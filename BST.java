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

	public Boolean isEmpty()
	{
		if (head == null)
			return true;
		return false;
	}

	public Boolean isEmpty(ListNode temp) 
	{
		if (temp == null)
			return true;
		return false;
	}

	public void insertNode(int data)
	{
		System.out.println("Inserting " + data);
		insertNode(data, head);
	}

	public void insertNode(int data, ListNode temp)
	{
		boolean found = false;

		if(isEmpty())
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
		if(isEmpty())
		{
			System.out.println("BST is emtpy.");
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

	public Boolean searchNode(int data) 
	{
		System.out.println("Searching " + data);

		if (isEmpty())
		{
			return false;
		}
		else 
		{
			return searchNode(data, head);			
		}
	}

	public Boolean searchNode(int data, ListNode temp)
	{
		if (data < temp.data) 
		{
			if (temp.left != null)
				return searchNode(data, temp.left);
			else
				return false;
		}
		else if (data > temp.data) 
		{
			if (temp.right != null)
				return searchNode(data, temp.right);
			else
				return false;
		}
		else if (data == temp.data)
		{
			return true;
		}
	
		return false;
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