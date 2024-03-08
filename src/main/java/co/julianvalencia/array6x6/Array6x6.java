/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.julianvalencia.array6x6;
import java.util.*;
import java.math.*;


/**
 *
 * @author usuario1
 */
public class Array6x6 {

    public static void main(String[] args) {
        
        List<List<Integer>> insumo = new ArrayList<>();

        insumo.get(0).add(0,-9);
        insumo.get(0).add(1,-9);
        insumo.get(0).add(2,-9);
        insumo.get(0).add(3, 1);
        insumo.get(0).add(4, 1);
        insumo.get(0).add(5, 1);

        insumo.get(1).add(0, 0);
        insumo.get(1).add(1,-9);
        insumo.get(1).add(2, 0);
        insumo.get(1).add(3, 4);
        insumo.get(1).add(4, 3);
        insumo.get(1).add(5, 2);

        insumo.get(2).add(0,-9);
        insumo.get(2).add(1,-9);
        insumo.get(2).add(2,-9);
        insumo.get(2).add(3, 1);
        insumo.get(2).add(4, 2);
        insumo.get(2).add(5, 3);

        insumo.get(3).add(0, 0);
        insumo.get(3).add(1, 0);
        insumo.get(3).add(2, 8);
        insumo.get(3).add(3, 6);
        insumo.get(3).add(4, 6);
        insumo.get(3).add(5, 0);

        insumo.get(4).add(0, 0);
        insumo.get(4).add(1, 0);
        insumo.get(4).add(2, 0);
        insumo.get(4).add(3,-2);
        insumo.get(4).add(4, 0);
        insumo.get(4).add(5, 0);

        insumo.get(5).add(0, 0);
        insumo.get(5).add(1, 0);
        insumo.get(5).add(2, 1);
        insumo.get(5).add(3, 2);
        insumo.get(5).add(4, 4);
        insumo.get(5).add(5, 0);

        int value = hourglassSum(insumo);
        
        System.out.println(value);
    }
    
    public static int hourglassSum( List<List<Integer>> arr ){
        List<Integer> result = new ArrayList<>();
        Integer sum = 0;
        int[][] coord   = {{0,0},{0,1},{0,2},{1,1},{2,0},{2,1},{2,2}};
        /*int[][] matrix  = {
                            {-9,-9,-9, 1, 1, 1}, 
                            { 0,-9, 0, 4, 3, 2}, 
                            {-9,-9,-9, 1, 2, 3}, 
                            { 0, 0, 8, 6, 6, 0}, 
                            { 0, 0, 0,-2, 0, 0}, 
                            { 0, 0, 1, 2, 4, 0}, 
                        };*/
        for (int i=0 ; i<4 ;i++ ) {
            for (int j=0 ; j<4 ; j++) {
                for (int m=0 ; m<7 ; m++){
                    //System.out.print( (coord[m][0]+i) + "," +(coord[m][1]+j) +" : " );
                    //sum += matrix[(coord[m][0]+i)][(coord[m][1]+j)];
                    sum += arr.get(coord[m][0]+i).get(coord[m][1]+j);
                    
                }
                result.add(sum);
                sum = 0;
                //System.out.println("---");
            }
            //System.out.println("-------------------------------------------------");
        }
        Collections.sort(result);
        //System.out.println( result.get(result.size()-1) );
        
        return result.get(result.size()-1);
    }
}