package com.example.demo.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CommentaireService {


    private final CommentaireRepository commentaireRepository;

    @Autowired
    public CommentaireService(CommentaireRepository commentaireRepository) {
        this.commentaireRepository = commentaireRepository;
    }

    public List<Commentaire> getCommentaires() {
        return (commentaireRepository.findAll());
    }

    public void addNewCommentaire(Commentaire commentaire) {
        Optional<Commentaire> optionalProjet = commentaireRepository.findById(commentaire.getId());
        if (optionalProjet.isPresent()) {
            throw new IllegalStateException("**Un projet de même titre existe deja!**");
        }
        commentaireRepository.save(commentaire);
    }

    public void deleteCommentaire(Long commentaireId) {
        boolean test = commentaireRepository.existsById(commentaireId);
        if (!test) {
            throw new IllegalStateException("**Le commentaire avec l'id : " + commentaireId + " n'existe pas!**");
        }
        commentaireRepository.deleteById(commentaireId);
    }

}
