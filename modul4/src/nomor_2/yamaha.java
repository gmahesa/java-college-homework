package nomor_2;

	public class yamaha extends motor {
	String brand="yamaha";
	public yamaha(String tipe) {
		super(tipe);
		super.printData();{
			System.out.println("brand : "+brand);
		
		}
	}
}



/*
public class yamaha extends motor {
	String brand;
	int kecepatan;
	public yamaha (String tipekendaraan) {
		super(tipekendaraan);
	}
	public void brand() {
	}
	public void kecepatan(int speed) {
	}
}
*/