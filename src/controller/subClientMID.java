package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import model.Client.Client;
import model.Client.CustomerAdministration;
import model.Client.CustomerAdministrationInterface;


public class subClientMID {

	private CustomerAdministrationInterface client = new CustomerAdministration();
	private Font font;
	private JPanel  aid; 
	private JLabel id ;
	private JTextArea id_; 
	private JLabel name ;
	private JTextArea name_;
	private JLabel phone ;
	private JTextArea phone_; 
	private JLabel lastN ;
	private JTextArea lastN_; 
	private JLabel email ;
	private JTextArea email_; 
	private JLabel dat; 
	private JTextArea dat_;
	private JLabel address; 
	private JTextArea address_;
	private JLabel person ;
	private JTextArea person_;
	
	public subClientMID () {
		
		font = new Font("Calibri", 9, 13);
		aid = new JPanel();
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
		
	}
	
	public void clean() {
		

		id_.setText("");
		name_.setText("");
		phone_.setText("");
		lastN_.setText("");
		email_.setText("");		
	//	dat_.setText("");
		address_.setText("");	
		person_.setText("");
		
	}
	
	public void template() {

		aid.setLayout(null);
		aid.setBounds(120, 0, 400, 400);
		
		id.setBounds(10, 10, 40, 40);
		id_.setBounds(60, 15, 100, 30);

		name.setBounds(180, 10, 60, 40);
		name_.setBounds(250, 15, 100, 30);
		
		phone.setBounds(180, 70, 60, 40);
		phone_.setBounds(250, 75, 100, 30);
			
		lastN.setBounds(10, 70, 40, 40);
		lastN_.setBounds(60, 75, 100, 30);

		email.setBounds(10, 130, 40, 40);
		email_.setBounds(60, 135, 100, 30);
			
		dat.setBounds(180, 130, 60, 40);
		dat_.setBounds(250, 135, 100, 30);
	
		address.setBounds(10, 190, 100, 40);
		address_.setBounds(110, 195, 240, 30);
		
		person.setBounds(10, 250, 100, 40);
		person_.setBounds(110, 255, 240, 30);
	
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
		aid.add(dat_).repaint();
		aid.add(address).repaint();
		aid.add(address_).repaint();
		aid.add(person).repaint();
		aid.add(person_).repaint();	
		aid.add(id_).repaint();	
		
	}
	
	public JPanel clientAdd() {

	template();
	
	JButton b6 = new JButton("Add");
	b6.setFont(font);
	b6.setBackground(Color.white);
	b6.setBounds(150, 340, 100, 40);

	aid.add(b6).repaint();
		
		b6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!id_.getText().equals("") && !name_.getText().equals("") && !lastN_.getText().equals("")
						&& !phone_.getText().equals("") && !email_.getText().equals("")
						&& !dat_.getText().equals("") && !address_.getText().equals("")
						&& !person_.getText().equals("")) {



					try {
						Date _dat_ = null;

						_dat_ = new SimpleDateFormat("dd/MM/yyyy").parse(dat_.getText());
						
						
						Client c = new Client();
						
						c.setId(id_.getText());
						c.setName(name_.getText());
						c.setLastName(lastN_.getText());
						c.setPhone(phone_.getText());
						c.setAddress(address_.getText());
						c.setEmail(email_.getText());
						c.setEmergencyPerson(person_.getText());
						c.setDateBirth(_dat_);

						if(client.add(c)) {
							clean();
							JOptionPane.showMessageDialog(null, "Customer added");
						}else {
							JOptionPane.showMessageDialog(null, "The customer already exists");
						}


					} catch (ParseException ex) {

						JOptionPane.showMessageDialog(null, "Incorrect format example - dd/MM/yyyy ",
								"Error with Date Birth", JOptionPane.ERROR_MESSAGE, null);

					}

				} else {
					JOptionPane.showMessageDialog(null, "Do not leave blank spaces", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}

		});

		
		return aid;

	}

//	public JPanel clientSearch() {
//
//		Client aux = new Client();
//		
//		JPanel  aid = new JPanel();
//		aid.setLayout(null);
//		aid.setBounds(120, 0, 400, 400);
//		
//		JLabel id = new JLabel("ID:");
//		JTextArea id_ = new JTextArea();
//		id.setBounds(10, 10, 40, 40);
//		id_.setBounds(60, 15, 100, 30);
//		id_.setEditable(false);
//	
//		JLabel name = new JLabel("Name:");
//		JTextArea name_ = new JTextArea();
//		name.setBounds(180, 10, 60, 40);
//		name_.setBounds(250, 15, 100, 30);
//		name_.setEditable(false);
//		
//		JLabel phone = new JLabel("Phone:");
//		JTextArea phone_ = new JTextArea();
//		phone.setBounds(180, 70, 60, 40);
//		phone_.setBounds(250, 75, 100, 30);
//		phone_.setEditable(false);
//		
//		JLabel lastN = new JLabel("Last N:");
//		JTextArea lastN_ = new JTextArea();
//		lastN.setBounds(10, 70, 40, 40);
//		lastN_.setBounds(60, 75, 100, 30);
//		lastN_.setEditable(false);
//		
//		JLabel email = new JLabel("Email:");
//		JTextArea email_ = new JTextArea();
//		email.setBounds(10, 130, 40, 40);
//		email_.setBounds(60, 135, 100, 30);
//		email_.setEditable(false);
//		
//		JLabel dat = new JLabel("Birthdate:");
//		JTextArea dat_ = new JTextArea();
//		dat.setBounds(180, 130, 60, 40);
//		dat_.setBounds(250, 135, 100, 30);
//		dat_.setEditable(false);
//
//		JLabel address = new JLabel("Address:");
//		JTextArea address_ = new JTextArea();
//		address.setBounds(10, 190, 100, 40);
//		address_.setBounds(110, 195, 240, 30);
//		address_.setEditable(false);
//		
//		JLabel person = new JLabel("Tel Emergency:");
//		JTextArea person_ = new JTextArea();
//		person.setBounds(10, 250, 100, 40);
//		person_.setBounds(110, 255, 240, 30);
//		person_.setEditable(false);
//
//		aid.add(id_).repaint();
//		aid.add(id).repaint();
//		aid.add(name).repaint();
//		aid.add(name_).repaint();
//		aid.add(lastN).repaint();
//		aid.add(lastN_).repaint();
//		aid.add(phone).repaint();
//		aid.add(phone_).repaint();
//		aid.add(email).repaint();
//		aid.add(email_).repaint();
//		aid.add(dat).repaint();
//		aid.add(dat_).repaint();
//		aid.add(address).repaint();
//		aid.add(address_).repaint();
//		aid.add(person).repaint();
//		aid.add(person_).repaint();	
//
//		JComboBox clients = new JComboBox(
//		
//		new String[] { "                  Search  ", "Select Id"});
//		clients.setBackground(Color.WHITE);
//		clients.setFont(font);
//		clients.setBounds(120, 340, 150, 40);
//		clients.setLayout(null);	
//
//
//		for(Client i: client.container()) {
//			clients.addItem(i.getId());
//			JOptionPane.showMessageDialog(null, i.getName()+ " " + i.toString());
//		}
//
//		
//		aid.add(clients).repaint();
//
//		clients.addActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent e) {
//
//			
//
//				}
//			});
//	
//
//		
//		return aid;
//
//	}

}
