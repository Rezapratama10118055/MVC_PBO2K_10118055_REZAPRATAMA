/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.reza.latihanmvc.controller;

import edu.reza.latihanmvc.model.pelangganModel;
import edu.reza.latihanmvc.view.pelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class pelangganController {
    
    private pelangganModel model;

    public void setModel(pelangganModel model) {
        this.model = model;
    }
    
    
    public void resetform(pelangganView view){
        
       String nama = view.getTxtnama().getText();
       String email = view.getTxtemail().getText();
       String notlp= view.getTxtnotelpon().getText();
       
       
       if (nama.equals("")&& email.equals("")&& notlp.equals("")){
           
       }else{
           model.resetform();
       }
    }
    public void simpanform(pelangganView view){
       String nama = view.getTxtnama().getText();
       String email = view.getTxtemail().getText();
       String notlp= view.getTxtnotelpon().getText();
       
       
       if(nama.trim().equals("")){
           JOptionPane.showMessageDialog(view, "Nama masih kosong");
       }else if(email.trim().equals("")){
           JOptionPane.showMessageDialog(view, "Email masih kosong");
           
       }else if(notlp.trim().equals("")){
           JOptionPane.showMessageDialog(view, "NoTelpon masih kosong");
    }else{
           model.simpanform();
       }
    
}
    }
