package edu.cauc.course.group6.hdap.mapper;


import edu.cauc.course.group6.hdap.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RequirementMapper {
    @Select("SELECT * FROM requirement1")
    List<Requirement1> getAllRequirement1();

    @Select("SELECT airline, air_system_delay, security_delay, airline_delay, late_aircraft_delay, weather_delay FROM requirement2")
    List<Requirement2> getAllRequirement2();

    @Select("SELECT airline, percentage FROM requirement3")
    List<Requirement3> getAllRequirement3();

    @Select("SELECT airline, avg_departure_delay FROM requirement4")
    List<Requirement4> getAllRequirement4();

    @Select("SELECT origin_airport, flight_count FROM requirement5")
    List<Requirement5> getAllRequirement5();

    @Select("SELECT origin_airport, destination_airport, avg_time, avg_distance FROM requirement6")
    List<Requirement6> getAllRequirement6();

    @Select("SELECT origin_airport, month, flight_count from requirement7")
    List<Requirement7> getAllRequirement7();
}
