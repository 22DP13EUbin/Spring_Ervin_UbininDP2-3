public class Money {

    Money a = new Money(10,0);
    Money b = new Money(5,0);

    Money c = a.plus(b);

    System.out.println(a);  // 10.00e
    System.out.println(b);  // 5.00e
    System.out.println(c);  // 15.00e

    a = a.plus(c);          


    System.out.println(a);  // 25.00e
    System.out.println(b);  // 5.00e
    System.out.println(c);  // 15.00e
    
}
