import java.util.ArrayList;

public class SimulationEngine {

    private ArrayList<Cell> cells;

    public SimulationEngine(int numCells) {
        cells = new ArrayList<>();

        for (int i = 0; i < numCells; i++) {
            cells.add(new Cell());
        }
    }

    public void update(double deltaTime) {

        for (Cell cell : cells) {

            // Random mutation event
            if (Math.random() < 0.01) {
                cell.addDamage(0.2);
            }

            cell.update(deltaTime);

            double risk = RiskModel.calculateRisk(cell);
            cell.setCancerProbability(risk);
        }
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }
}