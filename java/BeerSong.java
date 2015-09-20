public class BeerSong{
	public static void main(String[] args) {
		int beerNum = 5;
		String word ="bottles";

		while(beerNum>= 0){
			if (beerNum==1){
			word ="bottle";
		}
		if(beerNum > 0){
			System.out.println(beerNum+" "+word+" of beer on the wall");
			System.out.println("Take one down.;");
			System.out.println("Pass it around.");
		}else{
			System.out.println("NO more beer bottles on the wall");
		}
		beerNum = beerNum - 1;

		}

	}
}