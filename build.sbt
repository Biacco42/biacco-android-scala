name := "Functional Home"

scalaVersion := "2.11.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "com.android.support" % "support-v4" % "23.1.1"

libraryDependencies += "com.android.support" % "support-v13" % "23.1.1"

// Override the run task with the android:run
run <<= run in Android

// Activate proguard for Scala
proguardScala in Android := true

// Activate proguard for Android
useProguard in Android := true

// Set proguard options
proguardOptions in Android ++= Seq(
"-ignorewarnings",
"-keep class scala.Dynamic",
"-keep class com.android.support.**")

