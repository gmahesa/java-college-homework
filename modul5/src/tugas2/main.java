package tugas2;

public class main {

	public static void main(String[] args) {
		KotakBalok kb = new KotakBalok();
		persegiKubus pk = new persegiKubus();
		lingkaranBola l = new lingkaranBola();
		
		kb.keliling();
		kb.luas();
		kb.volume();
		pk.keliling();
		pk.luas();
		pk.volume();
		l.luas();
		l.volume(4);

	}

}
