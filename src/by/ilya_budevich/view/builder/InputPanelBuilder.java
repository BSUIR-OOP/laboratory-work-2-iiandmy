package by.ilya_budevich.view.builder;

import by.ilya_budevich.view.ShapePanel;

public class InputPanelBuilder {
    private static InputPanelBuilder instance;

    private ShapePanel result;

    public void reset() {
        result = new ShapePanel();
    }

    public ShapePanel build() {
        return result;
    }

    public void changeToRegularPanel() {
        result.makePanelRegular();
    }

    public void changeToSymmetricPanel() {
        result.makePanelSymmetric();
    }

    public void changeToTwoPointsPanel() {
        result.makePanelTwoPoints();
    }

    private InputPanelBuilder() {
        result = new ShapePanel();
    }

    public static InputPanelBuilder getInstance() {
        if (instance == null) {
            instance = new InputPanelBuilder();
        }
        return instance;
    }
}
