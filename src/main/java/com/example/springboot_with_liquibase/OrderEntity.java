package com.example.springboot_with_liquibase;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(
        name = "order"
)
public class OrderEntity {
    @Id
    @GeneratedValue
    @Column
    private Long Id;
    private String name;
}
