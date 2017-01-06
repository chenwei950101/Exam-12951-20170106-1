package com.hand.mapper;

import com.hand.bean.Customer;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by 陈伟 on 2016/12/29.
 * Film存储映射接口
 */
@Component
public interface CustomerMapper {
    Customer getCustomerByName(String firstName);
}
