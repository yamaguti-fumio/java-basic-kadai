package kadai_18;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	public KatoTaro_Chapter18(String familyName, String address) {
		super(familyName, address);
		setGivenName();
	}

	public void setGivenName() {
		this.givenName = "太郎";
	}

	@Override
	public void eachIntroduce() {
		System.out.println("私はjavaが得意です");
	}

}
