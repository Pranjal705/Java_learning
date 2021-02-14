package oops.singeltonClass;

public class Main {

	public static void main(String[] args) {
		AppConfig obj1 = AppConfig.getInstance();
		
		obj1.introduce();

	}

}
