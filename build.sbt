name := "finatra-rest"

enablePlugins(JavaAppPackaging)

version := "0.1"

scalaVersion := "2.12.8"

javaOptions ++= Seq(
  "-Dlog.service.output=/dev/stderr",
  "-Dlog.access.output=/dev/stderr")

lazy val versions = new {
  val finatra = "18.12.0"
}

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra-http" % versions.finatra,
  "io.github.finagle" %% "finagle-postgres" % "0.8.2",
  "io.github.finagle" %% "finagle-postgres-shapeless" % "0.8.2",

  "com.typesafe" % "config" % "1.3.2",

  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.9.6",

  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "com.twitter" %% "finatra-http" % versions.finatra % "test" classifier "tests"
)