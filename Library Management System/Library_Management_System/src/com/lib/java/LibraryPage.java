package com.lib.java;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryPage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc= new Scanner(System.in);
		System.out.println("Who's Login\n1.Librarian\n2.Student");
		int choice=sc.nextInt();
		Management_System bm = new Management_System();
		if(choice==1) {
			System.out.println("*******  Welcome Librarian  *******");
			System.out.println("Enter Username");
			String luser=sc.next();
			System.out.println("Enter Password");
			String lpass=sc.next();
			int r=bm.liblogin(luser, lpass);
			String res=(r>0)?"Login Successfully :)\nWelcome Librarian":"Invalid Credentials :(";
			System.out.println(res);
		}
	}

}
