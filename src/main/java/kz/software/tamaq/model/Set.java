package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="sets")
@Data
public class Set {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToMany
    private List<Food> foodList;

    @OneToOne
    @JoinColumn(name="type_id", referencedColumnName = "id")
    private Type type;

    @Column(name="count")
    private Long count;

    @ManyToMany
    private List<Apparat> apparatList;

    @Column(name="date")
    private LocalDateTime date;

}
