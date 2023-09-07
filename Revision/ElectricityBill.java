import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter unit Consumed: ");
        double unit=in.nextDouble();
        double bill=0.0;
        if(unit<=150){
            bill=0.0;
        }
        else if(unit>150 && unit<251){
            bill=(unit-150)*1;
        }
        else if(unit>250 && unit<301){
            bill=150*0+250*1+(unit-250)*2.0;
        }
        else{
            bill=150*0+250*1+300*2.0+(unit-300)*2.80;
        }
        System.out.println("Bill: "+bill);
    }

}
