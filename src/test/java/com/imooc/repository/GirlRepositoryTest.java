package com.imooc.repository;

import com.imooc.entity.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
@ConfigurationProperties("application.yml")
public class GirlRepositoryTest {

    @Autowired
    private GirlRepository repository;

    @Test
    public void fun1() {
        Girl girl = new Girl();
        girl.setCupSize("F");
        girl.setAge(11);

        Girl save = repository.save(girl);
        Assert.assertNotNull(save);

    }
}