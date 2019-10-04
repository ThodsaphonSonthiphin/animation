package com.myanimation;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    int x = 70;
    int y = 70;
    public static void main(String[] args) {
        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.go();

    }

    private void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Myplanel myplanel = new Myplanel();
        frame.getContentPane().add(myplanel);

        frame.setSize(500,500);
        frame.setVisible(true);

        for(int i = 0; i< 130; i++){
            x++;
            y++;
            myplanel.repaint();

            try{
                Thread.sleep(50);
            }catch (Exception ex){
                ex.printStackTrace();
            }

            if(i == 129){
                i = 0;
                x = 0;
                y = 0;
            }
        }

    }


    class Myplanel extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.green);

            g.fillOval(x,y,40,40);
        }
    }
}
