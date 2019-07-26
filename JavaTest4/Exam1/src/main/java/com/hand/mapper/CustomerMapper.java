package com.hand.mapper;

import com.hand.model.Customer;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface CustomerMapper {
    @ResultMap("BaseResultMap1")
    @Select("select * from customer where first_name=#{firstName}")
    Customer select(Customer customer);


}