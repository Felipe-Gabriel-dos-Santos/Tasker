package com.tasker.entities;

import java.util.List;

import com.tasker.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity()
@Table(name = "TASK_STATUS")
@Getter @Setter
public class TaskStatus extends BaseEntity {
    private String status;
    @OneToMany(mappedBy = "status")
    private List<Task> tasks;
}