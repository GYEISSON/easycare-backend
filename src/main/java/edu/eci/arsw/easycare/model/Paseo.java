package edu.eci.arsw.easycare.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Paseo {
    @Id
    @GeneratedValue
    private Long id;
    private String ruta;
    private int duracion;
}
