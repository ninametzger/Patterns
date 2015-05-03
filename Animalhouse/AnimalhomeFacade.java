
public class AnimalhomeFacade {
	
	private DogDepartment dogs = new DogDepartment();
	private CatDepartment cats = new CatDepartment();
	
	public String getAnimals(int size) {
		Dog wau = dogs.getDog(size);
		Cat miau = cats.getCat(size);
		
		return "Dogs: "+ wau.getProperty() + "\nCats: " + miau.getProperty();
	}
}


