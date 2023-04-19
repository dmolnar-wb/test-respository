package com.spring.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class FooFormatter implements Formatter {

    public String format() {
        return "foo";
    }
}
