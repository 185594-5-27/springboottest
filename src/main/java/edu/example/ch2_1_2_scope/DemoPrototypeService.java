package edu.example.ch2_1_2_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by linzf on 2017/3/29.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
