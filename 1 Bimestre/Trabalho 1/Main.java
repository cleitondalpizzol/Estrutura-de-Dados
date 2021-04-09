import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Sort<Frutas> BublleSort = new BubbleSort<>();
		Sort<Frutas> SelectionSort = new SelectionSort<>();
		Sort<Frutas> InsertSort = new InsertSort<>();
		
		List<Frutas> list = new ArrayList<>();
		list.add(new Frutas("Laranja",0.200));
		list.add(new Frutas("Limão",0.300));
		list.add(new Frutas("Banana",0.500));
		list.add(new Frutas("Tangirina",0.100));
		list.add(new Frutas("Maçã",0.800));
		list.add(new Frutas("Pera",0.600));
		list.add(new Frutas("Pessego",0.400));
		
		BublleSort.sort(list, new OrdenarCrescenteFrutas<Frutas>());
		InsertSort.sort(list, new OrdenarCrescenteFrutas<Frutas>());
		SelectionSort.sort(list,  new OrdenarCrescenteFrutas<Frutas>());
		
	}

}
