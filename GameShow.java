package classAssignments;

public class GameShow {

	public static void main(String[] args) {
		GameShowArrayBag names = new GameShowArrayBag();
		GameShowArrayBag money = new GameShowArrayBag();
		
		names.add("Will");
		names.add("Reed");
		names.add("Tucker");
		names.add("Joe");
		names.add("Phil");
		
		money.add("$100");
		money.add("$500");
		money.add("$50");
		money.add("$10,000");
		money.add("$0");
		
		for(int i = 0; i < 5; i++) {
			//I removed the +1 from the randomizer line of the grab method because 
			//when it did the randomizer, the +1 made it so 
			//the grab method never grabbed the first item of the bag which was at index 0, 
			//so it would just loop forever and not print all of the possibilities
			Object name = names.grab();
			Object prize = money.grab();
			
			//Also I added a null checker to the grab method because without it, the method would grab null from the
			//list when because null would be present when 
			//elements were removed, that way it would not print null for the prize or name. Therefore the
			//grab method only returns actual objects and not null values
			System.out.println(name + " won " + prize);
			
			//The grab method does not remove the element that is grabbed so I did it myself
			names.remove(name);
			money.remove(prize);
		}
	}
}
