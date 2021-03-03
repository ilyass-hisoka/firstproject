package com.store.manager;

import java.util.List;
import java.util.Optional;

public class Train {
	 
	
	private List<Wagon> wagons ;
	
    public Train(String hpp) {
    	wagons = WagonsFactory.createWagons(hpp);
    	
    }

    public String print() {
    	StringBuilder result = new StringBuilder(wagons.stream().map(a -> a.getNameWagon()).reduce("",(a,b) -> a + "::" + b ));
    	result.delete(0, 2);
    	return result.toString();
    }
    
    public void detachEnd() {
    	wagons.remove(wagons.size() - 1);
    }

    public void detachHead() {
    	wagons.remove(0);
    }

    public boolean fill() {
    	Optional<Wagon> wagon = wagons.stream().filter((a) -> a.getNameWagon().equals("|____|")).findFirst();
    	wagon.ifPresent(a -> a.setNameWagon("|^^^^|"));
    	return wagon.isPresent();
    }
}


