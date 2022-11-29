import java.math.BigInteger;
public class Main
{

    public static String multiply(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.multiply(n2).toString();
    }

	public static void main(String[] args) {
	    String m="10",n="9";
	    
		System.out.println(multiply(m,n));
	}
}
