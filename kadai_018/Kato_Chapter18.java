package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName;//性を表す
	public String givenName;//名を表す
	public String address;//住所を表す
	
	
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
		System.out.println("住所は"+address+"です");
		
	};
	abstract public void eachIntroduce();
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	};
	
	
	
	

}
