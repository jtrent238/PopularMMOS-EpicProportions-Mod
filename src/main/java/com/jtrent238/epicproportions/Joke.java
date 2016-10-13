package com.jtrent238.epicproportions;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

public class Joke {

	int askjoke;
	String Joke_Ask;
	String Joke_Answer;
	private String jokeNumber;



	public Joke(int jokeNumber) {
		
		askjoke = jokeNumber;
	}

	
	
	public int getJoke() {
		
		return askjoke;
	}
		


{

switch (askjoke){


	case 0:
		Joke_Ask = "What is invisible and smells like carrots?";
		Joke_Answer = "Rabbit farts";

	case 1:
		Joke_Ask = "What did the worker at the rubber band factory say when he lost his job?";
		Joke_Answer = "OH SNAP";
	
	case 2:
		Joke_Ask = "What do calendars eat?";
		Joke_Answer = "DATES!";
	
	case 3:
		Joke_Ask = "How much does a pirate pay for corn?";
		Joke_Answer = "A buccaneer!";

}

		System.out.println(Joke_Ask);
			System.out.println(Joke_Answer);
 

}


@SubscribeEvent
public void PlayerEvent(PlayerEvent event) {

	event.player.addChatComponentMessage(new ChatComponentText("§b§lHello" + " " + "§e§l" + event.player.getDisplayName() + askjoke(1)));
	
}



private String askjoke(int i) {
	
	return jokeNumber;
}


}