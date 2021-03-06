package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the prtsonalMedical database table.
 * @Entity - ii spui ca mapezi tabela personalMedical. se pune deasupra clasei
 * toate variabilele reprezinta coloanele tabelei personalMedical
 * @Id - cheia primara a tabelei personalMedical
 * @GeneratedValue - idPersonalMedical va fi generat automat
 */
@Entity
@NamedQuery(name="PersonalMedical.findAll", query="SELECT personalMedical FROM PersonalMedical personalMedical")
public class PersonalMedical implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int idPersonalMedical;
	private String firstName;
	private String lastName;
	
	public PersonalMedical() {	
	}

	public int getIdPersonalMedical() {
		return idPersonalMedical;
	}

	public void setIdPersonalMedical(int idPersonalMedical) {
		this.idPersonalMedical = idPersonalMedical;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}



