package HewanPoly;

public class Hewan {
	private String jenis, ciri;
	
	public Hewan(String jenis, String ciri){
		this.jenis = jenis;
		this.ciri = ciri;
	}
	
	public String getJenis(){
		return jenis;
	}
	
	public void setJenis(String jenis){
		this.jenis = jenis;
	}
	
	public String getCiri(){
		return ciri;
	}
	
	public void setCiri(String ciri){
		this.ciri = ciri;
	}
	
	public void Suara(){
		System.out.println("Hewan Bersuara :");
	}
	
	public void Berjalan(){
		System.out.println("Hewan berjalan :");
	}
	
	public void Bernafas(){
		System.out.println("Hewan Bernafas :");
	}
	
	public void getInfo(){
		this.Suara();
		this.Berjalan();
		this.Bernafas();
	}
}
