
public class Block {
	private int a, b, c;
	private int volume;
	
	public Block(int i, int j, int k) {
		this.a = i;
		this.b = j;
		this.c = k;
		this.volume = a * b * c;
	}
	
	//Retorna true se ob tiver o mesmo bloco.
	boolean sameBlock(Block ob) {
		if((ob.a == a) & (ob.b == b) & (ob.c == c)) return true;
		else return false;
	}
	
	//Retorna true se ob tiver o mesmo volume.
	boolean sameVolume (Block ob) {
		if(ob.volume == volume) return true;
		else return false;
	}
}


