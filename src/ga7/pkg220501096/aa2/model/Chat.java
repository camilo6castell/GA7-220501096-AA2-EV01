
package ga7.pkg220501096.aa2.model;

import java.sql.Timestamp;

public class Chat {
    
    private Long conversationId;

    private User user1;
    private User user2;
    private Timestamp createdAt;

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }
    
}
