

public class RiskModel {

    public static double calculateRisk(Cell cell) {

        double mPhaseRisk = 0;
        if (cell.getPhase() == Cell.Phase.M) {
            mPhaseRisk = cell.getTimeInPhase();
        }

        double damageRisk = cell.getDnaDamage();
        double checkpointRisk = cell.isCheckpointPassed() ? 0 : 1;

        double risk = (0.4 * mPhaseRisk)
                    + (0.4 * damageRisk)
                    + (0.2 * checkpointRisk);

        return Math.min(risk, 1.0);
    }
}