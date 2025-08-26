package OOPSQues;
class books{
     static int price;
     static int count;
    books(int price){
        this.price=price;
        count++;

    }
}
public class Book {
    public static void main(String[] args) {
books b=new books(150);
books b2= new books(120);
        System.out.println(books.price);
        System.out.println(books.count);
        System.out.println(b.price);
        //System.out.println(b.price);
        System.out.println(books.count);

    }
}
