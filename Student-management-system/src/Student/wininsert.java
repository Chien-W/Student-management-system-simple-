package Student;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class wininsert {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public void Wininsert() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wininsert window = new wininsert();
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
	public wininsert() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u63D2\u5165\u6570\u636E");
		frame.setBounds(100, 100, 800, 520);
		
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		
		JLabel label = new JLabel("\u4F60\u9700\u8981\u63D2\u5165\u7684\u6570\u636E\u4E3A\uFF1A");
		label.setBounds(30, 45, 300, 35);
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		
		JLabel label_1 = new JLabel("\u5B66\u53F7\uFF1A");
		label_1.setBounds(30, 135, 75, 30);
		label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		
		JLabel label_2 = new JLabel("\u59D3\u540D\uFF1A");
		label_2.setBounds(30, 190, 75, 30);
		label_2.setFont(new Font("宋体", Font.PLAIN, 25));
		
		JLabel label_3 = new JLabel("\u5E74\u9F84\uFF1A");
		label_3.setBounds(30, 245, 75, 30);
		label_3.setFont(new Font("宋体", Font.PLAIN, 25));
		
		JLabel label_4 = new JLabel("\u6027\u522B\uFF1A");
		label_4.setBounds(30, 300, 75, 30);
		label_4.setFont(new Font("宋体", Font.PLAIN, 25));
		
		JLabel label_5 = new JLabel("\u9662\u7CFB\uFF1A");
		label_5.setBounds(30, 355, 75, 30);
		label_5.setFont(new Font("宋体", Font.PLAIN, 25));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(label_2);
		frame.getContentPane().add(label_3);
		frame.getContentPane().add(label_4);
		frame.getContentPane().add(label_5);
		
		textField = new JTextField();
		textField.setBounds(99, 139, 213, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(99, 196, 213, 24);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(99, 248, 213, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(99, 305, 213, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(99, 359, 213, 24);
		frame.getContentPane().add(textField_4);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num = textField.getText();
				String Name = textField_1.getText();
				String Age = textField_2.getText();
				String Sex = textField_3.getText();
				String SelectedIndex = textField_4.getText();
			//	System.out.println(Num+" "+Name+" "+Age+" "+Sex+" "+SelectedIndex+" ");
				Insert.insert(Num,Name,Age,Sex,SelectedIndex);
				JOptionPane.showMessageDialog(frame, "增加成功!");
			}
		});
		button.setBounds(403, 364, 141, 84);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		button_1.setBounds(599, 364, 141, 84);
		frame.getContentPane().add(button_1);
		
	}
}

