import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    private List<String[]> dados;
    private int index;

    public InsertionSort(String path, int index){
        this.index = index;
        this.dados = lerCsv(path);
    }

    public static List<String[]> lerCsv(String path) {
    List<String[]> dados = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        String linha;

           while((linha = br.readLine()) != null){
            String[] dadosLinha = linha.split(", ");
            dados.add(dadosLinha);
        }
    } catch(IOException e){
        e.printStackTrace();
    }
     return dados;
    }

    public void organizar() {
        for(int i  = 1; i < dados.size(); i++){
            String[] chave = dados.get(i);
            int j = i - 1;

            while(j >= 0 && Integer.parseInt(dados.get(j)[index]) > Integer.parseInt(dados.get(j+1)[index])){
                dados.set(j + 1, dados.get(j));
                j--;                
            }
        }
    }

    public static void printInsertionSort(List<String[]> dados) {
        for (String[] linha : dados) {
            System.out.println(String.join(", ", linha));
        }
    }

    public void rodar() {
        organizar();
        System.out.println("dados organizados: ");
        printInsertionSort(dados);
    }
    
}
