/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.reza.latihanmvc.model;

import edu.reza.latihanmvc.event.pelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class pelangganModel {
    private String nama;
    private String email;
    private String notelpon;
    
    private pelangganListener pelangganLIstener;

    public pelangganListener getPelangganLIstener() {
        return pelangganLIstener;
    }

    public void setPelangganLIstener(pelangganListener pelangganLIstener) {
        this.pelangganLIstener = pelangganLIstener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNotelpon() {
        return notelpon;
    }

    public void setNotelpon(String notelpon) {
        this.notelpon = notelpon;
        fireOnChange();
    }
    
    
    protected void fireOnChange(){
        if (pelangganLIstener!=null){
            pelangganLIstener.onChange(this);
        }
            
    }
    
    
    public void resetform(){
        setNama("");
        setEmail("");
        setNotelpon("");
    }
    public void simpanform(){
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        
    }
    
    
}
