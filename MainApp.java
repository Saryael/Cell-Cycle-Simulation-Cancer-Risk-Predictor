

import javax.swing.*;

public class MainApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Cell Cycle Simulation");
        SimulationPanel panel = new SimulationPanel();

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}