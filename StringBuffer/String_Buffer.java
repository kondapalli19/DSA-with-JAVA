import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class String_Buffer {
    public static void main(String[] args) {

        StringBuffer st=new StringBuffer();
        st.append("Hello World");

        System.out.println(st.capacity()); // by default 16

        System.out.println(st);

        st.replace(2, 6, " Hey ");
        System.out.println(st);

        System.out.println(st.reverse());
        st.reverse();

        st.insert(2,  " Rahul");
        System.out.println(st);

        StringBuffer sb=new StringBuffer();

        System.out.println(st.capacity());
        System.out.println(sb.capacity());

        Random random=new Random();
        System.out.println(random.nextFloat());

        String sentence="He    ll o W     or ld   ";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        String arr="Koyal Kasish Romil Sweta Vivek Priyanka Kriti";

        String[] names=arr.split(" ");
        System.out.println(Arrays.toString(names));

        String[] names1=arr.trim().split("\\s+"); // removes extra spaces
        System.out.println(Arrays.toString(names1));

        DecimalFormat df=new DecimalFormat("00.0000");

        System.out.println(df.format(756));
        System.out.println(df.format(7));
        System.out.println(df.format(7.9));
        System.out.println(df.format(9.899999));

    }
}
