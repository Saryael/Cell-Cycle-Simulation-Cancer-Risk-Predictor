import javax.swing.*;
import java.awt.*;

public class SimulationPanel extends JPanel {

    private SimulationEngine engine;

    public SimulationPanel() {
        engine = new SimulationEngine(50);

        Timer timer = new Timer(100, e -> {
            engine.update(0.1);
            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 20;
        int y = 50;

        for (Cell cell : engine.getCells()) {

            g.setColor(getColor(cell));
            g.fillOval(x, y, 20, 20);

            x += 30;
            if (x > getWidth() - 40) {
                x = 20;
                y += 30;
            }
        }
    }

    private Color getColor(Cell cell) {
        switch (cell.getPhase()) {
            case G1: return Color.BLUE;
            case S: return Color.GREEN;
            case G2: return Color.ORANGE;
            case M: return Color.RED;
        }
        return Color.GRAY;
    }
}