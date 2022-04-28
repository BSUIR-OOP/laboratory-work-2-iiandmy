package by.ilya_budevich.view;

import by.ilya_budevich.presenter.MainPresenter;
import by.ilya_budevich.model.factory.ShapeFactory;
import by.ilya_budevich.utils.SizeConstants;
import by.ilya_budevich.view.builder.InputPanelBuilder;

import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel {
    private LayoutManager layout;

    private JComboBox shapeChooseCB;
    private JButton paintBN;
    private ShapePanel inputPanel;

    public static final int REGULAR_PANEL = 0;
    public static final int SYMMETRIC_PANEL = 1;
    public static final int TWO_POINTS_PANEL = 2;

    public MenuPanel() {
        initLayout();
        initPanel();
    }

    private void initLayout() {
        this.layout = new FlowLayout();
        this.setLayout(layout);
    }

    private void initPanel() {
        initUI();
        initSizes();
        initListeners();
        this.add(shapeChooseCB);
        this.add(inputPanel);
        this.add(paintBN);
    }

    private void initUI() {
        this.shapeChooseCB = new JComboBox<>(ShapeFactory.getInstance().getShapeNames());
        this.paintBN = new JButton("Paint!");
        this.inputPanel = buildPanel(REGULAR_PANEL);
        this.setBackground(Color.LIGHT_GRAY);
    }

    private void initListeners() {
        this.shapeChooseCB.addItemListener((e) -> {
            String selectedField = (String) this.shapeChooseCB.getSelectedItem();
        });

        this.paintBN.addActionListener((event) -> {
            String selectedField = (String) this.shapeChooseCB.getSelectedItem();
            MainPresenter.getInstance().passParams(selectedField, inputPanel.getParams());
            MainPresenter.getInstance().drawFigure();
        });
    }

    private void initSizes() {
        this.shapeChooseCB.setPreferredSize(SizeConstants.DEFAULT_COMBOBOX_DIMENSION);
        this.paintBN.setPreferredSize(SizeConstants.DEFAULT_BTN_DIMENSION);
    }

    private ShapePanel buildPanel(int panelType) {
        InputPanelBuilder builder = InputPanelBuilder.getInstance();
        builder.reset();
        switch (panelType) {
            case 1 -> builder.changeToSymmetricPanel();
            case 2 -> builder.changeToTwoPointsPanel();
            default -> builder.changeToRegularPanel();
        }
        return builder.build();
    }
}
