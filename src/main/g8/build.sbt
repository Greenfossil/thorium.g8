val scala3Version = "3.3.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
  )

libraryDependencies ++= Seq(
  "com.greenfossil" %% "thorium" % "0.7.22" withSources(),
  "org.slf4j" % "slf4j-api" % "2.0.12",
  "ch.qos.logback" % "logback-classic" % "1.5.6" % Test,
  "org.scalameta" %% "munit" % "1.0.0-RC1" % Test
)
