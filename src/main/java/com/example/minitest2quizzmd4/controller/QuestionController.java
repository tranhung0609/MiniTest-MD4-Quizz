package com.example.minitest2quizzmd4.controller;

import com.example.minitest2quizzmd4.model.Question;
import com.example.minitest2quizzmd4.service.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin("*")
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping
public ResponseEntity findAll(){
        return new ResponseEntity<>(questionService.findAll(), HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity save(@RequestBody Question question) {
        questionService.save(question);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Question> findById(@PathVariable Long id) {
        return new ResponseEntity<>(questionService.findById(id).get(), HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity edit(@PathVariable Long id, @RequestBody Question question) {
        Optional<Question> questionOptional = questionService.findById(id);
        if (questionOptional.isPresent()) {
            question.setId(id);
            questionService.save(question);
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity edit(@PathVariable Long id) {
        Optional<Question> questionOptional = questionService.findById(id);
        if (questionOptional.isPresent()) {
            questionService.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }

}
