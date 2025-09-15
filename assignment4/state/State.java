package state;

import java.util.Random;

public abstract class State {
    protected Package pkg;
    protected Random random = new Random();

    protected State(Package pkg) {
        this.pkg = pkg;
    }

    public abstract String getStatus();
    public abstract String getETA();
}
