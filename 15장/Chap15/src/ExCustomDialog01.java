import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExCustomDialog extends JDialog {
	private JPanel panel1, panel2;
	private JLabel label;
	private JButton okBtn;
	private JButton cancelBtn;

	public ExCustomDialog(JFrame frame, String str) {
		super(frame, str, true);
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		add(panel1);

		label = new JLabel("커스텀 대화상자!", JLabel.CENTER);
		panel1.add(label, BorderLayout.CENTER);
		panel2 = new JPanel();
		panel1.add(panel2, BorderLayout.SOUTH);

		okBtn = new JButton("닫기");

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // 다이얼로그 제거
			}
		});
		panel2.add(okBtn);

		cancelBtn = new JButton("취소");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // 다이얼로그 제거
			}
		});
		panel2.add(cancelBtn);
		setSize(200, 150);
	}
}