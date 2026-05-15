public class User extends Colleague {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String message) {
        if (getMediator() != null) {
            getMediator().sendMessageOperation(message, this);
        }
    }

    public void receiveMessage(String message) {
        System.out.println(username + " recebeu: " + message);
    }
    
}
