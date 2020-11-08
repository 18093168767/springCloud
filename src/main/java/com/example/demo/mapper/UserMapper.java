package com.example.demo.mapper;
    /**
        *功能描述:Dao$ Dao$
        *@author guyongqi
        *@date 20201108$
        */
import com.example.demo.bean.UserBean;
public interface UserMapper {

    UserBean getInfo(String name,String password);

}
