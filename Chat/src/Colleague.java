public abstract class Colleague {
    private Mediator mediator;

    public void setMediator(Mediator m) {
        this.mediator = m;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
