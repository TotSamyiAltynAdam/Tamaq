package kz.software.tamaq.model;

import jakarta.persistence.*;
import lombok.Data;

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

    @Column(name="balance")
    private Long balance;
}
