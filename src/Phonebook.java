import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;


public class Phonebook {

	HashMap<String, PersonPhoneNumber> phonebook;
	
	public Phonebook()
	{
		phonebook = new HashMap<String, PersonPhoneNumber>();
		System.out.println("Welcome to phonebook! Enter number 1 if you want to add new phone number.\n"
				+ "Enter number 2 if you want to remove phone number\n"
				+ "Enter number 3 if you want to edit phone number.\n"
				+ "Enter number 4 if you want to exit application");
		Scanner unos = new Scanner(System.in);
		int num = unos.nextInt();
		select(num);
		print();
		do
		{
			System.out.println("Enter next number: ");
			num = unos.nextInt();
			select(num);
			print();
			
		}while (num != 4);
		
		
		
	}
	
	public void add(String name, PersonPhoneNumber phone)
	{
		if(name.length()==0)
		{
			throw new IllegalArgumentException("Name cannot be empty field!");
		}
		phonebook.put(name, phone);
	}
	
	public void remove(String name)
	{
		if (!phonebook.containsKey(name))
		{
			throw new IllegalArgumentException("Phonebook does not contain that name!");
		}
		phonebook.remove(name);
		
	}
	
	public void edit(String name, PersonPhoneNumber phone)
	{
		phonebook.replace(name, phone);
	}
	
	public void print()
	{
		Set<String>keys = phonebook.keySet();
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			String key = iterator.next();
			System.out.println("Name: " +  phonebook.get(key).getName());
			System.out.println("Mobile number: " + phonebook.get(key).getMobile());
			if (phonebook.get(key).getHasHome() == true)
			{
				System.out.println("Home number: " + phonebook.get(key).getHome());
			}
			if (phonebook.get(key).getHasBus() == true)
			{
				System.out.println("Business number: " + phonebook.get(key).getBussiness());
			}
		}
	}
	
	public void select(int select)
	{
		Scanner unos = new Scanner(System.in);
		if (select < 1 || select > 4)
		{
			throw new IllegalArgumentException("Number must be between 1 and 4!");
		}
		else if (select == 1)
		{
			System.out.println("Please enter name: ");
			String name = unos.nextLine();
			System.out.println("Enter mobile phone number: ");
			int mob= unos.nextInt();
			PersonPhoneNumber phone = new PersonPhoneNumber(name, mob);
			add(name, phone);
			System.out.println("Enter home phone number (0 if you don't want to): ");
			int home= unos.nextInt();
			if(home != 0)
			{
				phone.setHome(home);
			}
			System.out.println("Enter business phone number(0 if you don't want to): ");
			int business = unos.nextInt();
			if(business != 0)
			{
				phone.setBussiness(business);
			}
		}
		else if(select == 2)
		{
			System.out.println("Please enter name: ");
			String name = unos.nextLine();
			remove(name);
		}
		else if (select == 3)
		{
			System.out.println("Please enter name: ");
			String name = unos.nextLine();
			System.out.println("Enter new phone number: ");
			int num = unos.nextInt();
			PersonPhoneNumber phone = new PersonPhoneNumber(name, num);
			edit(name, phone);
		}
	}
	
}
