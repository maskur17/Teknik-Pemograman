package HewanPoly;
import java.util.Scanner;

public class TestHewan {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Pilih;
		
		System.out.println("-----------------");
		System.out.println("----Menu Hwan----");
		System.out.println("-----------------");
		System.out.println("1. Singa ");
		System.out.println("2. Elang ");
		System.out.println("3. Lebah ");
		System.out.println("4. Puas ");
		System.out.println("5. keluar ");
		do{
			System.out.println("Pilihan Menu :");
			Pilih = sc.nextInt();
			switch (Pilih){
			case 1:
				Hewan  h1 = new Singa("Singa", "Pemakan Daging");
				h1.getInfo();
				break;
			case 2:
				Hewan h2 = new Elang("Elang","Berburu Dengan Cepat");
				h2.getInfo();
				break;
			case 3:
				Hewan h3 = new Lebah("Lebah","Mengambil madu di Sari bunga");
				h3.getInfo();
				break;
			case 4:
				Hewan h4 = new Paus("Paus","Pemakan Planton");
				h4.getInfo();
				break;
			case 5:
				break;

			}
		}while (Pilih !=5);
		sc.close();
	}
}	