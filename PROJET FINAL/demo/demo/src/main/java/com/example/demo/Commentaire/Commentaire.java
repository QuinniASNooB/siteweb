package com.example.demo.Commentaire;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Commentaire {

    @Id
    @SequenceGenerator( name= "sequence_commentaire", sequenceName = "sequence_commentaire", allocationSize = 1)
    @GeneratedValue(strategy = SEQUENCE, generator = "sequence_commentaire")
    @Column(updatable = false)
    private Long id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String contenu;

    public Commentaire() {
    }

    public Commentaire(String contenu) {
        this.contenu = contenu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
