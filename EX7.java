import java.io.*;
class EX7
{
public static void main(String[]args)
{
try
{
FileInputStream fin=new FileInputStream("Src.txt");
FileOutputStream fout=new FileOutputStream("dst.txt");
int data;
while(( data=fin.read())!=-1)
{
fout.write(data);
}
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("File created successfully");
}
}


