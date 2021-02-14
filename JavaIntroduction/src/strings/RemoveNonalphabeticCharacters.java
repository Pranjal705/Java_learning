package strings;
import java.util.Scanner;
public class RemoveNonalphabeticCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        int n = s.length();
        
        
        if (n > 0 && n<400000)
        {
            String[] Arr = s.split("[!,?._'@\\s]+");
            System.out.println(Arr.length);
            for(String item: Arr)
            {
                System.out.println(item.trim());
            } 
        }
        else
        {
            System.out.print(0);
        }
        
        scan.close();
	}

}
