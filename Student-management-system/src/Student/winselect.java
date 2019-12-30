package Student;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class winselect {

	private JFrame frame;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void Winselect() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winselect window = new winselect();
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
	public winselect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u67E5\u8BE2\u6570\u636E");
		frame.setBounds(100, 100, 800, 520);

		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);
		
		JLabel label = new JLabel("\u4F60\u60F3\u67E5\u8BE2\uFF1A");
		label.setBounds(38, 26, 152, 47);
		label.setFont(new Font("宋体", Font.PLAIN, 22));
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(288, 40, 59, 24);
		comboBox.addItem("学号");
		comboBox.addItem("姓名");
		comboBox.addItem("年龄");
		comboBox.addItem("性别");
		comboBox.addItem("院系");
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(comboBox);
		
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "查询成功!");
			}
		});
		button.setBounds(522, 39, 82, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
			}
		});
		
		button_1.setBounds(634, 39, 82, 27);
		frame.getContentPane().add(button_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(147, 40, 140, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 83, 782, 390);
		frame.getContentPane().add(scrollPane);
		
		
		
		
		
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String content = textField_1.getText();
				String[] dataTitle =Select.getHead();
				if(comboBox.getSelectedIndex() == 0)
				{
				//	System.out.println(content);
					String[][] data=Select.getnumber(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 1)
				{
				//	System.out.println(content);
					String[][] data=Select.getname(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 2)
				{
				//	System.out.println(content);
					String[][] data=Select.getage(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 3)
				{
				//	System.out.println(content);
					String[][] data=Select.getsex(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
				else if(comboBox.getSelectedIndex() == 4)
				{
				//	System.out.println(content);
					String[][] data=Select.getdepartments(content);
					table = new JTable(data,dataTitle);
					table.setFont(new Font("宋体", Font.PLAIN, 18));
					table.setRowHeight(25);
					scrollPane.setViewportView(table);
					table.setEnabled(false);
				}
			}
		});

	}
}

