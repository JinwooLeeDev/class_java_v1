package swing.ch03;
import javax.swing.*;
import java.awt.*;

public class SwingFrame extends JFrame {

    MyImagePanel myImagePanel;

    public SwingFrame() {
        setTitle("도전과제");
        setSize(500,500);
        setDefaultCloseOperation(3);
        myImagePanel = new MyImagePanel();
        add(myImagePanel);
        setVisible(true);
    }

    // 중첩 클래스 활용
    static class MyImagePanel extends JPanel {
        private Image image1;
        public MyImagePanel() {
            image1 = new ImageIcon("images.png").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(100,200,100,100);
            g.drawLine(100,200,150,150);
            g.drawLine(150,150,200,200);
            g.drawLine(0,300,500,300);
            g.drawRoundRect(160,210,35,35,50,50);
            g.drawImage(image1, 0, 0, 500, 200, null);

        }
    }

    public static void main(String[] args) {
        new SwingFrame();
    }

}
