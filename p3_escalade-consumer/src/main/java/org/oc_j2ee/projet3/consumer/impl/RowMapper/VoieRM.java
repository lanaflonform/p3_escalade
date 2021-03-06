package org.oc_j2ee.projet3.consumer.impl.RowMapper;

import org.oc_j2ee.projet3.model.Voie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class VoieRM implements RowMapper<Voie> {
    @Override
    public Voie mapRow(ResultSet rs, int i) throws SQLException {

        Voie voie = new Voie();

        voie.setVoie_id(rs.getInt("voie_id"));
        voie.setSecteur_id(rs.getInt("secteur_id"));
        voie.setNom(rs.getString("nom"));
        voie.setEtat(rs.getBoolean("etat"));

        return voie;
    }
}
