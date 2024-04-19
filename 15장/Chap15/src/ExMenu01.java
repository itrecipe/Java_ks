import javax.swing.*;

public class ExMenu01 extends JFrame {

	public ExMenu01() {
		setTitle("메뉴 만들기");
		setSize(400, 200);

		JMenuBar menuBar = new JMenuBar(); // 메뉴바 생성

		JMenu menu01 = new JMenu("File"); // 주메뉴 File 생성
		JMenu menu02 = new JMenu("Edit"); // 주메뉴 Edit 생성
		JMenu menu03 = new JMenu("Help"); // 주메뉴 Help 생성

		menuBar.add(menu01); // 메뉴바에 주메뉴 File 추가
		menuBar.add(menu02); // 메뉴바에 주메뉴 Edit 추가
		menuBar.add(menu03); // 메뉴바에 주메뉴 Help 추가

		JMenuItem item01 = new JMenuItem("New"); // 메뉴 항목 New 생성
		JMenuItem item02 = new JMenuItem("Open"); // 메뉴 항목 Open 생성
		menu01.add(item01); // 주메뉴에 메뉴 항목 New 추가
		menu01.add(item02); // 주메뉴에 메뉴 항목 Open 추가

		setJMenuBar(menuBar); // 프레임에 메뉴바 추가

		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[]) {
		new ExMenu01();
	}
}