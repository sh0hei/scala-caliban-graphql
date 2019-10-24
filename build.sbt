name := "scala-caliban-graphql"

version := "1.0"

scalaVersion := "2.13.1"

lazy val calibanVersion = "0.0.6"
lazy val zioVersion = "1.0.0-RC15"

testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))

libraryDependencies ++= Seq(
  // core
  "com.github.ghostdogpr" %% "caliban" % calibanVersion,
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio" %% "zio-streams" % zioVersion,
  "dev.zio" %% "zio-test" % zioVersion % "test",
  "dev.zio" %% "zio-test-sbt" % zioVersion % "test",
  "com.lihaoyi" %% "fastparse" % "2.1.3",
  "com.propensive" %% "magnolia" % "0.12.0",
  compilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1"),
  // http4s
  "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC6",
  "org.typelevel" %% "cats-effect" % "2.0.0",
  "org.http4s" %% "http4s-dsl" % "0.21.0-M5",
  "org.http4s" %% "http4s-circe" % "0.21.0-M5",
  "org.http4s" %% "http4s-blaze-server" % "0.21.0-M5",
  "io.circe" %% "circe-parser" % "0.12.3",
  "io.circe"  %% "circe-derivation" % "0.12.0-M7",
  compilerPlugin(("org.typelevel" %% "kind-projector" % "0.11.0").cross(CrossVersion.full))
)