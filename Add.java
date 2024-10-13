import java.io.DataInputStream;
class Add{
public static void main(String arg[]){
DataInputStream in =new DataInputStream(System.in);
int x=2;
int y=3;
int z=4;
int g;
try
{
System.out.println("enter a integer no:");
x=Integer.parseInt(in.readLine());
y=Integer.parseInt(in.readLine());
z=Integer.parseInt(in.readLine());
}
catch(Exception e) {}
g=x+y+z;
System.out.println("G:" +g);
}
}