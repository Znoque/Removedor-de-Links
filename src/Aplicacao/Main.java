/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Znoque
 */
public class Main {
    public static void main(String[] args) {
        Removedor r = new Removedor();
        String s = new String(JOptionPane.showInputDialog("REMOVEDOR DE LINKS\n\nDigite o texto que deseja alterar:"));
        String s2 = s;
        
        if(s.contains("http")){
            s = r.removeURL(s);
        } 
        if(s.contains(".br") || s.contains(".br ")){
            s = r.removeBR(s);
        }
        if(s.contains("/") || s.contains("/ ")){
          s = r.removeBar(s);  
        }
        
        
        JOptionPane.showMessageDialog(null, "Texto Digitado:\n"+s2+"\n\nTexto sem Links!!\n"+s);
        System.out.println("Texto Digitado:\n"+s2+"\n\nTexto sem Links!!\n"+s);
    }
}
