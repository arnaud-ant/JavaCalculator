/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.telecom.fise2.controller;

import fr.telecom.fise2.model.Functionalities;
import fr.telecom.fise2.view.CalculatorFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Arnaud
 */
public class Listeners extends CalculatorFrame implements ActionListener{
    // Tous les listeners font appel à la fonction resetLabels afin de "rafraichir"
    // les erreurs (en les effacants)
    
    
   
    public static void Butt0ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"0"); //Ajoute un 0 à la fin du texte
         
    } 
    
    public static void Butt1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"1"); //Ajoute un 1 à la fin du texte
         
    }           
    
    public static void Butt2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"2"); //Ajoute un 2 à la fin du texte
         
    }                                     

   public static void Butt3ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"3"); //Ajoute un 3 à la fin du texte
         
    }                                     

   public static void Butt4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"4"); //Ajoute un 4 à la fin du texte
         
    }   
   
   public static void Butt5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"5"); //Ajoute un 5 à la fin du texte
         
    }   
   
    public static void Butt6ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"6"); //Ajoute un 6 à la fin du texte
         
    }  
       
    public static void Butt7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"7"); //Ajoute un 7 à la fin du texte
         
    }                                     

    public static void Butt8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"8"); //Ajoute un 8 à la fin du texte
         
    } 
    
    public static void Butt9ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText(Input.getText()+"9"); //Ajoute un 9 à la fin du texte
        
    }                                                                                              

    public static void ButtAddActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null) // On vérifie qu'il n'y a pas d'opération déjà en cours
        {
                ValidLabel.setVisible(true); // Si c'est le cas, on affiche l'erreur (trop d'opération)
        }
        else
        {
            try{
                partie1=Float.parseFloat(Input.getText()); // On récupère le contenu de la première partie sous forme de réel
                op="plus"; // On définit l'opération comme une addition
                Input.setText(Input.getText()+"+"); // On ajoute un + au texte
                pos=Input.getText().length(); // On récupère la position de l'opérateur
            }catch(NumberFormatException e){ // Si Float.parseFloat produit une erreur
                    ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }
           
        }
         
    }                                       

    public static void ButtSubActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null)  // On vérifie qu'il n'y a pas d'opération déjà en cours
        {
                ValidLabel.setVisible(true); // Si c'est le cas, on affiche l'erreur (trop d'opération)
        }
        else
        {
            try{
                partie1=Float.parseFloat(Input.getText()); // On récupère le contenu de la première partie sous forme de réel 
                op="minus"; // On définit l'opération comme une soustraction 
                Input.setText(Input.getText()+"-"); // On ajoute un - au texte
                pos=Input.getText().length(); // On récupère la position de l'opérateur
            }catch(NumberFormatException e){ // Si Float.parseFloat produit une erreur
                    ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }
           
        }

         
    }                                       

    public static void ButtMultActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null)  // On vérifie qu'il n'y a pas d'opération déjà en cours
        {
                ValidLabel.setVisible(true); // Si c'est le cas, on affiche l'erreur (trop d'opération)
        }
        else
        {
            try{
                partie1=Float.parseFloat(Input.getText()); // On récupère le contenu de la première partie sous forme de réel
                op="mult"; // On définit l'opération comme une multiplication
                Input.setText(Input.getText()+"*"); // On ajoute un * au texte
                pos=Input.getText().length(); // On récupère la position de l'opérateur
            }catch(NumberFormatException e){ // Si Float.parseFloat produit une erreur
                    ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }
           
        }
         
    }                                        

    public static void ButtDivActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null) // On vérifie qu'il n'y a pas d'opération déjà en cours
        {
                ValidLabel.setVisible(true); // Si c'est le cas, on affiche l'erreur (trop d'opération)
        }
        else
        {
            try{
                partie1=Float.parseFloat(Input.getText()); // On récupère le contenu de la première partie sous forme de réel
                op="div"; // On définit l'opération comme une division 
                Input.setText(Input.getText()+"/"); // On ajoute un / au texte
                pos=Input.getText().length(); // On récupère la position de l'opérateur
            }catch(NumberFormatException e){ // Si Float.parseFloat produit une erreur
                    ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)          
            }
        }
         
    }                                       

    public static void ButtModuloActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null) // On vérifie qu'il n'y a pas d'opération déjà en cours
        {
                ValidLabel.setVisible(true); // Si c'est le cas, on affiche l'erreur (trop d'opération)
        }
        else
        {
            try{
                partie1=Float.parseFloat(Input.getText()); // On récupère le contenu de la première partie sous forme de réel
                op="mod"; // On définit l'opération comme une division 
                Input.setText(Input.getText()+"%"); // On ajoute un % au texte
                pos=Input.getText().length(); // On récupère la position de l'opérateur
            }catch(NumberFormatException e){ // Si Float.parseFloat produit une erreur
                    ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }
           
        }
         
    }                                          

    public static void ButtSupprActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if(!Input.getText().equals("")) // On vérifie que le le texte n'est pas déjà vide
        {
            if (Input.getText().endsWith("-") || Input.getText().endsWith("+") || Input.getText().endsWith("*") || Input.getText().endsWith("/") || Input.getText().endsWith("%"))
            { // Si l'on supprime un opérateur
                Input.setText(Input.getText().substring(0,Input.getText().length()-1)); // On supprime l'opérateur
                op=null; // On réinitialise l'opération à faire
                pos=0; // On réinitialise la position du précédent opérateur
            }
            else
                Input.setText(Input.getText().substring(0,Input.getText().length()-1)); // On supprime le dernier chiffre
        }
    }                                        

    public static void ButtEnterActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        if (op!=null) // On vérifie qu'il y a bien une opération
        {
            if (!Input.getText().equals("")) // On vérifie que le texte n'est pas vide
            {
             try{
                partie2=Float.parseFloat(Input.getText().substring(pos,Input.getText().length()));
                // On stocke la 2ème partie du calcul sous forme de réel
                if (partie2==0 && op.equals("div")) // Si il s'agit d'une division par 0
                {
                    Div0Label.setVisible(true); // On affiche l'erreur de division par 0
                }
                else
                {
                // On calcule le résultat et on l'insère dans le texte (le texte devient le résultat)
                Input.setText(Functionalities.calculResult(partie1, partie2, op)); 
                op=null; // On réinitialise l'opération à faire
                pos=0; // On réinitialise la position de l'opérateur
                }
            }catch(NumberFormatException e){ // Si Float.parseFloat renvoi une erreur
                    ErrorNbrLabel.setVisible(false);  // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }

            }
            else
            {
               ErrorNbrLabel.setVisible(true);  // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
            }
        }
        else
        {
            ChooseOpLabel.setVisible(true); // On affiche l'erreur (Choisir une opération)
        }
    }                                         

    public static void ButtClearActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        Input.setText("0"); // On efface(clear) le texte, en ne laissant qu'un 0
        op=null; // On réinitialise l'opération à faire
        pos=0; // On réinitialise la position de l'opérateur
    }                                         

    public static void ButtNegActionPerformed(java.awt.event.ActionEvent evt) {                                        
           Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
           if (op==null) // On vérifie si l'utilisateur n'a pas saisi d'opération
           {
               if (!Input.getText().startsWith("-")) // On vérifie si l'on n'a pas déjà un nombre négatif
                {   
               Input.setText("-"+Input.getText()); // On ajote un - au début
                }
               else // Si on a déjà un nombre négatif
               {
                   Input.setText(Input.getText().substring(1)); // On enlève le - du début (nombre positif)
               }
           }
           else // Si l'utilisateur a déjà saisi une opération
           {
               if (Input.getText().length()==pos) // On vérifie si la longueur du texte correspond
                   // à la position de l'opérateur
               {
                 Input.setText(Input.getText()+"-"); // On ajoute un - après l'opérateur
               }
               else
               {
                    if((Input.getText().charAt(pos)=='-')) // On vérifie si on a déjà un nombre négatif
                    {
                        Input.setText(Input.getText().substring(0,pos)+Input.getText().substring(pos+1,Input.getText().length()));
                        // On enlève le - après l'opérateur
                    }
                    else
                    {
                        Input.setText(Input.getText().substring(0,pos)+"-"+Input.getText().substring(pos,Input.getText().length()));
                        // On ajoute un - après l'opérateur
                    }
               }
               
           }
         
    }               
    
    
    public static void ButtDotActionPerformed(java.awt.event.ActionEvent evt) {                                          
                    
        Functionalities.resetLabels(ErrorNbrLabel, ChooseOpLabel, ErrorOpLabel, ValidLabel,Div0Label,VirguleLabel);
        
        try{
                if (op!=null) // Si une opération a été choisie
                {
                    Integer.parseInt(Input.getText().substring(pos,Input.getText().length()));
                    // On vérifie que la 2ème partie peut être parsée en un entier
                    Input.setText(Input.getText()+"."); // On ajoute un point
                }  
                else // Si une opération n'a pas été choisie
                {
                    Integer.parseInt(Input.getText()); 
                    // On vérifie que la 1ère partie peut être parsée en un entier
                    Input.setText(Input.getText()+"."); // On ajoute un point
                }
            }catch(NumberFormatException e){ // Si une des parties n'est pas parsable en un entier
                try {
                    if (op!=null) // Si il n'y a pas d'opération
                    {
                      Float.parseFloat(Input.getText().substring(pos,Input.getText().length()));
                      // On vérifie que la 2ème partie peut être parsée en un réel
                      VirguleLabel.setVisible(true); // On affiche l'erreur (on a déjà une virgule)
                    }
                    else // Si il y a une opération
                    {
                     Float.parseFloat(Input.getText());
                     // On vérifie que la 1ère partie peut être parsée en un réel
                     VirguleLabel.setVisible(true); // On affiche l'erreur (on a déjà une virgule)
                    }
                            }
                catch(NumberFormatException e2){ // Si une des parties n'est pas parsable en un réel
                
                ErrorNbrLabel.setVisible(true); // On affiche l'erreur (pas assez de chiffres ou mauvais caractère)
                }
            }
    }     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
