package HewanPoly;

public class Paus extends Hewan{

	public Paus(String jenis, String ciri) {
		super(jenis, ciri);
	}
	
	public void Suara(){
		System.out.println("Hewan Bersuara : Ngeeeee");
	}
	
	public void Berjalan(){
		System.out.print("Hewan Berjalan : Berenang");
	}
	
	public void Bernafas(){
		System.out.println("Hewan Bernafas : Paru Paru");
	}
	
	public void getInfo(){
		System.out.println("Jenis : " + super.getJenis());
		System.out.println("Ciri : " + super.getCiri());
		this.Suara();
		this.Berjalan();
		this.Bernafas();
	}
}