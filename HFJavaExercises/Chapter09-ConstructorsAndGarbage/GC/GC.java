public class GC {
	
	public static GC doStuff() {
		GC newGC = new GC(); // creates a GC object
		doStuff2(newGC); // calls doStuff2() and uses the above GC object reference (newGC) as an input
		return newGC; // return the newGC object reference
	}
	
	public static void doStuff2(GC copyGC) {
		GC localGC = copyGC; // GC object reference localGC copies the GC object reference pulled from doStuff
	}
	
	// Will comment what happens in the code when the below are run
	public static void main(String[] args) {
		GC gc1; // creates an object reference called Gc1 but doesn't assign it an object
		GC gc2 = new GC(); // creates an object reference called Gc1 but doesn't assign it an object
		GC gc3 = new GC(); // creates an object reference called Gc1 but doesn't assign it an object
		GC gc4 = gc3; // Creates an object reference called gc4 which points to the same object as gc3
		gc1 = doStuff();
		
		// Answers to exercise questions with explanations of what each line will do
		copyGC = null; // no: Since this is a variable that is only mentioned in a method, it will fail to compile since there's no object type declared
		gc2 = null; // yes: This sets the gc2 object reference to null. The object which it referenced will now be eligible for Garbage collection. 
		newGC = gc3; // no:Creates a new object reference, which refers to the same object as gc3. no object being collected. 
		gc1 = null; // yes: This sets the gc1 object reference to null. The object which it referenced will now be eligible for Garbage collection
		newGC = null; //no: out of scope reference variable name
		gc4 = null; // no: Gc4 is the second object referenced and shared with the gc3 object. The object will persist.
		gc3 = gc2; // no: gc4 will still reference the object so it will not be garage collected 
		gc1 = gc4; // yes: gc1 previously referenced the object created in doStuff(). Now, it will referene the same object as gc4 and gc3
		gc3 = null;	// no: gc4 will still reference the object so it will not be garage collected
		// add more here
	}
}