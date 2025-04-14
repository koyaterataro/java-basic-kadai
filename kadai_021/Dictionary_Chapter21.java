package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	// public ArrayList<String>  Word= new ArrayList<String>();
	 public HashMap<String,String> Dictionary = new HashMap<String,String>();

	 
	public void put() {
		
		 Dictionary.put("apple","リンゴ");
		 Dictionary.put("peach","桃");
		 Dictionary.put("banana","バナナ");
		 Dictionary.put("lemon","レモン");
		 Dictionary.put("pear","梨");
		 Dictionary.put("kiwi","キウイ");
		 Dictionary.put("strawberry","いちご");
		 Dictionary.put("grape","ぶどう");
		 Dictionary.put("muscut","マスカット");
		 Dictionary.put("cherry","さくらんぼ");
		
	}
	
	public void dictionary(String[] word) {
		
		
	for(int i = 0; i<word.length;i++) {
		
		if(Dictionary.get(word[i]) != null) {
			System.out.println(word[i]+"の意味は"+Dictionary.get(word[i]));
		
		}else {
			System.out.println(word[i]+"は存在しません");
			
		}
		
		
		
	}
		
		
		
		
	
			
		
		
		
	}
	
}
