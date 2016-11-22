# Spark HDFS Interaction.

```
sam.pegler@ietl-1:~/spark-2.0.0-bin-hadoop2.7/bin$ ./spark-submit --class org.infectious.spark.ListHDFS --master local[1] /tmp/listhdfs_2.11-1.0.jar
```

Runs stuff.

```
sam.pegler@ietl-1:~/spark-2.0.0-bin-hadoop2.7/bin$ hdfs dfs -text /tmp/counts.txt/part-00000 | tail
16/11/22 16:36:29 WARN util.NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
(matrimony,,2)
(perseverance.,1)
(companion,12)
(confusion,,4)
(silence,,7)
(at!",1)
(aunt,",2)
(absolutely,17)
(justifying,1)
(young,123)
```

Is the output.
