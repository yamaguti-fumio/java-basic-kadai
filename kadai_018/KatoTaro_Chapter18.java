package kadai_18;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	public String givenName = "太郎";

	public void setGivenName() {
		super.givenName = this.givenName;

	}

	@Override
	public void eachIntroduce() {
		System.out.println("私はjavaが得意です");
	}

}
