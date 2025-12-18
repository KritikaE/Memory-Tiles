import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenuPanel extends JPanel {

    public MainMenuPanel(GameWindow window) {

        setLayout(new GridBagLayout());
        setBackground(new Color(255, 220, 240)); // Candy Pink

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 10, 15, 10);

        // Game title
        JLabel titleLabel = new JLabel("MEMORY FLIP GAME");
        titleLabel.setFont(new Font("Verdana", Font.BOLD, 32));
        titleLabel.setForeground(new Color(120, 0, 150)); // Jelly Purple

        // Buttons
        JButton startButton = new JButton("Start Game");
        JButton instructionsButton = new JButton("Instructions");
        JButton exitButton = new JButton("Exit");

        startButton.setFont(new Font("Arial", Font.PLAIN, 20));
        instructionsButton.setFont(new Font("Arial", Font.PLAIN, 20));
        exitButton.setFont(new Font("Arial", Font.PLAIN, 20));

        startButton.setBackground(new Color(255, 120, 180)); // Bubblegum Pink
        instructionsButton.setBackground(new Color(255, 240, 130)); // Lemon Yellow
        exitButton.setBackground(new Color(255, 80, 120)); // Strawberry Red


        startButton.addActionListener(e -> window.showScreen(GameWindow.GAME_SCREEN));

        // Instructions popup
        instructionsButton.addActionListener(e ->
                JOptionPane.showMessageDialog(
                        this,
                        "Flip 2 tiles at a time.\n"
                        + "If they match, they stay open.\n"
                        + "Match all pairs to win!",
                        "How To Play",
                        JOptionPane.INFORMATION_MESSAGE
                )
        );

        exitButton.addActionListener(e -> System.exit(0));

        gbc.gridy = 0;
        add(titleLabel, gbc);

        gbc.gridy = 1;
        add(startButton, gbc);

        gbc.gridy = 2;
        add(instructionsButton, gbc);

        gbc.gridy = 3;
        add(exitButton, gbc);
    }
}
