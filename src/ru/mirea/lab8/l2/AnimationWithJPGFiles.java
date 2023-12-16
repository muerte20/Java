package ru.mirea.lab8.l2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWithJPGFiles {
    private static int frameIndex = 1;
    private static Timer timer;
    private static final int FRAME_DELAY = 100; // Задержка между кадрами (в миллисекундах)
    private static final int numFrames = 5; // Общее количество кадров

    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация с кадрами");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Здесь мы рисуем текущий кадр
                String fileName;
                if (frameIndex == 1) {
                    fileName = "D://pic/jpeg1.jpeg"; // Замените на абсолютный путь к вашему файлу
                } else {
                    fileName = "D://pic/jpeg" + frameIndex + ".jpg"; // Замените на абсолютные пути к вашим файлам
                }
                ImageIcon imageIcon = new ImageIcon(fileName);
                Image image = imageIcon.getImage();
                g.drawImage(image, 0, 0, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Обновляем индекс кадра
                frameIndex = (frameIndex % numFrames) + 1;
                panel.repaint();
            }
        };

        // Создаем таймер для обновления кадров
        timer = new Timer(FRAME_DELAY, actionListener);
        timer.start();
    }
}
