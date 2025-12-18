import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    CardLayout cardLayout;
    JPanel mainPanel;

    public static final String MENU_SCREEN = "Menu Screen";
    public static final String GAME_SCREEN = "Game Screen";

    public GameWindow() {

        setTitle("Memory Game - Flipping Tiles");
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        MainMenuPanel menu = new MainMenuPanel(this);
        GamePanel game = new GamePanel(this);

        mainPanel.add(menu, MENU_SCREEN);
        mainPanel.add(game, GAME_SCREEN);

        add(mainPanel);
    }

    public void showScreen(String screenName) {
        cardLayout.show(mainPanel, screenName);
    }
}
