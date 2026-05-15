import java.util.List;

public class GroupChat implements Mediator {
    private List<User> users;
    
    public void addUser(User user) {
        users.add(user);
        user.setMediator(this);
    }

    @Override
    public void sendMessageOperation(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }
}
