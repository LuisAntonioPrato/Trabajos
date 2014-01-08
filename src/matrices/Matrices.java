/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package matrices;
/**
 *
 * @author AULAC
 */
import java.util.Scanner;
public class Matrices {

    /**
     * @param args the command line arguments
     */
    final static int TAMANYO=3;
    public static void main(String[] args) {
   int [][] matriz=new int [TAMANYO][TAMANYO];
      rellenarMatriz(matriz);
        System.out.println("");
      mostrarMatriz(matriz);
      mostrarDiagonal(matriz);
      mostrarDiagonalSec(matriz);
      
    }
    public static void rellenarMatriz(int[][]m){
        Scanner sc=new Scanner(System.in);
        //recorremos filas
        for(int i=0;i<m.length;i++){
        //recorremos por columnas
            for(int j=0;j<m[i].length;j++){
                System.out.println("Dame ARGO");  
            m[i][j]=sc.nextInt();
            }
        }
    }
public static void mostrarMatriz(int [][] m){
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            System.out.print(m[i][j]+" ");
        }
    System.out.println("");    
    }
    
}
public static void mostrarDiagonal(int[][] m){
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
        if(i==j){
            System.out.print(m[i][j]+" ");
        }
    }
    System.out.println("");}
    
}
public static void mostrarDiagonalSec(int[][] m){
    for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            int valor=i+j;
            if(valor==m.length-1){
                System.out.print(m[i][j]+" ");
            }
        }
        System.out.println("");
    }
}
}
