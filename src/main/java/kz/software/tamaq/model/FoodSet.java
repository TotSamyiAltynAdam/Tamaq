package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="sets")
@Data
public class FoodSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToMany
    private List<Food> foodList = new ArrayList<>();


    @Column(name="count")
    private Long count;

//    @OneToOne
//    private Apparat apparat;


}
