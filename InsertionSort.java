public class InsertionSort extends Sort {

    public InsertionSort(String path, int index) {
        super(path, index);
    }

    @Override
    public void organizar() {
        for (int i = 1; i < dados.size(); i++) {
            String[] key = dados.get(i);
            int j = i;

            while (j > 0 && Integer.parseInt(dados.get(j - 1)[index]) > Integer.parseInt(key[index])) {
                swap(j, j - 1);
                j--;
            }
            dados.set(j, key);
        }
    }


    @Override
    public void swap(int i, int j) {
        String[] temp = dados.get(i);
        dados.set(i, dados.get(j));
        dados.set(j, temp);
    }
}
