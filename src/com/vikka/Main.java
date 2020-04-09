package com.vikka;

import com.vikka.model.NotRectangle;
import com.vikka.ui.RectangleCanvas;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    private static void addComponent(Container container, Component c, int x, int y, int width, int height) {
        c.setBounds(x, y, width, height);
        container.add(c);
    }

    public static void main(String[] args) {
        NotRectangle rectangle = new NotRectangle();

        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(0, 0, 800, 850);

        // setting canvas for draw
        JPanel canvas = new RectangleCanvas(rectangle);

        // НЕ ТРОГАЙ ЭТОТ ИНПУТ -- ЭТО КОСТЫЛь
        JTextArea blockValue = new JTextArea("");
        blockValue.disable();

        JLabel angleLabel = new JLabel();
        JTextArea angleValue = new JTextArea("");
        angleValue.setBorder(new LineBorder(Color.red,1));
        //TODO: таким же методом создать поля для других параметров


        JButton repaintButton = new JButton("DO IT");
        repaintButton.addActionListener(e -> {
            int angle = Integer.parseInt(angleValue.getText());// ВЫЛЕТИТ ПТИЧКА ЕСЛИ ТУТ НЕ ЦЕЛОЕ ЧИСЛО В ИНПУТЕ
            //TODO: таким же методом достать поля для других параметров
            System.out.println(angle);

            //todo: вызываешь метод rectange где ты меняешь координаты, и туда передаешь параметры введенные

            canvas.repaint();
        });

        // todo: тут точнее координаты сделай(посчитай ручками -- мне влом было просчитывать расстояние), ну и ширину/высоту подбери
        addComponent(window, repaintButton, 0, 0, 100, 30);
        addComponent(window, canvas, 0, 50, 800, 800);
        addComponent(window, angleValue, 170, 0, 50, 30);
        addComponent(window, blockValue, 0, 0, 50, 30);

        // set visibility
        window.setVisible(true);
    }
}
