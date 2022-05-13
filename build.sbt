import sbt.util
import sbt.util.Level

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "com.home.scala-demo",
    logLevel := Level.Info
  )

libraryDependencies += "org.scalatestplus" %% "selenium-4-1" % "3.2.12.0" % "compile"
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.12" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-shouldmatchers" % "3.2.12" % "test"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.11"
libraryDependencies += "com.typesafe" % "config" % "1.4.2"

logLevel in Scope.Global := util.Level.Info