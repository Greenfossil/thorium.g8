lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.5.1",
  )

libraryDependencies ++= Seq(
  "com.greenfossil" %% "thorium" % "0.8.0" withSources(),
  "org.slf4j" % "slf4j-api" % "2.0.12",
  "ch.qos.logback" % "logback-classic" % "1.5.6" % Test,
  "org.scalameta" %% "munit" % "1.0.0" % Test
)
