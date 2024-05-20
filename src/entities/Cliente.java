package entities;

import java.time.LocalDate;
import java.util.Date;

public class Cliente {

	private String name;
	private int numberPhone;
	private LocalDate birthDate;
	private String adress;
	
	public Cliente() {
	}

	public Cliente(String name, int numberPhone, LocalDate birthDate, String adress) {
		this.name = name;
		this.numberPhone = numberPhone;
		this.birthDate = birthDate;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Cliente: " + name + ", Telefone: " + numberPhone + ", Nascimento" + birthDate + ", Endereco: " + adress + "/n";
	}
	
}
