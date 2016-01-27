//////////////////////////////////////
//Spirit.java
//Text based game for core night
//Jared Penner
//////////////////////////////////////

import java.util.Scanner;

class Spirit{

  public static void main(String args[]){

   Scanner sc = new Scanner(System.in);

   int health = 8, c = 1, o;  //o will be the variable for the user's answer
   String dName;
   boolean game = true, care = false;

   System.out.println("This is a text-based game designed to simulate the struggles of Lia Lee's family.  A scenario will be presented with options.  Type the number of the option you would like to choose.");
   System.out.print("Please type the name of your in-game daughter(no spaces) and press enter: ");
   dName = sc.next();
   System.out.println("You and "+dName+" have just arrived in a foreign land after being forced out of America by violence.  You have no belongings, no money, and you don't speak the native tongue.");

   while(health>0 && game){

    switch(c){
      case 1:
        System.out.println();
        System.out.println("A man in a uniform approaches you, and gestures for you and "+dName+" to follow.  He says something you do not understand.");
        System.out.println("Option 1: Go another direction.");
        System.out.println("Option 2: Follow the man.");
        System.out.print("Type 1 or 2 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
          c = 2;
        }
        else if(o == 2){
          c = 3;
          System.out.println("The man brings you to an apartment building and hands you keys to a small apartment.");
        }else{
          System.out.println("Please type 1 or 2 and press enter.");
        }
        break;

      case 2:
        health -= 1;
        System.out.println();
        System.out.println("You walk away with "+dName+" and it begins to get dark.  You find a park and settle down for the night. "+dName+" has a severe headache.");
        System.out.println("Option 1: Wait it out in the park.");
        System.out.println("Option 2: Go back to the man in uniform tomorrow.");
        System.out.print("Type 1 or 2 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
          c = 2;
          System.out.println(dName+" doesn't seem to be getting better.");
        }else if(o == 2){
          c = 1;
        }else{
          System.out.println("Please type 1 or 2 and press enter.");
        }
        break;

      case 3:
        System.out.println();
        health -= 1;
        if(health>4){
            System.out.println("You have settled in to your new apartment, and found that things are very different here. Western Medecine is not accepted. You feel very alone. "+dName+" gets a severe headache.");
        }
        if(health<=4){
            System.out.println(dName+" is very sick and has a very severe headache.");
        }
        System.out.println("Option 1: Go out and purchase some advil for "+dName+".");
        System.out.println("Option 2: Go to the local healer.");
        System.out.print("Type 1 or 2 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
          c = 3;
          System.out.println("The Advil doesn't seem to help.");
        }else if(o == 2){
          c = 4;
        }else{
          System.out.println("Please type 1 or 2 and press enter.");
        }
        break;

      case 4:
        System.out.println();
        System.out.println("You go to the local healer. He gives you tea leaves and roughly translates for you to give some to "+dName+". You go home.");
        System.out.println("Option 1: Give 1 cup to "+dName+".");
        System.out.println("Option 2: Give 1 cup a day to "+dName+".");
        System.out.println("Option 3: Don't give "+dName+" any because you don't trust the healer.");
        System.out.print("Type 1, 2 or 3 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
        	c = 6;
         	health += 1;
        }else if(o == 2){
            c = 5;
        }else if(o == 3){
            c = 5;
        }else{
          System.out.println("Please type 1, 2 or 3 and press enter.");
        }
        break;

      case 5:
        System.out.println();
        if(health < 5){
           System.out.println("Men in uniform knock on your door and take "+dName+" away. You don't know why. She is gone for a long time.");
           System.out.println("Finally "+dName+" comes home. She looks sicker.");
           health -= 1;
           c = 6;
        }else{
          c = 6;
        }
        break;

      case 6:
        System.out.println();
        System.out.println("You and "+dName+" are at home. She now has a bad cough in addition to her chronic headache.");
        System.out.println("Option 1: Give "+dName+" Advil and cough drops.");
        System.out.println("Option 2: Go back to the healer.");
        System.out.println("Option 3: Give "+dName+" more tea.");
        System.out.print("Type 1, 2 or 3 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
          c = 6;
          health -= 2;
        }else if(o == 2){
          c = 7;
        }else if(o == 3){
          c = 6;
     	  health -= 2;
        }else{
          System.out.println("Please type 1, 2 or 3 and press enter.");
        }
        break;

      case 7:
        System.out.println();
        System.out.println("The healer gives you a bag of beans, a bat wing, and bottle with a label you can't read. You can't understand his directions.");
        System.out.println("Option 1: Feed "+dName+" the bat wing.");
        System.out.println("Option 2: Give "+dName+" 1 bean a day and put the bat wing above her bed.");
        System.out.println("Option 3: Pour the contents of the bottle on "+dName+" and feed her the beans.");
        System.out.println("Option 4: Give "+dName+" nothing.");
        System.out.print("Type 1, 2, 3, or 4 and press enter: ");
        o = sc.nextInt();
        if(o == 1)health = 0;
        else if(o == 3 || o == 4){
          health -= 1;
     	  c = 8;
        }else if(o == 2){
          c = 9;
        }else{
          System.out.println("Please type 1, 2, 3, or 4 and press enter.");
        }
        break;

      case 8:
        System.out.println();
        System.out.println(dName+" is getting worse. The healer is able to translate that it doesn't look good.");
        System.out.println("Option 1: Find someone who will perform surgery.");
        System.out.println("Option 2: Give her to a care unit.");
        System.out.println("Option 3: Do nothing.");
        System.out.println("Type 1, 2, or 3 and press enter: ");
        o = sc.nextInt();
        if(o == 1 || o == 3){
          health = 0;
        }else if(o == 2){
          c = 10;
        }else{
          System.out.println("Please type 1, 2 or 3 and press enter.");
        }
        break;

      case 9:
        System.out.println();
        System.out.println(dName+" is getting better! The healer gives you more beans, herbs, and a dolphin's blowhole. You have no idea what his directions mean.");
        System.out.println("Option 1: Put the blowhole under "+dName+"'s bed, burn the herbs, and feed her the beans.");
        System.out.println("Option 2: Make soup with the blowhole, plant the beans, and burn the herbs.");
        System.out.println("Option 3: Feed "+dName+" the herbs, and plant the beans.");
        System.out.print("Type 1, 2 or 3 and press enter: ");
        o = sc.nextInt();
        if(o == 1){
          c = 11;
        }else if(o == 2 || o == 3){
          health = 0;
        }else{
          System.out.println("Please type 1, 2 or 3 and press enter.");
        }
        break;

      case 10:
        System.out.println();
        System.out.println(dName+" lives the rest of her life with a care unit. You get to visit every week.");
        game = false;
        care = true;
        break;

      case 11:
        System.out.println();
        System.out.println("Congratulations! "+dName+" survived!");
        game = false;
        break;
     }
    }
    if(health < 1){
    	System.out.println();
    	System.out.println(dName+" has died.  You lose.");
    }
   }
  }