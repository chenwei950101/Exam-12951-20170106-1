package com.hand.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 陈伟 on 2016/12/29.
 * 发生在执行service方法后
 */
public class AfterInsertFilmEvent extends ApplicationEvent{
    String resource;
    public AfterInsertFilmEvent(String resource){
        super(resource);
        this.resource=resource;
    }
}
