package esempi;

public interface Prova {
	
	void somma();
	
	default int sottrazione() {
		return 0;
	}
	
	

}
