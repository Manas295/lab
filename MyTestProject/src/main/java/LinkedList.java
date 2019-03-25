class LinkedList
{
	static Node head;  // head of list

	/* Linked list Node*/
	static class Node
	{
		String data;
		Node next;

		// Constructor to create a new node
		// Next is by default initialized
		// as null
		Node(String d) {data = d; next=null;}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}
	/* Function to print middle of linked list */

	public  void printList()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.print(n.data+"-->");
			n = n.next;
		}
		System.out.println("NULL");
	}
	public void push(String new_data)
	{
		/* 1 & 2: Allocate the Node &
                  Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;
		/* 4. Move the head to point to new Node */
		head = new_node;
	}
	static int getLength(String arr[])
	{
		int count=0;
		for(String curr : arr)
		{
			count++;
		}
		return count;
	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		String currency[] = {"INR","USD","POUND","AED","EURO"};
		int len = getLength(currency);
		for(int i=0 ; i < len; i++)
		{
			llist.push(currency[i]);
		}

		llist.printList();
		getRateofconversion(head,len);
	}
	static void getRateofconversion(Node node, int size)
	{
		Node first,second;
		String currency1 = null, currency2=null;
		try {
			//for(i=0;i<size;i++)
			for(first = node; first!=null ; first = first.next)
			{
				currency1 = first.data;
				for(second = first.next ; second!=null ; second = second.next)
				{
					currency2 = second.data;

					//Api Calling Method making it dummy one
					long rate = callThirdPartyApi(currency1,currency2);
					System.out.println("Conversion rate of "+currency1+" to "+currency2+" are : "+rate+" ");

					//Calling same for vice versa case so doing this iteration will be less
					rate = callThirdPartyApi(currency2,currency1);
					System.out.println("Conversion rate of "+currency2+" to "+currency1+" are : "+rate+" ");
				}
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	static long callThirdPartyApi(String currencyFrom, String currencyTo)
	{

		//API CALLED AND DUMMY RESULT WILLB E RETURNED
		return 2000;
	}
}