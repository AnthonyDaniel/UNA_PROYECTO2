package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import vista.interfazG;

public class controlador {
	
	private interfazG i = new interfazG(); 
	private Cliente c = new Cliente();
    private Medico m = new Medico();
	
	private JFrame cl;
	private JFrame cm;
	
	public controlador() {
		
		cl = new JFrame();
		cm = new JFrame();
		
		
		clienteBotn();
		medicoBotn();
		serviciosBotn();
		citasBotn();
		facturacionBotn();
		acercaBotn();
		salirBotn();
		inicio();	
	}
	
	private void inicio() {
		
		i.main();
		
	}
	
	//-----------------------------Modulos-----------------------------
	
	private void clienteModulo() {
		
		cl.setTitle("Clientes");
		cl.setSize(450, 450);
		cl.setLayout(null);
		
		
		JButton agregar = new JButton("Agregar");
		JButton buscar = new JButton("Buscar");
		JButton modificar = new JButton("Modificar");
		JButton eliminar = new JButton("Eliminar");
		JButton volver = new JButton("Volver");
		
		agregar.setBounds(115, 40, 200, 40);
		buscar.setBounds(115, 90, 200, 40);
		modificar.setBounds(115, 140, 200, 40);
		eliminar.setBounds(115, 190, 200, 40);
		volver.setBounds(115, 240, 200, 40);
		
		cl.add(agregar).repaint();
		cl.add(buscar).repaint();
		cl.add(modificar).repaint();
		cl.add(eliminar).repaint();
		cl.add(volver).repaint();
		
		cl.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	     
		cl.addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				 if (JOptionPane.showConfirmDialog(cm, "¿Desea realmente salir?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {     	
			        	cl.dispose();
			        	main i = new main();
			        	i.main(null);
			  
			        }
	            }
	        });
		
		agregar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				c.agregar();
				cl.dispose();
				
			}
		});
		buscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				c.buscar();
				cl.dispose();
			}
		});
		modificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				c.modificar();
				cl.dispose();
			}
		});
		eliminar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				c.eliminar();
				cl.dispose();
			}
		});
		volver.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				cl.dispose();
	        	main i = new main();
	        	i.main(null);
	        	
			}
		});
		
		
		cl.setLocationRelativeTo(null);
		cl.setVisible(true);
		
		
		
	}
	private void medicoModulo() {

		cm.setTitle("Medicos");
		cm.setSize(450, 450);
		cm.setLayout(null);

		JButton agregar = new JButton("Agregar");
		JButton buscar = new JButton("Buscar");
		JButton modificar = new JButton("Modificar");
		JButton eliminar = new JButton("Eliminar");
		JButton volver = new JButton("Volver");
		
		agregar.setBounds(115, 40, 200, 40);
		buscar.setBounds(115, 90, 200, 40);
		modificar.setBounds(115, 140, 200, 40);
		eliminar.setBounds(115, 190, 200, 40);
		volver.setBounds(115, 240, 200, 40);
		
		cm.add(agregar).repaint();
		cm.add(buscar).repaint();
		cm.add(modificar).repaint();
		cm.add(eliminar).repaint();
		cm.add(volver).repaint();
		
		cm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	     
		cm.addWindowListener(new java.awt.event.WindowAdapter() {

			public void windowClosing(java.awt.event.WindowEvent evt) {
				 if (JOptionPane.showConfirmDialog(cm, "¿Desea realmente salir?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {     	
			        	cm.dispose();
			        	main i = new main();
			        	i.main(null);
			  
			        }
	            }
	        });
	        
			
		
		agregar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				m.agregar();
				cm.dispose();
			}
		});
		buscar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				m.buscar();
				cm.dispose();
			}
		});
		modificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				m.modificar();
				cm.dispose();
			}
		});
		eliminar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				m.eliminar();
				cm.dispose();
			}
		});
		volver.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
				cm.dispose();
	        	main i = new main();
	        	i.main(null);
	  
			
			}
		});
		
		
		cm.setLocationRelativeTo(null);
		cm.setVisible(true);

	}
	private void serviciosModulo() {
		
	}
	private void citasModulo() {
		
	}
	private void facturacionModulo() {
		
	}
	
	//-------------Funcionalidad a los botones---------------------------
	
	private void clienteBotn() {
		i.cliente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				clienteModulo();
				i.g.dispose();
				
			}
		});
	}
	private void medicoBotn() {
		
		i.medicos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				medicoModulo();
				i.g.dispose();
			}
		});
		
	}
	private void serviciosBotn() {
		
	}
	private void citasBotn() {
		
	}
	private void facturacionBotn() {
		
	}
	private void acercaBotn() {
		i.acerca.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane.showMessageDialog(null,"Version 4.1 \n \n Desarroladores:\n Anthony Marín Bolivar \n Erick Badiila \n William Arias");
				
			}
		});
		
		
	}
	private void salirBotn() {
		i.salir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				System.exit(0);
				
			}
		});
	}
	
	
}
