package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cafeterias")
@Data
public class Cafeteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany()
    @JoinColumn(name = "cafeteria_id")
    private List<Apparat> apparatList = new ArrayList<>();
}
