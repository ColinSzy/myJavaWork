package oop;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat bob = new Cat();
		System.out.println("The age of the cat is " + bob.getAge() );
		System.out.println("The cat gets " + bob.getSleep() + " hours of sleep.");
		bob.birthday(1);
		System.out.println("The cat had a birthday!");
		System.out.println("The age of the cat is " + bob.getAge() );
		bob.sleepLess(1);
		System.out.println("The cat now gets " + bob.getSleep() + " hours of sleep.");
		bob.birthday(1);
		System.out.println("The cat had a birthday!");
		System.out.println("The age of the cat is " + bob.getAge() );
		bob.sleepMore(1);
		System.out.println("The cat now gets " + bob.getSleep() + " hours of sleep.");
	}

}
