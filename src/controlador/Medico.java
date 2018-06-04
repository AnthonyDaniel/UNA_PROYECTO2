package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.clientes.clienteEntity;
import modelo.medico.IMedico;
import modelo.medico.medicoContenedor;
import modelo.medico.medicoEntity;

public class Medico {

	private IMedico cli;
	
	private JFrame ClF;
	
	private JLabel id;    		 	
	private JTextField id_;
	private JLabel nombre;	 			
	private JTextField nombre_;
	private JLabel apel;  				
	private JTextField apel_;
	private JLabel tel;					 
	private JTextField tel_;
	private JLabel fecha;		
	private JFormattedTextField fecha_ ;
	private JLabel especialidad;	
	private JTextField especialidad_;
	private JLabel email; 
	private JTextField email_;
	private JLabel direc;
	private JTextField direc_;
	
	private JButton agregarC;
	private JButton buscarC;
	private JButton modificarC;
	private JButton eliminarC;

	public Medico (){

		id = new JLabel("ID:");    
		id_ = new JTextField();
		nombre = new JLabel("Nombre");
		nombre_ = new JTextField();
		apel = new JLabel("Apellidos:");
		apel_ = new JTextField();
		tel = new JLabel("Tel:");
		tel_ = new JTextField();
		fecha = new JLabel("Fecha Nac:");
		fecha_ = new JFormattedTextField();
		especialidad = new JLabel("Tel Emerg:");
		especialidad_ = new JTextField();
		email = new JLabel("Email:");
		email_ = new JTextField();
		direc = new JLabel("Dirrecion");
		direc_ = new JTextField();
		
		agregarC = new JButton("Agregar");
		buscarC = new JButton("Buscar");
		modificarC = new JButton("Modificar");
		eliminarC = new JButton("Eliminar");
		
		try {
			
			
			cli = new  medicoContenedor();
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Error al cargar los archivos");
			
		}
		
		ClF = new JFrame();
		
		ClF.setSize(450, 450);
		ClF.setLayout(null);
		ClF.setTitle("Medico");
		ClF.add(id);
		ClF.add(id_);
		
		ClF.add(nombre);
		ClF.add(nombre_);
		
		ClF.add(apel);
		ClF.add(apel_);
		
		ClF.add(tel);
		ClF.add(tel_);
		
		ClF.add(fecha);
		ClF.add(fecha_);
		
		ClF.add(especialidad);
		ClF.add(especialidad_);
		
		ClF.add(email);
		ClF.add(email_);
		
		ClF.add(direc);
		ClF.add(direc_);
		
		ClF.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	     
		ClF.addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
					close();
	            }
	        });
	        
			
		ClF.setLocationRelativeTo(null);

	}
	private void close(){
        if (JOptionPane.showConfirmDialog(ClF, "¿Desea realmente salir?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {     	
        	ClF.dispose();
        	main i = new main();
        	i.main(null);
  
        }
      
    }  
	public void plantilla () {

		ClF.setVisible(true);
		
		id.setBounds(10, 10, 80, 40);        	 id_.setBounds(100, 10, 120, 40);
		nombre.setBounds(230, 10, 80, 40);       nombre_.setBounds(320, 10, 120, 40);  
		apel.setBounds(10, 50, 80, 40);        	 apel_.setBounds(100, 50, 120, 40);
		tel.setBounds(230, 50, 80, 40);  	     tel_.setBounds(320, 50, 120, 40);  
		fecha.setBounds(10, 90, 80, 40);		 fecha_.setBounds(100, 90, 120, 40);
		
		try {
	     fecha_.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
			fecha_.setText("00/00/0000");
		} catch (java.text.ParseException ex) {
			ex.printStackTrace();
		}
		
		especialidad.setBounds(230, 90, 80, 40);  	     especialidad_.setBounds(320, 90, 120, 40); 
		email.setBounds(10, 130, 80, 40);        email_.setBounds(100, 130, 340, 40);
		direc.setBounds(10, 170, 80, 40); 		 direc_.setBounds(100, 170, 340, 40);	
		
		id_.setEditable(true);
		nombre_.setEditable(true);
		apel_.setEditable(true);
		tel_.setEditable(true);
		fecha_.setEditable(true);
		especialidad_.setEditable(true);
		email_.setEditable(true);
		direc_.setEditable(true);
	
		ClF.setVisible(true);
		
	}
	public void limpiar() {
		id_.setText("");
		nombre_.setText("");
		apel_.setText("");
		tel_.setText("");
		fecha_.setText("00/00/0000");
		especialidad_.setText("");
		email_.setText("");
		direc_.setText("");		
	}
	public void agregar() {
		
		limpiar();
		
		plantilla();
		
		agregarC.setBounds(120, 350,100, 40);
		
		agregarC.setEnabled(true);
		buscarC.setEnabled(false);
		modificarC.setEnabled(false);
		eliminarC.setEnabled(false);
		
		ClF.add(agregarC).repaint();
		
		
		agregarC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!id_.getText().equals("") && !nombre_.getText().equals("") && !apel_.getText().equals("") && !tel_.getText().equals("") 
				&& !especialidad.getText().equals("") && !email_.getText().equals("") && !direc_.getText().equals("") && !fecha_.getText().equals("00/00/0000")) {
					
					medicoEntity cE = new medicoEntity();
					
					cE.setId(id_.getText());
					cE.setNombre(nombre_.getText());
					cE.setApellidos(apel_.getText());
					cE.setFecha(fecha_.getText());
					cE.setEmail(email_.getText());
					cE.setTel(tel_.getText());
					cE.setEspecialidad(especialidad_.getText());
					cE.setDireccion(direc_.getText());
					
					try {
						
				    	if(cli.agregar(cE)) {
						
							limpiar();
							JOptionPane.showMessageDialog(null, "Agregado Correctamente");
				
					
						}else {
							
							JOptionPane.showMessageDialog(null, "Ya existe, No agregado");
							
						}
						
					} catch (Exception e1) {
						
						JOptionPane.showMessageDialog(null, "Existe un error");
					
					}
					
				}else {
					
					JOptionPane.showMessageDialog(null,"No dejar espacios en blancos");
				}
				
			}
		});

				
	}
	
	public void buscar() {
		
		limpiar();
		
		plantilla();
	
		agregarC.setEnabled(false);
		buscarC.setEnabled(true);
		modificarC.setEnabled(false);
		eliminarC.setEnabled(false);
		
		buscarC.setBounds(10, 350,100, 40);
		
		ClF.add(buscarC).repaint();
		
		id_.setEditable(true);
		nombre_.setEditable(false);
		apel_.setEditable(false);
		tel_.setEditable(false);
		fecha_.setEditable(false);
		especialidad_.setEditable(false);
		email_.setEditable(false);
		direc_.setEditable(false);
		
		
		
		
		buscarC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				if(!id_.equals("")) {
					
					try {
						
						medicoEntity i = cli.buscar(id_.getText());
						
						nombre_.setText(i.getId());
						apel_.setText(i.getApellidos());
						tel_.setText(i.getTel());
						fecha_.setText(i.getFecha());
						especialidad_.setText(i.getEspecialidad());
						email_.setText(i.getEmail());
						direc_.setText(i.getDireccion());
						
						
					} catch (Exception e1) {
						
						JOptionPane.showMessageDialog(null, "Existe un error", "error",JOptionPane.ERROR_MESSAGE);
					
					}
					
				}else {
					
					JOptionPane.showMessageDialog(null, "No dejar espacios en blanco", "Necesito la cedula", JOptionPane.ERROR_MESSAGE);
					
	     		}
				
			}
		});
		
	}
	
	public void modificar() {
		
		limpiar();
		
		plantilla();
		
		agregarC.setEnabled(false);
		buscarC.setEnabled(false);
		modificarC.setEnabled(true);
		eliminarC.setEnabled(false);
		
		modificarC.setBounds(230, 350,100, 40);
		
		ClF.add(modificarC).repaint();

		modificarC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(!id_.getText().equals("") && !nombre_.getText().equals("") && !apel_.getText().equals("") && !tel_.getText().equals("") 
						&& !especialidad_.getText().equals("") && !email_.getText().equals("") && !direc_.getText().equals("") && !fecha_.getText().equals("00/00/0000")) {
				
				medicoEntity cE = new medicoEntity();
				
				cE.setId(id_.getText());
				cE.setNombre(nombre_.getText());
				cE.setApellidos(apel_.getText());
				cE.setFecha(fecha_.getText());
				cE.setEmail(email_.getText());
				cE.setTel(tel_.getText());
				cE.setEspecialidad(especialidad_.getText());
				cE.setDireccion(direc_.getText());

				
				try {
					
					if(cli.modificar(cE)) {
				
						JOptionPane.showMessageDialog(null, "Modificado correctamente");
						
						
					}else {
						
						JOptionPane.showMessageDialog(null, "No modificado");
						
					}
					
				} catch (Exception e1) {
				
					JOptionPane.showMessageDialog(null, "Error-Modulo modificar");
				
				}
				
				}else {
					
					JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
				}
				
			}
		});
	}
	
	public void eliminar() {
		
		limpiar();
		
		plantilla();

		agregarC.setEnabled(false);
		buscarC.setEnabled(false);
		modificarC.setEnabled(false);
		eliminarC.setEnabled(true);

		eliminarC.setBounds(340, 350,100, 40);
		
		ClF.add(eliminarC).repaint();

		id_.setEditable(true);
		nombre_.setEditable(false);
		apel_.setEditable(false);
		tel_.setEditable(false);
		fecha_.setEditable(false);
		especialidad_.setEditable(false);
		email_.setEditable(false);
		direc_.setEditable(false);

		eliminarC.addActionListener(new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				
				if(!id_.equals("")) {
					
					try {
						if(cli.eliminar(id_.getText())) {
							JOptionPane.showMessageDialog(null, "Eliminado correctamente");
							limpiar();
						}else {
							JOptionPane.showMessageDialog(null, "No Eliminado");
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Existe un error-Modulo Eliminar");
					}
					
				}else {
					JOptionPane.showMessageDialog(null, "Por llenar el espacio de la cedula");
				}
				
			}
		});
		
	}
}