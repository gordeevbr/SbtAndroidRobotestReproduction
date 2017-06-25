import sbt._

object Libraries {

  object android {
    def androidDep(module: String) = "com.android.support" % module % Versions.android

    lazy val androidDesign = androidDep("design")
  }

  object test {
    lazy val robolectric = "org.robolectric" % "robolectric" % Versions.robolectric % Test
    lazy val junit = "junit" % "junit" % Versions.junit % Test
    lazy val junitInterface = "com.novocode" % "junit-interface" % Versions.junitInterface % Test
  }
}