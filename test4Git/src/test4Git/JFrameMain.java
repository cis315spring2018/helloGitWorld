/**
 *   file: JFrameMain.java
 Changed by Mannning in Github
 */
package test4Git;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

/**
 * @author atmanning - atmanning@dbq.edu
 *
 */
public class JFrameMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameMain frame = new JFrameMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrameMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnHelloGitWorld = new JButton("Hello, Git World!");
		contentPane.add(btnHelloGitWorld, BorderLayout.CENTER);
		
		JButton btnTopButton = new JButton("Top Button");
		contentPane.add(btnTopButton, BorderLayout.NORTH);
	}

}
