package com.example.lld3.models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Expenses extends BaseModel{
    private String description;
    private int amount;
    @ManyToOne
    private User createdBy;
    @ManyToOne
    private Groups groups;
    @OneToMany
    private List<UserExpense> userExpenses;
    @Enumerated(EnumType.ORDINAL)
    private ExpenseType expenseType ;
}
