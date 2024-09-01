package com.example.lld3.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name = "splitwise_group")
public class Groups extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<User> members;
    @ManyToOne
    private User createdby;
    @OneToMany(mappedBy = "groups")
    private List<Expenses> expenses;
}
