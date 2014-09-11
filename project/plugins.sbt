resolvers += Resolver.url(
  "bintray-sbt-plugin-heroku",
   url("http://dl.bintray.com/heroku/sbt-plugins/"))(
       Resolver.ivyStylePatterns)

resolvers += Resolver.url(
  "bintray-sbt-plugin-codefinger",
  url("http://dl.bintray.com/codefinger/sbt-plugins/"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("com.heroku" % "sbt-heroku" % "0.1.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "0.7.4" excludeAll(ExclusionRule("org.bouncycastle", "*")))

addSbtPlugin("org.jruby" % "sbt-rubygems" % "1.0")

//net.virtualvoid.sbt.graph.Plugin.graphSettings
