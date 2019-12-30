package Student;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Test {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		new Link();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406");
		frame.setBounds(100, 100, 800, 520);
		frame.setLocation(600,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		int windowWidth = frame.getWidth(); //获得窗口宽
		 int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		 int screenHeight = screenSize.height; //获取屏幕的高
		 frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(1, 66, 781, 407);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
		scrollPane.setViewportView(textArea);
		textArea.append("Student数据库加载成功\n");
		
		JButton btnNewButton = new JButton("\u589E\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wininsert w1=new wininsert();
				w1.Wininsert();
				textArea.append("插入成功！\n");
				
			}
		});
		btnNewButton.setBounds(1, 0, 113, 53);
		
		JButton button = new JButton("\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				windelete w2=new windelete();
				w2.Windelete();
				textArea.append("插入成功！\n");
			}
		});
		button.setBounds(112, 0, 113, 53);
		
		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winchange w3=new winchange();
				w3.Winchange();
				textArea.append("修改成功！\n");
			}
		});
		button_1.setBounds(222, 0, 113, 53);
		
		JButton button_2 = new JButton("\u67E5\u8BE2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winselect w4=new winselect();
				w4.Winselect();
				textArea.append("查询成功！\n");
			}
		});
		button_2.setBounds(333, 0, 113, 53);
		
		JButton button_3 = new JButton("\u663E\u793A");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				winshow w5=new winshow();
				w5.Winshow();
				textArea.append("显示成功！\n");
				
				
			}
		});
		button_3.setBounds(445, 0, 113, 53);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(button);
		frame.getContentPane().add(button_1);
		frame.getContentPane().add(button_2);
		frame.getContentPane().add(button_3);
	}
}

