name := "ListHDFS"

version := "1.0"

scalaVersion := "2.11.4"

resolvers +=
	"HBase-Spark repo" at "https://repository.apache.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
	"org.apache.hadoop" % "hadoop-common" % "2.7.3",
    "org.apache.spark" %% "spark-core" % "1.6.0"
)

scalacOptions := Seq("-unchecked", "-feature")