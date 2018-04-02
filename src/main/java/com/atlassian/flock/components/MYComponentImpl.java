package com.atlassian.flock.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MYComponentImpl implements MYComponent {
    private static final Logger log = LoggerFactory.getLogger(MYComponentImpl.class);

    public MYComponentImpl() {

    }

    public String hello() {
        return "hello";
    }
}