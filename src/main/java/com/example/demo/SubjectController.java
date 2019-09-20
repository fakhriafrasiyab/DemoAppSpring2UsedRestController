package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SubjectController {

    @RequestMapping("/subjects")
    public List<Subject> getAllSubjects() {
        return Arrays.asList(
                new Subject("Java", "Spring Framework","Spring Boot Description"),
                new Subject("PHP", "Laravel Framework","Laravel Description"),
                new Subject("C#", ".NET CORE ",".NET Description"),
                new Subject("JS", "React Framework","React Description")
        );
    }
}
