
package ga7.pkg220501096.aa2.model;

import java.sql.Timestamp;


public class User {
    
    private Long userId;
    private String username;
    private String passwordHash;
    private String publicKey;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());

    // Getters and setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp creadtedAt) {
        this.createdAt = creadtedAt;
    }
    
}
