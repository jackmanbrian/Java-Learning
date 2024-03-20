import java.util.ArrayList;

public class StartupBust {
	
	// Declare and initialise the variables needed
	private GameHelper helper = new GameHelper(); 
	private ArrayList<Startup> startups = new ArrayList<Startup>();
	private int numOfGuesses = 0;
	
	private void setUpGame() {
		// first make some Startups and give them locations
		// Make three startup objects, give them names and stick them in the ArrayList
		Startup one = new Startup();
		one.setName("poniez");
		Startup two = new Startup();
		two.setName("hacqi");
		Startup three = new Startup();
		three.setName("cabista");
		// sticking them in the ArrayList here
		startups.add(one);
		startups.add(two);
		startups.add(three);
		
		// print brief instructions for the user
		System.out.println("Your goal is to sink three Startups.");
		System.out.println("poniez,hacqi, cabista");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		// repeat for each startup in the list
		for (Startup startup: startups) { 
			ArrayList<String> newLocation = helper.placeStartup(3); // ask the helper for a startup location
			startup.setLocationCells(newLocation); // Call the setter method for this startup to give it locations from helper
		}
	}
	
	private void startPlaying() {
		while (!startups.isEmpty()) { // As long as the startup list is not empty
			String userGuess = helper.getUserInput("Enter a guess"); // get user input
			checkUserGuess(userGuess); // Call the checkUserGuess method we have created
		}
		finishGame(); // Calling the finish game method we have made
	}
	
	private void checkUserGuess(String userGuess) {
		numOfGuesses++; // increment the number of guesses the user has made
		String result = "miss"; // Assume a miss unless told otherwise
		
		// Ask the startup to check the user guesses, looking for a hit or kill
		// repeat with all startups in the list
		for (Startup startupToTest : startups) {
			result = startupToTest.checkYourself(userGuess);
			
			if (result.equals("hit")) {
				break; // Exit the loop early, no point in testing the others
			}
			
			if (result.equals("kill")) {
				startups.remove(startupToTest); // This ones dead, so take it out of the startups list and exit the loop
				break;
			}
		} // close for
		
		System.out.println(result); // print the result for the user
	} // close method
	
	private void finishGame() {
		System.out.println("All Startups are dead! Your stock is now worthless");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses.");
			System.out.println("You got out before your options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options.");
		}
	}
	
	public static void main(String[] args) {
		StartupBust game = new StartupBust(); // Create the game object
		game.setUpGame(); // Tell the game object to set up the game
		game.startPlaying(); // Tell the main game object to start the main game play loop
	}
}