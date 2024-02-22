public class Honey {
	public static void main(String[] args) {
		Honey honeypot = new Honey(); // honeypot: 1 ref
		Honey[] ha = {honeyPot, honeyPot, honeyPot, honeyPot}; // honeypot: 5 refs
		Bees bees = new Bees(); // bees: 1 ref
		bees.beeHoney = ha; //honeypot = 9 refs
		Bear[] bears = new Bear[5]; //
		for (int i = 0; i < 5; i++) {
			bears[i] = new Bear(); // bear: 5 refs
			bears[i].hunny = honeyPot; //honeypot: 14 refs
		}
		Kit kit = new Kit(); // Kit: 1 ref
		kit.honey = honeyPot; //honeypot: 15 refs
		Raccoon raccoon = new Raccoon(); // Raccoon: 1 ref
		
		raccoon.rh = honeyPot; // honeypot: 16 refs
		raccoon.rk = kit; // honeypot: 15 refs
		kit = null; // honetpot: 12 refs
	}
}		