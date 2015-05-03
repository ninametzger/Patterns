
public class CatDepartment {
	
	Cat getCat(int size){
		if(size > 60 && size < 90){
			return new BigCat();
		}
		if(size <= 60 && size > 20){
			return new MiddleCat();
		}
		if(size <= 20 && size > 5){
			return new SmallCat();	
		}
		return new NoCat();
	}
}
