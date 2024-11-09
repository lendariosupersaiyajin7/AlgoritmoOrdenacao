import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bS {

    private List<String[]> dados;
    private int index;

    public bS(String path, int index){
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
        int n = dados.size();
        boolean trocado;

        do {
            trocado = false;

            for(int i = 0; i < n - 1; i++){
                if(Integer.parseInt(dados.get(i)[index]) > Integer.parseInt(dados.get(i+1)[index])){
                    String temp[] = dados.get(i);
                    dados.set(i, dados.get(i+1));
                    dados.set(i+1, temp);
                    trocado = true;
                }
            }
            n--;
        } while(trocado);
    }

    public static void printBubbleSort(List<String[]> dados) {
        for(String[] linha : dados){
            System.out.println(String.join(", ", linha));
        }
    }

    public void rodar() {
        organizar();
        System.out.println("dados organizados:");
        printBubbleSort(dados);
    }
    
}
