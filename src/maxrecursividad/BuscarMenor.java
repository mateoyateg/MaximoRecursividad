/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxrecursividad;

/**
 *
 * @author mateo
 */
public class BuscarMenor {
    int menor;
    
    public void buscarMenor(int[] a, int n){
        
        if (a[n] < a[a.length-1]){
            menor = n;
        }
        
        else{
            
            buscarMenor (a, n-1);
        }
    }
    
}
