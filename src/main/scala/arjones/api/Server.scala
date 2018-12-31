package arjones.api

import arjones.api.controller._
import arjones.api.modules.{CustomJacksonModule, DatabaseModule}
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.{CommonFilters, LoggingMDCFilter, TraceIdMDCFilter}
import com.twitter.finatra.http.routing.HttpRouter
import com.google.inject.Module

object ServerMain extends Server

class Server extends HttpServer {

  override val name = "finatra-api"

  override def jacksonModule = CustomJacksonModule

  override val modules: Seq[Module] = Seq(DatabaseModule)

  override def configureHttp(router: HttpRouter): Unit = {
    router
      .filter[CommonFilters]
      .filter[LoggingMDCFilter[Request, Response]]
      .filter[TraceIdMDCFilter[Request, Response]]
      .add[PortfolioController]
  }
}