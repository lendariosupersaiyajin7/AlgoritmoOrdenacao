import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "conjuntos/aleatorio/aleatorio_100.csv"; 
        int index = 0;

        List<String[]> dados = bS.lerCsv(path);

        //BubbleSort sort1 = new BubbleSort(path, index);
        //sort1.rodar();

        InsertionSort sort2 = new InsertionSort(path, index);
        sort2.rodar();
       
        //QuickSort sort3 = new QuickSort(path, index);
        //sort3.rodar();
    }
}
