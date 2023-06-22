import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapLesson {

	public static void main(String[] args) {
		Map<String,Integer>prefs = new HashMap<String,Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都",1261);
		prefs.put("熊本県",181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は、"+tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県",182);
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は、"+kumamoto);
		System.out.println(prefs.size());
		if(prefs.containsKey("東京都")) {
			System.out.println("OK");
		}
		if(prefs.containsValue(182)) {
			System.out.println("OK");
		}
		Set<String>keys =prefs.keySet();
		System.out.println(keys);

		Collection<Integer> vals= prefs.values();
		System.out.println(vals);

		for(String key : prefs.keySet()) {
			System.out.printf("都道府県名%s,人口%d%n",key,prefs.get(key));
		}
	}

}
