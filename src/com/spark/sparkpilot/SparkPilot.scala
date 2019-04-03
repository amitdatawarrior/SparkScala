package com.spark.sparkpilot

import org.apache.spark.SparkContext

object SparkPilot {
  
  def main(args: Array[String]) {
    
    val sc = new SparkContext("local[*]", "SparkPilot") 
    
    println("Hello World")
    
    val rdd = sc.parallelize(List(1, 2, 3, 4)) //Created the RDD.
    
    val sq = rdd.map(x=> x*x)
    
    
 //   myRDD.take(n).foreach(println)
    
    sq.collect().foreach(println)
    
    
    
  }
}