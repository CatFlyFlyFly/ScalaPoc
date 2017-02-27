name := "scala-sbt-template"

version := "1.0"

scalaVersion := "2.12.1"

scalaSource in Compile := baseDirectory.value / "app"

scalaSource in Test := baseDirectory.value / "test"

// disable using the Scala version in output paths and artifacts
crossPaths := false

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1"