package kadai_021;

import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {

	Map<String, String> map = new HashMap<>();
	{
		map.put("apple", "りんご");
		map.put("peach", "桃");
		map.put("banana", "バナナ");
		map.put("lemon", "レモン");
		map.put("pear", "梨");
		map.put("kiwi", "キウイ");
		map.put("strawberry", "いちご");
		map.put("grape", "ぶどう");
		map.put("muscat", "マスカット");
		map.put("cherry", "さくらんぼ");
	}

	public void searchWords(String[] wordsArray) {
		for (String word : wordsArray) {
			if (map.containsKey(word)) {
				System.out.println(word + "の意味は" + map.get(word));
			} else {
				System.out.println(word + "は辞書に存在しません");
			}

		}
	}
}
