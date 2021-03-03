package com.store.manager;

import java.util.ArrayList;
import java.util.List;

public class WagonsFactory {

	public static List<Wagon> createWagons(String hpp) {
		int headWagonCount = 0;
		List<Wagon> list = new ArrayList<Wagon>();
		for( char c : hpp.toCharArray())
			switch(c){
	    	case 'H':	headWagonCount++;
	    	   			if (headWagonCount == 1)
	    	   				list.add(new Wagon("<HHHH"));
	    	   			else 
	    	   				list.add(new Wagon("HHHH>"));
	    	   			break;
	    				
	    	case 'P': 	list.add(new Wagon("|OOOO|"));
	    				break;
	    				
	    	case 'R': 	list.add(new Wagon("|hThT|"));
	    			 	break;
	    	case 'C': 	list.add(new Wagon("|____|"));	  
	    				break;
	}	
		return list;
	}
}
