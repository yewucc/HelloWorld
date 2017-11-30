package hello;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("CN", "�л����񹲺͹�");
		map.put("US", "��������ڹ�");
		map.put("UK", "���е߼�����������������");
		System.out.println(map.get("UK"));
		System.out.println("---------------");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		System.out.println("---------------");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println("---------------");
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}
}
