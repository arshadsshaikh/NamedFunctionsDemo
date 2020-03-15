import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompDemo {

    public static void main(String[] args) {

        ArrayList<Laptops>laptops= new ArrayList<>();


        laptops.add(new Laptops(16,400000));
        laptops.add(new Laptops(4,12000));
        laptops.add(new Laptops(8,20000));

        Comparator<Laptops>comparator= (laptops12, t1) -> {
            if(laptops12.getPrice()>t1.getPrice()){

                return 1;
            }
            else{

               return -1;
            }
        };

        laptops.sort(comparator);

      //  Collections.sort(laptops);

        for(Laptops laptops1:laptops){

            System.out.println(laptops1.price);
        }


    }

}

class  Laptops {
    int ram;
    int price;
    Laptops(int rm, int prc){

        ram=rm;
        price=prc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



//    @Override
//    public int compareTo(Laptops laptops) {
//
//        if(this.price>laptops.price){
//
//            return 1;
//        }
//        else{
//            return -1;
//        }
//
//    }
}
