ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "com.home.scala-demo"
  )

libraryDependencies += "org.scalatestplus" %% "selenium-4-1" % "3.2.12.0" % "compile"
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.12" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.12" % "test"

// testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "report")