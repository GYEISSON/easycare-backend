package edu.eci.arsw.easycare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    private Long documento;
    private String tDoc;
    @NonNull
    private String nombre;
    private String email;
    private String telefono;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Subasta> subastas;

    @ManyToMany
    private Set<Paseo> paseos;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Mascota> mascotas;
}
