package CoreJava.Basics;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter NAME below");
		String name= sc.next();
		System.out.println("HELLO "+name.toUpperCase());
		
		
                 Set<Integer> s= new HashSet<Integer>();
                 //  Iterator<Integer> i=     s.iterator();
		         //  Integer in=Collections.max(s);
               Collection c=  Collections.synchronizedCollection(s);
	}

}
