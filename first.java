import java.util.ArrayList;
import java.util.List;

class First{
    public static void main(String[] args) {
        List<Data> s21=new ArrayList<>();
        s21.add(new Data("tea", 100));
        s21.add(new Data("coffee", 100));
        s21.add(new Data("green tea", 75));
         List<Data> s22=new ArrayList<>();
        s22.add(new Data("tea", 120));
        s22.add(new Data("coffee", 110));
        s22.add(new Data("green tea", 100));
        List<Data> varience=new ArrayList<>();
        for(int i=0;i<s21.size();i++){
          int var=  s22.get(i).getSale()-s21.get(i).getSale();
          double varpct=((double)var/s22.get(i).getSale())*100;
         varience.add(new Data(s21.get(i).getProduct(), varpct));
        }
        System.out.println(varience);
    }
}
class Data{
    String product;
    int sale;
    double var;
    Data(String product,int sale){
        this.product=product;
        this.sale=sale;
    }
    Data(String product,double var){
        this.product=product;
        this.var=var;
    }
    public String getProduct(){
        return product;
    }
    public int getSale(){
        return sale;
    }
    public String toString(){
        return "{"+product+":"+sale+":"+var+"}";
    }
}