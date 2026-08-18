package swing.ch05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventListenerFrame extends JFrame {

    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    public KeyEventListenerFrame() {
        initData();
        setInitLayout();
        addEventListener();
        setVisible(true);
    }

    private void initData() {
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(3);
        super.setResizable(false);  // 사용자 맘대로 크기조절을 할 수 없음
        textArea = new JTextArea();
        textArea.setBackground(Color.YELLOW);
        Font myFont = new Font("SansSerif", Font.BOLD, 20);
        textArea.setFont(myFont);
    }

    private void setInitLayout() {
        add(textArea);
    }

    private void addEventListener() {
        // 이벤트 리스너 등록 - 익명 내부 클래스로 처리
        textArea.addKeyListener(new KeyListener() {

            int count = 0;
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("키 누름 : " + e.getKeyCode());
                // 도전 - 이벤트를 받아서 위 쪽 화살표면 위쪽 화살표라고 출력   ⬆  ️⬆️⬆️⬆️⬆️
                if (e.getKeyCode()==37) {
                    textArea.append("⬅️⬅️");
                    textArea.append("왼쪽\n");
                    count++;
                } else if (e.getKeyCode()==38) {
                    textArea.append("⬆️⬆️");
                    textArea.append("위\n");
                    count++;
                } else if (e.getKeyCode()==39) {
                    textArea.append("➡️➡️");
                    textArea.append("오른쪽\n");
                    count++;
                } else if (e.getKeyCode()==40) {
                    textArea.append("⬇️⬇️");
                    textArea.append("아래\n");
                    count++;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased 발생 : " + e.getKeyCode());
                if (count >= 16) {
                    textArea.setText("");
                    count = 0;
                }
            }
        });
    }

    public static void main(String[] args) {
        new KeyEventListenerFrame();
    }

}
