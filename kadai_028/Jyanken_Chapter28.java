package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	double randomken;
	int result;
	String[] jyanken = { "r", "s", "p" };
	boolean roop = true;
	public HashMap<String, String> Battle = new HashMap<String, String>();

	public String getMyChoice() {
		String input = "";
		System.out.println("自分のじゃんけんの手を入力しましょう");

		while (roop) {
			Scanner scanner = new Scanner(System.in);

			//入力した内容を取得する
			input = scanner.next();
			System.out.println(input);

			for (int i = 0; i < 3; i++) {

				if (input.equals(jyanken[i])) {
				
			      roop = false;
			      scanner.close();

				}
			}
			
			if(roop == true) {
				System.out.println("正しいじゃんけんの手ではないのでもう一度入力してください");
			}
			

		}
		
		return input;
	}

	public String getRandom() {

		randomken = Math.random() * 3;
		result = (int) Math.floor(randomken);

		return jyanken[result];
	}

	public void playGame() {

		Battle.put("r", "グー");
		Battle.put("s", "チョキ");
		Battle.put("p", "パー");

		String player = getMyChoice();
		String opponent = getRandom();

		System.out.println("自分の手は" + Battle.get(player) + "相手の手は" + Battle.get(opponent) + "です");
		if (player.equals(opponent)) {

			System.out.println("あいこです");

		} else if (player.equals("r") && opponent.equals("s") || player.equals("s") && opponent.equals("p")
				|| player.equals("p") && opponent.equals("r")) {

			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}

	}

}
