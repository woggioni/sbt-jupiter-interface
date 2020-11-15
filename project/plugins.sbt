
resolvers += Resolver.mavenCentral

libraryDependencies ++= Seq(
  "org.scala-sbt" % "scripted-plugin_2.12" % sbtVersion.value
)

resolvers += Resolver.typesafeIvyRepo("releases")

addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.6")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
