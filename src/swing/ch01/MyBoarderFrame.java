package swing.ch01;

import javax.swing.*;
import java.awt.*;

public class MyBoarderFrame extends JFrame {

    // 문제1 배열 변경
    private JButton[] buttons;
    // 배열 선언과 동시에 초기화 (필요하다면 변수 및 배열을 선언해서 활용할 수 있다)
    // String 배열
    private final String[] directions = {BorderLayout.NORTH, BorderLayout.WEST,
            BorderLayout.EAST, BorderLayout.SOUTH, BorderLayout.CENTER};
    private BorderLayout borderLayout;

    public MyBoarderFrame() {

        setTitle("boarderLayout 연습");
        setSize(600, 400);
        setVisible(true);
        // x 누르면 동시에 프로그램도 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initData();
        setInitLayout();

    }

    public void initData() {
        // 문제2 배열과 for  활용
        borderLayout = new BorderLayout();
        buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("button" + (i + 1));
        }
    }

    public void setInitLayout() {
        // 배치 관리자 선정을 하고 Frame 설정해 보자.
        setLayout(borderLayout); // Frame 에 배치관리자 설정
        // 보더 레이아웃은 add 할때 동 서 남 북 가운데 를 명시해주어야 한다.
        // 문제3 배열과 for  활용
        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i], directions[i]);
        }
    }
}
