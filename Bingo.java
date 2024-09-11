package pertemuanempat;

public class Bingo {
	 public Bingo() {tampilkanLirik();
	    }

	    public void tampilkanLirik() {
	        String lirikAwal = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";
	        String[] bingo = {"B", "I", "N", "G", "O"};

	        tampilkanBagian(lirikAwal, bingo, 0);

	        for (int i = 1; i <= 5; i++) {
	            tampilkanBagian(lirikAwal, bingo, i);
	        }
	    }

	    private void tampilkanBagian(String lirikAwal, String[] bingo, int jumlahClap) {
	        System.out.println(lirikAwal);

	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < bingo.length; j++) {
	                if (j < jumlahClap) {
	                    System.out.print("(clap)-");
	                } else {
	                    System.out.print(bingo[j] + "-");
	                }
	            }
	            System.out.println(); 
	        }

	        System.out.println("And Bingo was his name-o.\n");
	    }

}
