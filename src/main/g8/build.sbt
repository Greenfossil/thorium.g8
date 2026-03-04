lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "3.7.1",
  )

libraryDependencies ++= Seq(
  "com.greenfossil" %% "thorium" % "0.10.10" withSources(),
  "org.slf4j" % "slf4j-api" % "2.0.17",
  "ch.qos.logback" % "logback-classic" % "1.5.18" % Test,
  "org.scalameta" %% "munit" % "1.2.1" % Test
)
