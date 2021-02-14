package strings;

public class Anagrams {

	public static void main(String[] args) {
		// Check if the two strings are anagram or not
		
		String a = "aab";
		String b = "abc";
		a = a.toLowerCase();
        b = b.toLowerCase();  
		boolean isAnagram = false;
		boolean isVisited[] = new boolean[b.length()];
		if(a.length()==b.length())
		{
			for(int i=0; i<a.length(); i++)
			{
				char c = a.charAt(i);
				isAnagram = false;
				for(int j=0; j<b.length(); j++)
				{
					if(c == b.charAt(j) && !isVisited[j])
					{
						isVisited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram)
				{
					break;
				}
			}
			if(isAnagram)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}

	}

}
