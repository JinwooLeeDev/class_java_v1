package swing.ch06;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;
    private final int MOVE_STEP = 20;

    public MyFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("이미지 겹치기 연습");
        setSize(1000, 600);
        setDefaultCloseOperation(3);

        // 배경 이미지 설정해보기
        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        backgroundMap = new JLabel(backgroundIcon);
        // 배치 관리자 좌표 ==> 컴포넌트 사이즈와 위치를 직접 지정해야 한다.
        backgroundMap.setSize(1000, 600);
        backgroundMap.setLocation(0, 0);

        // 플레이어 이미지 초기화
        ImageIcon playerIcon = new ImageIcon("images/playerL.png");
        player = new JLabel(playerIcon);
        player.setSize(100, 100);
        player.setLocation(200, 250);
    }

    private void setInitLayout() {
        // 루트 패널에 설정
        setLayout(null);
        add(backgroundMap);
        backgroundMap.add(player);
        setVisible(true);
        player.setFocusable(true);
        player.requestFocusInWindow();
    }

    private void addEventListener() {
        player.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) {           // 왼쪽
                    if(player.getX()-MOVE_STEP >= 0) {
                        player.setLocation(player.getX() - MOVE_STEP, player.getY());
                    }
                } else if (e.getKeyCode() == 38) {    // 위
                    if(player.getY()-MOVE_STEP >= 0) {
                        player.setLocation(player.getX(), player.getY() - MOVE_STEP);
                    }
                } else if (e.getKeyCode() == 39) {    // 오른쪽
                    if (player.getX() + MOVE_STEP + player.getWidth() <= backgroundMap.getWidth()) {
                        player.setLocation(player.getX() + MOVE_STEP, player.getY());
                    }
                } else if (e.getKeyCode() == 40) {    // 아래
                    if (player.getY() + MOVE_STEP + player.getHeight() <= backgroundMap.getHeight()) {
                        player.setLocation(player.getX(), player.getY() + MOVE_STEP);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }


    // 테트스 코드
    public static void main(String[] args) {
        new MyFrame();
    }

}