package lab2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<BuddyInfo> book = new ArrayList();

	public void addBuddy(BuddyInfo bud)
	{
		if (bud != null)
		{
			book.add(bud);
		}
	}

	public void removeBuddy(BuddyInfo bud)
	{
		
		book.remove(bud);
	}
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
		System.out.print("Change");

	}

}
