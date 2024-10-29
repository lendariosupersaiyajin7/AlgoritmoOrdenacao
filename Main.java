import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "conjuntos/aleatorio/aleatorio_10000.csv"; 
        int index = 0;

        List<String[]> dados = BubbleSort.lerCsv(path);

        if(dados != null && !dados.isEmpty()){

            BubbleSort.bubbleSort(dados, index);
            
            BubbleSort.printBubbleSort(dados);

        } else {
            System.out.println("dados nao encontrados");
        }

    }
}
