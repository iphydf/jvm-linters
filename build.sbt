organization  := "org.toktok"
name          := "linters"
version       := "0.1.0"
scalaVersion  := "2.11.7"

// Build dependencies.
libraryDependencies ++= Seq(
  "org.wartremover" %% "wartremover" % "1.1.1"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.0"
) map (_ % Test)

import im.tox.sbt.lint.Scalastyle
Scalastyle.projectSettings
