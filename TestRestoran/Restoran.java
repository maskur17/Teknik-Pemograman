package TestRestoran;

public class Restoran {
	private Food[] item; //variable declaration
	private static byte id=0; //create index
	
	public Restoran () { //create object
		item = new Food[10]; //create array to contain the food,food stocks, and food prices list
		for (int i=0; i<item.length; i++)
				item[i] = new Food();
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) { //procedure to input a new food to the list(menu)
		item[id].setNama(nama);
		item[id].setHarga(harga);
		item[id].setStok(stok);
	}
	
	public void tampilMenuMakanan(){ //procedure to show the list(menu)
		for(int i =0; i< item.length;i++){
			if(!isOutOfStock(i,1))
				System.out.println((i+1) +"." +item[i].getNama() +"["+item[i].getStok()+"]"+"\tRp. "+item[i].getHarga());
		}
	}
	
	public boolean isOutOfStock(int id, int qty){ //to check if the food we have the stock regarding the demand from the customer
		if(item[id].getStok() < qty){
			return true;
		}
		else{
			return false;
		}
	}
	public static void nextId(){ //to get to the next index
		id++;
	}

	public double getHarga(int idx) { //accessor
		return item[idx].getHarga();
	}
	
	public int getStok(int qty) { //accessor
		return item[qty].getStok();
	}
	
	public void reduceStock(int id, int qty) { //reduce the food stock if customer buy the food
		if (isOutOfStock(id, qty) == false){
			item[id].setStok(item[id].getStok() - qty); 
		}
	}
}
