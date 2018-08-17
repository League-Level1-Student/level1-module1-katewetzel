
public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature Spongebob = new SeaCreature("Spongebob");
	Spongebob.eat();
	SeaCreature Patrick = new SeaCreature("Patrick");
	System.out.println("Patrick");
	Patrick.eat();
	SeaCreature Squidward = new SeaCreature("Squidward");
	System.out.println("Squidward");
	Squidward.eat();
}
}
