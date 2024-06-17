package edu.cauc.course.group6.hdap.service;


import edu.cauc.course.group6.hdap.entity.*;
import edu.cauc.course.group6.hdap.mapper.RequirementMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequirementService {

    @Resource
    private RequirementMapper requirementMapper;

    public List<Requirement1> getAllRequirement1() {
        return requirementMapper.getAllRequirement1();
    }

    public List<Requirement2> getAllRequirement2() {
        return requirementMapper.getAllRequirement2();
    }

    public List<Requirement3> getAllRequirement3() {
        return requirementMapper.getAllRequirement3();
    }

    public List<Requirement4> getAllRequirement4() {
        return requirementMapper.getAllRequirement4();
    }

    public List<Requirement5> getAllRequirement5() {
        return requirementMapper.getAllRequirement5();
    }

    public List<Requirement6> getAllRequirement6() {
        return requirementMapper.getAllRequirement6();
    }
    public List<Requirement7> getAllRequirement7() {
        return requirementMapper.getAllRequirement7();
    }
}