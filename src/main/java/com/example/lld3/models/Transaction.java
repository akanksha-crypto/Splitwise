package com.example.lld3.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction extends BaseModel{
    private int amount;
    private Long fromUserid;
    private Long toUserid;
}
