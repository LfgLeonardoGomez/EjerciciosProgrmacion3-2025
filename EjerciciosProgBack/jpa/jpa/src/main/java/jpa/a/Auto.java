package jpa.a;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
