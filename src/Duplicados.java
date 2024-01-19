import java.util.ArrayList;
import java.util.List;

public class Duplicados {
    public static void main(String[] args) {
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        List<String> repetidos = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    String temp = array1[i];
                    repetidos.add(array1[i]);
                }
            }
        }
        for (String elemento : repetidos) {
            System.out.println(elemento);
        }
        
    }
}
