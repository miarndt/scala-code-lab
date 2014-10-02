val projectName = "scala-code-lab"

offline := true

version := "1.0"

scalaVersion := "2.11.2"

organization := "de.otto"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature", "-language:postfixOps")

libraryDependencies ++= {
    Seq(
        "org.scalatest" %% "scalatest" % "2.2.1" % "test"
	)
}
