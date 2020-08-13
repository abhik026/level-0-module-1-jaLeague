package _05_for_loops._2_badgers;

public class BadgerSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for(int verse = 0; verse<2; verse++) {
				for(int i = 0; i<12; i++) {
					System.out.print("Badger, ");
				}
				System.out.println("\n");
				for(int e=0; e<2;e++) {
					System.out.print("Mushroom, ");
				}
				System.out.println("\n");
			}
			System.out.println("A Snake!");
	}

}
