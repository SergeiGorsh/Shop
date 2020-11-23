import java.util.ArrayList;
class Basket {
    private int sumOfBasket ;
    private int numberOfOrder;
    ArrayList<String> arraylist = new ArrayList<>();

    public void setArraylist(ArrayList<String> arraylist) {
        this.arraylist = arraylist;
    }
    public ArrayList<String> getArraylist() {
        return arraylist;
    }
    public void setSumOfBasket(int sumOfBasket) {
        this.sumOfBasket = sumOfBasket;
    }
    public int getSumOfBasket() {
        return sumOfBasket;
    }
    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }
    public int getNumberOfOrder() {
        return numberOfOrder;
    }
    public void addGood(String AbstractGoogs){
        arraylist.add("Добавить товар");
    }
}
