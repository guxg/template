import sbt._
import Keys._

object build extends Build {

  lazy val root = Project("default", file(".")) settings (Deploy.deploySettings:_*)
}
