
public class DogDepartment {
	
	Dog getDog(int size){
		if(size > 80 && size < 120){
			return new BigDog();
		}
		if(size <= 80 && size > 40){
			return new MiddleDog();
		}
		if(size <= 40 && size > 10){
			return new SmallDog();	
		}
		return new NoDog();
	}
}
