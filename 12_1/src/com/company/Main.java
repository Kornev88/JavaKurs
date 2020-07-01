package com.company;

public class Main {

    public static void main(String[] args) {
	Computer computer1 = new Computer("AMD Ryzen",16,4,2500);
	Computer computer2 = new Computer("Intel Core", 8,10,2000);
	Computer computer3 = new Computer("Intel Xeon",32,2,3500);




	Computer[] comps = {computer1,computer2,computer3};
		System.out.println(cheapComp(comps)+"  самый недорогой комп");
		System.out.println("===========Computer list==========================");
	for(int i=0;i<comps.length;i++){
	    System.out.println(comps[i].toString());
    }
	System.out.println("--------Compare---------");
	int compare=computer1.compareTo(computer2);
	System.out.println(computer1);
	if(compare!=0) {
		System.out.println((compare > 1) ? "больше" : "меньше: ");
	}else {
		System.out.println("равен");
	}
	System.out.println(computer2);

	}
	public static Computer cheapComp(Computer[] comps){
    	Computer minPrice = comps[0];
    	for(int i=0; i<comps.length; i++){
    		if(minPrice.price>comps[i].price){
    			minPrice=comps[i];
			}
		}
    	return minPrice;
	}
    }

