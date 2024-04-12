package com.market.main;

import javax.swing.*;
import java.awt.*;

//고객 저어보 입력 클래스 생성
public class GuestWindow extends JFrame { //부모인 JFrame을 상속을 받는다. 
	
	//메인 프레임 화면 만들기
	public GuestWindow(String title, int x, int y, int width, int height) {
		
		initContainer(title, x, y, width, height); //initContainer() 메서드 호출
		setVisible(true); //프레임 보이기 설정
		setResizable(true); // 프레임 크기 조절 기능 설정
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //프레임 닫기(x) 버튼 기능 설정
		setIconImage(new ImageIcon("./images/shop.png").getImage()); //프레임 아이콘 표시
	}
	
	private void initContainer(String title, int x, int y, int width, int height) {
		setTitle(title); //프레임 제목 설정
		setBounds(x, y, width, height); //프레임 위치, 크기 설정
		setLayout(null); //프레임 레이아웃 미설정
		
		Font ft;
		ft = new Font("함초롬돋움", Font.BOLD, 15); //글꼴, 스타일, 크기 설정
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width - 1000) / 2, (screenSize.height - 750 / 2)); //pc 화면에 맞춰 프레임 창을 화면 중앙에 출력한다.
		
		// user.png 이미지 표시를 위한 패널 영역 설정 및 출력 
		JPanel userPanel = new JPanel();
		userPanel.setBounds(0, 100, 1000, 256);
		
		ImageIcon imageIcon = new ImageIcon("./images/user.png");
		imageIcon.setImage(imageIcon.getImage().getScaledInstance
				(160, 160, Image.SCALE_SMOOTH));
		
		JLabel userLabel = new JLabel(imageIcon);
		userPanel.add(userLabel);
		add(userPanel);
		// 여기까지 / user.png 이미지 표시를 위한 패널 영역 설정 및 출력 부분
		
		//--고객 정보를 입력-- 표시를 위한 패널 영역 설정 및 출력
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 350, 1000, 50);
		add(titlePanel);
		
		JLabel titleLabel = new JLabel("--고객 정보를 입력--");
		titleLabel.setFont(ft); //JLabel 글꼴 설정
		titleLabel.setForeground(Color.blue); //JLabel 문자열 색상 설정
		titleLabel.add(titleLabel);
		
		//이름 표시를 위한 패널 영역 설정 및 출력
		JPanel namePanel = new JPanel();
		namePanel.setBounds(0, 350, 1000, 50);
		add(namePanel);
		
		JLabel nameLabel = new JLabel("이 름 : ");
		nameLabel.setFont(ft);
		nameLabel.add(nameLabel);
		
		JTextField nameField = new JTextField(10);
		nameField.setFont(ft);
		namePanel.add(nameField);
		//여기까지 / 이름 표시를 위한 패널 영역 설정 및 출력
	}
	
	public static void main(String[] args) {
		new GuestWindow("고객 정보 입력", 0, 0, 1000, 750);
	}
}
