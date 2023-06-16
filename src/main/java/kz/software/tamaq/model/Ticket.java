package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="tickets")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User owner;

    @OneToOne
    @JoinColumn(name="apparat_id",referencedColumnName = "id")
    private Apparat apparat;

    @Column(name="count")
    private Long count;
}
