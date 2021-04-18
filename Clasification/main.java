package Clasification;

public class main {
	public static void main(String[] args){
		Api api = new Api();
		Gelombang gelombang = new Gelombang();
		Angin angin = new Angin();
		Tornado tornado = new Tornado();
		
		api.user();
		api.PowerValir();
		
		gelombang.user();
		gelombang.PowerValir();
		
		angin.user();
		angin.PowerVale();
		
		tornado.user();
		tornado.PowerVale();
		
	}
}
