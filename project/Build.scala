import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "RestServer"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "com.google.code.morphia" % "morphia" % "0.99",	
      "org.mongodb" % "mongo-java-driver" % "2.8.0",
      "com.google.code.morphia" % "morphia-logging-slf4j" % "0.99"	
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
		// Add your own project settings here
     resolvers += "Maven repository" at "http://morphia.googlecode.com/svn/mavenrepo/",
     resolvers += "MongoDb Java Driver Repository" at "http://repo1.maven.org/maven2/org/mongodb/mongo-java-driver/"      
    )

}
