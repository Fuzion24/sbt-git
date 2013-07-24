seq(githubRepoSettings: _*)

sbtPlugin := true

name := "sbt-git"

organization := "com.typesafe.sbt"

scalaVersion := "2.10.2"

version := "0.6.3"

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "2.2.0.201212191850-r"

publishMavenStyle := true

localRepo := Path.userHome / "github" / "maven"

githubRepo := "git@github.com:Fuzion24/maven.git"