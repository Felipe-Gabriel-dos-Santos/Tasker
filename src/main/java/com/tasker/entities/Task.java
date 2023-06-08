package com.tasker.entities;

import java.util.Date;

import com.tasker.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity()
@Table(name = "TASKS")
@Getter @Setter
public class Task extends BaseEntity{
    private String title;
    private String description;
    @ManyToOne()
    @JoinColumn(name = "USER_ID")
    private User ownerUser;
    @ManyToOne()
    @JoinColumn(name = "TASK_STATUS_ID")
    private TaskStatus status;
    private Date finishDate;
    private Boolean isDeleted = false;
}