organization := "biz.enef"

name := "xsbt-web-plugin"

scalaVersion := "2.10.5"

sbtPlugin := true

scalacOptions ++= Seq("-feature", "-deprecation")

version := "1.1.0-jokade-SNAPSHOT" 

publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra := (
  <url>https://github.com/jokade/angulate2</url>
    <licenses>
      <license>
        <name>BSD 3-Clause License</name>
        <url>http://www.opensource.org/licenses/BSD-3-Clause</url>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:jokade/xsbt-web-plugin</url>
      <connection>scm:git:git@github.com:jokade/xsbt-web-plugin.git</connection>
    </scm>
    <developers>
      <developer>
        <id>earldouglas</id>
        <name>James Earl Douglas</name>
      </developer>
      <developer>
       <id>aolshevskiy</id>
       <name>Artyom Olshevskiy</name>
      </developer>
    </developers>
  )
 
