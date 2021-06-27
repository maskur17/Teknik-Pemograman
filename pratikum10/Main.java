import java.util.*;
import java.util.Scanner;

/**
 * @author
 * @version
 */

public class Main {
    public static void main (String[] args){
        //Update game
        boolean exit = false;
        //make game "Tebak Kotak Bernilai"
        System.out.println("Program Tebak Kotak bernilai");
        //bound -> Isi kotak
        Bound<A> kotakA = new Bound<A>(new A());
        Bound<B> kotakB = new Bound<B>(new B());
        Bound<C> kotakC = new Bound<C>(new C());
        //GenericType -> nama getter
        GenericType<HashMap<String, Integer>> pemain = new GenericType<HashMap<String, Integer>>();
        Integer s[] = new Integer[3];
        //masukan pemain
        HashMap<String, Integer> in = new HashMap<String, Integer>();
        in.put("Dimas Kurniawan", 0); in.put("Maskur", 0); in.put("Dimaskn", 0);
        pemain.set(in);
        //masukan untuk user
        Scanner input = new Scanner(System.in);
        //Generic Method -> untuk perbandingan
        GenericMethods method = new GenericMethods();
        //wilcard -> Pemain
        WildCardSimpleExample printPemain = new WildCardSimpleExample();
        //Mulai Game
        int x;
        char c;
        Character[] n = new Character[3];
        n[0] = 'A'; n[1] = 'B'; n[2] ='C';
        Character k = new Character('a');
        while (!exit){
            // still working 
            for (String name : pemain.get().keySet()){
                System.out.println("Giliran : " +name);
                k = method.getRandom(n);
                System.out.println("Tebak Isi Nilai Kotak"+ k + "?");
                x = input.nextInt();
                switch (k){
                    case 'A':
                        if (kotakA.getAnswer() ==  x){
                        System.out.println(name + " benar skor +1");
                        pemain.get().replace(name, pemain.get().get  (name), pemain.get().get(name) + 1);
                    } else {
                        System.out.println("Salah! jawabannya adalah " + kotakA.getAnswer());
                    }
                    break;
                    case 'B':
                    if (kotakB.getAnswer() ==  x){ 
                        System.out.println(name + " Berhasil skor +1");
                        pemain.get().replace(name, pemain.get().get(name), pemain.get().get(name) + 1);
                    } else {
                        System.out.println("Salah! jawabannya adalahh " + kotakB.getAnswer());
                    }
                    break;
                    case 'C':
                    if (kotakC.getAnswer() ==  x){
                        System.out.println(name + " Berhasil skor +1");
                        pemain.get().replace(name, pemain.get().get  (name), pemain.get().get(name) + 1); 
                    } else {
                        System.out.println("Salah! jawabannya adalah " + kotakC.getAnswer());
                    }                        
                    break;                
                }
            }
            //check end game
            System.out.println("Selesai (Y/T) ?");
            c = input.next().charAt(0);
            if(c == 'Y'){
                pemain.get().values().toArray(s);
                Myclass<Integer> pemenang = new Myclass<Integer>(s); 
                exit = true;
                System.out.println("Perolehan skor final :"); 
                printPemain.printMap(pemain.get());
                System.out.println("Pemenangnya Adalah : " + method.getKeyFromValue(pemain.get(), pemenang.max()));
            } else {
                System.out.println("Perolehan skor sementara :");                   
                printPemain.printMap(pemain.get());

            }
        }
    }
}