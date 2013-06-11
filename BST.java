/**
 * File: BST.java
 * Status: Not Completed 
 * Created Date: June 09, 2013
 * Last Modified Date: June 09, 2013
 * Programmer: Ka-Son Chan
 * Description:
 */ 

public class BST
{
	private ListNode head;

	public BST()
	{
		head = null;
	}

	public void insertNode(int data)
	{
		System.out.println("Inserting " + data);
		insertNode(data, head);
	}

	public void insertNode(int data, ListNode temp)
	{
		boolean found = false;

		if(head == null)
		{
			ListNode newNode = new ListNode();
			newNode.data = data;
			head = newNode;

			return;
		}
		else
		{
			if(data < temp.data)
			{
				if(temp.left == null)
				{
					ListNode newNode = new ListNode();
					newNode.data = data;
					temp.left = newNode;
				}	
				else
					insertNode(data, temp.left);
			}
			else if(data > temp.data)
			{
				if(temp.right == null)
				{
					ListNode newNode = new ListNode();
					newNode.data = data;
					temp.right = newNode;
				}
				else
					insertNode(data, temp.right);
			}
			else if(data == temp.data)
			{
				System.out.println(data + " already in the BST.");
				return;
			}
		}
	}

	public void inorderPrint()
	{
		if(head == null)
		{
			System.out.println("BST is emtpy!");
			return;
		}
		else		
			inorderPrint(head);
		
		System.out.println();
	}

	public void inorderPrint(ListNode temp)
	{
		if((temp == null))
			return;
		inorderPrint(temp.left);
		System.out.print(temp.data + " ");
		inorderPrint(temp.right);
	}

	public class ListNode
	{
		private int data;
		private ListNode left;
		private ListNode right;

		public ListNode()
		{
			data = -1;
			left = null;
			right = null;
		}
	}
}