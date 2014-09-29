/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package promedio;

/**
 *
 * @author Personal
 */
public class EVALUA {
    private int valores[] = new int[5];
    private float medio;
    
    public void LlenarValores()
    {
        int i;
        for (i=0; i <5; i++){
            System.out.println("Ingresa el valor " +(i+ 1) + ":" );
            valores[i] = Leer.datoInt();
        }
    }
    
       
    public void Mostrar()
    {
        int i;
        for (i=0; i <5; i++){
            System.out.println("Los valores son" + ":"+ valores[i]);
        }
    }
    
    public void Promediar()
    {
        float prom;
        float sum = 0;
        int i;
        
        for (i=0; i<5; i++)
        {
            sum += valores[i];
        }
           prom = sum/5;

        System.out.println("El promedio es: " + prom);
        
    
    }
 
}

