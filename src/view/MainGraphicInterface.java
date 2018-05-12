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
				
				
				if(panelOpen(medicalAdministration())) {
					medicalAdministration().setVisible(false);
					graphic.add(customerAdministration()).repaint();
				}else {
					graphic.add(customerAdministration()).repaint();
				}
				
			}
		});;
		
		b2.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {

				
				if(panelOpen(customerAdministration())) {
					customerAdministration().setVisible(false);
					graphic.add(medicalAdministration()).repaint();
				}else {
					graphic.add(medicalAdministration()).repaint();
				}
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
				
				
				JOptionPane.showMessageDialog( null,"Thanks for using our program");
				System.exit(0);
				
				
			}
		});;


		
	}
	
	private JPanel customerAdministration() {
		
		subG = new JPanel();
		subG.setLayout(null);
		subG.setBackground(Color.white);
		subG.setBounds(320, 10, 515, 400);
		
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Modify");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");
	
		b1.setBackground(Color.BLUE);
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
		
		return subG;
	}
	
private JPanel medicalAdministration() {
		
		subG = new JPanel();
		subG.setLayout(null);
		subG.setBackground(Color.pink);
		subG.setBounds(320, 10, 515, 400);
		
		JButton b1 = new JButton("Adfdd");
		JButton b2 = new JButton("Seadfrch");
		JButton b3 = new JButton("Modfdify");
		JButton b4 = new JButton("Remdfove");
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
		
		
		return subG;
		
		
	}
	
	private boolean panelOpen(JPanel i) {
		
		boolean open = false;
		
		if(i.isVisible()) {
			open =  true;
		}
		
		return open;
	}
	
}
