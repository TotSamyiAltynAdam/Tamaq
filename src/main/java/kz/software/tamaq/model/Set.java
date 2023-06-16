package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="sets")
@Data
public class Set {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


}
