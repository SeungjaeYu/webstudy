package GameInter;

import java.util.Random;

   class ScissorsRockPaper implements Game {
	final static int SCISSOR = 1;
	final static int ROCK = 2;
	final static int Paper = 3;
	
	Random r = new Random();
	int me = r.nextInt(3)+1;
	

	

	public int startGame(int you) {
		if (this.me == you)
			return 2;
		else if (this.me - you == -2 || this.me - you == 1)
			return 3;
		else
			return 1;
	}	

}
