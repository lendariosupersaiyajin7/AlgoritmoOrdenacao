import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "conjuntos/decrescente/decrescente_100.csv"; 
        int index = 0;

        List<String[]> dados = BubbleSort.lerCsv(path);

        BubbleSort bs = new BubbleSort(path, index);
        bs.rodar();
        InsertionSort is = new InsertionSort(path, index);
        is.rodar();
        

    }
}
