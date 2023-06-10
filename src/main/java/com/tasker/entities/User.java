package com.tasker.entities;

import java.util.List;

import com.tasker.base.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity()
@Table(name = "USERS")
@Getter
@Setter
public class User extends BaseEntity {
    @NotBlank(message = "O nome não deve estar em branco")
    private String name;
    @Email(message = "Insira um endereço de email valido")
    private String email;
    @Min(value = 4, message = "A senha deve ser maior do que 4 caracteres")
    private String password;
    // @OneToMany(mappedBy = "ownerUser")
    // List<Task> tasks;
}