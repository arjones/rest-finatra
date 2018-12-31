package arjones.api.domain

import com.twitter.finagle.http.Request
import com.twitter.finatra.request.RouteParam

case class IdRequest(@RouteParam id: Long, request: Request)

/**
  * Allow named requests being processed as comma-separated values
  * @param name
  * @param request
  */
case class NameRequest(@RouteParam name: String, request: Request) {
  def names = name.split(",").toSeq
}

