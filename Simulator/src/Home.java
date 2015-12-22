import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public void Method(){
		Home window = new Home();
		window.frame.setVisible(true);
		//initialize();
	}
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 746, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOsConceptsSimulator = new JLabel("OS Simulator");
		lblOsConceptsSimulator.setBackground(Color.RED);
		lblOsConceptsSimulator.setForeground(Color.BLACK);
		lblOsConceptsSimulator.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblOsConceptsSimulator.setBounds(249, 28, 282, 59);
		frame.getContentPane().add(lblOsConceptsSimulator);
		Icon I1 = new ImageIcon("cpu.jpg");
		Icon I2 = new ImageIcon("disk.jpg");
		Icon I3 = new ImageIcon("page.jpg");
		
		JButton btnNewButton = new JButton(I1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("CPU");
				process z=new process();
				z.DS();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(112, 98, 209, 145);
		frame.getContentPane().add(btnNewButton);
		
		JButton DiskScheduling = new JButton(I2);
		DiskScheduling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Disk");
				DiskScheduling x = new DiskScheduling();
				x.DS();
				frame.setVisible(false);
				}
		});
		DiskScheduling.setBounds(437, 98, 217, 145);
		frame.getContentPane().add(DiskScheduling);
		
		JButton btnNewButton_2 = new JButton(I3);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Page");
				pagereplacement y = new pagereplacement();
				y.DS();
				frame.setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(249, 282, 273, 131);
		frame.getContentPane().add(btnNewButton_2);
	}
}
