

public class Cell {

    public enum Phase {
        G1, S, G2, M
    }

    private Phase phase;
    private double timeInPhase;

    private double dnaDamage;
    private boolean checkpointPassed;

    private double cancerProbability;

    public Cell() {
        phase = Phase.G1;
        timeInPhase = 0;
        dnaDamage = Math.random() * 0.2;
        checkpointPassed = true;
        cancerProbability = 0;
    }

    public void update(double deltaTime) {
        timeInPhase += deltaTime;

        switch (phase) {
            case G1:
                if (timeInPhase > 2) transition(Phase.S);
                break;
            case S:
                if (timeInPhase > 3) transition(Phase.G2);
                break;
            case G2:
                checkpointPassed = dnaDamage < 0.5;
                if (timeInPhase > 2 && checkpointPassed) {
                    transition(Phase.M);
                }
                break;
            case M:
                if (timeInPhase > 1.5) {
                    transition(Phase.G1);
                    dnaDamage *= 0.5; // partial repair
                }
                break;
        }
    }

    private void transition(Phase newPhase) {
        phase = newPhase;
        timeInPhase = 0;
    }

    // getters & setters
    public Phase getPhase() { return phase; }
    public double getTimeInPhase() { return timeInPhase; }
    public double getDnaDamage() { return dnaDamage; }
    public boolean isCheckpointPassed() { return checkpointPassed; }

    public double getCancerProbability() { return cancerProbability; }
    public void setCancerProbability(double p) { cancerProbability = p; }

    public void addDamage(double amount) {
        dnaDamage += amount;
        if (dnaDamage > 1) dnaDamage = 1;
    }
}