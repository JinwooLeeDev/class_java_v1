package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

public class MoveLabelFrame extends JFrame {

    private JLabel label;
    private final int MOVE_STEP = 10;
    int count = 0;
    private Random random = new Random();
    ArrayList<JLabel> list = new ArrayList<>();
    private Timer generateTimer;
    private Timer moveTimer;

    public MoveLabelFrame() {
        initData();
        setInitLayout();
        addEventListener();
        randomGenerate();
    }

    private void randomGenerate() {
        generateTimer = new Timer(2000, e -> {generateAdd();});
        moveTimer = new Timer(30, e -> {moveGeneratedLabels();});
        generateTimer.start();
        moveTimer.start();
    }

    private void moveGeneratedLabels() {
        for (int i = list.size() - 1; i >= 0; i--) {
            JLabel generatedLabel = list.get(i);
            // 기존 x좌표는 유지하고 y좌표만 증가
            generatedLabel.setLocation(generatedLabel.getX(), generatedLabel.getY() + 3);
        }
    }

    private void generateAdd() {
        JLabel generatedLabel = new JLabel("▼");
        generatedLabel.setSize(100, 100);
        int randomX = random.nextInt(500);
        // 무작위 가로위치 + y좌표는 0에 배치
        generatedLabel.setLocation(randomX, 0);
        // 리스트와 화면에 추가
        list.add(generatedLabel);
        add(generatedLabel);
    }

    private void renameTitle() {
        setTitle("방향키로 별 움직이기 연습 | 총 이동 횟수 : " + count);
    }

    private void initData() {
        setTitle("방향키로 별 움직이기 연습 | 총 이동 횟수 : " + count);
        setSize(500, 500);
        setDefaultCloseOperation(3);
        setResizable(false);

        label = new JLabel("★");
        label.setFont(new Font("맑은 고딕", Font.BOLD, 30));
        // 좌표 기반 - 컴포넌트의 크기와 위치를 직접 설정해야함
        label.setSize(50, 50);   // 사이즈
        label.setLocation(250, 250);// 시작위치
    }

    private void setInitLayout() {
        setLayout(null);    // null --> 좌표 기반
        add(label);
        setVisible(true);
        label.setFocusable(true);
        label.requestFocusInWindow();
    }

    private void addEventListener() {
        label.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) {           // 왼쪽
                    label.setLocation(label.getX() - MOVE_STEP, label.getY());
                    renameTitle();
                    count++;

                } else if (e.getKeyCode() == 38) {    // 위
                    label.setLocation(label.getX(), label.getY() - MOVE_STEP);
                    renameTitle();
                    count++;
                } else if (e.getKeyCode() == 39) {    // 오른쪽
                    label.setLocation(label.getX() + MOVE_STEP, label.getY());
                    renameTitle();
                    count++;
                } else if (e.getKeyCode() == 40) {    // 아래
                    label.setLocation(label.getX(), label.getY() + MOVE_STEP);
                    renameTitle();
                    count++;
                }
                if (e.getKeyCode() == 32) {           // 위치 초기화
                    label.setLocation(250, 250);
                    renameTitle();
                    count++;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new MoveLabelFrame();
    }
}
