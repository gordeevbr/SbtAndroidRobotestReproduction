import Libraries.android._
import Libraries.test._
import android.Keys.aar
import sbt._

object Settings {

  lazy val resolvers = Seq(
    Resolver.mavenLocal,
    DefaultMavenRepository,
    Resolver.typesafeRepo("releases"),
    Resolver.typesafeRepo("snapshots"),
    Resolver.typesafeIvyRepo("snapshots"),
    Resolver.defaultLocal,
    Resolver.url("google-maven", url("https://maven.google.com"))(Resolver.mavenStylePatterns),
    Resolver.url("bintray-47deg-maven", url("https://dl.bintray.com/47deg/maven"))(Resolver.ivyStylePatterns),
    Resolver.url("bintray-scalaz-releases", url("https://dl.bintray.com/scalaz/releases"))(Resolver.ivyStylePatterns),
    "jcenter" at "http://jcenter.bintray.com",
    "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots",
    "Scala Tools Releases" at "http://scala-tools.org/repo-releases"
  )

  lazy val dependencies = Seq(
    aar(androidDesign),
    aar(androidCardView),
    aar(androidRecyclerView),
    aar(androidSupportLib),
    aar(androidSupportV4),

    robolectric,
    junit,
    junitInterface)

}
