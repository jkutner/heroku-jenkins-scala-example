resolvers += Resolver.url(
  "bintray-sbt-plugin-heroku",
   url("http://dl.bintray.com/heroku/sbt-plugins/"))(
       Resolver.ivyStylePatterns)

addSbtPlugin("com.heroku" % "sbt-heroku" % "0.3.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.6")
