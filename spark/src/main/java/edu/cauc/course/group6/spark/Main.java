package edu.cauc.course.group6.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;

import java.sql.ResultSet;
import java.sql.SQLException;


public final class Main {
    private static void sparkTest() {
        SparkConf sparkConf = new SparkConf()
                .setAppName("JavaSparkPi")
                .set("spark.sql.warehouse.dir", "hdfs://path/to/your/warehouse")
                .setMaster("local[*]");
        // 创建 SparkSession
        SparkSession spark = SparkSession.builder()
                .appName("HiveSparkExample")
                .enableHiveSupport() // 启用 Hive 支持
                .config(sparkConf)
                .getOrCreate();

        // 使用 SparkSession 连接 Hive
        spark.sql("CREATE TABLE IF NOT EXISTS src (key INT, value STRING)");
        spark.sql("LOAD DATA LOCAL INPATH 'examples/src/main/resources/kv1.txt' INTO TABLE src");

        // 执行查询
        Dataset<Row> result = spark.sql("SELECT * FROM src");
        result.show();

        // 停止 SparkSession
        spark.stop();
    }


    public static void main(String[] args) {
        sparkTest();
    }
}