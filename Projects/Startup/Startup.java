import java.util.ArrayList;

public class Startup {
	private ArrayList<String> locationCells;
	private String name;
	// private int numOfHits;
	// Don't need to track this yet
	
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput) {
		String result = "miss";
		// indexOf() method: if user guess matches, returns list location. Otherwise it returns -1
		int index = locationCells.indexOf(userInput); 
		
		if (index >= 0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			} // end if
		} // end outer if
		return result;
	}	
}