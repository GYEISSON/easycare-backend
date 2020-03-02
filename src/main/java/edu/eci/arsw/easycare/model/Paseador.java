package edu.eci.arsw.easycare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Paseador {
    @Id
    private Long documento;
    private String tDoc;
    @NonNull
    private String nombre;
    private String correo;
    private String telefono;

    @ManyToMany
    private Set<Paseo> paseos_Ofrecidos;

    @ManyToMany
    private Set<Subasta> subastas;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Mascota> mascotas;
}
