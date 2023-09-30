import java.math.BigInteger;

public class Big__Integer {
    public static void main(String[] args) {
        int a=33;
        int b=3;
        System.out.println(a+b);

        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(3);

        BigInteger S=A.add(B);
        System.out.println(S);
        
        BigInteger C=new BigInteger("23456789");
        BigInteger D=new BigInteger("567454");

        BigInteger ST=C.add(D);
        System.out.println(ST);

        BigInteger X=BigInteger.TEN; // constants

        BigInteger s=C.subtract(D);
        BigInteger m=C.multiply(D);        
        BigInteger d=C.divide(D);
        BigInteger r=C.remainder(D);

        System.out.println(s);
        System.out.println(m);
        System.out.println(d);
        System.out.println(r);

        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }

        System.out.println(factorial.fact(1000)); //You cannot do it with regular integer i.e, why you need BigInteger

    }
}
