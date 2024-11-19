package com.foro.foro.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long cedula ;
   private  String nombre ;
   private  String apellido ;
   private  int edad;
   private  int telefono;
   private  String email;
   private  String usuario;
   private  String contrasennia;

   //Contructor vacio
   public Users() {
   }
   
   //Constructor con parametros
   public Users(Long cedula, String nombre, String apellido, int edad, int telefono, String email, String usuario, String contrasennia) {
    this.cedula = cedula;
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.telefono = telefono;
    this.email = email;
    this.usuario = usuario;
    this.contrasennia = contrasennia;
   }
    //Getters y Setters
    public Long getCedula() {
    return cedula;
   }
    public void setCedula(Long cedula) {
    this.cedula = cedula;
   }
    public String getNombre() {
    return nombre;
   }
    public void setNombre(String nombre) {
    this.nombre = nombre;
   }
    public String getApellido() {
    return apellido;
   }
    public void setApellido(String apellido) {
    this.apellido = apellido;
   }
    public int getEdad() {
    return edad;
   }
    public void setEdad(int edad) {
    this.edad = edad;
   }
    public int getTelefono() {
    return telefono;
   }
    public void setTelefono(int telefono) {
    this.telefono = telefono;
   }
    public String getEmail() {
    return email;
   }
    public void setEmail(String email) {
    this.email = email;
   }
    public String getUsuario() {
    return usuario;
   }
    public void setUsuario(String usuario) {
    this.usuario = usuario;
   }
    public String getContrasennia() {
    return contrasennia;
   }
    public void setContrasennia(String contrasennia) {
    this.contrasennia = contrasennia;
   }
   
   

    


    
}
