import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;


public class Test {

	public static int hash(int num)
	{
		return num % 10;
	}
	
	public static void main(String[] args) {
		HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
		Set<Integer>keys = map.keySet();
		Random rand = new Random();
		for (int i=0; i<100; i++)
		{
			int num = rand.nextInt(100);
			int key = hash(num);
			map.put(key, new LinkedList<Integer>());
			map.get(key).push(num);
		}
		Set<Integer> set = map.keySet();
		Iterator<Integer> iterator = keys.iterator();
		while(iterator.hasNext())
		{
			int key = iterator.next();
			System.out.println(map.get(key));
		}
	}

}
