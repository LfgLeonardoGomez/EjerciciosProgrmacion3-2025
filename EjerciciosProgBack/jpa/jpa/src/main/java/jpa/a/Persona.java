package jpa.a;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import lombok.Data;
import org.hibernate.annotations.*;

import java.util.List;

@Entity
@Data
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "persona_id")
    private List<Auto> autos;
}
