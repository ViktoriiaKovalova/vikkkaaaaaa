package com.vikka.model;

import java.awt.*;
import java.util.ArrayList;

public class NotRectangle {
    ArrayList<Point> points = new ArrayList<>();
    ArrayList<Integer> from = new ArrayList<>();
    ArrayList<Integer> to = new ArrayList<>();

    public NotRectangle() {
        // points
        points.add(new Point(100, 100));
        points.add(new Point(100, 700));
        points.add(new Point(700, 700));
        points.add(new Point(700, 200));
        points.add(new Point(200, 100));


        // edges
        from.add(0);
        to.add(1);
        from.add(1);
        to.add(2);
        from.add(2);
        to.add(3);
        from.add(3);
        to.add(4);
        from.add(4);
        to.add(0);
    }


    public ArrayList<Point> getPoints() {
        return points;
    }

    public ArrayList<Integer> getFrom() {
        return from;
    }

    public ArrayList<Integer> getTo() {
        return to;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public void setFrom(ArrayList<Integer> from) {
        this.from = from;
    }

    public void setTo(ArrayList<Integer> to) {
        this.to = to;
    }
}
