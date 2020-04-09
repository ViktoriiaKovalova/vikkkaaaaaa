package com.vikka.ui;

import com.vikka.model.NotRectangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class RectangleCanvas extends JPanel {

    final NotRectangle figure;

    public RectangleCanvas(NotRectangle figure) {
        this.figure = figure;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ArrayList<Point> points = figure.getPoints();
        ArrayList<Integer> from = figure.getFrom();
        ArrayList<Integer> to = figure.getTo();


        for (int i = 0; i < from.size(); ++i) {
            Point p1 = points.get(from.get(i));
            Point p2 = points.get(to.get(i));
            g.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
        }
    }
}
