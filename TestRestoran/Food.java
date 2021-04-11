package TestRestoran;

public class Food {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;

	
	public Food() {}
	
	//mutator (setter)
	public void setNama(String nama){
		this.nama_makanan = nama;
	}
	
	public void setHarga(double harga) {
		this.harga_makanan = harga;
	}
	
	public void setStok(int stok) {
		this.stok = stok;
	}
	
	//accessor (getter)
	public String getNama() {
		return nama_makanan;
	}
	
	public double getHarga() {
		return harga_makanan;
	}
	
	public int getStok() {
		return stok;
	}
}
