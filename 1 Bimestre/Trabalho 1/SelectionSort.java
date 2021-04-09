import java.util.Comparator;
import java.util.List;

public class SelectionSort<T> implements Sort<T> {

	@Override
	public void sort(List<T> list, Comparator<T> comparator) {
		
		for(int i = 0; i < list.size(); i++){
            int menor = i;
            for(int j = i+ 1 ; j < list.size(); j++){
                if(list.get(i) < list.get(menor)){
                    menor = j;
                }
            }
            int temp = (int) list.get(i);
            list.set(i, menor);
            list.set(menor, temp);
        }
	}

}
