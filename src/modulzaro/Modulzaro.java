
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
        adatszerkezetTomb();
    
    }

    private static void programozoiTetelek() {
        
        tombFeltoltEsKiir();
        programozoiTetelekBemutatasa();
    }

    private static void tombFeltoltEsKiir() {
        konzolraKiir("A tomb elemei:" + SEP);
        velSzam(-5,20);
        feltolt(10);
        sorozat = feltolt(10);
        tombKiir(4);
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
           System.out.print(SEP);
       }
      
    private static void programozoiTetelekBemutatasa() {
        osszegzesBemutatasa();
        megszamlalalsBemutatasa();
        minKivalasztasBemutatasa();
        maxKivalasztasBemutatasa();
        kivalasztasBemutatasa();
        eldontesEgyBemutatasa();
        eldontesMindBemutatasa();
        linKerBemutatasa();
    }

    private static void osszegzesBemutatasa() {
        konzolraKiir("1. Osszegzes tetele: " + SEP);
        konzolraKiir("  a sorozat osszege: ");
        int osszeg = osszegzes();
        konzolraKiir(osszeg + SEP);
    }

    private static void megszamlalalsBemutatasa() {
        konzolraKiir("2. Megszamlalas tetele: " + SEP);
        konzolraKiir("  a parosak szama: " + megszamlalas() + SEP);
    }

    private static void minKivalasztasBemutatasa() {
        int index = minHely();
        int ertek = sorozat[index];
        String s = "3. Minimum kivalasztas tetele: \n  a legkisebb elem helye: %d, erteke: %d".formatted(index, ertek);
        konzolraKiir(s + SEP);
    }

    private static void maxKivalasztasBemutatasa() {
        int index = maxHely();
        int ertek = sorozat[index];
        String s = "4. Maximum kivalasztas tetele: \n  a legnagyobb elem helye: %d, erteke: %d".formatted(index, ertek);
        konzolraKiir(s + SEP);
    }

    private static void kivalasztasBemutatasa() {
        konzolraKiir("5. Kivalasztas tetele: " + SEP);
        konzolraKiir("  Az elso elem, ami nagyobb mint 10: ");
        konzolraKiir(sorozat[kivalasztas()] + SEP);
    }
    
    private static void eldontesEgyBemutatasa() {
        konzolraKiir("6. Eldontes-egy tetele: " + SEP);
        String valasz = eldontesEgy() ? "van" : "nincs";
        konzolraKiir("  Van legalabb 1 paratlan: " + valasz + SEP);
    }
    
    private static void eldontesMindBemutatasa() {
        konzolraKiir("7. Eldontes-mind tetele: " + SEP);
        String valasz = eldontesMind() ? "igen" : "nem";
        konzolraKiir("  Minden elem nagyobb mint 10: " + valasz + SEP);
    }
    
    private static void linKerBemutatasa() {
        konzolraKiir("8. Linearis kereses tetele: " + SEP);
        konzolraKiir("  A keresett elem paratlan es nagyobb mint 10" + SEP);
        int i = linKereses();
        if(i != -1){
            konzolraKiir("  Van ilyen elem, a %d%s".formatted(sorozat[i], SEP + SEP));
        }else{
            konzolraKiir("  Nincs ilyen elem!" + SEP + SEP);
        }
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
    private static int minHely(){
        int m = 0;
        for (int i = 1; i < sorozat.length; i++) {
            if(sorozat[i] < sorozat[m]){
                m = i;
            }
        }
        return m;
    }
    
    private static int maxHely(){
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
        while( !(sorozat[i] >= 10)){
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
    
    private static void adatszerkezetTomb() {
        int[][] matrix = tombFeltolt();
        matrixFoatloVelSzam(matrix);
        int[][] matrixInvert = invertMatrixFeltolt(matrix);
        invertMatrixKiir(matrix);
    }

    private static int[][] tombFeltolt() {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][i] = (int)(Math.random() * 9) + 1;
            }
        }
        return matrix;
    }

    private static void matrixFoatloVelSzam(int[][] tomb) {
        konzolraKiir("Tobbdimenzios tomb elemei, foatloban veletlen szamok: " + SEP);
        for (int i = 0; i < tomb.length; i++) {
            for (int j = 0; j < tomb[i].length; j++) {
                System.out.printf("%2d",tomb[i][j]);
            }
            System.out.print(SEP);
        }
    }

    private static int[][] invertMatrixFeltolt(int[][] matrix) {
        konzolraKiir("Invertalt tomb: " + SEP);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 9) + 1;
            }
            matrix[i][i] = 0;
        }
        return matrix;
    }

    private static void invertMatrixKiir(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%2d",matrix[i][j]);
            }
            System.out.print(SEP);
        }
    
    }
    private static void konzolraKiir(String kimenet) {
        System.out.print(kimenet);
    }
    
}
