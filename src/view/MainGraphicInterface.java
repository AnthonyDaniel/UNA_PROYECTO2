package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainGraphicInterface {

	private JFrame graphic = new JFrame();
    private File imagenFile; // route 
    private Image newImagen; // icon of Jframe
	private Font font; 
	private JPanel subG;
	private JPanel subG2;
	private JPanel subG3;
	private JPanel subG4;
	private JPanel subG5;
	private JPanel subG6;
    
	public MainGraphicInterface() {
		
		imagenFile = new File("src/icon.PNG");
		font = new Font("Calibri",3,20); 
		subG = new JPanel();
		subG2 = new JPanel();
		subG3 = new JPanel();
		subG4 = new JPanel();
		subG5 = new JPanel();
		subG6 = new JPanel();
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
		graphic.setSize(850, 450);
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
		b7.setBounds(10, 370, 300, 40);

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
		ImageIcon icon = new ImageIcon("src/fondo.png");
		background.setBounds(0, 0, 850, 450);
		background.setIcon(icon);
		graphic.add(background);
	

		
		
		
		graphic.repaint();
		graphic.setVisible(true);

		
	
		
		
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				graphic.remove(subG2);
				graphic.remove(subG3);	
				graphic.remove(subG4);	
				graphic.remove(subG5);	
				graphic.remove(subG6);	
				customerAdministration();
				
				
			}
		});;
		
		b2.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				
				graphic.remove(subG);
				graphic.remove(subG3);	
				graphic.remove(subG4);	
				graphic.remove(subG5);	
				graphic.remove(subG6);		
				medicalAdministration();
				
				
			}
		});;
		
		b3.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				graphic.remove(subG);
				graphic.remove(subG2);	
				graphic.remove(subG4);	
				graphic.remove(subG5);	
				graphic.remove(subG6);	
				medicalServicesAdministration();
				
			}
		});;
		
		b4.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				
				graphic.remove(subG);
				graphic.remove(subG2);	
				graphic.remove(subG3);	
				graphic.remove(subG5);	
				graphic.remove(subG6);	
				administrationScheduleAppointments();
				
			}
		});;
		
		b5.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
				
				graphic.remove(subG);
				graphic.remove(subG2);	
				graphic.remove(subG3);	
				graphic.remove(subG4);	
				graphic.remove(subG6);	
				serviceBilling();
				
			}
		});;
		
		b6.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				graphic.remove(subG2);
				graphic.remove(subG3);	
				graphic.remove(subG4);	
				graphic.remove(subG5);	
				graphic.remove(subG);	
				about();
			}
		});;
		
		b7.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				JOptionPane.showMessageDialog( null,"Thanks for using our program");
				System.exit(0);
				
				
			}
		});;


		
	}
	
	private void customerAdministration() {
		
		
		subG.setLayout(null);
		subG.setBackground(Color.GRAY);
		subG.setBounds(320, 10, 515, 400);
		
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Modify");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");
	
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);

		b1.setBounds(10, 10, 100, 40);
		b2.setBounds(10, 70, 100, 40);
		b3.setBounds(10, 130, 100, 40);
		b4.setBounds(10, 190, 100, 40);
		b5.setBounds(10, 250, 100, 40);
	
		subG.add(b1);
		subG.add(b2);
		subG.add(b3);
		subG.add(b4);
		subG.add(b5);
		
	
		
		subG.setVisible(true);
		
		graphic.add(subG).repaint();
		
	
	}
	
private void medicalAdministration() {
	
		subG2.setLayout(null);
		subG2.setBackground(Color.GRAY);
		subG2.setBounds(320, 10, 515, 400);
		
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Modify");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");
	
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);

		b1.setBounds(10, 10, 100, 40);
		b2.setBounds(10, 70, 100, 40);
		b3.setBounds(10, 130, 100, 40);
		b4.setBounds(10, 190, 100, 40);
		b5.setBounds(10, 250, 100, 40);
	
		
		subG2.add(b1);
		subG2.add(b2);
		subG2.add(b3);
		subG2.add(b4);
		subG2.add(b5);

		subG2.setVisible(true);
		
		graphic.add(subG2).repaint();	
		
	}
	
	 private void medicalServicesAdministration() {
		 
		 	subG3.setLayout(null);
			subG3.setBackground(Color.GRAY);
			subG3.setBounds(320, 10, 515, 400);
			
			JButton b1 = new JButton("Add");
			JButton b3 = new JButton("Modify");;
			JButton b5 = new JButton("List");
		
			b1.setBackground(Color.white);
			b3.setBackground(Color.white);
			b5.setBackground(Color.white);

			b1.setBounds(10, 10, 100, 40);
			b3.setBounds(10, 130, 100, 40);
			b5.setBounds(10, 250, 100, 40);
		
			
			subG3.add(b1);
			subG3.add(b3);
			subG3.add(b5);

			subG3.setVisible(true);
			
			graphic.add(subG3).repaint();	
		 
		 
	 }
	 
	 private void administrationScheduleAppointments() {
		 	subG4.setLayout(null);
			subG4.setBackground(Color.GRAY);
			subG4.setBounds(320, 10, 515, 400);
			
			JButton b1 = new JButton("Developing");
			JButton b2 = new JButton("Developing");
			JButton b3 = new JButton("Developing");
			JButton b4 = new JButton("Developing");
			JButton b5 = new JButton("Developing");
		
			b1.setBackground(Color.white);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
			b5.setBackground(Color.white);

			b1.setBounds(10, 10, 100, 40);
			b2.setBounds(10, 70, 100, 40);
			b3.setBounds(10, 130, 100, 40);
			b4.setBounds(10, 190, 100, 40);
			b5.setBounds(10, 250, 100, 40);
		
			
			subG4.add(b1);
			subG4.add(b2);
			subG4.add(b3);
			subG4.add(b4);
			subG4.add(b5);

			subG4.setVisible(true);
			
			graphic.add(subG4).repaint();	
	 }
	
	 private void serviceBilling() {
		 	subG5.setLayout(null);
			subG5.setBackground(Color.GRAY);
			subG5.setBounds(320, 10, 515, 400);
			
			JButton b1 = new JButton("Developing");
			JButton b2 = new JButton("Developing");
			JButton b3 = new JButton("Developing");
			JButton b4 = new JButton("Developing");
			JButton b5 = new JButton("Developing");
		
			b1.setBackground(Color.white);
			b2.setBackground(Color.white);
			b3.setBackground(Color.white);
			b4.setBackground(Color.white);
			b5.setBackground(Color.white);

			b1.setBounds(10, 10, 100, 40);
			b2.setBounds(10, 70, 100, 40);
			b3.setBounds(10, 130, 100, 40);
			b4.setBounds(10, 190, 100, 40);
			b5.setBounds(10, 250, 100, 40);
		
			
			subG5.add(b1);
			subG5.add(b2);
			subG5.add(b3);
			subG5.add(b4);
			subG5.add(b5);

			subG5.setVisible(true);
			
			graphic.add(subG5).repaint();	
	 }
	 
	 private void about() {
		 
		 	subG6.setLayout(null);
			subG6.setBackground(Color.white);
			subG6.setBounds(320, 10, 515, 400);
			
			JLabel txt = new JLabel();
			String txt_ = "Developed \n by Anthony Marin Bolivar and Erick Badilla"
					+ "\n Version:1.3 DEVELOPINGGGGG";
			txt.setText(txt_);
			txt.setLayout(null);
			txt.setBounds(10, 10, 400, 400);
			
			
			subG6.add(txt);

			subG6.setVisible(true);
			
			graphic.add(subG6).repaint();	
		 
		 
	 }
	 
}
