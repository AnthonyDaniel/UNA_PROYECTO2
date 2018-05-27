package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import model.Client.Client;
import model.Client.CustomerAdministration;
import model.Client.CustomerAdministrationInterface;

public class subClientMDI {

	private CustomerAdministrationInterface client = new CustomerAdministration();
	private Font font;
	private JLabel id;
	private JTextArea id_;
	private JLabel name;
	private JTextArea name_;
	private JLabel phone;
	private JTextArea phone_;
	private JLabel lastN;
	private JTextArea lastN_;
	private JLabel email;
	private JTextArea email_;
	private JLabel dat;
	private JTextArea dat_;
	private JLabel address;
	private JTextArea address_;
	private JLabel person;
	private JTextArea person_;
	private JFormattedTextField jd1;
	private JButton b1;
	private JComboBox b2;
	private JComboBox b3;
	private JComboBox b4;
	private JScrollPane b5;
	private JLabel save;
	private File imagenFile;
	private Image newImagen;
	private JFrame ClientG;
	private JFrame aid;
	private JFrame aid2;
	private JFrame aid3;
	private JFrame aid4;

	JTextArea jt = new JTextArea();



	public subClientMDI() {

		ClientG = new JFrame();
		aid = new JFrame();
		aid2 = new JFrame();
		aid3 = new JFrame();
		aid4 = new JFrame();

		jd1 = new JFormattedTextField();
		imagenFile = new File("src/icon.png");
		font = new Font("Times New Roman", 12, 13);
		id = new JLabel("ID:");
		id_ = new JTextArea();
		name = new JLabel("Name:");
		name_ = new JTextArea();
		phone = new JLabel("Phone:");
		phone_ = new JTextArea();
		lastN = new JLabel("Last N:");
		lastN_ = new JTextArea();
		email = new JLabel("Email:");
		email_ = new JTextArea();
		dat = new JLabel("Birthdate:");
		dat_ = new JTextArea("12/12/2012");
		address = new JLabel("Address:");
		address_ = new JTextArea();
		person = new JLabel("Tel Emergency:");
		person_ = new JTextArea();
		b1 = new JButton("Add");
		b2 = new JComboBox(new String[] { "Search"});
		b3 = new JComboBox(new String[] { "Modify"});
		b4 = new JComboBox(new String[] { "Remove"});
		b5 = new JScrollPane(jt);
		save = new JLabel();
	}

	public void main() {

		try {

			newImagen = ImageIO.read(imagenFile);
			ClientG.setIconImage(newImagen);

		} catch (IOException e) {

			System.out.println("Error newImagen - setConImagen - ");

		}

		ClientG.setResizable(false);
		ClientG.setLayout(null);
		ClientG.setSize(450, 450);
		ClientG.setUndecorated(true);
		ClientG.setLocationRelativeTo(null);
		ClientG.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JLabel title = new JLabel("Customer Administration");
		JButton x = new JButton();
		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Modify");
		JButton b3 = new JButton("Search");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");
		JButton b6 = new JButton("Back");

		title.setFont(new Font("Times New Roman", 12, 20));
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);

		x.setBackground(Color.white);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);

		title.setBounds(115, 10, 300, 40);
		x.setBounds(430, 0, 20, 20);
		b1.setBounds(70, 70, 300, 40);
		b2.setBounds(70, 130, 300, 40);
		b3.setBounds(70, 190, 300, 40);
		b4.setBounds(70, 250, 300, 40);
		b5.setBounds(70, 310, 300, 40);
		b6.setBounds(70, 370, 300, 40);

		x.setIcon(new ImageIcon(getClass().getResource("/X.png")));

		// b1.setOpaque(false);
		// b2.setBorder(null);

		ClientG.add(title);
		ClientG.add(x);
		ClientG.add(b1);
		ClientG.add(b2);
		ClientG.add(b3);
		ClientG.add(b4);
		ClientG.add(b5);
		ClientG.add(b6);

		JLabel background = new JLabel();
		ImageIcon icon = new ImageIcon("src/fondo.png");
		background.setBounds(0, 0, 850, 450);
		background.setIcon(icon);
		ClientG.add(background);
		ClientG.setVisible(true);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				add();
				ClientG.setVisible(false);

			}
		});
	
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				modify();
				ClientG.setVisible(false);
		

			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				search();
				ClientG.setVisible(false);
				
				
			}
		});
		
		b4.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
	
				remove();
				ClientG.setVisible(false);
				
			}
		});
		
		b5.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
			
				list();
				
				
				
			}
		});

		b6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				ClientG.dispose();

			}
		});

		x.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ClientG.dispose();

			}
		});

	}

	public void clean() {

		id_.setText("");
		name_.setText("");
		phone_.setText("");
		lastN_.setText("");
		email_.setText("");
		dat_.setText("");
		address_.setText("");
		person_.setText("");
		save.setText("");
		jd1.setText("");
		
		jd1.setEditable(true);
		id_.setEditable(true);
		name_.setEditable(true);
		phone_.setEditable(true);
		lastN_.setEditable(true);
		email_.setEditable(true);
		dat_.setEditable(true);
		address_.setEditable(true);
		person_.setEditable(true);

		for (Client i : client.container()) {
			b2.removeItem(i.getId());
		}
		for (Client i : client.container()) {
			b3.removeItem(i.getId());
		}
		
	}

	public void template() {
		
	
		
		id.setBounds(30, 10, 50, 40);
		id_.setBounds(90, 15, 100, 30);
		id_.setEditable(true);

		name.setBounds(200, 10, 60, 40);
		name_.setBounds(270, 15, 110, 30);
		name_.setEditable(true);

		phone.setBounds(200, 70, 60, 40);
		phone_.setBounds(270, 75, 110, 30);
		phone_.setEditable(true);

		lastN.setBounds(30, 70, 50, 40);
		lastN_.setBounds(90, 75, 100, 30);
		lastN_.setEditable(true);

		email.setBounds(30, 130, 50, 40);
		email_.setBounds(90, 135, 100, 30);
		email_.setEditable(true);

		dat.setBounds(200, 130, 60, 40);
		dat_.setBounds(270, 135, 110, 30);
		dat_.setEditable(true);

		address.setBounds(30, 190, 100, 40);
		address_.setBounds(140, 195, 240, 30);
		address_.setEditable(true);

		person.setBounds(30, 250, 100, 40);
		person_.setBounds(140, 255, 240, 30);
		person_.setEditable(true);
		
		try {
			jd1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
			jd1.setText("00/00/0000");
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		jd1.setBounds(270, 135, 110, 30);

	}

	public void add() {
	
		template();

		
		try {

			newImagen = ImageIO.read(imagenFile);
			aid.setIconImage(newImagen);

		} catch (IOException e) {

			System.out.println("Error newImagen - setConImagen - ");

		}
		
		aid.setResizable(false);
		aid.setLayout(null);
		aid.setSize(450, 450);
		aid.setUndecorated(true);
		aid.setLocationRelativeTo(null);
		aid.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		save.setBounds(30, 340, 300, 40);

		JButton x = new JButton();
		x.setBackground(Color.white);
		x.setBounds(430, 0, 20, 20);
		x.setIcon(new ImageIcon(getClass().getResource("/X.png")));

		b1.setFont(font);
		b1.setBackground(Color.white);
		b1.setBounds(330, 400, 100, 40);
		b1.setVisible(true);

		aid.add(id).repaint();
		aid.add(name).repaint();
		aid.add(name_).repaint();
		aid.add(lastN).repaint();
		aid.add(lastN_).repaint();
		aid.add(phone).repaint();
		aid.add(phone_).repaint();
		aid.add(email).repaint();
		aid.add(email_).repaint();
		aid.add(dat).repaint();
		aid.add(address).repaint();
		aid.add(address_).repaint();
		aid.add(person).repaint();
		aid.add(person_).repaint();
		aid.add(id_).repaint();
		aid.add(b1).repaint();
		aid.add(x).repaint();
		aid.add(save).repaint();
		aid.add(jd1).repaint();
		
		
		aid.setVisible(true);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				save.setText("");
				
				
				if (!id_.getText().equals("") && !name_.getText().equals("") && !lastN_.getText().equals("")
						&& !phone_.getText().equals("") && !email_.getText().equals("") && !jd1.getText().equals("")
						&& !address_.getText().equals("") && !person_.getText().equals("")) {


						Client c = new Client();

						c.setId(id_.getText());
						c.setName(name_.getText());
						c.setLastName(lastN_.getText());
						c.setPhone(phone_.getText());
						c.setAddress(address_.getText());
						c.setEmail(email_.getText());
						c.setEmergencyPerson(person_.getText());
						c.setDateBirth(jd1.getText());

						if (client.add(c)) {

							clean();

							ClientG.setVisible(true);
						
							aid.dispose();

						} else {

							save.setText("It already exists");
							aid.repaint();
						}

				} else {

					save.setText("No blanks");

				}

			}

		});

		x.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				clean();

				ClientG.setVisible(true);

				aid.dispose();

			}
		});

	}

	private void search() {
		
		template();

		try {

			newImagen = ImageIO.read(imagenFile);
			aid2.setIconImage(newImagen);

		} catch (IOException e) {

			System.out.println("Error newImagen - setConImagen - ");

		}
		
		aid2.setResizable(false);
		aid2.setLayout(null);
		aid2.setSize(450, 450);
		aid2.setUndecorated(true);
		aid2.setLocationRelativeTo(null);
		aid2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		JButton x = new JButton();
		x.setBackground(Color.white);
		x.setBounds(430, 0, 20, 20);
		x.setIcon(new ImageIcon(getClass().getResource("/X.png")));

		b2.setFont(font);
		b2.setBackground(Color.white);
		b2.setBounds(180, 350, 100, 40);
		b2.setVisible(true);
		
		id_.setEditable(false);
		name_.setEditable(false);
		phone_.setEditable(false);
		lastN_.setEditable(false);
		email_.setEditable(false);
		dat_.setEditable(false);
		address_.setEditable(false);
		person_.setEditable(false);
		
	
		aid2.add(id).repaint();
		aid2.add(name).repaint();
		aid2.add(name_).repaint();
		aid2.add(lastN).repaint();
		aid2.add(lastN_).repaint();
		aid2.add(phone).repaint();
		aid2.add(phone_).repaint();
		aid2.add(email).repaint();
		aid2.add(email_).repaint();
		aid2.add(dat).repaint();
		aid2.add(dat_).repaint();
		aid2.add(address).repaint();
		aid2.add(address_).repaint();
		aid2.add(person).repaint();
		aid2.add(person_).repaint();
		aid2.add(id_).repaint();
		aid2.add(b2).repaint();
		aid2.add(x).repaint();
		aid2.setVisible(true);

		for(Client i: client.container()) {
			
			b2.addItem(i.getId());
			
		}
		
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				
				for(Client i: client.container()) {
					
					if(b2.getSelectedItem().equals(i.getId())) {
						
						
						id_.setText(i.getId());
						name_.setText(i.getName());
						phone_.setText(i.getPhone());
						lastN_.setText(i.getLastName());
						email_.setText(i.getEmail());
						dat_.setText(i.getDateBirth());
						address_.setText(i.getAddress());
						person_.setText(i.getEmergencyPerson());
						
						
						
					}
					
				}
				
				
			}

		});

		x.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				clean();

				ClientG.setVisible(true);

				aid2.dispose();

			}
		});
	
	}
	
private void modify() {
		
		template();

		try {

			newImagen = ImageIO.read(imagenFile);
			aid3.setIconImage(newImagen);

		} catch (IOException e) {

			System.out.println("Error newImagen - setConImagen - ");

		}
		
		aid3.setResizable(false);
		aid3.setLayout(null);
		aid3.setSize(450, 450);
		aid3.setUndecorated(true);
		aid3.setLocationRelativeTo(null);
		aid3.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


		JButton x = new JButton();
		x.setBackground(Color.white);
		x.setBounds(430, 0, 20, 20);
		x.setIcon(new ImageIcon(getClass().getResource("/X.png")));

		b3.setFont(font);
		b3.setBackground(Color.white);
		b3.setBounds(150, 390, 100, 40);
		b3.setVisible(true);
		
		id_.setEditable(false);
		
		JButton moodify = new JButton("Modify");
		moodify.setBounds(260, 390, 100, 40);
		moodify.setBackground(Color.white);
		
		save.setBounds(30, 340, 300, 40);
		
		aid3.add(id).repaint();
		aid3.add(name).repaint();
		aid3.add(name_).repaint();
		aid3.add(lastN).repaint();
		aid3.add(lastN_).repaint();
		aid3.add(phone).repaint();
		aid3.add(phone_).repaint();
		aid3.add(email).repaint();
		aid3.add(email_).repaint();
		aid3.add(dat).repaint();
		aid3.add(address).repaint();
		aid3.add(address_).repaint();
		aid3.add(person).repaint();
		aid3.add(person_).repaint();
		aid3.add(id_).repaint();
		aid3.add(b3).repaint();
		aid3.add(moodify).repaint();
		aid3.add(x).repaint();
		aid3.add(save).repaint();
		aid3.add(jd1);
		aid3.setVisible(true);

		for(Client i: client.container()) {
			
			b3.addItem(i.getId());
			
		}
		
		moodify.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
			
				if (!id_.getText().equals("") && !name_.getText().equals("") && !lastN_.getText().equals("")
						&& !phone_.getText().equals("") && !email_.getText().equals("") && !jd1.getText().equals("")
						&& !address_.getText().equals("") && !person_.getText().equals("")) {

				

						Client i = new Client(); 
						
						i.setName(name_.getText());
						i.setId(id_.getText());
						i.setAddress(address_.getText());
						i.setDateBirth(jd1.getText());
						i.setEmail(email_.getText());
						i.setEmergencyPerson(person_.getText());
						i.setPhone(phone_.getText());
						i.setLastName(lastN_.getText());
					
						if(client.modify(i)) {
							
							save.setText("Modified");
							
						}else {
					
							save.setText("Not modified");
					
						}
			
				} else {

					save.setText("No blanks");

				}

				
				
			}
		});
		
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				
				for(Client i: client.container()) {
					
					if(b3.getSelectedItem().equals(i.getId())) {
						
						id_.setText(i.getId());
						name_.setText(i.getName());
						phone_.setText(i.getPhone());
						lastN_.setText(i.getLastName());
						email_.setText(i.getEmail());
						jd1.setText(i.getDateBirth());
						address_.setText(i.getAddress());
						person_.setText(i.getEmergencyPerson());
						
					}
					
				}
				
				
			}

		});

		
		x.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				clean();

				ClientG.setVisible(true);

				aid3.dispose();

			}
		});
		
		
	}

private void remove() {
	
	template();

	try {

		newImagen = ImageIO.read(imagenFile);
		aid4.setIconImage(newImagen);

	} catch (IOException e) {

		System.out.println("Error newImagen - setConImagen - ");

	}
	
	aid4.setResizable(false);
	aid4.setLayout(null);
	aid4.setSize(450, 450);
	aid4.setUndecorated(true);
	aid4.setLocationRelativeTo(null);
	aid4.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	JButton x = new JButton();
	x.setBackground(Color.white);
	x.setBounds(430, 0, 20, 20);
	x.setIcon(new ImageIcon(getClass().getResource("/X.png")));

	b4.setFont(font);
	b4.setBackground(Color.white);
	b4.setBounds(150, 390, 100, 40);
	b4.setVisible(true);
	
	id_.setEditable(false);
	name_.setEditable(false);
	phone_.setEditable(false);
	lastN_.setEditable(false);
	email_.setEditable(false);
	dat_.setEditable(false);
	address_.setEditable(false);
	person_.setEditable(false);
	
	JButton remoove = new JButton("Remove");
	remoove.setBounds(260, 390, 100, 40);
	remoove.setBackground(Color.white);

	
	save.setBounds(30, 340, 300, 40);
	
	aid4.add(id).repaint();
	aid4.add(name).repaint();
	aid4.add(name_).repaint();
	aid4.add(lastN).repaint();
	aid4.add(lastN_).repaint();
	aid4.add(phone).repaint();
	aid4.add(phone_).repaint();
	aid4.add(email).repaint();
	aid4.add(email_).repaint();
	aid4.add(dat).repaint();
	aid4.add(dat_).repaint();
	aid4.add(address).repaint();
	aid4.add(address_).repaint();
	aid4.add(person).repaint();
	aid4.add(person_).repaint();
	aid4.add(id_).repaint();
	aid4.add(b4).repaint();
	aid4.add(remoove).repaint();
	aid4.add(x).repaint();
	aid4.add(save).repaint();
	aid4.setVisible(true);
	
	for(Client i: client.container()) {
		
		b4.removeItem(i.getId());
		
	}
	
	for(Client i: client.container()) {
		
		b4.addItem(i.getId());
		
	}
	
	remoove.addActionListener(new ActionListener() {
	
		public void actionPerformed(ActionEvent arg0) {
		
			if(client.remove(""+ b4.getSelectedItem())) {
			
				save.setText("Removed");
			
				b4.removeItem(b4.getSelectedItem());
				
				clean();
				
			
			
			}else {
				
				save.setText("Not removed");
				
			}
		
		}
	});
	
	b4.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			
			for(Client i: client.container()) {
				
				if(b4.getSelectedItem().equals(i.getId())) {
					
					id_.setText(i.getId());
					name_.setText(i.getName());
					phone_.setText(i.getPhone());
					lastN_.setText(i.getLastName());
					email_.setText(i.getEmail());
					dat_.setText(i.getDateBirth());
					address_.setText(i.getAddress());
					person_.setText(i.getEmergencyPerson());
					
				}
				
			}
			
			
		}

	});

	
	x.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			clean();

			ClientG.setVisible(true);

			aid4.dispose();

		}
	});
	
	
}
	
public void list() {

	jt.setText(null);

	for(Client i : client.container()) {
		
		jt.append("----------------------------------------------------------------------------------------------------------- \n "
				+ "Id: " + i.getId() + " \n \n"
				+ "Name: " + i.getName() + " \n \n"
				+ "Last Name: " + i .getLastName() + " \n \n"
				+ "Date Birth " + i.getDateBirth()+ " \n \n"
				+ "Phone: " + i.getPhone() + " \n \n"
				+ "Email: " + i.getEmail() + " \n  \n"
				+ "Phone Emergency: " + i.getEmergencyPerson() + " \n \n"
				+ "Address: " + i.getAddress()+ " \n \n");
		
		
	}


	b5.setPreferredSize(new Dimension(450,300));
	b5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	
	JOptionPane.showMessageDialog(null, b5);
	
}

}
