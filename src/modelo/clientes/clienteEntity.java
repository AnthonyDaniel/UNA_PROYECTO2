package modelo.clientes;

public class clienteEntity {

	private String telEmer;
	private String id;
	private String nombre;
	private String apellidos;
	private String tel;
	private String email;
	private String direccion;
	private String fecha;
	
	public clienteEntity() {
		
	}

	public String getTelEmer() {
		return telEmer;
	}

	public void setTelEmer(String telEmer) {
		this.telEmer = telEmer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
