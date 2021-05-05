package com.pwebk.expensetracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Data
@Table(name = "category")
public class Category {

    private Long id;

    private String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private User user;

}
