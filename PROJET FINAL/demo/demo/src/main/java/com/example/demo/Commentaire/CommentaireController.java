package com.example.demo.Commentaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.enicarthage.SiteWeb.Commentaire.CommentaireService;

import java.util.List;

@RestController
@RequestMapping(path= "/media")
public class CommentaireController {

    private final CommentaireService commentaireService;

    @Autowired
    public CommentaireController(CommentaireService commentaireService) {
        this.commentaireService = commentaireService;
    }


    @GetMapping
    public List<Commentaire> getCommentairess(){return commentaireService.getCommentaires();}

    @PostMapping
    public void postNewCommentaire(@RequestBody Commentaire commentaire){
        commentaireService.addNewCommentaire(commentaire);
    }

    @DeleteMapping(path = "{mediaId}")
    public void deleteCommentaire(@PathVariable ("commentaireId") Long commentaireId){
        commentaireService.deleteCommentaire(commentaireId);
    }


}
