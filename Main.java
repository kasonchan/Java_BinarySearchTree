/**
 * File: Main.java
 * Status: Not Completed 
 * Created Date: June 09, 2013
 * Last Modified Date: June 09, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		String command;
		int num;
		Scanner keyboard = new Scanner(System.in);

		BST BST = new BST();

		do
		{
			System.out.print("Command> ");
			command = keyboard.next();

			if (command.equalsIgnoreCase("insert")) {
				System.out.print("Integer> ");
				num = keyboard.nextInt();

				BST.insertNode(num);
			}
			else if (command.equalsIgnoreCase("inorder")) {
				
				BST.inorderPrint();
			}
			else if (command.equalsIgnoreCase("exit")) {
				System.exit(0);
			}
			else {
				System.out.println("Error. Invalid command.");
			}
		} while(true);
	}
}