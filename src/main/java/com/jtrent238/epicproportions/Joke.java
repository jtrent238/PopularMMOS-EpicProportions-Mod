package com.jtrent238.epicproportions;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.util.ChatComponentText;

public class Joke {

	static ArrayList<String> JokeAsk = new ArrayList<String>();
	static ArrayList<String> JokeAnswer = new ArrayList<String>();

	public void jokes(){
		JokeAsk.add(0, "What did Steve say when he was angry at a skeleton?");
		JokeAnswer.add(0, "I’ve got a bone to pick with you!");
		
		JokeAsk.add(1, "What do skeletons order at the village restaurant?");
		JokeAnswer.add(1, "Spare ribs");
		
		JokeAsk.add(2, "What kind of makeup do witches wear?");
		JokeAnswer.add(2, "Mas-scare-a");
		
		JokeAsk.add(3, "What did the zombie say to the villager?");
		JokeAnswer.add(3, "Nice to eat you.");
		
		JokeAsk.add(4, "Do you hear about the Minecraft movie?");
		JokeAnswer.add(4, "It’s a blockbuster.");
		
		JokeAsk.add(5, "What is a Creepers favorite food?");
		JokeAnswer.add(5, "Ssssssssalad");
		
		JokeAsk.add(6, "Why can’t the Ender Dragon ever understand a book?");
		JokeAnswer.add(6, "Because he always starts at the end.");
		
		JokeAsk.add(7, "How are ocelots like m&m’s?");
		JokeAnswer.add(7, "You can’t just have one.");
		
		JokeAsk.add(8, "What do witches put in their hair?");
		JokeAnswer.add(8, "Scare spray");
		
		JokeAsk.add(9, "Why didn’t the enderman cross the road?");
		JokeAnswer.add(9, "Because he teleported.");
		
		JokeAsk.add(10, "How do zombies get so good at Minecraft?");
		JokeAnswer.add(10, "DEADication.");
		
		JokeAsk.add(11, "Where does Steve rent movies?");
		JokeAnswer.add(11, "Blockbuster");
		
		JokeAsk.add(12, "What did Charlie Brown say when Steve broke his baseball bat?");
		JokeAnswer.add(12, "You Blockhead!");
		
		JokeAsk.add(13, "What kind of parties do Minecraft players have?");
		JokeAnswer.add(13, "Block parties.");
		
		JokeAsk.add(14, "What is Cobblestone’s favorite type of music?");
		JokeAnswer.add(14, "Rock music.");
		
		JokeAsk.add(15, "Why did the Creeper cross the road?");
		JokeAnswer.add(15, "To get to the other Sssssssssside");
		
		JokeAsk.add(16, "Where do miners sleep?");
		JokeAnswer.add(16, "On their bed-rocks");
		
		JokeAsk.add(17, "What was the name of the Minecraft boy band?");
		JokeAnswer.add(17, "New Kids on the Block.");
		
		JokeAsk.add(18, "Why can’t you score against Minecraft basketball players?");
		JokeAnswer.add(18, "They know how to block.");
		
		JokeAsk.add(19, "Why didn’t the skeleton like to fly?");
		JokeAnswer.add(19, "He had no guts");
		
		JokeAsk.add(20, "Why aren’t there cars in Minecraft?");
		JokeAnswer.add(20, "The streets are blocked off.");
		
		//JokeAsk.add(0, "");
		//JokeAnswer.add(0, "");

	}
@SubscribeEvent
public void PlayerEvent(PlayerEvent event) {


	int minimum = 0;
	double maximum = 21;
	int index = minimum + (int)(Math.random() * maximum); ;
	event.player.addChatComponentMessage(new ChatComponentText("§b§lHello" + " " + "§e§l" + event.player.getDisplayName() + JokeAsk.get(index)));
	System.out.println(index);
}

}