//package processshed;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.Color;


public class process {
	private JFrame frame;
	private JTextField text;
	private JTextField text2;
	private JTextField text3;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void DS() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					process window = new process();
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
	public process() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 630, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CPU SCHEDULING Algorithms");
		lblNewLabel.setBounds(174, 35, 376, 50);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		text = new JTextField();
		text.setBounds(250, 201, 201, 28);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblInput = new JLabel("Burst Time :");
		lblInput.setBounds(145, 202, 101, 23);
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblInput);
		
		text2 = new JTextField();
		text2.setBounds(250, 260, 204, 28);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel lblOutput = new JLabel("Avg. Waiting Time :");
		lblOutput.setBounds(82, 265, 174, 14);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblOutput);
		
		text3 = new JTextField();
		text3.setBounds(250, 131, 157, 28);
		frame.getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel lblFrame = new JLabel("Priority/Time quantum/Arrival time:");
		lblFrame.setBounds(10, 134, 230, 20);
		lblFrame.setFont(new Font("Times New Roman", Font.BOLD, 14));
		frame.getContentPane().add(lblFrame);
		
		JButton button = new JButton("FCFS");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(63, 330, 101, 28);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 String Val,v="";
										Val = text.getText();
										convert z = new convert(Val);
										int[] L= z.method1();
										//int h = Integer.parseInt(text3.getText());
										 PFcfs a1= new PFcfs(L);
										 double r=a1.averageWaitingTimeCalc();
										 v=v+""+r;
										//a1.Get(L,L.length);
										 
										text2.setText(v);
					
			}
		});
		frame.getContentPane().add(button);
		
		JButton btnRoundRobin = new JButton("Round Robin");
		btnRoundRobin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRoundRobin.setBounds(365, 382, 140, 26);
		btnRoundRobin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				  String Val,v="";
										Val = text.getText();
										convert z = new convert(Val);
										int[] L= z.method1();
										int h = Integer.parseInt(text3.getText());
										roundrobin a1= new roundrobin(h,L);
										double r=a1.calcAverageWaitingTime();
										 //int r = a1.method();
										 v=v+""+r;
										//a1.Get(L,L.length);
										 
										text2.setText(v);
										 
			}
		});
		frame.getContentPane().add(btnRoundRobin);
		
		JButton btnSjfPrimitive = new JButton("SJF Primitive");
		btnSjfPrimitive.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSjfPrimitive.setBounds(451, 330, 140, 28);
		btnSjfPrimitive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String Val,v="",x;
					Val = text.getText();
					convert z = new convert(Val);
					int[] L= z.method1();
					x=text3.getText();
					convert t = new convert(x);
					int[] h=t.method1();
					//int h = Integer.parseInt(text3.getText());
					Sjf a1= new Sjf();
					double r = a1.calcAverage(h,L);
					 //int r = a1.method();
					 v=v+""+r;
					//a1.Get(L,L.length);
					 
					text2.setText(v);

			}
		});
		frame.getContentPane().add(btnSjfPrimitive);
		
		JButton btnPriority = new JButton("Priority");
		btnPriority.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPriority.setBounds(145, 381, 101, 28);
		btnPriority.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String Val,v="",x;
				 Val = text.getText();
					convert z = new convert(Val);
					int[] L= z.method1();
					x=text3.getText();
					convert t = new convert(x);
					int[] h=t.method1();
					//int h = Integer.parseInt(text3.getText());
					PrioritySchedular a1= new PrioritySchedular(h,L);
					double r = a1.calcAverageWaitingTime();
					 //int r = a1.method();
					 v=v+""+r;
					 
					text2.setText(v);
				
			}
		});
		frame.getContentPane().add(btnPriority);
		Icon I23 = new ImageIcon("back.jpg");
		JButton btnBack = new JButton(I23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home x=new Home();
				x.Method();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(32, 35, 101, 50);
		frame.getContentPane().add(btnBack);
	
		
		JButton btnNewButton = new JButton("SJF Non Primitive");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(215, 330, 192, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String Val,v="",x;
				 Val = text.getText();
					convert z = new convert(Val);
					int[] L= z.method1();
					x=text3.getText();
					convert t = new convert(x);
					int[] h=t.method1();
					//int h = Integer.parseInt(text3.getText());
					SjfNP a1= new SjfNP(L,h);
					double r = a1.averageWaitingTimeCalc();
					 //int r = a1.method();
					 v=v+""+r;
					 
					text2.setText(v);
				
			}
		});
		
		frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
