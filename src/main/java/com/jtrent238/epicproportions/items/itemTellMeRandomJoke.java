package com.jtrent238.epicproportions.items;

import com.jtrent238.epicproportions.Joke;

import net.minecraft.item.Item;

public class itemTellMeRandomJoke extends Item{


	
	public void joke() {
	    
    	System.out.println("Woof!");
  }
	
	
	
	public static void main(String[] args) {

	    Joke randomJoke = new Joke(0);
	    
	    
	    int myJoke = randomJoke.getJoke();
	    		System.out.println(myJoke);
	    		
	    
		}
	}