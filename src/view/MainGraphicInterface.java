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
import controller.subClientMDI;
import controller.subDoctorMDI;

public class MainGraphicInterface {

	
	private subClientMDI subClient = new subClientMDI();
	private subDoctorMDI subDoctor = new subDoctorMDI();
	public JFrame graphic = new JFrame();
    private File imagenFile; 
    private Image newImagen; 
	private Font font; 

	
    
	public MainGraphicInterface() {
		
		imagenFile = new File("src/icon.png");
		font = new Font("Times New Roman",12,13); 
	
	}
	
	public void main() {
		
		try {
		
			newImagen = ImageIO.read(imagenFile);
			graphic.setIconImage(newImagen);
		
		}catch(IOException e) {
		
			System.out.println("Error newImagen - setConImagen - ");
		
		}
	
		graphic.setResizable(false);
		graphic.setLayout(null);
		graphic.setSize(450, 450);
		graphic.setUndecorated(true); 
		graphic.setLocationRelativeTo(null);
		graphic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel title = new JLabel("Clinic");
		JButton x = new JButton();
		JButton b1 = new JButton("Customer Administration");
		JButton b2 = new JButton("Medical Administration");
		JButton b3 = new JButton("Medical Services Administration");
		JButton b4 = new JButton("Administration and Schedule of Appointments");
		JButton b5 = new JButton("Service billing");
		JButton b6 = new JButton("About.....");
		JButton b7 = new JButton("Get Out");
		
		title.setFont(new Font("Times New Roman",12,35));
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		
		x.setBackground(Color.white);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		
		title.setBounds(180,28, 300, 40);
		x.setBounds(430, 0, 20, 20);
		b1.setBounds(70, 100, 300, 40);
		b2.setBounds(70, 150, 300, 40);
		b3.setBounds(70, 200, 300, 40);
		b4.setBounds(70, 250, 300, 40);
		b5.setBounds(70, 300, 300, 40);
		b6.setBounds(70, 350, 300, 40);
		b7.setBounds(70, 400, 300, 40);

		x.setIcon(new ImageIcon(getClass().getResource("/X.png")));
		// b1.setOpaque(false);
		// b2.setBorder(null);
		
		graphic.add(title);
		graphic.add(x);
		graphic.add(b1);
		graphic.add(b2);
		graphic.add(b3);
		graphic.add(b4);
		graphic.add(b5);
		graphic.add(b6);
		graphic.add(b7);		

		JLabel background = new JLabel();
		ImageIcon icon = new ImageIcon("src/fondo.png");
		background.setBounds(0, 0, 850, 450);
		background.setIcon(icon);
		graphic.add(background);
		graphic.setVisible(true);
			

		
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {

				subClient.main(); 
				

			}
		});;
		
		b2.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				
				subDoctor.main();
				
				
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
				System.exit(0);
			}
		});;

		x.addActionListener(new ActionListener() {
			
	
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
	}

}
