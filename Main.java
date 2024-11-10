import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "conjuntos/decrescente/decrescente_10000.csv";
        String path2 = "conjuntos/decrescente/decrescente_1000.csv";
        String path3 = "conjuntos/decrescente/decrescente_100.csv";
        String path4 = "conjuntos/crescente/crescente_10000.csv";
        String path5 = "conjuntos/crescente/crescente_1000.csv";
        String path6 = "conjuntos/crescente/crescente_100.csv"; 
        String path7 = "conjuntos/aleatorio/aleatorio_10000.csv";
        String path8 = "conjuntos/aleatorio/aleatorio_1000.csv";
        String path9 = "conjuntos/aleatorio/aleatorio_100.csv";
        int index = 0;

        List<String[]> dados = bS.lerCsv(path);

        BubbleSort sort1 = new BubbleSort(path, index);
        sort1.rodar();

        InsertionSort sort2 = new InsertionSort(path, index);
        sort2.rodar();

        QuickSort sort3 = new QuickSort(path, index);
        sort3.rodar();

    }
}
