name := "$name$"

scalaVersion := "2.12.3"

scalacOptions in ThisBuild ++= Seq("-Xfatal-warnings", "-Xlint")

PB.targets in Compile := Seq(
  PB.gens.java -> (sourceManaged in Compile).value,
  scalapb.gen(javaConversions=true) -> (sourceManaged in Compile).value
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % "$scalapb_version$" % "protobuf",
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % "$scalapb_version$"
)
