package poo_lab2_practica5_u2_alexanderq;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESPE
 */
public class Persona {
    private String nomb;
    private String telef;
    private String mail;
    
    public Persona(String nomb, String telef, String mail){
        this.nomb = nomb;
        this.telef = telef;
        this.mail = mail;
    }
    
    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
