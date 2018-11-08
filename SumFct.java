import java.math.BigInteger;
public class SumFct {

  public static BigInteger perimeter(BigInteger n){

    BigInteger temp = new BigInteger("0");
    BigInteger a = new BigInteger("1");
    BigInteger b = new BigInteger("0");
    BigInteger per = new BigInteger("0");

    for(BigInteger i = BigInteger.valueOf(0);
                    i.compareTo(n) <= 0; i = i.add(BigInteger.valueOf(1))){
      temp = a;
      a = b;
      b = temp.add(a);
      per = per.add(b);
    }

    return per.multiply(BigInteger.valueOf(4));

  }

  public static void main(String args[]){

    System.out.println(perimeter(new BigInteger("5")));

  }

}
