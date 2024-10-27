package kadai_18;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		Kato_Chapter18 taro = new KatoTaro_Chapter18("加藤", "東京都中野区⚪×︎");
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18("加藤", "東京都中野区⚪×︎");
		Kato_Chapter18 hanako = new KatoHanako_Chapter18("加藤", "東京都中野区⚪×︎");

		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
	}
}
