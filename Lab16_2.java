
public class Lab16_2 {

    public static void main(String[] args) {

    
        MyInteger i1 = new MyInteger(7);
        MyInteger i2 = new MyInteger(12);
        MyInteger i3 = new MyInteger(15);
        MyInteger i4 = new MyInteger(22);
        MyInteger i5 = new MyInteger(121);

        System.out.println("Is " + i1.getValue() + " Even? " + i1.isEven());
        System.out.println("Is " + i2.getValue() + " Even? " + i2.isEven());
        System.out.println("Is " + i3.getValue() + " Even? " + i3.isEven());
        System.out.println("Is " + i4.getValue() + " Even? " + i4.isEven());
        System.out.println("Is " + i5.getValue() + " Even? " + i5.isEven());

        System.out.println("Is " + i1.getValue() + " Odd? " + i1.isOdd());
        System.out.println("Is " + i2.getValue() + " Odd? " + i2.isOdd());
        System.out.println("Is " + i3.getValue() + " Odd? " + i3.isOdd());
        System.out.println("Is " + i4.getValue() + " Odd? " + i4.isOdd());
        System.out.println("Is " + i5.getValue() + " Odd? " + i5.isOdd());


        System.out.println("Is " + i1.getValue() + " Prime? " + i1.isPrime());
        System.out.println("Is " + i2.getValue() + " Prime? " + i2.isPrime());
        System.out.println("Is " + i3.getValue() + " Prime? " + i3.isPrime());
        System.out.println("Is " + i4.getValue() + " Prime? " + i4.isPrime());
        System.out.println("Is " + i5.getValue() + " Prime? " + i5.isPrime());

        System.out.println();






        
    }
    
}
