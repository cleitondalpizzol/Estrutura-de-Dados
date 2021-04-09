import java.util.Comparator;
import java.util.List;

public class InsertSort<T> implements Sort<T>{
		Frutas lista = new Frutas();

		public void sort(List<T> list, Comparator<T> comparator) {
				OrdenarCrescenteFrutas comparador = new OrdenarCrescenteFrutas();
				for(int i = 1; i< list.size(); i++) {
					int selecionado =  (int) list.get(i);
					int j = i - 1;
					while(j >=0 && selecionado < (int) list.get(j)) {
						list.set(j+1, list.get(j));
						j = j -1;
					}
					list.set(j+1, selecionado);
			   		}
		
				for(int i = list.size(); i >= 0; i++) {
					lista.toString();
				}
		}
}
