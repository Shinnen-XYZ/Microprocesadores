/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asdfg;

/**
 *
 * @author Jefer
 */
public class MCD {
    public static void main(String[] args) {
        int n = 80844;
        int m = 25320;
        int  resultado = mcd(n,m);
        System.out.println("El mcd de: "+n+" y "+m+" es: "+ resultado);
    }
    
    public static int mcd(int n, int m){
        if(m == 0){
            return n;
        }
        int residuo = n % m;
        System.out.println(n + " mod "+ m +" = "+residuo);
        return mcd(m, residuo);
    }
}