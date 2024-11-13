package com.example.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "my_group")
@Getter
@Setter
public class Group extends BaseModel{
    private String name;
    private int totalAmount;
    @ManyToMany(mappedBy = "groups")
    private List<User> members;
    @ManyToOne
    private User admin;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
}
