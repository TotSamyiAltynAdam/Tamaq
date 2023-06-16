package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="types")
@Data
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    @Column(name="name")
    private String name;
}
