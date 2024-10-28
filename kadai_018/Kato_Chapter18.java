package kadai_018;

public abstract class Kato_Chapter18 {

	// 姓を表す
	public String familyName = "加藤";
	// 名を表す
	public String givenName;
	// 住所を表す
	public String address = "東京都中野区⚪︎×";

	// 共通の紹介を出力する
	public void commonInteroduce() {
		System.out.println("私は" + familyName + " " + givenName + "です。");
		System.out.println("住所は" + address + "です。");
	}

	// 個別の紹介を行う抽象メソッド
	public abstract void eachIntroduce();

	// 紹介を実行するメソッド
	public void execIntroduce() {
		commonInteroduce();
		eachIntroduce();
	}

}
