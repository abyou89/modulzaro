
package modulzaro;

import java.util.Scanner;

public class logikaiFeladat {

    static Scanner sc = new Scanner(System.in);
    static String[] palya = {"X","X","X"," ","O","O","O"};
    static int[] sorszam = {0,1,2,3,4,5,6}; 
    static String SEP = System.lineSeparator();
    
    public static void main(String[] args) {
        feladat();
    }

    private static void feladat() {
        sorszamMegjelenit();
        palyaMegjelenit();
        int bekeres[] = bekeres();
        elemekCsereje(bekeres);
    }
    private static void sorszamMegjelenit() {
        for (int i = 0; i < sorszam.length; i++) {
            System.out.printf("%d ",sorszam[i]);
        }
        System.out.print(SEP);
    } 
    private static void palyaMegjelenit() {
        for (int i = 0; i < palya.length; i++) {
            System.out.printf("%s ",palya[i]);
        }
        System.out.print(SEP);
    }
    private static int[] bekeres() {
        int bekeres[] = new int[2];
        konzolraKiir("Adja meg, melyik elemet szeretne athelyezeni (0-6): ");
        bekeres[0] = sc.nextInt();
        konzolraKiir("Adja meg, hova szeretne athelyezni (0-6): ");
        bekeres[1] = sc.nextInt();
        
        return bekeres;
    }
    private static void elemekCsereje(int[] bekeres) {
        palya[bekeres[1]] = palya[bekeres[0]];
        palya[bekeres[0]] = " ";
        sorszamMegjelenit();
        palyaMegjelenit();
    }
    
    private static void konzolraKiir(String kimenet) {
        System.out.print(kimenet);
    }
    
}
