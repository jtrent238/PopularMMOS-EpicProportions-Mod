package com.jtrent238.epicproportions.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jtrent238.epicproportions.EpicProportionsMod;
import com.jtrent238.epicproportions.Joke;
import com.jtrent238.epicproportions.entity.EntityLuckyEgg;

import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class itemTellMeRandomJoke extends Item{


	//ArrayList<List<Integer>> JokeAsk = new ArrayList<List<Integer>>();
	//ArrayList<List<Integer>> JokeAnswer = new ArrayList<List<Integer>>();
	public static ArrayList<String> JokeList = new ArrayList<String>();
	public static ArrayList<String> AnswerList = new ArrayList<String>();
    //List<Integer> Jokes=new ArrayList<Integer>();
    //List<Integer> Answers=new ArrayList<Integer>();

	Random rand = new Random();
	
	public static void Jokes(){
		JokeList.add(0, "What did Steve say when he was angry at a skeleton?"); //Jokes.add(0);
		JokeList.add(1, "What do skeletons order at the village restaurant?"); //Jokes.add(1);
		JokeList.add(2, "What kind of makeup do witches wear?"); //Jokes.add(2);
		JokeList.add(3, "What did the zombie say to the villager?"); //Jokes.add(3);
		JokeList.add(4, "Do you hear about the Minecraft movie?"); //Jokes.add(4);
		JokeList.add(5, "What is a Creepers favorite food?"); //Jokes.add(5);
		JokeList.add(6, "Why can’t the Ender Dragon ever understand a book?"); //Jokes.add(6);
		JokeList.add(7, "How are ocelots like m&m’s?"); //Jokes.add(7);
		JokeList.add(8, "What do witches put in their hair?"); //Jokes.add(8);
		JokeList.add(9, "Why didn’t the enderman cross the road?"); //Jokes.add(9);
		JokeList.add(10, "How do zombies get so good at Minecraft?"); //Jokes.add(10);
		JokeList.add(11, "Where does Steve rent movies?"); //Jokes.add(11);
		JokeList.add(12, "What did Charlie Brown say when Steve broke his baseball bat?"); //Jokes.add(12);
		JokeList.add(13, "What kind of parties do Minecraft players have?"); //Jokes.add(13);
		JokeList.add(14, "What is Cobblestone’s favorite type of music?"); //Jokes.add(14);
		JokeList.add(15, "Why did the Creeper cross the road?"); //Jokes.add(15);
		JokeList.add(16, "Where do miners sleep?"); //Jokes.add(16);
		JokeList.add(17, "What was the name of the Minecraft boy band?"); //Jokes.add(17);
		JokeList.add(18, "Why can’t you score against Minecraft basketball players?"); //Jokes.add(18);
		JokeList.add(19, "Why didn’t the skeleton like to fly?"); //Jokes.add(19);
		JokeList.add(20, "Why aren’t there cars in Minecraft?"); //Jokes.add(20);
		
		//return Jokes;
	}
	public static void Answers(){
		AnswerList.add(0, "I’ve got a bone to pick with you!"); //Answers.add(0);
		AnswerList.add(1, "Spare ribs"); //Answers.add(1);
		AnswerList.add(2, "Mas-scare-a"); //Answers.add(2);
		AnswerList.add(3, "Nice to eat you."); //Answers.add(3);
		AnswerList.add(4, "It’s a blockbuster."); //Answers.add(4);
		AnswerList.add(5, "Ssssssssalad"); //Answers.add(5);
		AnswerList.add(6, "Because he always starts at the end."); //Answers.add(6);
		AnswerList.add(7, "You can’t just have one."); //Answers.add(7);
		AnswerList.add(8, "Scare spray"); //Answers.add(8);
		AnswerList.add(9, "Because he teleported."); //Answers.add(9);
		AnswerList.add(10, "DEADication."); //Answers.add(10);
		AnswerList.add(11, "Blockbuster"); //Answers.add(11);
		AnswerList.add(12, "You Blockhead!"); //Answers.add(12);
		AnswerList.add(13, "Block parties."); //Answers.add(13);
		AnswerList.add(14, "Rock music."); //Answers.add(14);
		AnswerList.add(15, "To get to the other Sssssssssside"); //Answers.add(15);
		AnswerList.add(16, "On their bed-rocks"); //Answers.add(16);
		AnswerList.add(17, "New Kids on the Block."); //Answers.add(17);
		AnswerList.add(18, "They know how to block."); //Answers.add(18);
		AnswerList.add(19, "He had no guts"); //Answers.add(19);
		AnswerList.add(20, "The streets are blocked off."); //Answers.add(20);
		
		//return Answers;
	}

	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {

		int jokeMax = 20;
		int jokeMin = 0;
        Random random = new Random();
        int randomJoke = rand.nextInt((jokeMax - jokeMin) + 1) + jokeMin;
        
        if(EpicProportionsMod.ENABLE_DEVLOGGING == true) {
        	System.out.println("Selected Joke: " + randomJoke);
        }
        
			System.out.println(JokeList.get(randomJoke));
			System.out.println(JokeList.get(randomJoke));
		
    	//if(jokeasked == false){
    		//p_77659_3_.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + TheJoke.toString()));
    		//System.out.println(JokeList.get(i));
    		//jokeasked = true;
    	//}
    	//if(jokeasked == true){
    		//p_77659_3_.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.YELLOW + TheAnswer.toString()));
    		//System.out.println(TheAnswer.toString());
    		//jokeasked = false;
    	//}
		return p_77659_1_;
    }
	}