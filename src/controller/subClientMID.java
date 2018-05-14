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
	private JButton b1 ;
	private JComboBox b2;
	private JButton b3 ;
	private JButton b4 ;
	private JButton b5 ;
	private int blankSpace; 
	private JLabel  save;
	
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
		b1 = new JButton("Add");	
	    b2 = new JComboBox(new String[] {"Search", " "} );	
		b3 = new JButton();	
		b4 = new JButton();	
		b5 = new JButton();
		save = new JLabel();
		blankSpace = 1; 
	}

	public void clean() {
		
		id_.setText("");
		name_.setText("");
		phone_.setText("");
		lastN_.setText("");
		email_.setText("");		
		dat_.setText("12/12/2012");
		address_.setText("");	
		person_.setText("");
		save.setText("");
		
		for(Client i: client.container()) {
			b2.removeItem(i.getId());
		}

		
		
		blankSpace = 1; 
	}
	
	public void template(boolean b1V,boolean b2V,boolean b3V,boolean b4V,boolean b5V ) {
		
		aid.setLayout(null);
		aid.setBounds(120, 0, 400, 400);
		
		id.setBounds(10, 10, 40, 40);
		id_.setBounds(60, 15, 100, 30);
		id_.setEditable(true);
		
		name.setBounds(180, 10, 60, 40);
		name_.setBounds(250, 15, 100, 30);
		name_.setEditable(true);
		
		phone.setBounds(180, 70, 60, 40);
		phone_.setBounds(250, 75, 100, 30);
		phone_.setEditable(true);	
		
		lastN.setBounds(10, 70, 40, 40);
		lastN_.setBounds(60, 75, 100, 30);
		lastN_.setEditable(true);
		
		email.setBounds(10, 130, 40, 40);
		email_.setBounds(60, 135, 100, 30);
		email_.setEditable(true);	
		
		dat.setBounds(180, 130, 60, 40);
		dat_.setBounds(250, 135, 100, 30);
		dat_.setEditable(true);
	
		
		address.setBounds(10, 190, 100, 40);
		address_.setBounds(110, 195, 240, 30);
		address_.setEditable(true);
		
		person.setBounds(10, 250, 100, 40);
		person_.setBounds(110, 255, 240, 30);
		person_.setEditable(true);
		
		save.setBounds(10, 10, 40, 40);
		save.setBounds(10, 340, 150, 40);
	
		b1.setFont(font);
		b1.setBackground(Color.white);
		b1.setBounds(150, 340, 100, 40);
		b1.setVisible(b1V);
		
		b2.setFont(font);
		b2.setBackground(Color.WHITE);
		b2.setBounds(150, 340, 100, 40);
		b2.setEditable(true);
		b2.setVisible(b2V);
		
		b3.setFont(font);
		b3.setBackground(Color.white);
		b3.setBounds(150, 340, 100, 40);
		b3.setVisible(b3V);
		
		b4.setFont(font);
		b4.setBackground(Color.white);
		b4.setBounds(150, 340, 100, 40);
		b4.setVisible(b4V);
		
		b5.setFont(font);
		b5.setBackground(Color.white);
		b5.setBounds(150, 340, 100, 40);
		b5.setVisible(b5V);
		
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
		aid.add(b1).repaint();
		aid.add(b2).repaint();
		aid.add(b3).repaint();
		aid.add(b4).repaint();
		aid.add(b5).repaint();
		aid.add(save).repaint();
		
		
		aid.repaint();
	}
	
	public JPanel clientAdd() {

		aid.removeAll();
		
		clean();
		
		template(true,false,false , false , false);
		
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (!id_.getText().equals("") && !name_.getText().equals("") && !lastN_.getText().equals("")
						&& !phone_.getText().equals("") && !email_.getText().equals("")
						&& !dat_.getText().equals("") && !address_.getText().equals("")
						&& !person_.getText().equals("") && !id_.getText().equals("In white")) {


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
						c.setDateBirth(""+_dat_.getTime());

						if(client.add(c)) {
			
							clean();
		
							save.setText("Customer added");
						
							
							aid.repaint();
					
							
							
						}else {
							
							save.setText("Customer not added");
							aid.repaint();
						}


					} catch (ParseException ex) {

						JOptionPane.showMessageDialog(null, "Incorrect format example - dd/MM/yyyy ",
								"Error with Date Birth", JOptionPane.ERROR_MESSAGE, null);

					}

				}else {
					
					save.setText("Without blank spaces");
					aid.repaint();
				}

			}

		});

		
		return aid;

	}

	public JPanel clientSearch() {

		clean();
	
		template(false,true, false , false , false);

		id_.setEditable(false);
		name_.setEditable(false);
		phone_.setEditable(false);	
		lastN_.setEditable(false);
		email_.setEditable(false);	
		dat_.setEditable(false);
		address_.setEditable(false);
		person_.setEditable(false);
		
		
			if(!client.container().isEmpty()) {
				for(Client i :client.container() ) {
			
					b2.addItem(i.getId());
			
				}
			}
			b2.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
				
					Client aux = client.search((String) b2.getSelectedItem());		
					
				 if(client.container().contains(aux)) {
				
						id_.setText(aux.getId());
						name_.setText(aux.getName());
						phone_.setText(aux.getPhone());
						lastN_.setText(aux.getLastName());
						email_.setText(aux.getEmail());		
						dat_.setText("");
						address_.setText(aux.getAddress());	
						person_.setText(aux.getEmergencyPerson());
						
					}else if(b2.getSelectedItem().equals("Search") || b2.getSelectedItem().equals(" ")) {
						
							b2.setAction(null);
							
					}
			
					aid.repaint();
				}
			});
			
			
		return aid;
	}
	
}
