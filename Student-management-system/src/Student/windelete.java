package Student;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windelete {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public void Windelete() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windelete window = new windelete();
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
	public windelete() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5220\u9664\u6570\u636E");
		frame.setBounds(100, 100, 800, 520);
		
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		
		JLabel label = new JLabel("\u4F60\u9700\u8981\u5220\u9664\u7684\u5B66\u53F7\u662F\uFF1A");
		label.setBounds(14, 41, 300, 35);
		label.setFont(new Font("宋体", Font.PLAIN, 30));
		
		textField = new JTextField();
		textField.setBounds(317, 45, 189, 27);
		textField.setColumns(10);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		frame.getContentPane().add(textField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 98, 782, 375);
		frame.getContentPane().add(scrollPane);
		
		String[][] data=Show.getRows();
		String[] dataTitle =Show.getHead();
		table = new JTable(data,dataTitle);
		table.setFont(new Font("宋体", Font.PLAIN, 18));
		table.setRowHeight(25);
		scrollPane.setViewportView(table);
		table.setEnabled(false);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Num = textField.getText();
				Delete.delete(Num);
				JOptionPane.showMessageDialog(frame, "删除成功!");
				String[][] data=Show.getRows();
				String[] dataTitle =Show.getHead();
				table = new JTable(data,dataTitle);
				table.setFont(new Font("宋体", Font.PLAIN, 18));
				table.setRowHeight(25);
				scrollPane.setViewportView(table);
				table.setEnabled(false);
			}
		});
		button.setBounds(519, 45, 113, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u91CD\u7F6E");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_1.setBounds(646, 45, 113, 27);
		frame.getContentPane().add(button_1);
		
	}
}

