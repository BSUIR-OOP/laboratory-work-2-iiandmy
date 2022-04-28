package by.ilya_budevich.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance;

    public final int WINDOW_WIDTH = 600;
    public final int WINDOW_HEIGHT = 400;

    private JPanel drawPanel;
    private JPanel menuPanel;

    public DrawPanel getDrawPanel() {
        return (DrawPanel) drawPanel;
    }

    private MainFrame() {
        super("Paint!");

        // Frame setup
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.setResizable(false);

        // Add draw panel
        drawPanel = new DrawPanel();
        this.add(drawPanel, BorderLayout.CENTER);

        // Add menu panel
        menuPanel = new MenuPanel();
        this.add(menuPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }

    public static MainFrame getInstance() {
        if (instance == null) {
            instance = new MainFrame();
        }
        return instance;
    }
}
