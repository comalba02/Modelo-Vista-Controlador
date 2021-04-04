/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;

    public Controlador (Vista view, Modelo model){

        this.view = view;
        this.model = model;
        this.view.btn_sumar.addActionListener(this);
        this.view.btn_restar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        model.setNum1(Integer.parseInt(view.txt_num1.getText()));
        model.setNum2(Integer.parseInt(view.txt_num2.getText()));
        
        if (e.getSource()== view.btn_sumar){
           model.sumar();
        }
        
         if (e.getSource()== view.btn_restar){
           model.restar();
        }
        
        view.lbl_resultado.setText(Integer.toString(model.getResultado())); 
    }
    
}
