package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainGraphicInterface {

	private JFrame graphic = new JFrame();
    private File imagenFile; // route 
    private Image newImagen; // icon of Jframe
	private Font font; 
    
	public MainGraphicInterface() {
		
		imagenFile = new File("src/icon.PNG");
		font = new Font("Calibri",3,20); 
		
	}
	
	public void main() {
		
		try {
		
			newImagen = ImageIO.read(imagenFile);
			graphic.setIconImage(newImagen);
		
		}catch(IOException e) {
		
			System.out.println("Error newImagen - setConImagen - ");
		
		}
		
		graphic.setTitle("Clinic");
		graphic.setResizable(false);
		graphic.setLayout(null);
		graphic.setSize(630, 450);
		graphic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		graphic.setLocationRelativeTo(null);
		
		JButton b1 = new JButton("Customer Administration");
		JButton b2 = new JButton("Medical Administration");
		JButton b3 = new JButton("Medical Services Administration");
		JButton b4 = new JButton("Administration and Schedule of Appointments");
		JButton b5 = new JButton("Service billing");
		JButton b6 = new JButton("About.....");
		JButton b7 = new JButton("Get Out");
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		
		b1.setBounds(10, 10, 300, 40);
		b2.setBounds(10, 70, 300, 40);
		b3.setBounds(10, 130, 300, 40);
		b4.setBounds(10, 190, 300, 40);
		b5.setBounds(10, 250, 300, 40);
		b6.setBounds(10, 310, 300, 40);
		b7.setBounds(315, 370, 300, 40);

		// b1.setOpaque(false);
		// b2.setBorder(null);
		
		graphic.add(b1);
		graphic.add(b2);
		graphic.add(b3);
		graphic.add(b4);
		graphic.add(b5);
		graphic.add(b6);
		graphic.add(b7);		

		JLabel background = new JLabel();
		ImageIcon icon = new ImageIcon("src/FondoClinica.jpg");
		background.setBounds(0, 0, 650, 450);
		background.setIcon(icon);
		graphic.add(background);
		
		graphic.repaint();
		graphic.setVisible(true);
		
		
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b2.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b3.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b4.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b5.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b6.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});;
		
		b7.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				JOptionPane.showMessageDialog(b7, Color.WHITE, "Thanks for using our program", 0);
				System.exit(0);
				
				
			}
		});;
	}
	
}
