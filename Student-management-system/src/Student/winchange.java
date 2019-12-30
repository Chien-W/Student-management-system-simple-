package Student;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class winchange {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public void Winchange() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winchange window = new winchange();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public winchange() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u4FEE\u6539\u6570\u636E");
		frame.setBounds(100, 100, 800, 520);
		
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		
		JLabel label = new JLabel("\u4F60\u60F3\u8981\u4FEE\u6539\u7684\u5BF9\u8C61\u5B66\u53F7\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 28));
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JLabel label_2 = new JLabel("\u59D3\u540D\uFF1A");
		label_2.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JLabel label_3 = new JLabel("\u5E74\u9F84\uFF1A");
		label_3.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JLabel label_4 = new JLabel("\u6027\u522B\uFF1A");
		label_4.setFont(new Font("宋体", Font.PLAIN, 24));
		
		JLabel label_5 = new JLabel("\u9662\u7CFB\uFF1A");
		label_5.setFont(new Font("宋体", Font.PLAIN, 24));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S = textField.getText();
				String Num = textField_1.getText();
				String Name = textField_2.getText();
				String Age = textField_3.getText();
				String Sex = textField_4.getText();
				String SelectedIndex = textField_5.getText();
				Change.change(S,Num,Name,Age,Sex,SelectedIndex);
				JOptionPane.showMessageDialog(frame, "修改成功!");
				
			}
		});
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(25)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
							.addGap(61))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(486, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(51)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(label)
							.addGap(46)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_3)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(label_4)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_5))))
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
					.addGap(44))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}

