package kadai_18;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	public String givenName = "一郎";

	public void setGivenName() {
		super.givenName = this.givenName;
	}

	@Override
	public void eachIntroduce() {
		System.out.println("好きな食べ物はりんごです");
	}

}
