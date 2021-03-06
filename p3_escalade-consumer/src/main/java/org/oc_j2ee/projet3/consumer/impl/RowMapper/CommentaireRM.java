package org.oc_j2ee.projet3.consumer.impl.RowMapper;


import org.oc_j2ee.projet3.model.Commentaire;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentaireRM implements RowMapper<Commentaire> {

    @Override
    public Commentaire mapRow(ResultSet rs, int i) throws SQLException {

        Commentaire commentaire = new Commentaire();

        commentaire.setId(rs.getInt("id"));
        commentaire.setArticleId(rs.getInt("article_id"));
        commentaire.setUtilisateurId(rs.getInt("utilisateur_id"));
        commentaire.setContent(rs.getString("contenu"));
        commentaire.setAuteur(rs.getString("auteur"));

        return commentaire;
    }
}
