package com.example.minitest2quizzmd4.repository;

import com.example.minitest2quizzmd4.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
