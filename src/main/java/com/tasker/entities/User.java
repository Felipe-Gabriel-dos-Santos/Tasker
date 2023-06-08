package com.tasker.entities;

import java.util.List;

import com.tasker.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity() 
@Table(name = "USERS")
@Getter @Setter
public class User extends BaseEntity{
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "ownerUser")
    List<Task> tasks;
}