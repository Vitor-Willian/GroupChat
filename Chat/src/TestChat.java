import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestChat {
    
    @Test
    public void testGroupChat() {
        GroupChat groupChat = new GroupChat();

        User user1 = new User("Alfa");
        User user2 = new User("Bravo");
        User user3 = new User("Charlie");

        groupChat.addUser(user1);
        groupChat.addUser(user2);
        groupChat.addUser(user3);

        user1.sendMessage("Olá, pessoal!");
        user2.sendMessage("Oi, Alfa!");

        assertDoesNotThrow(() -> {
            groupChat.sendMessageOperation("Teste de mensagem", user1);
        });
    }
}
