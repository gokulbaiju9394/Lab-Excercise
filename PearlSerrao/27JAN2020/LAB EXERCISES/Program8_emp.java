package demo;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Program8_emp {
	static void checkavailablity(int b,String n,String address,int ac)throws Exception{
		  if(b==1) {
		   System.out.println("record saved.....exiting");
		   
		   FileOutputStream fout;
		   PrintStream p;
		   
		   fout=new FileOutputStream("d:\\Emp_details.txt");
		   p=new PrintStream(fout);
		   p.println("the values of name is"+n);
		   p.println("address: "+address);
		   p.println("aadhar card: "+ac);
		   
		   p.close();
		  }
		  else if(b==0) {
		   System.out.println("Record not saved ......exiting");
		  }
		  else {
		   throw new exceptions("Invalid choice");
		  }
		 }
	 public static void main(String[] args) {
		  try {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter name");
		   String name=sc.nextLine();
		   System.out.println("enter address");
		   String address=sc.nextLine();
		   System.out.println("enter the adhar card address");
		   int i=sc.nextInt();
		   System.out.println("do u want to save 0 or 1");
		   int a=sc.nextInt();
		   checkavailablity(a,name,address,i);
		  }
		  catch(Exception e){
		  System.out.println("error occured: "+e);
		  }
}
}
