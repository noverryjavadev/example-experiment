package ex.allimplements.exampleimplementation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author "Noverry Ambo"
 * @start 3/25/2023
 */
@Entity
@Table(name = "roles")
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    public Role() {}

    public Role(ERole name) {
        this.name = name;
    }

    public enum ERole {
        ROLE_USER,
        ROLE_MODERATOR,
        ROLE_ADMIN
    }
}
