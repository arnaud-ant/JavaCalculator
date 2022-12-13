/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.telecom.fise2.model;

import javax.swing.JLabel;

/**
 *
 * @author Arnaud
 */
public class Functionalities {
    
    static public String calculResult(float A, float B, String operation) 
            // Fonctionnalité : Calcul et renvoi du résultat
    {
        float result=0; 
        switch(operation) // En fonction de l'opération choisie par l'utilisateur :
       {
           case "plus":
               result = A + B; // Addition des 2 parties
               break;
           case "minus":
               result = A - B; // Soustraction des 2 parties
               break;
           case "mult":
               result = A * B; // Multiplication des 2 parties
               break;
           case "div":
               result = A / B; // Division des 2 parties
           case "mod":
               result = A % B; // Partie 1 modulo Partie 2
       }
        return String.valueOf(result); // On retourne le résultat sous forme de chaine de caractères
    }
    
    static public void resetLabels(JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6)
            // Fonctionnalité : réinitialiser les labels (Les rendre invisibles)
    {
        label1.setVisible(false);
        label2.setVisible(false);
        label3.setVisible(false);
        label4.setVisible(false);
        label5.setVisible(false);
        label6.setVisible(false);
    }
}



