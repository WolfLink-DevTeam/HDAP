package edu.cauc.course.group6.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.*;

import java.sql.ResultSet;
import java.sql.SQLException;


public final class Main {
    private static void sparkTest() {
        SparkConf sparkConf = new SparkConf()
                .setAppName("JavaSparkPi")
                .set("spark.sql.warehouse.dir", "hdfs://43.248.116.245:6018/user/hive/warehouse")
                .set("hive.metastore.uris", "thrift://43.248.116.245:6459")
                .setMaster("local[*]");
        // 创建 SparkSession
        SparkSession spark = SparkSession.builder()
                .appName("HiveSparkExample")
                .enableHiveSupport() // 启用 Hive 支持
                .config(sparkConf)
                .getOrCreate();

        spark.sparkContext().hadoopConfiguration().set("fs.defaultFS","hdfs://43.248.116.245:6018");

        spark.sql("USE flights_db");
        // 执行查询
        Dataset<Row> result = spark.sql("SELECT * FROM flights LIMIT 10");
        Encoder<FlightsSchema> flightsSchemaEncoder = Encoders.bean(FlightsSchema.class);
        Dataset<FlightsSchema> flightsSchemaDataset = result.as(flightsSchemaEncoder);
        flightsSchemaDataset.show();
        // 停止 SparkSession
        spark.stop();
    }


    public static void main(String[] args) {
        sparkTest();
    }
}