/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author kjbs1
 */
public class Potencia_Recursiva {

    int multi=1, i=0, res;
    
    public int Potencia(int num, int pot){
        if(pot!=0){
          multi = multi*num;
          i++;
          return Potencia(num, pot-1);
        }else{
         res= multi;
        }
        return num;
    }
   
}
