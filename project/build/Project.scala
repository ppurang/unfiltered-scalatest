import sbt.{ScalaToolsSnapshots, DefaultProject, ProjectInfo}

/**
 * 
 * @author Piyush Purang
 */

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val jetty_version = "7.2.2.v20101205"
  val uf_version = "0.3.3-SNAPSHOT"

  lazy val uff = "net.databinder" %% "unfiltered-filter" % uf_version
  lazy val ufj = "net.databinder" %% "unfiltered-jetty" % uf_version
  lazy val ufn = "net.databinder" %% "unfiltered-netty" % uf_version

  lazy val dispatch =  "net.databinder" % "dispatch-mime_2.8.0" % "0.7.8"

  val scalaTest = "org.scalatest" % "scalatest" % "1.3"
  //val jettyDependency = "org.eclipse.jetty" % "jetty-webapp" % jetty_version


  lazy val jboss = "JBoss repository" at
    "https://repository.jboss.org/nexus/content/groups/public/"

  // logging
  val javaNetRepo = "Java.net Repository for Maven" at "http://download.java.net/maven/2"
  val newReleaseToolsRepository = ScalaToolsSnapshots
  val avsl = "org.clapper" %% "avsl" % "0.3.1"


}

// "org.scalatest" % "scalatest" % "1.3"