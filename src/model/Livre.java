package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livres")
public class Livre implements Serializable{
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id;
private String description;
private int quantity;
public Livre(int id, String description, int quantity) {
	this.id = id;
	this.description = description;
	this.quantity = quantity;
}
public Livre() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
