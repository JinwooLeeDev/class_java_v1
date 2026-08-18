package swing.ch04;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JPanel panel1;

    public ColorChangeFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(3);
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        panel1 = new JPanel();
    }

    void setInitLayout() {
        setLayout(new BorderLayout());
        panel1.setBackground(Color.YELLOW);
        panel1.add(button1);
        panel1.add(button2);
        add(panel1);
        setVisible(true);
    }

    private void addEventListener() {
        // button1의 객체에 이벤트 리스너 등록 --> 약속 ---> actionPerformed() 메서드가 콜백 됨
        button1.addActionListener(this);
        button2.addActionListener(this);
    }

    // ActionListener 의 추상 메서드를 구현 메서드로 재정의
    // 미리 약속되어 있는 메서드, 즉 어떤 이벤트가 발생하면
    // 아래의 메서드가 동작되도록 설계되어 있다. (콜백 메서드라고도 부른다)
    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getSource());
        JButton selectedButton = (JButton) e.getSource();

        if (selectedButton == button1) {
            System.out.println("1번 버튼");
            panel1.setBackground(Color.RED);
        } else if (selectedButton == button2) {
            System.out.println("2번 버튼");
            panel1.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
        // 메서드를 일반적으로 호출 a.abc(); 으로 했었는데
        // 어떤 이벤트가 발생하면 불려져서 (콜백) 동작함 <--- 콜백 메서드
    }
}
