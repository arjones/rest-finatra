package arjones.api.modules

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.twitter.finatra.json.modules.FinatraJacksonModule

object CustomJacksonModule extends FinatraJacksonModule {

  // ISO-8601 time representation
  override def additionalJacksonModules = Seq(new JavaTimeModule())
}
