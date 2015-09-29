/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorrerarreglo;

/**
 *
 * @author Belén
 */
public class RecorrerArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String [][]matriz = new String[2][7];
        int aux = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                aux = (int)(Math.random()* 3);
                String dato=""+aux;
                
                if(dato.equals("2")){
                    matriz[i][j]="N";
                } else{
                    matriz[i][j]=dato;
                }
            
        }

    }
        
        String datosmatriz = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              datosmatriz += matriz[i][j]+"  ";
            }
            datosmatriz += "\n";
        }
        
        System.out.println(datosmatriz);
    
}
    
    
}
