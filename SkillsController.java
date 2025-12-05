package com.portfolio.controller;

import com.portfolio.model.SkillCategory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin("*")
public class SkillsController {

    @GetMapping
    public List<SkillCategory> getSkills() {

        SkillCategory coreJava = new SkillCategory(
                "Core Java",
                List.of("OOP Principles", "Exception Handling", "Collections Framework", "Multithreading", "JDBC")
        );

        SkillCategory backend = new SkillCategory(
                "Backend",
                List.of("Spring Boot", "Spring MVC", "REST APIs", "Microservices", "Hibernate")
        );

        SkillCategory frontend = new SkillCategory(
                "Frontend",
                List.of("HTML5", "CSS3", "JavaScript", "React", "Bootstrap")
        );

        SkillCategory database = new SkillCategory(
                "Database",
                List.of("MySQL", "PostgreSQL", "MongoDB", "SQL Queries", "Database Design")
        );

        SkillCategory devops = new SkillCategory(
                "Tools & DevOps",
                List.of("Git", "GitHub", "Maven", "Docker", "IntelliJ IDEA", "VS Code")
        );

        SkillCategory concepts = new SkillCategory(
                "Concepts",
                List.of("Data Structures", "Algorithms", "Design Patterns", "Agile", "Problem Solving")
        );

        return Arrays.asList(coreJava, backend, frontend, database, devops, concepts);
    }
}
