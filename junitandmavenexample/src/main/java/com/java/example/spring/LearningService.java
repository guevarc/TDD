package com.java.example.spring;

import org.springframework.stereotype.Service;

@Service("ml")
public class LearningService implements DataModelService {

    @Override
    public boolean isValid(String input) {
        return true;
    }

}