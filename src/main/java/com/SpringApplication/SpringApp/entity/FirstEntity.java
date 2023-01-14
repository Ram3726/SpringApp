package com.SpringApplication.SpringApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "first_table")

public class FirstEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sId;

    @Column(name = "sName")
    private String sName;


}
