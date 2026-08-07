package swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    // JPanel을 상속한 클래스라 기능을 다 물려 받았다.
    MyImagePanel myImagePanel;

    public MyImageFrame() {
        setTitle("중첩 클래스 활용");
        setSize(600, 600);
        setDefaultCloseOperation(3);
        myImagePanel = new MyImagePanel();
        add(myImagePanel);
        setVisible(true);
    }

    // 2. 정적 내부 클래스 선언
    static class MyImagePanel extends JPanel {

        private Image image1;

        public MyImagePanel() {
            image1 = new ImageIcon("image1.png").getImage();
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawString("이미지게임", 200, 200);
            g.drawLine(100, 100, 300, 100);
            g.drawImage(image1, 100, 100, 100, 100, null);
        }
    } // end of inner class

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyImageFrame();
    }
} // end of outer class
