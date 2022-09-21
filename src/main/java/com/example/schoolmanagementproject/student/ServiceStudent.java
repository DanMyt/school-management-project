package com.example.schoolmanagementproject.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServiceStudent {

    private final DaoStudent daoStudent;

    public EntityStudent findById(Long id) {
        return this.daoStudent.findById(id);
    }

}
