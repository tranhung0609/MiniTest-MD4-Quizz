package com.example.minitest2quizzmd4.controller;

import com.example.minitest2quizzmd4.service.answer.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/answers")
public class AnswerController {
    @Autowired
    IAnswerService answerService;
}
