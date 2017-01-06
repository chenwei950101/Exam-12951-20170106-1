package com.hand.listener;

import com.hand.event.AfterInsertFilmEvent;
import com.hand.event.BeforeInsertFilmEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Created by 陈伟 on 2016/12/29.
 *
 *
 */
public class EventListener implements ApplicationListener<ApplicationEvent>{
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof AfterInsertFilmEvent){
            System.out.println(event.getSource());
        }
        if(event instanceof BeforeInsertFilmEvent){
            System.out.println(event.getSource());
        }
        if(event instanceof ContextRefreshedEvent){
            System.out.println("Context Start");
        }
        if(event instanceof ContextClosedEvent){
            System.out.println("Context Stop");
        }
    }

}
