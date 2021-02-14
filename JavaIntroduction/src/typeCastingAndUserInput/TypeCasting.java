package typeCastingAndUserInput;

public class TypeCasting {

	public static void main(String[] args) {
		//Widening
		// byte->Short->Char->int->long->float->double
		// In this sequence, the type casting will be automatically done by the Compiler.
		 int x = 4;
		 double y = x;
		 
		 System.out.println(x);
		 System.out.println(y);
		
		// Narrowing
		// If we have to cast opposite to the above sequence, we will have to explicitly type cast.
		 
		 double myDouble = 2.857;
		 int myInt = (int)myDouble;
		 float myFloat = (float)myDouble;
		 
		 System.out.println(myDouble);
		 System.out.println(myInt);
		 System.out.println("This is a float value: " + myFloat);
		 
	}

}
