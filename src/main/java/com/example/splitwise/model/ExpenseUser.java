package com.example.splitwise.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class ExpenseUser extends BaseModel{
    @ManyToOne
    private User user;
    private int amount;
    @ManyToOne
    private Expense expense;
    @Enumerated(EnumType.STRING)
    private UserExpenseType userExpenseType;
}
