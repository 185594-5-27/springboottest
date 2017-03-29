package edu.example.ch2_2_2_springel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by linzf on 2017/3/29.
 */
@Service
public class DemoService {

    @Value("other value")
    private String another;

    public String getAnother() {
        return another;
    }


    public void setAnother(String another) {
        this.another = another;
    }






}
