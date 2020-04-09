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
    
     ArrayList<Double> Multiply(ArrayList<ArrayList<Double>> matrix, ArrayList<Double> vector) {
        int n = matrix.size();
        ArrayList<Double> res = new ArrayList<Double>();
        for (int i = 0; i < n; ++i) {
            double sum = 0;
            for (int j = 0; j < n; ++j) {
                sum += matrix.get(i).get(j) * vector.get(j);
            }
            res.add(sum);
        }
        return res;
    }

    void MakeMoves(int degree, int move_x, int move_y, int x, int y) {
        double deg = degree / 360.0 * 2.0 * Math.PI;
        ArrayList<ArrayList<Double>> matrix = new ArrayList<ArrayList<Double>>();
        matrix.add(new ArrayList<Double>(Arrays.asList(cos(deg), -sin(deg))));
        matrix.add(new ArrayList<Double>(Arrays.asList(sin(deg), cos(deg))));
        for (Point p : points) {
            p.setX(p.getX() + move_x);
            p.setY(p.getY() + move_y);
            ArrayList<Double> pnt =
                    Multiply(matrix, new ArrayList(Arrays.asList(p.getX(), p.getY())));
            p.setX((int)(double) pnt.get(0));
            p.setY((int)(double) pnt.get(1));
        }
    }
}
