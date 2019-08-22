package com.bosssoft.bes.basedata.center.api;

import com.bosssoft.bes.basedata.center.entity.Dictionary;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Test
    public void addDictionary(){
        Dictionary dictionary = new Dictionary();
        System.out.println(dictionary);

    }

}
