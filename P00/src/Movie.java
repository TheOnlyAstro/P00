public class Movie {
	
	public boolean movieRatingPG13(int age) {
		if(age >= 13) {
			System.out.println("Able to watch the movie");
			return true;
		} else if (age < 0) {
			System.out.println("Invalid age");
			return false;
		} else {
			System.out.println("Age requirement not met");
			return false;
		}
	}
	
	public boolean movieRatingNC16(int age) {
		if(age >= 16) {
			System.out.println("Able to watch the movie");
			return true;
		} else if (age < 0) {
			System.out.println("Invalid age");
			return false;
		} else {
			System.out.println("Age requirement not met");
			return false;
		}
	}
	
	public boolean movieRatingM18(int age) {
		if(age >= 18) {
			System.out.println("Able to watch the movie");
			return true;
		} else if (age < 0) {
			System.out.println("Invalid age");
			return false;
		} else {
			System.out.println("Age requirement not met");
			return false;
		}
	}
	
	public boolean movieRatingR21(int age) {
		if(age >= 21) {
			System.out.println("Able to watch the movie");
			return true;
		} else if (age < 0) {
			System.out.println("Invalid age");
			return false;
		} else {
			System.out.println("Age requirement not met");
			return false;
		}
	}

}
