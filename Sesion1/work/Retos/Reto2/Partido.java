package org.bedu.javase2.models;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name="partidos")
public class Partido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "equipos1_fk", referencedColumnName = "id")
    private Equipo equipo1;

    @ManyToOne
    @JoinColumn(name = "equipos2_fk", referencedColumnName = "id")
    private Equipo equipo2;

    @Column(name="marcador_equipo_1")
    private Integer marcadorEquipo1;

    @Column(name="marcador_equipo_2")
    private Integer marcadorEquipo2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
