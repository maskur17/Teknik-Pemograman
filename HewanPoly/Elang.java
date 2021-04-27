package HewanPoly;

public class Elang extends Hewan{

	public Elang(String jenis, String ciri) {
		super(jenis, ciri);
	}
	
	public void Suara(){
		System.out.println("Hewan Bersuara : Ngeakkkk");
	}
	
	public void Berjalan(){
		System.out.print("Hewan Berjalan : Terbang");
	}
	
	public void Bernafas(){
		System.out.println("Hewan Bernafas : paru Paru");
	}
	
	public void getInfo(){
		System.out.println("Jenis : " + super.getJenis());
		System.out.println("Ciri : " + super.getCiri());
		this.Suara();
		this.Berjalan();
		this.Bernafas();
	}
}