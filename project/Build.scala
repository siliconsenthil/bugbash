import sbt._
import Keys._
import play.Project._
import sbt.Project.richInitializeTask
 
object ApplicationBuild extends Build {
 
  val appName         = "bugbash"
  val appVersion      = "0.1"

  val appDependencies = Seq(
    jdbc,
    anorm,
    "mysql" % "mysql-connector-java" % "5.1.18"
  )



  val main = play.Project(
    appName, appVersion, appDependencies
  ).settings(ebeanEnabled:=true)
 
}

