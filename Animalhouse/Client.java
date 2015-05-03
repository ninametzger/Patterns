
public class Client {

	public static void main(String[] args) {
		AnimalhomeFacade facade = new AnimalhomeFacade();
		System.out.println(facade.getAnimals(40));

		System.out.println(facade.getAnimals(60));
		
		System.out.println(facade.getAnimals(20));
		
		System.out.println(facade.getAnimals(4));
		
		System.out.println(facade.getAnimals(200));
	}

}
