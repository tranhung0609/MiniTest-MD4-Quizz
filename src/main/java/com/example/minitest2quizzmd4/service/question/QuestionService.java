package com.example.minitest2quizzmd4.service.question;

import com.example.minitest2quizzmd4.model.Question;
import com.example.minitest2quizzmd4.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuestionService implements IQuestionService{
    @Autowired
    QuestionRepository questionRepository;
    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public Iterable<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        questionRepository.deleteById(id);
    }
}
