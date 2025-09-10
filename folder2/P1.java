public class P1 {
class Book{
        String title;
        String author;
        double price;

        Book(){
            title="unknown";
            author="unknown";
            price=0.0;

        }
        Book(String t,String a,double p){
            title=t;
            author=a;
            price=p;
        }
    }
 
    public static void main(String args[]){
        P1 outer = new P1();
        Book book1=outer.new Book();
        Book book2=outer.new Book("1984", "George Orwell", 299.99);
    }
    
}
