package br.com.compassuol.pb.msorder.domain.entity;

import java.time.LocalDate;

public class Items {
    private Integer id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate expirationDate;
    private Double amount;
    private String offer;
}

