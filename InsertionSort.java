public class InsertionSort extends Sort {

    public InsertionSort(String path, int index) {
        super(path, index);
    }

    @Override
    public void organizar() {
        for (int i = 1; i < dados.size(); i++) {
            String[] key = dados.get(i);
            int j = i - 1;

            while (j >= 0 && Integer.parseInt(dados.get(j)[index]) > Integer.parseInt(key[index])) {
                dados.set(j + 1, dados.get(j));
                j = j - 1;
            }
            dados.set(j + 1, key);
        }
    }

    @Override
    public void swap(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swap'");
    }
}
