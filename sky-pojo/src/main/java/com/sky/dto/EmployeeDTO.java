package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

// 如果前端提交数据和实体类中对应属性差距较大，建议DTO来封装数据。
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
