
public class Product {
int pcode;
String pname;
double price;
Product(int cod, String nam,double pri){
pcode=cod;
pname=nam;
price=pri;
}
void display(){
    System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
}
static void lowest(double p1, double p2, double p3){
    if(p1<p2&&p1<p3)
    {    
        System.out.println("Product 1 has the lowest price");
    }
    else if(p2<p1&&p2<p3){
        System.out.println("Product 2 has the lowest price");
    }
    else if(p3<p1&&p2>p3)
    {
        System.out.println("Product 3 has the lowest price");

    }
} 
public static void main(String[] args) {
    Product obj1=new Product(1,"Shirt",400);
    Product obj2=new Product(2,"watch",20);
    Product obj3=new Product(3,"Book",100);
    System.out.println("Jaison jacob\n Rollno:33\n13-02-2024\nDefine a class ‘product’ with data members pcode, pname and price. Create 3 objects ofthe class and find the product having the lowest price");

    System.out.println("\nProduct Information\n\nProductCode\tProductName\tProductPrice");
    obj1.display();
    obj2.display();
    obj3.display();
    lowest(obj1.price,obj2.price,obj3.price);
}
    
}
