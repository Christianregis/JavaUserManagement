package com.usermanagement.MySQLVersion.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.usermanagement.MySQLVersion.models.User;


public class UserRepositotyImpl implements UserRepository {
    private final JdbcTemplate jdbcTemplate;

    // RowMapper pour convertir les résultats SQL en objets User
    private final RowMapper<User> rowMapper = (rs, rowNum) -> {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setEmail(rs.getString("email"));
        return user;
    };

    public UserRepositotyImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /*
     * Implémentation de l'interface UserRepository pour la gestion des utilisateurs dans la base de données MySQL
     */
    @Override
    public void save(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
        System.err.println("Utilisateur enregistre: " + user.getName());
    }

    @Override
    public Optional<User> findById(Long id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        List<User> users = jdbcTemplate.query(sql, rowMapper, id);
        return users.stream().findFirst();
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM users WHERE id = "+id;
        jdbcTemplate.execute(sql);
        System.out.println("Utlisateur avec ID "+id+" Supprimee !");
    }

}
