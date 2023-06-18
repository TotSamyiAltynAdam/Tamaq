package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @JoinColumn(name="type_id")
    private Type type;

    @Column(name="date")
    private LocalDateTime date;

//    @ManyToOne
//    @JoinColumn(name="cafeteria_id")
//    private Cafeteria cafeteria;

    @OneToMany()
    @JoinColumn(name = "apparat_id")
    private List<FoodSet> foodSets = new ArrayList<>();

}
