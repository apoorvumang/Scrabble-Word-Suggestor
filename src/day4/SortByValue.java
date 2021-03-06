package day4;

import java.util.Comparator;
import java.util.Map;

public class SortByValue implements Comparator<String> {

	    Map<String, Integer> base;
	    public SortByValue(Map<String, Integer> base) {
	        this.base = base;
	    }
	    public int compare(String a, String b) {
	        if (base.get(a) > base.get(b)) {
	            return -1;
	        } 
	        else if(base.get(a) == base.get(b)){
	        	return 1;
	        }
	        else {
	            return 1;
	        } 
	    }
	}

