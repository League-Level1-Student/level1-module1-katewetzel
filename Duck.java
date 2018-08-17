
public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends){
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	public void quack() {
		System.out.println("quack");
	}
	
	public void waddle() {
	System.out.println("waddle");	
	}
}
