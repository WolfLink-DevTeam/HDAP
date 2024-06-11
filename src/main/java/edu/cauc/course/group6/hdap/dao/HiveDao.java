package edu.cauc.course.group6.hdap.dao;

import jakarta.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class HiveDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    public List<Map<String,Object>> executeQuery(String query) {
        return jdbcTemplate.queryForList(query);
    }
}
