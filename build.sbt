scalaVersion := Versions.scala

enablePlugins(AndroidApp)
android.useSupportVectors

name := "Robolectric Reproduce"

organization := "com.gordeevbr"
organizationName := "gordeevbr"
applicationId in Android := "com.gordeevbr"

versionCode := Some(1)
version := "1"

platformTarget in Android := Versions.androidPlatform

javacOptions in Compile ++= "-source" :: "1.7" :: "-target" :: "1.7" :: Nil
scalacOptions in Compile += "-Xexperimental"

resolvers ++= Settings.resolvers

libraryDependencies ++= Settings.dependencies

proguardScala in Android := false
useProguard in Android := false
useProguardInDebug in Android := false
proguardCache in Android := Seq.empty

parallelExecution in Test := false
fork in Test := true
debugIncludesTests in Android := false
unmanagedClasspath in Test ++= (bootClasspath in Android).value