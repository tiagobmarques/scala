name := """play-scala-seed"""
organization := "com.bmarques"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.16"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.2" % Test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.18" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.bmarques.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.bmarques.binders._"
