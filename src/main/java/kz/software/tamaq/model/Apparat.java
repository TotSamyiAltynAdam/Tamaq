package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="apparats")
@Data
public class Apparat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;


    @ManyToOne
    @JoinColumn(name="cafeteria_id")
    private Cafeteria cafeteria;

}
