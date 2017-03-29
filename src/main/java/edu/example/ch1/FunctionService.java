package edu.example.ch1;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017-03-28.
 */
@Service
public class FunctionService {

    public String sayHello(String word){
        return "Hello:" + word + "!";
    }
}
