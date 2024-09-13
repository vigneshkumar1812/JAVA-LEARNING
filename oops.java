
abstract class Bird{
	abstract void eat();
	abstract void fly();
}
abstract class Eagle extends Bird{
	@Override
	void fly() {
		System.out.println("Eagle is flies long at height");
	}
}
class SerpentEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("It eats only snakes");
		
	}
}
class GoldenEagle extends Eagle{
	@Override
	void eat() {
		System.out.println("It eats only fishes");
		
	}
}
class BirdFamily{
	void family(Eagle ref) {
		ref.fly();
		ref.eat();
	}
}


public class Day44 {

	public static void main(String[] args) {
		SerpentEagle se=new SerpentEagle();
		GoldenEagle  ge=new GoldenEagle();
		BirdFamily   bf=new BirdFamily();
		bf.family(ge);
		bf.family(se);

	}

}
