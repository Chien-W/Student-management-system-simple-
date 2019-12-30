package Student;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class winshow {

	private JFrame frame;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public  void Winshow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winshow window = new winshow();
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
	public winshow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u663E\u793A\u6570\u636E");
		frame.setBounds(100, 100, 800, 520);
			
		int windowWidth = frame.getWidth(); //获得窗口宽
		int windowHeight = frame.getHeight(); //获得窗口高
		Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
		Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
		int screenWidth = screenSize.width; //获取屏幕的宽
		int screenHeight = screenSize.height; //获取屏幕的高
		frame.setLocation(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2);//设置窗口居中显示 
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		String[][] data=Show.getRows();
		String[] dataTitle =Show.getHead();
		table_1 = new JTable(data,dataTitle);
		table_1.setFont(new Font("宋体", Font.PLAIN, 18));
		table_1.setRowHeight(25);
		scrollPane.setViewportView(table_1);
		table_1.setEnabled(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 782, GroupLayout.PREFERRED_SIZE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
		
	}

}

