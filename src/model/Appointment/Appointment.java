package model.Appointment;

public class Appointment {

	private static final long serialVersionUID = 1L;
	private String id;
	private String date;
	private String time;
	private String numAppoint;
	private String clientName;
	private String doctor;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNumAppoint() {
		return numAppoint;
	}
	public void setNumAppoint(String numAppoint) {
		this.numAppoint = numAppoint;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
}
