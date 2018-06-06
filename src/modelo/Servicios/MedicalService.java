package modelo.Servicios;


public class MedicalService {
	
	String cod;
	String desc;
	double price;
	
	public MedicalService(){
		super();
		this.cod = null;
		this.desc = null;
		this.price = 0.0;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	

}
