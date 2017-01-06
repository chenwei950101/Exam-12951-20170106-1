package com.hand.controller;


import com.hand.bean.Customer;
import com.hand.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by 陈伟 on 2017/1/4.
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/welcome",method = RequestMethod.POST)
    @ResponseBody
    public Boolean login(@RequestParam String firstName) {
        Customer customerList = customerService.getCustomerByName(firstName);
        if(customerList!=null){
            return true;
        }else {
            return false;
        }
    }
}
