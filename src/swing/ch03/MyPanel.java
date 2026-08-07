package swing.ch03;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    // 패널 - 컴포넌트들을 그룹화 시킬 수 있다. (패널마다 다른 배치관리자를 설정할 수 도 있다.)
    private JPanel panel1;
    private JPanel panel2;

    public MyPanel() {
        setTitle("패널 연습");
        setSize(500, 500);
        setDefaultCloseOperation(3);
        initData();
        setInitLayout();

        setVisible(true);
    }

    private void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");

        panel1 = new JPanel();
        panel2 = new JPanel();
    }

    private void setInitLayout() {
        // 루트 패널의 배치 관리자 ---> Grid 사용
        setLayout(new GridLayout(2, 1));

        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.YELLOW);
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        super.add(panel1);
        super.add(panel2);
        panel1.add(button1);
        panel1.add(button2);
        panel2.add(button3);
        panel2.add(button4);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyPanel();
    }
}
