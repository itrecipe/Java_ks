import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class EventHandling extends JFrame {

	public EventHandling() {
		setTitle("계산기 화면");
		setSize(300, 250);

		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 300, 40);
		add(titlePanel);
		JLabel title = new JLabel("계산기", JLabel.CENTER);
		title.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		titlePanel.add(title);

		JPanel numPanel = new JPanel();
		numPanel.setBounds(0, 40, 300, 40);
		numPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		add(numPanel);
		JTextField num1 = new JTextField(5);
		numPanel.add(num1);
		JTextField num2 = new JTextField(5);
		numPanel.add(num2);

		JPanel btPanel = new JPanel();
		btPanel.setBounds(100, 80, 100, 80);
		btPanel.setLayout(new GridLayout(2, 2, 10, 5));
		add(btPanel);
		JButton plus = new JButton("+");
		btPanel.add(plus);
		JButton minus = new JButton("-");
		btPanel.add(minus);
		JButton multiply = new JButton("*");
		btPanel.add(multiply);
		JButton divide = new JButton("/");
		btPanel.add(divide);

		JPanel resultPanel = new JPanel();
		resultPanel.setBounds(0, 160, 300, 40);
		add(resultPanel);
		JLabel label01 = new JLabel("계산결과 : ");
		JLabel label02 = new JLabel("");
		resultPanel.add(label01);
		resultPanel.add(label02);

		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == plus) { // 더하기 버튼인지 확인
					int num01 = Integer.parseInt(num1.getText());
// 텍스트필드에 입력된 숫자 얻어오기
					int num02 = Integer.parseInt(num2.getText());
// 텍스트필드에 입력된 숫자 얻어오기 
					int result = num01 + num02; // 더하기 연산하기
					label02.setText(String.valueOf(result)); // 연산 결과 출력하기
				}
			}
		});

		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == minus) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
					int result = num01 - num02;
					label02.setText(String.valueOf(result));
				}
			}
		});

		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == multiply) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
					int result = num01 * num02;
					label02.setText(String.valueOf(result));
				}
			}
		});

		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == divide) {
					int num01 = Integer.parseInt(num1.getText());
					int num02 = Integer.parseInt(num2.getText());
					double result = (double) num01 / (double) num02;
					label02.setText(String.valueOf(result));
				}
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventHandling();
	}
}