# Cell Cycle Cancer Risk Simulator

## Overview

A Java-based graphical simulator that models the progression of cells through the eukaryotic cell cycle (G1, S, G2, and M phases). The application allows users to observe real-time changes in cell behavior, including DNA damage accumulation, checkpoint regulation, and the probability of cancer development during replication.

This project combines biological modeling with interactive software simulation to visualize how abnormalities in the cell cycle can contribute to cancer formation.

---

##  Features

• Interactive graphical user interface (GUI)
• Real-time cell cycle simulation
• Color-coded visualization of cell phases
• DNA damage accumulation and mutation events
• G2 checkpoint regulation system
• Cancer probability prediction model
• Dynamic cell population behavior

---

##  Simulation Model

The simulation is based on a simplified representation of the cell cycle:

G1 → S → G2 → M

Each cell progresses through these phases based on time-dependent transitions. The system introduces stochastic DNA damage events that influence checkpoint behavior and overall cell health.

Cancer risk is estimated using a weighted model:

risk = (0.4 × M phase duration)
+ (0.4 × DNA damage)
+ (0.2 × checkpoint failure)

Where:

risk = probability of cancer-like behavior
M phase duration = time spent in mitosis
DNA damage = accumulated genetic instability
checkpoint failure = inability to repair before division

Prolonged mitosis and failed checkpoints increase the likelihood of abnormal cell division.

---

##  Technologies Used

Java
Java Swing (GUI framework)
Object-Oriented Programming
Real-Time Simulation
Biological Modeling

---

## Project Structure

src/

cell_simulation/
MainApp.java
SimulationPanel.java
SimulationEngine.java
Cell.java
RiskModel.java

---

##  How to Run

1. Clone the repository
2. Open the project in an IDE (Eclipse, IntelliJ, or VS Code)
3. Compile the project:

javac -d bin src/cell_simulation/*.java

4. Run the application:

java -cp bin cell_simulation.MainApp

---

##  Future Improvements

Real-time graph of cancer probability
User-controlled mutation rate and phase timing
Machine learning-based risk prediction
Integration with biological datasets
Simulation of tumor cell populations
Enhanced visualization and animations

---

##  License

This project is licensed under the MIT License.
