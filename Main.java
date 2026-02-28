

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pg, pe, pp, s;
        pg = 3;
        pe = 1;
        pp = 0;
        String xx;
        
        System.out.println("Ingrese el nombre del equipo: ");
       
        xx = sc.nextLine();
        
        System.out.println("Ingrese el numero de patidos ganados: ");
        pg=sc.nextInt();
        pg = pg * 3;
         
        System.out.println("Ingrese el numero de patidos empatados: ");
        pe=sc.nextInt();
        pe = pe *1;
        
        System.out.println("Ingrese el numero de patidos perdidos: ");
        pp=sc.nextInt();
        pp = pp * 0;
        
        s = pg + pe + pp;
        System.out.println(xx+s);
        
    }
}
