package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="foods")
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="price")
    private Long price;

    @OneToMany(mappedBy = "food")
    private List<Feedback> feedbackList;

    @ManyToMany
    private List<Ingredient> ingredientsList;
}
