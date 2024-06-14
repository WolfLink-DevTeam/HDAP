package edu.cauc.course.group6.spark;

import lombok.Data;

@Data
public class FlightsSchema {
    // 年份
    Integer year;
    // 月份
    Integer month;
    // 日期
    Integer day;
    // 星期几
    Integer day_of_week;
    // 航空公司
    String airline;
    // 航班号
    String flight_number;
    // 飞机编号
    String tail_number;
    // 起飞机场
    String origin_airport;
    // 目的机场
    String destination_airport;
    // 计划起飞时间
    Integer scheduled_departure;
    // 实际起飞时间
    Integer departure_time;
    // 起飞延误时间，负数表示提前起飞
    Integer departure_delay;
    // 起飞前滑行时间
    Integer taxi_out;
    // 离地时间
    Integer wheels_off;
    // 计划飞行时间
    Integer scheduled_time;
    // 实际飞行时间
    Integer elapsed_time;
    // 空中时间
    Integer air_time;
    // 航线距离
    Integer distance;
    // 着地时间
    Integer wheels_on;
    // 降落后滑行时间
    Integer taxi_in;
    // 计划到达时间
    Integer scheduled_arrival;
    // 实际到达时间
    Integer arrival_time;
    // 到达延误时间
    Integer arrival_delay;
    // 是否转降
    Integer diverted;
    // 是否取消
    Integer cancelled;
}
