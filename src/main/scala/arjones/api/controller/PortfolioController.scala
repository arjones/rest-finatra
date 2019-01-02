package arjones.api.controller

import arjones.api.domain._
import arjones.api.repository.PortfolioRepository
import com.google.inject.Inject
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller


class PortfolioController @Inject()(repo: PortfolioRepository) extends Controller {
  prefix("/v1") {

    get("/assets") { _: Request => repo.all() }

    get("/assets/:name") { req: NameRequest => repo.findByNameList(req.names) }

  }
}
