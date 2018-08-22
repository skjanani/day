package janani;
import java.util.Scanner;
public class Exchangeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str,str1="",str2="",str3="",str4="";
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.next();
str1=str.substring(1,2);
str2=str.substring(0,1);
str3=str.substring(3,4);
str4=str.substring(2,3);
System.out.println(str1+str2+str3+str4);
	}

}
