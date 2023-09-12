name := "$name$"

scalaVersion := "$scala_version$"

ThisBuild / scalacOptions ++= Seq("-Xfatal-warnings", "-Xlint")

Compile / PB.targets := Seq(
  PB.gens.java -> (Compile / sourceManaged).value / "java",
  scalapb.gen(javaConversions=true) -> (Compile / sourceManaged).value / "scalapb"
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion
)
