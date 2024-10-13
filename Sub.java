import java.util.Scanner;
class Sub{
public static void main(String arg[]){
Scanner f = new Scanner(System.in);
System.out.println("enter 2 values:");
int a = f.nextInt();
int b = f.nextInt();
System.out.println("A:" +a);
System.out.println("B:" +b);
System.out.println("Sub:" +(a-b));
}
}