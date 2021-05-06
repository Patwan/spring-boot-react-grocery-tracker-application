package com.pwebk.expensetracker.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Data
@Table(name = "category")
public class Category {

    @Id
    private Long id;

    @NonNull
    private String name;

}
