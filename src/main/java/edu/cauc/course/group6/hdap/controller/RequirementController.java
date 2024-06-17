package edu.cauc.course.group6.hdap.controller;


import edu.cauc.course.group6.hdap.entity.*;
import edu.cauc.course.group6.hdap.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequirementController {

    @Autowired
    private RequirementService requirementService;

    @GetMapping("/requirement1")
    public List<Requirement1> getAllRequirement1() {
        return requirementService.getAllRequirement1();
    }

    @GetMapping("/requirement2")
    public List<Requirement2> getAllRequirement2() {
        return requirementService.getAllRequirement2();
    }

    @GetMapping("/requirement3")
    public List<Requirement3> getAllRequirement3() {
        return requirementService.getAllRequirement3();
    }

    @GetMapping("/requirement4")
    public List<Requirement4> getAllRequirement4() {
        return requirementService.getAllRequirement4();
    }

    @GetMapping("/requirement5")
    public List<Requirement5> getAllRequirement5() {
        return requirementService.getAllRequirement5();
    }

    @GetMapping("/requirement6")
    public List<Requirement6> getAllRequirement6() {
        return requirementService.getAllRequirement6();
    }
    @GetMapping("/requirement7")
    public List<Requirement7> getAllRequirement7() {
        return requirementService.getAllRequirement7();
    }
}