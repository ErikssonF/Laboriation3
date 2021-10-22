package com.example.paintdemo;

import javafx.scene.canvas.Canvas;

public class ResizableCanvas extends Canvas {
    @Override
    public boolean isResizable() {
        return true;
    }

    @Override
    public double prefHeight(double v) {
        return super.getHeight();
    }


    @Override
    public double prefWidth(double v) {
        return super.getWidth();
    }

    @Override
    public double minHeight(double v) {
        return 1;
    }

    @Override
    public double minWidth(double v) {
        return 1;
    }

    @Override
    public double maxHeight(double v) {
        return Double.MAX_VALUE;
    }

    @Override
    public double maxWidth(double v) {
        return Double.MAX_VALUE;
    }

    @Override
    public void resize(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

}
