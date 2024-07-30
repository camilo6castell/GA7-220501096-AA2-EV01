
package ga7.pkg220501096.aa2.service;

import ga7.pkg220501096.aa2.controller.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import ga7.pkg220501096.aa2.model.User;
import java.util.ArrayList;
import java.util.List;



public class Service {
    
    private Connection connection = MyConnection.connect();
    
    public List<User> getAllUsers() throws SQLException {
        
        String sql = "SELECT * FROM users";
        List<User> userList = new ArrayList<>();
        
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Long userId = rs.getLong("user_id");
                String username = rs.getString("username");
                String publicKey = rs.getString("public_key");
                
                userList.add(new User(userId, username, publicKey));
            }
        }
        return userList;
    }
    
    
    public static void createUser(Connection conn, User user) throws SQLException {
        String sql = "INSERT INTO users (username, password_hash, public_key) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getPasswordHash());
            pstmt.setString(3, user.getPublicKey());
            pstmt.executeUpdate();

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setUserId(generatedKeys.getLong(1));
                }
            }
        }
    }

    public static User getUserByUsername(Connection conn, String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setUserId(rs.getLong("user_id"));
                    user.setUsername(rs.getString("username"));
                    user.setPasswordHash(rs.getString("password_hash"));
                    user.setPublicKey(rs.getString("public_key"));
                    user.setCreatedAt(rs.getTimestamp("created_at"));
                    return user;
                }
            }
        }
        return null;
    }

    public static void updateUser(Connection conn, User user) throws SQLException {
        String sql = "UPDATE users SET password_hash = ?, public_key = ? WHERE username = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, user.getPasswordHash());
            pstmt.setString(2, user.getPublicKey());
            pstmt.setString(3, user.getUsername());
            pstmt.executeUpdate();
        }
    }

    public static void deleteUser(Connection conn, Long userId) throws SQLException {
        String sql = "DELETE FROM users WHERE user_id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, userId);
            pstmt.executeUpdate();
        }
    }


    
}
