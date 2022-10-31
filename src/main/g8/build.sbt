val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
  )

libraryDependencies ++= Seq(
  "com.greenfossil" %% "thorium" % "0.2.1" withSources(),
  "org.scalameta" %% "munit" % "0.7.29" % Test
)
