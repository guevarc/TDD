package com.java.example.junitandspringexample;

import com.java.example.junitandspringexample.ApplicationConfig;
import com.java.example.spring.DataModelService;
import com.java.example.spring.LearningService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class LearningTest {
	
	//DI
    @Autowired
    @Qualifier("ml")
    DataModelService ml;

    @Test
    public void test_ml_always_return_true() {

        //assert correct type/impl
        assertThat(ml, instanceOf(LearningService.class));

        //assert true
        assertThat(ml.isValid(""), is(true));

    }

}
