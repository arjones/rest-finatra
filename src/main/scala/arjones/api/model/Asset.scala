package arjones.api.model

import java.time.ZonedDateTime

case class Asset(name: String, transactedAt: ZonedDateTime, quantity: Int, priceInCents: Int)
