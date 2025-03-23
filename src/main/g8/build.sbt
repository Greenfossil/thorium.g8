lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.6.3",
  )

libraryDependencies ++= Seq(
  "com.greenfossil" %% "thorium" % "0.9.0" withSources(),
  "org.slf4j" % "slf4j-api" % "2.0.17",
  "ch.qos.logback" % "logback-classic" % "1.5.18" % Test,
  "org.scalameta" %% "munit" % "1.1.0" % Test
)
