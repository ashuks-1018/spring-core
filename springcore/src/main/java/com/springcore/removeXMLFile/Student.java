package com.springcore.removeXMLFile;

public class Student {
	
	private Samosa samosa;
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void Study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}
	
}
