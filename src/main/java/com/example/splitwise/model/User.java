package com.example.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "my_user")
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    private String phoneNo;
    private String password;
    @ManyToMany
    private List<Group> groups;
}
