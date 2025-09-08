package com.sky.mapper;

import com.sky.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper {

    /**
     * 根据用户名查询员工
     * @param username
     * @return
     *
     * 简单sql使用注解方式来处理，较为复杂的比如动态sql则是用xml方式。
     */
    @Select("select * from employee where username = #{username}")
    Employee getByUsername(String username);

}
