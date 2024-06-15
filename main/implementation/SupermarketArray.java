package implementation;

public class SupermarketArray implements  Supermarket{

    private final String [] items;

    private int LastIndex;

    public SupermarketArray(final int size) {
        items = new String[size];
        LastIndex = -1;
    }


    @Override
    public void add(String item) {
        if (LastIndex == items.length-1) {
            System.err.println("Lista de supermercado cheia");
        } else {
            LastIndex++;
            items[LastIndex] = item;
        }
    }

    @Override
    public void print() {
        System.out.println("_______________");
        if(LastIndex < 0) {
            System.out.println("lista vazia");
        }
        for(int i=0; i <= LastIndex; i++){
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("_______________");
    }

    @Override
    public void delete(int index) {
        if (index >=0 && index <= LastIndex){
            shift(index);
            LastIndex--;
        } else {
            System.err.println("INDICE INVALIDO");
        }
    }
    private void shift(final int index){
        for (int i = index; i < LastIndex; i++) {
            items[i] = items[i+1];
        }
    }
}
