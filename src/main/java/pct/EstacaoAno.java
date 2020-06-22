/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;


/**
 *
 * @author cauadelgado
 */
public class EstacaoAno {
    public static void main(String[] args) {
       
//        declaraçao de variaveis 
        int dia, mes;
       
//        entrada
        Scanner entrada = new Scanner (System.in);
        
//        apresentação
        System.out.println("\n\t\t\t ---Descubra a Estação do Ano--- \n");
        
//        Entradas
        System.out.print("\n Informe o dia: \n");
        dia = entrada.nextInt();
        
        System.out.print("\n Informe o mês: \n");
        mes = entrada.nextInt();
        
       if ( dia > 31){
            System.out.println("\n\t --Data inválida-- \n");
       }
        
       else if ( (dia >= 20 && mes == 3) || (mes == 4) || (mes == 5) || (dia < 21 && mes == 6) ){
            System.out.println("\n\t --Outono-- \n");
        }
        
        else if ( (dia >= 21 && mes == 6 ) || (mes == 7) || (mes == 8) || (dia < 23 && mes == 9) ){
            System.out.println("\n\t --Inverno-- \n");
        }
        
        else if ( (dia >= 23 && mes == 9) || (mes == 10) || (mes == 11) || (dia < 22 && mes == 12) ){
            System.out.println("\n\t --Primavera-- \n");
        }
        
        else if ( (dia >= 22 && mes == 12) || (mes == 1) || (mes == 2) || (dia < 20 && mes == 3) ){
            System.out.println("\n\t --Verão-- \n");
        }
        
        else {
            System.out.println("\n\t --Data inválida-- \n");
        }
        
    }
}
