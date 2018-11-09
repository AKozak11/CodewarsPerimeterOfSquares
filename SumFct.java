import java.math.BigInteger;

/*The drawing shows 6 squares the sides of which have a length of 1, 1, 2, 3, 5, 8. It's easy to see that the sum of the perimeters of these squares is : 4 * (1 + 1 + 2 + 3 + 5 + 8) = 4 * 20 = 80

Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 squares disposed in the same manner as in the drawing:

alternative text

#Hint: See Fibonacci sequence

#Ref: http://oeis.org/A000045

The function perimeter has for parameter n where n + 1 is the number of squares (they are numbered from 0 to n) and returns the total perimeter of all the squares.

perimeter(5)  should return 80
perimeter(7)  should return 216*/

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
    System.out.println(perimeter(new BigInteger("7")));

  }

}
