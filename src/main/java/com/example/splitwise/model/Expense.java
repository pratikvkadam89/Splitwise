package com.example.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    private String description;
    private int amount;
    @OneToMany(mappedBy = "expense")
    private List<ExpenseUser> expenseUsers;
    @ManyToOne
    private Group group;
    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;
}
