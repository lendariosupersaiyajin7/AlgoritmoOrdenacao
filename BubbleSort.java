public class BubbleSort extends Sort {

    public BubbleSort(String path, int index) {
        super(path, index);
    }

    @Override
    public void swap(int i, int j) {
        String[] aux = dados.get(i);
        dados.set(i, dados.get(j));
        dados.set(j, aux);
    }

    @Override
    public void organizar() {
        for (int i = 0; i < dados.size(); i++) {
            for (int j = i + 1; j < dados.size(); j++) {
                if (Integer.parseInt(dados.get(i)[index]) > Integer.parseInt(dados.get(j)[index])) {
                    swap(i, j);
                }
            }
        }
    }
}
