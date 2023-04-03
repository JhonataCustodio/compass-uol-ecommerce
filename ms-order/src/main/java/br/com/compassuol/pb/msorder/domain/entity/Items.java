package br.com.compassuol.pb.msorder.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collation = "items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Items {
    @Id
    private Integer id;
    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate expirationDate;
    private Double amount;
    private String offer;
}

