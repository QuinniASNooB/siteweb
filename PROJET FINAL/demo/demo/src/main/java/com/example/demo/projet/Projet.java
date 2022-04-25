package com.example.demo.projet;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Projet implements Serializable {

    @Id
    @SequenceGenerator(
            name = "projet_sequence",
            sequenceName = "projet_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "projet_sequence"
    )
    private Long id;
    private String nomProjet;

    @Lob
    @Column(name="CONTENT", length=512)
    private String description;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String image1;

    private String image2;

    private String image3;

    private String video1;

    private String video2;

    private String video3;

    private String etat;

    public Projet(String nomProjet, String description, String image1, String image2, String image3, String video1, String video2, String video3, String etat) {
        this.nomProjet = nomProjet;
        this.description = description;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.video1 = video1;
        this.video2 = video2;
        this.video3 = video3;
        this.etat = etat;
    }
}
