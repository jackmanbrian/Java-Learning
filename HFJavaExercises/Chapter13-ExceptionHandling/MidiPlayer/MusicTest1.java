import javax.sound.midi.*;

public class MusicTest1 {
	/* --------------------
		Play Method
	-------------------- */
	
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		} catch(MidiUnavailableException e) {
			System.out.println("Bummer");
		}
	}
	
	/* --------------------
		Main Method
	-------------------- */
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
	}
}