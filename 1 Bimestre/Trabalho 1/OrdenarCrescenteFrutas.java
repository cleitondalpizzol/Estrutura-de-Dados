import java.util.Comparator;


public class OrdenarCrescenteFrutas<T> implements Comparator<Frutas>{

	public int compare(Frutas a, Frutas b) {
		if(a.getNome().compareTo(b.getNome()) < 0 ) {
			return -1;
		}	
		if(a.getNome().compareTo(b.getNome()) > 0) {
			return 1;
		}
		return 0;
	}

}
