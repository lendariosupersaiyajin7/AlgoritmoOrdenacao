import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Sort {
    protected List<String[]> dados;
    protected int index;

    public Sort(String path, int index) {
        this.dados = lerCsv(path);
        this.index = index;
    }

    public abstract void swap(int i, int j);

    public abstract void organizar();

    public void rodar() {
        long inicio = System.nanoTime();
        organizar();
        long fim = System.nanoTime();

        long metrica = fim - inicio;

        System.out.println("Tempo: " + metrica + " ns (nanosegundos)");
        System.out.println("Dados foram ordenados:");
        for (String[] linha : dados) {
            System.out.println(String.join(", ", linha));
        }
    }

    public static List<String[]> lerCsv(String path) {
        List<String[]> dados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLinha = linha.split(", ");
                dados.add(dadosLinha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dados;
    }
}
