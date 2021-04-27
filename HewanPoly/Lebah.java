package HewanPoly;

public class Lebah extends Hewan{

	public Lebah(String jenis, String ciri) {
		super(jenis, ciri);
	}
	
	public void Suara(){
		System.out.println("Hewan Bersuara : Breeettttt");
	}
	
	public void Berjalan(){
		System.out.print("Hewan Berjalan : Terbang");
	}
	
	public void Bernafas(){
		System.out.println("Hewan Bernafas : Trakea");
	}
	
	public void getInfo(){
		System.out.println("Jenis : " + super.getJenis());
		System.out.println("Ciri : " + super.getCiri());
		this.Suara();
		this.Berjalan();
		this.Bernafas();
	}
}