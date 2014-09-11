import NativePackagerKeys._

packageArchetype.java_application

name := """scala-getting-started"""

version := "1.0"

//scalaVersion := "2.10.4"

resolvers +=
  "rubygems-release" at "http://rubygems-proxy.torquebox.org/releases"

libraryDependencies ++= Seq(
  "rubygems" % "travis" % "1.7.1" excludeAll(ExclusionRule("rubygems", "pry", "*")),
  "rubygems" % "pry" % "0.9.12.6"
)

libraryDependencies ++= Seq(
  "com.twitter" % "finagle-http_2.10" % "6.18.0",
  "postgresql" % "postgresql" % "9.0-801.jdbc4",
  "org.jscience" % "jscience" % "4.3.1"
)

herokuJdkVersion in Compile := "1.7"

herokuAppName in Compile := "sheltered-citadel-3631"
