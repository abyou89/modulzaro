
//Abdalla Younes modulzárója

package modulzaro;


public class Modulzaro {
    
    static int[] sorozat; 
    static String SEP = System.lineSeparator();

    public static void main(String[] args) {
        
        feladatok();
    }

    private static void feladatok() {
        
        programozoiTetelek();
    
    }

    private static void programozoiTetelek() {
        
        velSzam(-5,20);
        feltolt(10);
        sorozat = feltolt(10);
        tombKiir(4);
        programozoiTetelekBemutatasa();
    }
    
     private static int velSzam(int also,int felso) {
         int velSzam;
         velSzam = (int)(Math.random() * (felso - also + 1) + also );
         return velSzam;
     }
     
      private static int[] feltolt(int db) {
       int[] tomb = new int[db];
          for (int i = 0; i < tomb.length; i++) {
              tomb[i] = velSzam(-5,20);
          }
          return tomb;
      }
       private static void tombKiir(int oszlop) {
           for (int i = 0; i < sorozat.length; i++) {
               if(i % oszlop == 0 && !(i == 0)){
                   System.out.print(SEP);
               }
               System.out.printf("%4d",sorozat[i]);
           }
           System.out.println(SEP);
       }
      
    private static void programozoiTetelekBemutatasa() {
        osszegzesBemutatasa();
        megszamlalalsBemutatasa();
        minKivalasztasBemutatasa();
        maxKivalasztasBemutatasa();
        kivalasztasBemutatasa();
        eldontesekBemutatasa();
        linKerBemutatasa();
    }

    private static void osszegzesBemutatasa() {
        
    }

    private static void megszamlalalsBemutatasa() {
        
    }

    private static void minKivalasztasBemutatasa() {
        
    }

    private static void maxKivalasztasBemutatasa() {
        
    }

    private static void kivalasztasBemutatasa() {
        
    }
    
    private static void eldontesekBemutatasa() {
        
    }
    private static void linKerBemutatasa() {
       
    }
     private static int osszegzes(){
        int osszeg = 0;
        for (int szam : sorozat) {
            osszeg += szam;
        }
        return osszeg;
    }
    
    private static int megszamlalas(){
        int db = 0;
        for (int szam : sorozat) {
            if(szam > 0 && szam % 2 == 0){
                db++;
            }
        }
        return db;
    }
    private static int minKivalasztas(){
        int m = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[m]){
                m = i;
            }
        }
        return m;
    }
    
    private static int maxKivalasztas(){
        int m = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] > sorozat[m]){
                m = i;
            }
        }
        return m;
    }
    
    /* csak addig, amíg nincs meg az eredmény: */
    private static int kivalasztas(){
        int i = 0;
        while( !(sorozat[i] >= -5)){
            i++;
        }
        return i;
    }
    
    private static boolean eldontesEgy(){
        int i = 0;
        int N = sorozat.length;
        while(i < N && !(sorozat[i] % 2 == 1)){
            i++;
        }
        return i < N;
    }
    
    private static boolean eldontesMind(){
        int i = 0;
        int N = sorozat.length;
        while(i < N && sorozat[i] > 10 ){
            i++;
        }
        return i >= N;
    }
    
    private static int linKereses(){
        int i = 0;
        int N = sorozat.length;
        while(i < N && !(sorozat[i] % 2 == 1 && sorozat[i] > 10)){
            i++;
        }
        if(i < N){
            return i;
        }else{
            return -1;
        }
    }

    private static void konzolraKiir(String kimenet) {
        System.out.print(kimenet);
    }
    
}
