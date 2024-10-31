public class QuickSort extends Sort {

    public QuickSort(String path, int index) {
        super(path, index);
    }

    @Override
    public void organizar() {
        quickSort(0, dados.size() - 1);
    }

    public void quickSort(int menor, int maior) {
        if(menor < maior){
            int pivot = particao(menor, maior);

            quickSort(menor, pivot -1);
            quickSort(pivot + 1, maior);
        }
    }

    public int particao(int menor, int maior) {
        String[] pivot = dados.get(maior);
        int i = (menor - 1);

        for(int j = menor; j < maior; j++){
            if (Integer.parseInt(dados.get(j)[index]) <= Integer.parseInt(pivot[index])){
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, maior);
        return (i + 1);
    }

    @Override
    public void swap(int i, int j) {
        String[] aux = dados.get(i);
        dados.set(i, dados.get(i));
        dados.set(i, dados.get(j));
        dados.set(j, aux);
    }
}