import Libraries.android._
import Libraries.test._
import android.Keys.aar
import sbt._

object Settings {

  lazy val resolvers = Seq(
    Resolver.mavenLocal,
    DefaultMavenRepository,
    Resolver.defaultLocal,
    Resolver.url("google-maven", url("https://maven.google.com"))(Resolver.mavenStylePatterns)
  )

  lazy val dependencies = Seq(
    aar(androidDesign),
    robolectric,
    junit,
    junitInterface)

}
