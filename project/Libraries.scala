import sbt._

object Libraries {

  object android {
    def androidDep(module: String) = "com.android.support" % module % Versions.android

    lazy val androidRecyclerView = androidDep("recyclerview-v7")
    lazy val androidCardView = androidDep("cardview-v7")
    lazy val androidDesign = androidDep("design")
    lazy val androidSupportLib = androidDep("support-core-utils")
    lazy val androidSupportV4 = androidDep("support-v4")
  }

  object test {
    lazy val robolectric = "org.robolectric" % "robolectric" % Versions.robolectric % Test
    lazy val junit = "junit" % "junit" % Versions.junit % Test
    lazy val junitInterface = "com.novocode" % "junit-interface" % Versions.junitInterface % Test
  }
}