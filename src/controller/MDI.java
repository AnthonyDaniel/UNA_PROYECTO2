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

import model.Client;
import model.CustomerAdministration;
import model.CustomerAdministrationInterface;
import view.MainGraphicInterface;

public class MDI extends MainGraphicInterface {

	private CustomerAdministrationInterface client = new CustomerAdministration();
	private MainGraphicInterface u = new MainGraphicInterface();
	private Font font;
	private JPanel subG;
	private JPanel subG2;
	private JPanel subG3;
	private JPanel subG4;
	private JPanel subG5;
	private JPanel subG6;

	public MDI() {

		super();
		initController();

		font = new Font("Calibri", 9, 13);

	}

	private void initController() {

		try {
			u.main(customerAdministration(), medicalAdministration(), medicalServicesAdministration(),
					administrationScheduleAppointments(), serviceBilling(), about());
		} catch (Exception e) {
			System.out.println("Error " + e);
		}

	}

	public JPanel customerAdministration() {

		Client aux = new Client();

		subG = new JPanel();
		subG.setLayout(null);
		subG.setBackground(Color.LIGHT_GRAY);
		subG.setBounds(320, 10, 515, 400);

		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Modify");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");
		JButton b6 = new JButton("Add");
		JButton b7 = new JButton("Search");
		JButton b8 = new JButton("Modify");
		JButton b9 = new JButton("Remove");
		JButton b10 = new JButton("List");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b6.setFont(font);
		b7.setFont(font);
		b8.setFont(font);
		b9.setFont(font);
		b10.setFont(font);

		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		b8.setBackground(Color.white);
		b9.setBackground(Color.white);
		b10.setBackground(Color.white);

		
		
		b1.setBounds(10, 10, 100, 40);
		b2.setBounds(10, 70, 100, 40);
		b3.setBounds(10, 130, 100, 40);
		b4.setBounds(10, 190, 100, 40);
		b5.setBounds(10, 250, 100, 40);
		b6.setBounds(210, 340, 100, 40);
		b7.setBounds(210, 340, 100, 40);	
		b8.setBounds(210, 340, 100, 40);
		b9.setBounds(210, 340, 100, 40);
		b10.setBounds(210, 340, 100, 40);
		
		subG.add(b1);
		subG.add(b2);
		subG.add(b3);
		subG.add(b4);
		subG.add(b5);
		
		String pName =" ", pId =" ", pPhone = " ", pLastN = " ", pEmail = " ", pDat = "12/03/2014",pAddress = "", pTelE = "";
		
		JComboBox<Object> clients = new JComboBox<Object>(new String[] {"Choose" , "feo" , "prueba"} );
		clients.setBounds(200, 15, 100, 30);
		clients.setForeground(Color.BLACK);

		JLabel id = new JLabel("ID:");
		JTextArea id_ = new JTextArea(pId);
		id.setBounds(150, 10, 40, 40);
		id_.setBounds(200, 15, 100, 30);

		JLabel name = new JLabel("Name:");
		JTextArea name_ = new JTextArea(pName);
		name.setBounds(340, 10, 40, 40);
		name_.setBounds(390, 15, 100, 30);
		
		JLabel phone = new JLabel("Phone:");
		JTextArea phone_ = new JTextArea(pPhone);
		phone.setBounds(340, 70, 40, 40);
		phone_.setBounds(390, 75, 100, 30);
		
		JLabel lastN = new JLabel("Last N:");
		JTextArea lastN_ = new JTextArea(pLastN);
		lastN.setBounds(150, 70, 40, 40);
		lastN_.setBounds(200, 75, 100, 30);
	

		JLabel email = new JLabel("Email:");
		JTextArea email_ = new JTextArea(pEmail);
		email.setBounds(150, 130, 40, 40);
		email_.setBounds(200, 135, 100, 30);
		
		JLabel dat = new JLabel("Birthdate:");
		JTextArea dat_ = new JTextArea(pDat);
		dat.setBounds(340, 130, 40, 40);
		dat_.setBounds(390, 135, 100, 30);

		JLabel address = new JLabel("Address:");
		JTextArea address_ = new JTextArea(pAddress);
		address.setBounds(150, 190, 100, 40);
		address_.setBounds(250, 195, 240, 30);

		JLabel person = new JLabel("Tel Emergency:");
		JTextArea person_ = new JTextArea(pTelE);
		person.setBounds(150, 250, 100, 40);
		person_.setBounds(250, 255, 240, 30);
	
		subG.add(id).repaint();
		subG.add(name).repaint();
		subG.add(name_).repaint();
		subG.add(lastN).repaint();
		subG.add(lastN_).repaint();
		subG.add(phone).repaint();
		subG.add(phone_).repaint();
		subG.add(email).repaint();
		subG.add(email_).repaint();
		subG.add(dat).repaint();
		subG.add(dat_).repaint();
		subG.add(address).repaint();
		subG.add(address_).repaint();
		subG.add(person).repaint();
		subG.add(person_).repaint();
		
		
		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				subG.add(id_).repaint();
				subG.add(b6).repaint();
				subG.remove(b7);
				subG.remove(b8);
				subG.remove(b9);
				subG.remove(b10);
				subG.remove(clients);
				
				
				b6.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						if (!id_.getText().equals("") && !name_.getText().equals("") && !lastN_.getText().equals("")
								&& !phone_.getText().equals("") && !email_.getText().equals("")
								&& !dat_.getText().equals("") && !address_.getText().equals("")
								&& !person_.getText().equals("")) {

							aux.setId(id_.getText());
							aux.setName(name_.getText());
							aux.setLastName(lastN_.getText());
							aux.setPhone(phone_.getText());
							aux.setAddress(address_.getText());
							aux.setEmail(email_.getText());
							aux.setEmergencyPerson(person_.getText());

							try {
								Date _dat_ = null;

								_dat_ = new SimpleDateFormat("dd/MM/yyyy").parse(dat_.getText());
								aux.setDateBirth(_dat_);

								if (client.add(aux)) {
									System.out.println("User add");
									subG.remove(b6);
									
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

		
			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
		
				subG.add(b7).repaint();
				subG.add(clients).repaint();
				subG.remove(id_);
				subG.remove(b6);
				subG.remove(b8);
				subG.remove(b9);
				subG.remove(b10);
			
				
		
			
				
//				for(Client i: client.container()) {
//				
//					clients.addItem(i.getId());
//								
//				}
				
				
			
				
				b6.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

					
						
						
						
					}
				});

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				subG.add(clients).repaint();
				subG.add(b8).repaint();
				subG.remove(b7);
				subG.remove(b6);
				subG.remove(b9);
				subG.remove(b10);
				subG.remove(id_);
				
				
				b6.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

					}
				});

			}
		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				subG.add(clients).repaint();
				subG.add(b9).repaint();
				subG.remove(b7);
				subG.remove(b8);
				subG.remove(b6);
				subG.remove(b10);
				subG.remove(id_);
				
				b6.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

					}
				});

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				
				subG.add(b10).repaint();
				subG.remove(b7);
				subG.remove(b8);
				subG.remove(b9);
				subG.remove(b6);
				
				b6.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

					}
				});

			}
		});

		return subG;

	}

	public JPanel medicalAdministration() {
		subG2 = new JPanel();
		subG2.setLayout(null);
		subG2.setBackground(Color.GRAY);
		subG2.setBounds(320, 10, 515, 400);

		JButton b1 = new JButton("Add");
		JButton b2 = new JButton("Search");
		JButton b3 = new JButton("Modify");
		JButton b4 = new JButton("Remove");
		JButton b5 = new JButton("List");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

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

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		subG2.add(b1);
		subG2.add(b2);
		subG2.add(b3);
		subG2.add(b4);
		subG2.add(b5);

		subG2.setVisible(true);

		return subG2;

	}

	public JPanel medicalServicesAdministration() {
		subG3 = new JPanel();
		subG3.setLayout(null);
		subG3.setBackground(Color.GRAY);
		subG3.setBounds(320, 10, 515, 400);

		JButton b1 = new JButton("Add");
		JButton b3 = new JButton("Modify");
		;
		JButton b5 = new JButton("List");

		b1.setFont(font);
		b3.setFont(font);
		b5.setFont(font);

		b1.setBackground(Color.white);
		b3.setBackground(Color.white);
		b5.setBackground(Color.white);

		b1.setBounds(10, 10, 100, 40);
		b3.setBounds(10, 130, 100, 40);
		b5.setBounds(10, 250, 100, 40);

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		subG3.add(b1);
		subG3.add(b3);
		subG3.add(b5);

		subG3.setVisible(true);

		return subG3;

	}

	private JPanel administrationScheduleAppointments() {
		subG4 = new JPanel();
		subG4.setLayout(null);
		subG4.setBackground(Color.GRAY);
		subG4.setBounds(320, 10, 515, 400);

		JButton b1 = new JButton("Developing");
		JButton b2 = new JButton("Developing");
		JButton b3 = new JButton("Developing");
		JButton b4 = new JButton("Developing");
		JButton b5 = new JButton("Developing");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

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

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		subG4.add(b1);
		subG4.add(b2);
		subG4.add(b3);
		subG4.add(b4);
		subG4.add(b5);

		subG4.setVisible(true);

		return subG4;

	}

	private JPanel serviceBilling() {
		subG5 = new JPanel();
		subG5.setLayout(null);
		subG5.setBackground(Color.GRAY);
		subG5.setBounds(320, 10, 515, 400);

		JButton b1 = new JButton("Developing");
		JButton b2 = new JButton("Developing");
		JButton b3 = new JButton("Developing");
		JButton b4 = new JButton("Developing");
		JButton b5 = new JButton("Developing");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);

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

		b1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		b5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

			}
		});

		subG5.add(b1);
		subG5.add(b2);
		subG5.add(b3);
		subG5.add(b4);
		subG5.add(b5);

		subG5.setVisible(true);

		return subG5;

	}

	private JPanel about() {

		subG6 = new JPanel();
		subG6.setLayout(null);
		subG6.setBackground(Color.white);
		subG6.setBounds(320, 10, 515, 400);

		JLabel txt = new JLabel();
		String txt_ = "Developed \n by Anthony Marin Bolivar and Erick Badilla" + "\n Version:1.3 DEVELOPINGGGGG";
		txt.setText(txt_);
		txt.setLayout(null);
		txt.setBounds(10, 10, 400, 400);

		subG6.add(txt);

		subG6.setVisible(true);

		return subG6;

	}

}
