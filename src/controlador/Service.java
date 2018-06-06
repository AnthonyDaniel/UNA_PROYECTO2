package controlador;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Servicios.MedicalServicesInterface;
import modelo.Servicios.MedicalServiceContainer;
import modelo.Servicios.MedicalService;


public class Service {
	
	private MedicalServicesInterface serviceInterface;
	private JFrame serviceFrame;
	
	JLabel id;
	JTextField textID;
	
	JLabel desc;
	JTextField textDesc;
	
	JLabel price;
	JTextField textPrice;
	
	JButton add;
	JButton search;
	JButton display;
	JButton back;
	
	public Service() {
		
		id = new JLabel("ID:");
		desc = new JLabel("Descripcion:");
		price = new JLabel("Precio:");
		
		textID = new JTextField();
		textDesc = new JTextField();
		textPrice = new JTextField();
		
		add = new JButton("Agregar");
		search =  new JButton("Buscar");
		display = new JButton("Mostrar");
		back = new JButton("Volver"); 
		
		
		try {
			serviceInterface = new MedicalServiceContainer();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error al cargar los archivos");
		}
		
		serviceFrame = new JFrame();
		
		serviceFrame.setSize(450, 450);
		serviceFrame.setLayout(null);
		serviceFrame.setTitle("Servicios");
		
		serviceFrame.add(id);
		serviceFrame.add(desc);
		serviceFrame.add(price);
	
		serviceFrame.add(textID);
		serviceFrame.add(textDesc);
		serviceFrame.add(textPrice);
		
		serviceFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		serviceFrame.addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
					close();
	            }
	        });
		
		serviceFrame.setLocationRelativeTo(null);	

	}
	
	private void close(){
        if (JOptionPane.showConfirmDialog(serviceFrame, "¿Desea realmente salir?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {     	
        	serviceFrame.dispose();
        	main i = new main();
        	i.main(null);
  
        }
      
    }  
	
	public void template () {

		serviceFrame.setVisible(true);
		
		id.setBounds(10, 10, 80, 40);        	 textID.setBounds(100, 10, 120, 40);
		price.setBounds(230, 10, 80, 40);       textPrice.setBounds(320, 10, 120, 40);  
		desc.setBounds(10, 70, 80, 40);        textDesc.setBounds(100, 70, 340, 40);
		
		
		textID.setEditable(true);
		textDesc.setEditable(true);
		textPrice.setEditable(true);
	
		serviceFrame.setVisible(true);
		
	}
	
	public void clean() {
		textID.setText(null);
		textDesc.setText(null);
		textPrice.setText(null);
	}
	
	public void agregar() {
		clean();
		template();
		
		add.setBounds(10, 350, 100, 40);
		back.setBounds(120, 350, 100, 40);
		add.setEnabled(true);
		search.setEnabled(false);
		display.setEnabled(false);
		back.setEnabled(true);
		
		serviceFrame.add(add).repaint();
		serviceFrame.add(back).repaint();
		
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!textID.getText().equals("") && !textDesc.getText().equals("") && !textPrice.getText().equals("")) {
					MedicalService serv = new MedicalService();
					
					serv.setCod(textID.getText());
					serv.setDesc(textDesc.getText());
					serv.setPrice(Double.valueOf(textPrice.getText()));
					
					try {
						if(serviceInterface.addNode(serv)) {
							clean();
							JOptionPane.showMessageDialog(null, "Se ha agregado", "Alerta", 0);
						}
						else {
							JOptionPane.showMessageDialog(null, "Ya existe", "Error", 0);
						}
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Existe un error\n" + ex, "Error", 0);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "No se pueden dejar espacios en blanco!", "Error", 0);
				}
				
			}
			
		});
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				serviceFrame.dispose();
				Controlador con = new Controlador();
				con.serviciosModulo();
				
			}
			
		});
	}
	
	public void buscar() {
		clean();
		template();
		textDesc.setEditable(false);
		textPrice.setEditable(false);
		search.setBounds(10, 350, 100, 40);
		back.setBounds(120, 350, 100, 40);
		
		search.setEnabled(true);
		add.setEnabled(false);
		display.setEnabled(false);
		back.setEnabled(true);
		
		serviceFrame.add(search).repaint();
		serviceFrame.add(back).repaint();
		
		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!textID.getText().equals("")) {
					try {
						MedicalService serv = serviceInterface.searchNode(textID.getText());
						
						textDesc.setText(serv.getDesc());
						textPrice.setText(String.valueOf(serv.getPrice()));
						
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "No se encontro el servicio" + e1, "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "No se encontro servicio", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
			
		});
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				serviceFrame.dispose();
				Controlador con = new Controlador();
				con.serviciosModulo();
				
			}
			
		});
		
	}
	
	public void display() {
		clean();
		template();
		
		add.setEnabled(false);
		search.setEnabled(false);
		display.setEnabled(true);
		
		display.setBounds(10, 350, 100, 40);
		back.setBounds(120, 350, 100, 40);
		
		serviceFrame.add(display).repaint();
		serviceFrame.add(back).repaint();
		
		display.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				serviceFrame.dispose();
				Controlador con = new Controlador();
				con.serviciosModulo();
				
			}
			
		});
	}


}


