package kadai_18;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public KatoHanako_Chapter18(String familyName, String address) {
		super(familyName, address);
		setGivenName();
	}

	public void setGivenName() {
		this.givenName = "花子";
	}

	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
