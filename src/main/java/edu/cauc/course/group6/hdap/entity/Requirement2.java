package edu.cauc.course.group6.hdap.entity;

import lombok.Data;

@Data
public class Requirement2 {
    private String airline;
    private double air_system_delay;
    private double security_delay;
    private double airline_delay;
    private double late_aircraft_delay;
    private double weather_delay;
}