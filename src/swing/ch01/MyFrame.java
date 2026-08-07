package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    JButton[] buttons = new JButton[200];

    // 문제 1. JButton 객체를 JFrame 객체에 하나 더 올려보자. - 완료
    // 문제 2. 배열을 활용해서 코드를 수정해주세요 - 완료

    public MyFrame() {
        super.setTitle("배치 관리자 연습");
        super.setSize(600, 300);
        super.setVisible(true);

        initData();
        setInitLayout();
    }

    public void initData() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("버튼 " + (i+1) + "번");
        }
    }

    public void setInitLayout() {
        // 배치 관리자 선언
        FlowLayout flowLayout = new FlowLayout();

        // 컴포넌트들을 수평, 수직으로 프레임에 배치해주는 역할을 한다
        super.setLayout(flowLayout);

        for (int i = 0; i<buttons.length; i++) {
            add(buttons[i]);
        }
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyFrame();  // 생성자 호출 --> 생성자에 있는 로직이 동작 한다.
    }
}
