package com.hand.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by 陈伟 on 2016/12/29.
 * 发生在执行service方法前
 */
public class BeforeInsertFilmEvent extends ApplicationEvent {
    String resource;
    public BeforeInsertFilmEvent(String resource){
        super(resource);
        this.resource=resource;
    }
}
