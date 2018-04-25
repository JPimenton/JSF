package com.codenotfound.primefaces;
 
import java.io.Serializable;
 
public class User implements Serializable {
 
    private String firstname;
     
    private String lastname;
     
    private Integer age;
     
    private String street;
     
    private String city;
     
    private String postalCode;
     
    private String info;
     
    private String email;
     
    private String phone;
 
    public String getFirstname() {
        return firstname;
    }
 
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String street) {
        this.street = street;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public String getPostalCode() {
        return postalCode;
    }
 
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
 
    public String getInfo() {
        return info;
    }
 
    public void setInfo(String info) {
        this.info = info;
    }
     
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
    	return "Nombre: "+this.getFirstname()+"\n"
    			+ "Apellidos: "+this.getLastname()+"\n"
    					+ "Edad: "+this.getAge()+"\n"
    					+ "Direccion: "+this.getStreet()+", "+this.getCity()+ " ("+this.getPostalCode()+") "+"\n"
    					+ "Email: "+ this.getEmail()+"\n"
    	    			+ "Telefono"+ this.getPhone()+"\n"
    					+ "Informacion adicional: "+this.getInfo();
    			
    }
}