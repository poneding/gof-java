package state;


public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        if (state != null) {
            state.handle(this);
        } else {
            System.out.println("State is not set.");
        }
    }
}
