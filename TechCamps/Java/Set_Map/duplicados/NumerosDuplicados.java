import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] values){
        TreeSet<Integer> result = new TreeSet<Integer>();
        HashSet<Integer> unique = new HashSet<Integer>();

        Arrays.stream(values).forEach(element -> {
            if(unique.add(element) == false)
                result.add(element);
        });

        return result;
    }
}