package com.tasker.entities;

import java.util.Date;

import com.tasker.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity()
@Table(name = "TASKS")
@Getter @Setter
public class Task extends BaseEntity{
    @NotBlank(message = "Insira um titulo valido")
    private String title;
    @NotBlank(message = "Insira uma descrição valida")
    private String description;
    private String status;
    private Date finishDate;
    private Boolean isDeleted = false;
}