package com.example.minitest2quizzmd4.service.answer;

import com.example.minitest2quizzmd4.model.Answer;
import com.example.minitest2quizzmd4.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnswerService implements IAnswerService{
    @Autowired
    AnswerRepository answerRepository;
    @Override
    public void save(Answer answer) {
        answerRepository.save(answer);
    }

    @Override
    public Iterable<Answer> findAll() {
        return answerRepository.findAll();
    }

    @Override
    public Optional<Answer> findById(Long id) {
        return answerRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        answerRepository.deleteById(id);
    }
}
