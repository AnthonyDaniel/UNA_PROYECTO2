package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

public class interfazG {

	public JFrame g = new JFrame();
	public JButton cliente;
	public JButton medicos;
	public JButton servicios;
	public JButton citas;
	public JButton facturacion;
	public JButton acerca;
	public JButton salir;
	
	public interfazG(){
		cliente = new JButton("Clientes");
		medicos = new JButton("Medicos");
		servicios = new JButton("Servicios");
		citas = new JButton("Citas");
		facturacion = new JButton("Facturacion");
		acerca = new JButton("Acerca..");
		salir = new JButton("Salir");
	}
	
	public void main() {
		
		g.setDefaultCloseOperation(g.EXIT_ON_CLOSE);
		g.setSize(450, 450);
		g.setLayout(null);
		g.setTitle("Farmacia");
		
		cliente.setBounds(115, 30, 200, 40);
		medicos.setBounds(115, 80, 200, 40);
		servicios.setBounds(115, 130, 200, 40);
		citas.setBounds(115, 180, 200, 40);
		facturacion.setBounds(115, 230, 200, 40);
		acerca.setBounds(115, 280, 200, 40);
		salir.setBounds(115, 330, 200, 40);
		
		g.add(cliente);
		g.add(medicos);
		g.add(servicios);
		g.add(citas);
		g.add(facturacion);
		g.add(acerca);
		g.add(salir);
		
		g.setLocationRelativeTo(null);
		g.setVisible(true);
		
	}
	
	
	
}
