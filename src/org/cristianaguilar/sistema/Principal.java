/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cristianaguilar.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sumar suma = new Sumar (0,0);
        Resta resta = new Resta(0,0);
        Multiplicar multiplicacion = new Multiplicar (0,0);
        Dividir division = new Dividir (0,0);
        int opcion =0;
        int cont =0;
      // JOptionPane.showInputDialog(" opcion ");
      while (cont==0)   { 
      opcion=Integer.parseInt(JOptionPane.showInputDialog("  Elija la opcion que desee para operar"));
   
                  
                          
            switch (opcion){
            case 1:
            
                suma.valor1 = Integer.parseInt(JOptionPane.showInputDialog("    S U M A \n Ingrese el primer valor a operar"));
                suma.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor a operar"));
                     JOptionPane.showMessageDialog(null,"Total de la Sumatoria : "+suma.sumatoria(suma.valor1,suma.valor2));
                break;
            case 2:
            
                resta.valor1 = Integer.parseInt(JOptionPane.showInputDialog(" R E S T A  \nIngrese el primer valor a restar : "));
                    resta.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor a restar : "));
                        JOptionPane.showMessageDialog(null,"Total de la Resta :"+resta.rastar(resta.valor1,resta.valor2));
                break;
            case 3:
            
                multiplicacion.valor1 = Integer.parseInt(JOptionPane.showInputDialog(" M U L T I P L I C A C I O N \n Ingrese el Primer valor a Multiplicar : "));
                    multiplicacion.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor a Multiplicar : "));
                        JOptionPane.showMessageDialog(null,"Total de La Multiplicacion : "+multiplicacion.Multiplicar(multiplicacion.valor1,multiplicacion.valor2));
                break;
            case 4:
                
                            division.valor1 = Integer.parseInt(JOptionPane.showInputDialog(" D I V I S I O N \n Ingrese el Primer valor a dividir : "));
                            division.valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor a dividir : "));
                     if (division.valor2==0){
                      JOptionPane.showMessageDialog(null,"ERROR ");
                break;
                     }else
                         JOptionPane.showMessageDialog(null,"Total de la Division : "+division.Dividir(division.valor1,division.valor2));
                break;
           
            case 5:
                cont++;
             

                break;
                
            default :  
                JOptionPane.showMessageDialog(null,"ERROR Opcion no valida ");
            
       }
    }
     }
    }
  
