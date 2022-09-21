package com.example.schoolmanagementproject.student;

import com.example.schoolmanagementproject.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EntityStudent extends BaseEntity {
    private String firstName;
    private String lastName;
    private String password;
}
