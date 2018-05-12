package controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		

	
		
		font = new Font("Calibri",9,13); 
		
	}
	
	private void  initController() {
		
		try {
		u.main(customerAdministration(),medicalAdministration(),
				medicalServicesAdministration(),administrationScheduleAppointments(),
				serviceBilling(),about());
		}catch(Exception e) {
			System.out.println("Error " + e);
		}
		
		}
	
	
	public JPanel customerAdministration() {

		Client aux = new Client();;
		
		subG = new JPanel();
		subG.setLayout(null);
		subG.setBackground(Color.LIGHT_GRAY);
		subG.setBounds(320, 10, 515, 400);
		
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
	
		subG.add(b1);
		subG.add(b2);
		subG.add(b3);
		subG.add(b4);
		subG.add(b5);
		
	
		
		b1.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			
				JLabel id = new JLabel("ID:");  	 		JTextArea id_ = new JTextArea();    		
				id.setLayout(null);					 		id_.setLayout(null); 						
				id.setBounds(150, 10, 40, 40);		 		id_.setBounds(200, 15, 100, 30); 			
				subG.add(id).repaint();				 		subG.add(id_).repaint(); 				

				JLabel name= new JLabel("Name:");  			 JTextArea name_ = new JTextArea();
				name.setLayout(null);						 name_.setLayout(null);
				name.setBounds(340, 10, 40, 40);			 name_.setBounds(390, 15, 100, 30);
				subG.add(name).repaint();					 subG.add(name_).repaint();
				
				JLabel lastN = new JLabel("Last N:");   	 JTextArea lastN_ = new JTextArea();  		JLabel phone= new JLabel("Phone:");  JTextArea phone_ = new JTextArea();
				lastN.setLayout(null);						 lastN_.setLayout(null); 					phone.setLayout(null);				 phone_.setLayout(null);
				lastN.setBounds(150, 70, 40, 40);	 		 lastN_.setBounds(200, 75, 100, 30); 		phone.setBounds(340, 70, 40, 40);	 phone_.setBounds(390, 75, 100, 30);
				subG.add(lastN).repaint();			 		 subG.add(lastN_).repaint(); 				subG.add(phone).repaint();			 subG.add(phone_).repaint();
				
				JLabel email = new JLabel("Email:"); 	  	 JTextArea email_ = new JTextArea();  		JLabel dat= new JLabel("Birthdate:");JTextArea dat_ = new JTextArea();
				email.setLayout(null);						 email_.setLayout(null); 					dat.setLayout(null);				 dat_.setLayout(null);
				email.setBounds(150, 130, 40, 40);	 		 email_.setBounds(200, 135, 100, 30); 		dat.setBounds(340, 130, 40, 40);	 dat_.setBounds(390, 135, 100, 30);
				subG.add(email).repaint();			 		 subG.add(email_).repaint(); 				subG.add(dat).repaint();			 subG.add(dat_).repaint();
				
				JLabel address = new JLabel("Address:"); 	  	 JTextArea address_ = new JTextArea();  
				address.setLayout(null);						 address_.setLayout(null); 					
				address.setBounds(150, 190, 100, 40);	 		 address_.setBounds(250, 195, 240, 30); 	
				subG.add(address).repaint();			 		 subG.add(address_).repaint(); 				
				
				JLabel person= new JLabel("Tel Emergency:");	 JTextArea person_ = new JTextArea();
				person.setLayout(null);							 person_.setLayout(null);
				person.setBounds(150, 250, 100, 40);		     person_.setBounds(250, 255, 240, 30);
				subG.add(person).repaint();						 subG.add(person_).repaint();
				
				
				
				
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
		
		subG.setVisible(true);
		
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
			JButton b3 = new JButton("Modify");;
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
			String txt_ = "Developed \n by Anthony Marin Bolivar and Erick Badilla"
					+ "\n Version:1.3 DEVELOPINGGGGG";
			txt.setText(txt_);
			txt.setLayout(null);
			txt.setBounds(10, 10, 400, 400);
			
			
			subG6.add(txt);

			subG6.setVisible(true);
			
			return subG6;
		 
		 
	 }
	
	
}
