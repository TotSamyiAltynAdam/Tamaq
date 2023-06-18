package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="fullName")
    private String fullName;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Report> reportList;

    @OneToMany(mappedBy = "owner")
    private List<Ticket> ticketList;

    @OneToMany(mappedBy = "owner")
    private List<Feedback> feedbackList;

    @Column(name="balance")
    private Long balance;
}
