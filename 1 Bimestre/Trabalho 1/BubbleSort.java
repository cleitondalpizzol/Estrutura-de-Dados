import java.util.Comparator;
import java.util.List;

public class BubbleSort<T> implements Sort<T>{
	Frutas lista =  new Frutas();
	@Override
	public void sort(List<T> list, Comparator<T> comparator) {
			OrdenarCrescenteFrutas<Frutas> comparador = new OrdenarCrescenteFrutas<Frutas>();
			for(int i = list.size(); i >= 0; i--) {
				Frutas a = (Frutas) list.get(i);
		   		for(int j = 0; j < i; j++) {	
		   			Frutas b = (Frutas) list.get(j+1);
					int resultado = comparador.compare(a,b);
		   			if(resultado == 1) {
		   				Frutas temp = (Frutas) list.get(j+1);
		   				list.set(j+1, list.get(j));
		   				list.set(j, (T) temp);
		   				}
		   			}
		   		}
			
			for(int i = list.size(); i >= 0; i++) {
				lista.toString();
			}
		}
	}




