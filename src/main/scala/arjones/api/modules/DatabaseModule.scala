package arjones.api.modules

import com.twitter.finagle.Postgres
import com.twitter.finagle.postgres.PostgresClient
import com.twitter.inject.TwitterModule
import com.typesafe.config.ConfigFactory
import com.google.inject.{Provides, Inject, Singleton}


// Heavily inspired:
// https://github.com/teaddict/turkce-metin-ozetleme-scala/blob/master/src/main/scala/com/summarizer/modules/DatabaseModule.scala

@Singleton
object DatabaseModule extends TwitterModule {
  val config = ConfigFactory.load()

  @Provides
  def provideDatabase(): PostgresClient = Postgres.Client()
    .withCredentials(config.getString("db.username"), config.getString("db.password"))
    .database(config.getString("db.database"))
    .withBinaryResults(true)
    .withBinaryParams(true)
    .newRichClient(config.getString("db.hostname"))
}
