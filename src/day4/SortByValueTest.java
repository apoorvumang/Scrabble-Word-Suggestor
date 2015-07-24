package day4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Test;

public class SortByValueTest {

	@Test
	public void test() {
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		map.put("abcd", 2);
		map.put("xyz", 1);
		SortByValue sortObj= new SortByValue(map);
		TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(sortObj);
		sorted_map.putAll(map);
		assertEquals("First element should be abcd", "abcd", sorted_map.firstEntry().getKey());
	}

}
