package model;

import java.util.Date;

public class Person {
			
		private String id;
		private String name;
		private String lastName;
		private String phone;
		private String email;
		private String address;
		private Date dateBirth;
		
		public Person() {
			
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Date getDateBirth() {
			return dateBirth;
		}

		public void setDateBirth(Date dateBirth) {
			this.dateBirth = dateBirth;
		}
		
		
	
}
