package com.arraylist;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayListString as= new ArrayListString();
        as.add("Hello");
        //System.out.println(as.length);

        as.add("World");
        as.add("!");
        as.add("This is just to");
        as.add("test the increase function");

        System.out.println(as);

        as.remove(2);
        System.out.println(as);

         
    }
}
