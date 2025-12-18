import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel {

    JLabel headerLabel;

    public GamePanel(GameWindow window) {

        setLayout(new BorderLayout());
        setBackground(new Color(210, 245, 255)); // Soft Mint Blue

        // Header at top
        headerLabel = new JLabel("Game Board - Match All Pairs!", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setBorder(BorderFactory.createEmptyBorder(15, 0, 15, 0));
        headerLabel.setForeground(new Color(80, 0, 120)); // Candy purple-ish

        // Temporary placeholder center
        JLabel tempInfo = new JLabel("Tiles will appear here soon...", SwingConstants.CENTER);
        tempInfo.setFont(new Font("Verdana", Font.ITALIC, 20));

        // Back button
        JButton backButton = new JButton("Back to Menu");
        backButton.setFont(new Font("Arial", Font.PLAIN, 18));
        backButton.addActionListener(e -> window.showScreen(GameWindow.MENU_SCREEN));
        backButton.setBackground(new Color(255, 200, 150)); // Peach Candy

        add(headerLabel, BorderLayout.NORTH);
        add(tempInfo, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
    }
}
