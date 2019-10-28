name := "scala-caliban-graphql"

version := "1.0"

scalaVersion := "2.13.1"

lazy val calibanVersion = "0.1.1"
lazy val zioVersion = "1.0.0-RC15"

testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-explaintypes",
  "-Yrangepos",
  "-feature",
  "-language:higherKinds",
  "-language:existentials",
  "-unchecked",
  "-Xlint:_,-type-parameter-shadow",
  "-Ywarn-numeric-widen",
  "-Ywarn-unused:patvars,-implicits",
  "-Ywarn-value-discard"
)

libraryDependencies ++= Seq(
  "com.github.ghostdogpr" %% "caliban" % calibanVersion,
  "com.github.ghostdogpr" %% "caliban-http4s" % calibanVersion, // routes for http4s
  "com.github.ghostdogpr" %% "caliban-cats"   % calibanVersion, // interop with cats effect
)