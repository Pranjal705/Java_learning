package methods;
// JAVA is always PASS-BY-VALUE
// The tricky part is for non-primitive data type like class
public class PassByValue {

	public static void main(String[] args) {
		int a = 3;
		int b = 34;

		Dog C = new Dog();
		Dog E = new Dog();
		C.legs = 5;
		E.legs = 0;
		
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
		
		swap(C,E);
		System.out.println(C.legs);
		System.out.println(E.legs);
	}
	
	static void swap(int number1, int number2)
	{
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}

//	static void swap(Dog a, Dog b) // This method will not swap the objects because only the references in this scope gets swapped
//	{
//		Dog temp = a;
//		a = b;
//		b = temp;
//	}
	static void swap(Dog a, Dog b)
	{
		int temp = a.legs;
		a.legs = b.legs;
		b.legs = temp;
	}
		
}

class Dog
{
	int legs;
}
