package by.ilya_budevich.presenter;

import by.ilya_budevich.model.factory.ShapeFactory;
import by.ilya_budevich.view.MainFrame;

import java.awt.*;

public class MainPresenter {
    private static MainPresenter instance;
    private MainFrame view;

    private Shape currentShape;

    public String[] getShapeNames() {
        return ShapeFactory.getInstance().getShapeNames();
    }

    public void passParams(String shapeName, double ...params) {
        this.currentShape = ShapeFactory.getInstance().getShape(shapeName, params);
    }

    public void drawFigure() {
        if (currentShape == null) {
            return;
        }
        this.view.getDrawPanel().drawComponent(currentShape);
    }

    private MainPresenter() {
        this.view = MainFrame.getInstance();
    }

    public static MainPresenter getInstance() {
        if (instance == null) {
            instance = new MainPresenter();
        }
        return instance;
    }
}
