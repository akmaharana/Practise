package com.practices;

import java.awt.*;

public class TrafficlightUsingJframe extends Frame {
    public static void main(String[] args) {


        TrafficlightUsingJframe e = new TrafficlightUsingJframe();

        e.setSize(400, 300);

        e.setVisible(true);

        e.setTitle("Traffic Light");

    }

    public void paint(Graphics g) {

        while (true) {
            g.setColor(Color.black);
            g.fillRect(30, 30, 30, 90);
            try {
                g.setColor(Color.green);
                g.fillOval(30, 30, 30, 30);
                Thread.sleep(10000);
                g.setColor(Color.black);
                g.fillRect(30, 30, 30, 90);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                g.setColor(Color.yellow);
                g.fillOval(30, 60, 30, 30);
                Thread.sleep(5000);
                g.setColor(Color.black);
                g.fillRect(30, 30, 30, 90);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();

            }

            try {
                g.setColor(Color.red);
                g.fillOval(30, 90, 30, 30);
                Thread.sleep(10000);
                g.setColor(Color.black);
                g.fillRect(30, 30, 30, 90);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}

