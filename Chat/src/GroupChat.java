import java.util.*;

public class GroupChat implements Mediator {
    private List<User> users;
    
    public GroupChat() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        user.setMediator(this);
    }

    @Override
    public void sendMessageOperation(String message, User sender) {
        System.out.println("\n// " + sender.getUsername() + " enviou: " + message + " //\n");
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
