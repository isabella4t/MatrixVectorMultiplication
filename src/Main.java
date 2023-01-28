import java.lang.Math;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        firsttest();

        testnum(10,100);//100
        testnum(10,10); // 10
        testnum(10,1); // 1
        testnum(100,1000); //0.1
        testnum(100,100); //0.01
        testnum(1000,1000); //0.001
        testnum(1000,100); // 0.0001
        testnum(1000,10); // 0.00001 e-5
        testnum(10000,10000); // 0.000001 e-6
       // testnum(10000,1000); // 0.0000001 e-7
       // testnum(10000,100); // 0.00000001 e-8
        //testnum(1000,100); //1
        //testnum(10000,100);//




    }

    public static void firsttest(){
        int[][] grew = {{1,2,3},{0,0,0},{3,3,3}};
        int[][] grow = {{1,0},{1,0},{1,0}};
        /*
        6 0
        0 0
        9 0

         */

        multiply(grew,grow);
        System.out.println(tostring(multiply(grew,grow)));
    }

    public static void testnum(int var, int chan){
        int[][] testX = new int[var][var];
        int[][] testY = new int[var][var];
        testX = fill(testX,chan);
        testY = fill(testY,chan);


        Long startIn=System.currentTimeMillis();
        multiply(testX,testY);
        Long endIn=System.currentTimeMillis();
        double time =(endIn-startIn)/1000.0;
        System.out.println("\n time: " + time);
        //System.out.println(tostring(multiply(testX,testY)));

    }

    public static int[][] multiply(int[][] fir, int[][] sec){
        int[][] newarr = new int[fir.length][sec[0].length];
        int acc = 0;

        for(int i = 0; i< fir.length;i++){
            for(int j = 0; j<sec[0].length; j++){
                for(int l = 0; l<fir[0].length; l++){
                    newarr[i][j] += fir[i][l]*sec[l][j];
                }
            }
        }

/*
        for(int r =0 ; r<tu[0].length;r++){
            for(int i = 0; i<mu[0].length;i++){
                for(int l= 0;l<tu.length;l++){
                    newarr[i][r] += mu[i][l] * tu[l][i];
                }
            }
        }

 */
        return newarr;
    }

    public static String tostring(int[][] de){
        String acc = "";
        for(int i =0; i<de.length;i++){
            for(int j = 0; j<de[0].length;j++){
                acc += de[i][j] + " ";
            }
            acc += "\n";
        }
        return acc;
    }

    public static int[][] fill(int[][] gee, int max){
        int acc = 0;
        for(int i = 0; i<gee.length;i++){
            for(int j = 0; j<gee.length; j++){
                if(acc<max){
                    acc++;
                    gee[i][j] = 1;
                }
                else gee[i][j] = 0;
            }
        }
        return gee;

    }


}

