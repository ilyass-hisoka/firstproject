package com.ily.firstproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<String> list = new ArrayList<String>();
        
        list.add("ilyass");
        list.add("jawad");
        list.add("simo");
        
        List<String> list2 = list.stream().filter(t -> t.equals("ilyass")).collect(Collectors.toList());
        
        list2.stream().forEach(System.out::println);
    }
}
