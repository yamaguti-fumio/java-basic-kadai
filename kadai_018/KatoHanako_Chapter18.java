package kadai_18;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	public String givenName = "花子";

	public void setGivenName() {
		super.givenName = this.givenName;
	}

	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}
