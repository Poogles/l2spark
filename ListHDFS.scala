package org.infectious.spark

// import required spark classes
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object ListHDFS {
  def main(args: Array[String]) {

    println("STARTING UP.")
    // // initialise spark context
    val conf = new SparkConf().setAppName("ListHDFS")
    val sc = new SparkContext(conf)

    val textFile = sc.textFile("hdfs://10.240.0.60:8020/tmp/pride-predj.txt")
    
    val counts = textFile.flatMap(line => line.split(" "))
                     .map(word => (word, 1))
                     .reduceByKey(_ + _)

    counts.saveAsTextFile("hdfs://10.240.0.60:8020/tmp/counts.txt")

    // terminate spark context
    println("BOOM DONE.")
    sc.stop()

  }
}