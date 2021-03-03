package com.store.manager;


public class Train {
	 
	private StringBuilder result ;
	
    public Train(String hpp) {
    	result = new StringBuilder();
    	getTrainFormat(hpp);
    }

    public String print() {
       
    	return result.toString();
    }
    
    private void getTrainFormat(String hpp) {
    	
    	char[] hppArray = hpp.toCharArray();
        int index=0;
        for (char c : hppArray)
        {
        	result.append(getStringValue(c, index));
			if(index < hppArray.length-1) 
				result.append("::"); 
			index++; 
        }
        
    }
    
    public String getStringValue(char c,int index) {
    	String result = "";
    	switch(c){
	    	case 'H':	if(index == 0)
	    			 		result =  "<HHHH";
	    		  		else
	    		  			result =  "HHHH>";
	    				break;
	    				
	    	case 'P': 	result =   "|OOOO|";
	    				break;
	    				
	    	case 'R': 	result =   "|hThT|";
	    			 	break;
	    			 	
	    	case 'C': 	result =  "|____|";	
	    			  	break;
	    			  	
    	}
    	return result;
    }

    public void detachEnd() {
    	try {
	    	int lastValueIndex = this.result.lastIndexOf("::");
	    	this.result.delete(lastValueIndex, this.result.length());
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    }

    public void detachHead() {
    	int headValueIndex = this.result.indexOf("::");
    	this.result.delete(0,headValueIndex + 2);
    }

    public boolean fill() {
    	boolean fillingAcheived = false;
    	int indexEmptyCargeo = this.result.indexOf("|____|");
    	if(indexEmptyCargeo != -1){
    		this.result.replace(indexEmptyCargeo, indexEmptyCargeo + 6, "|^^^^|");
    		fillingAcheived = true;
    	}
    	
        return fillingAcheived;
    }
}


