package ru.mirea.lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultApp {

    private JFrame frame;
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    private int milanScore = 0;
    private int madridScore = 0;

    public MatchResultApp() {
        frame = new JFrame("Match Results");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        frame.add(milanButton);
        frame.add(madridButton);
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);

        frame.setVisible(true);
    }

    private void updateLabels(String team) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + team);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MatchResultApp());
    }
}

