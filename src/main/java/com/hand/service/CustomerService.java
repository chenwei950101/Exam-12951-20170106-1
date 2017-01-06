package com.hand.service;


import com.hand.bean.Customer;
import com.hand.mapper.CustomerMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储实现类
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public Customer getCustomerByName(String firstName){
        return  customerMapper.getCustomerByName(firstName);
    }

}








