package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="feedbacks")
@Data
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name="food_id")
    private Food food;

    @Column(name="message")
    private String message;

    @Column(name="rank")
    private Integer rank;
}
