package arjones.api.repository

import arjones.api.model.Asset
import com.google.inject.{Inject, Singleton}
import com.twitter.finagle.postgres.PostgresClient
import com.twitter.finagle.postgres.generic._

@Singleton
class PortfolioRepository @Inject()(client: PostgresClient) {
  def findByNameList(names: Seq[String]) =
    sql"SELECT * FROM assets WHERE name IN ($names) ORDER BY name".as[Asset].run(client)

  def findById(id: Long) = {
    //    client.prepareAndQuery("SELECT * FROM assets WHERE id = $1", id)(convertRowIntoAsset)
    sql"SELECT * FROM assets WHERE id = $id".as[Asset].run(client)
  }

  def all() =
    client.queryAs[Asset]("SELECT * FROM assets ORDER BY name")

}
