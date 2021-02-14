package strings;

public class StringsIntro {

	public static void main(String[] args) {
		// Strings are immutable
		String name = "Pranjal";
		
		String name1 = new String("Pranjal");
		String name3 = "Pranjal";
		System.out.println(name == name1); // false because name is stored in string pool area but name1 is in heap.
		System.out.println(name == name3); // true because both are stored in string pool area.
		name1 = "Bunny";
		System.out.println(name1); // It will Print Bunny but Pranjal is still in the memory that's why strings are immutable.
		
		// Some methods of strings
		
		System.out.println(name.charAt(5)); // return type = char
		System.out.println(name.length()); // return type = int
		System.out.println(name.substring(4)); //returns string
		System.out.println(name.substring(2, 5)); // returns string, ending index is not included
		System.out.println(name.contains("anjak"));// returns boolean
		
		
		String friends = "Aadarsh, Shaswat, Aaditya, Deepak";
		String[] allFriends = friends.split(",");
		
		for(String friend: allFriends)
		{
			System.out.print(friend.trim()); // trim() removes all the forward and backward spaces
		}
	}

}
