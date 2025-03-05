import java.util.Scanner;
import java.util.ArrayList;
public class Madlib
{
    public static void main(String[] args)
    {
        // boolean to see if user wants to play again ( initiates true ) and if not ( initiates false and breaks.)
        
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate ArrayLists for nouns, adjectives, verbs, colors, food, and locations, etc.
        
        ArrayList<String> noun = new ArrayList<String>();
        ArrayList<String> adj = new ArrayList<String>();
        ArrayList<String> verb = new ArrayList<String>();
        ArrayList<String> color = new ArrayList<String>();
        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> loc = new ArrayList<String>();
        ArrayList<String> obj = new ArrayList<String>();
        ArrayList<String> action = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> strt = new ArrayList<String>();
        ArrayList<String> exThing = new ArrayList<String>();
        ArrayList<String> lrgTh = new ArrayList<String>();
        ArrayList<String> carT = new ArrayList<String>();
        ArrayList<String> state = new ArrayList<String>();
        ArrayList<String> num = new ArrayList<String>();
        ArrayList<String> date = new ArrayList<String>();
        ArrayList<String> emo = new ArrayList<String>();
        ArrayList<String> time = new ArrayList<String>();
        ArrayList<String> pluralobj = new ArrayList<String>();
        ArrayList<String> show = new ArrayList<String>();
        ArrayList<String> event = new ArrayList<String>();

        // Welcome Message and credits
        
        System.out.println("Welcome to our Madlib app!");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Credits:");
        System.out.println("Henry \nWilliam \nZoe \nSanthosh \nKirubashinilakshana \nReed ");
        System.out.println("Donations ARE accepted at Bitybooce on Roblox Pls Donate");
        System.out.println("------------------------------------------------------------------------------------------");
        
        while(loop) {
            loop = false;
            
            // Story Selection
            
            System.out.println("There are four stories that you can choose from. \n Your options are sci-fi, horror, comedy, and mystery. \n type 1 for sci-fi, 2 for horror, 3 for comedy, and 4 for mystery.");
            
            //this will decide which story you picked
            
            Integer story = scanner.nextInt();
            scanner.nextLine();
        
                // if user presses 1, then the sci-fi story would be picked and would ask inputs according to the sci-fi story.
        
            if(story == 1) {
                System.out.println("Sci-fi has been selected");
                
                // These take in input from the user and store it into its specific array
                
                
                loc(loc, scanner);
                action(action, scanner);
                name(name, scanner);
                obj(obj, scanner);
                exThing(exThing, scanner);
                strt(strt, scanner);
                emo(emo,scanner);
                lrgTh(lrgTh, scanner);
                name(name, scanner);
                name(name, scanner);
                carT(carT, scanner);
                food(food, scanner);
                time(time,scanner);
                emo(emo, scanner);
                emo(emo,scanner);
                
                // the .get() method makes it so we can take whatever we want that is stored in the array.
                
                // string concatination with adding in all user inputs from arrays into the story.
                
                System.out.println("In the vast land of " + loc.get(0) + ", where the wind sang songs and the birds " + action.get(0) + ", a young superhero named " + name.get(0) + " stood at the end of a " + obj.get(0) + ", gazing at the moon.");
                System.out.println("Her cape whipped in the wind as she traced the " + exThing.get(0) + " in her hand, knowing that stealing it was the worst decision she'd ever made. She turned and headed to the hidden " + strt.get(0) + " to make the final transfer, where she would finally have all she needed to leave her dark past behind she felt very " + emo.get(0) + ".");
                System.out.println("Just as she was about to drop the " + exThing.get(0) + ", a loud noise startled her. Turning around, she found her only happy memory from the past, a " + lrgTh.get(0) + ", smashed on the ground.");
                System.out.println("Tears filled her eyes as she realized who would dare do this: her father, " + name.get(1) + ", the man who'd never been there when she needed him. 'I knew you'd come back,' he said coldly.");
                System.out.println("Enraged, " + name.get(0) + " called her friend " + name.get(2) + ", telling her it was time to take away what he loved most: his " + carT.get(0) + ". The plan was to smash it into a large " + lrgTh.get(0) + " and cover it with rotten " + food.get(0) + ".");
                System.out.println("That night, she snuck into his house, grabbed the car keys, and drove the " + carT.get(0) + " to the fence.");
                System.out.println("As she crashed it into the " + lrgTh.get(0) + ", and covered it with rotten "+ food.get(0) + " which so happened to be his favourite food she felt so "+ emo.get(1) +", she could only imagine her father's reaction when he discovered what she had done. Her father came by " + time.get(0) +" later and was very " + emo.get(2) + "." );

            } else if(story == 2) {
                System.out.println("Horror has been selected");
                
            
                name(name,scanner);
                state(state,scanner);
                adj(adj, scanner);
                adj(adj,scanner);
                name(name,scanner);
                noun(noun, scanner);
                num(num,scanner);
                verb(verb, scanner);
                adj(adj, scanner);
                loc(loc, scanner);
                emo(emo,scanner);
                time(time,scanner);
                adj(adj,scanner);
                name(name,scanner);
                verb(verb,scanner);
                time(time,scanner);
                
                
                System.out.println("In the small town of " + name.get(0) + ", in the state of " + state.get(0) + ", where the weather is always " + adj.get(0) + " and the people are " + adj.get(1) + ", there is a girl named " + name.get(1) + ", who has recently moved into the town.");
                System.out.println("She moved to seek a new life, somewhere peaceful where she could get away from the "+ noun.get(0 )+". It has been "+ num.get(0) + " days since she has moved into the town and she was starting to get used to the town, it was time , and she was "+ verb.get(0) + " to her new house. She was so "+ adj.get(2) + " that she could finally get back home after her long day at the "+ loc.get(0) +".");
                System.out.println("She walked in her house and felt so " + emo.get(0) + ", but immediately she felt that something was off, she decided to ignore the feeling and though that she was just being paranoid. But within a few "+ time.get(0) +" she started to hear whispers coming from behind her room in a house.");
                System.out.println("She felt shivers running down her spine, she lived alone. She got closer to see if she was really hearing what she was hearing, and she was correct. The whispers were " + adj.get(3) + ".");
                System.out.println("She carefully put her ear against the door, and right as she did the whispers turned into a shrill scream. It was deafening, she tried to " + verb.get(1) + " out of the house and in the process she took out her phone and tried to call a nice old neighbour named "+ name.get(2) + ", but the door was locked, leaving her and the thing behind the door alone. She was trapped and unable to " + verb.get(0) + " Years later the house became abandoned and to this day nobody knows what happened to the girl and that house… It was also said to be that "+ name.get(2) +" who came a " + time.get(1) + " after she recieved the call from "+ name.get(1) +" to the house was never to be seen even to this day.");
                
            } else if(story == 3) {
                System.out.println("Comedy has been selected");
                
         
                date(date, scanner);
                noun(noun, scanner);
                adj(adj, scanner);
                emo(emo, scanner);
                noun(noun, scanner);
                date(date, scanner);
                obj(obj, scanner);
                adj(adj, scanner);
                pluralobj(pluralobj, scanner);
                loc(loc, scanner);
                noun(noun, scanner);
                exThing(exThing, scanner);
                pluralobj(pluralobj, scanner);
                show(show, scanner);
                adj(adj,scanner);
                obj(obj, scanner);
                
                System.out.println("In " + date.get(0) +", the Titanic, a massive " + noun.get(0) +" built to be 'unsinkable,' set sail on its " + adj.get(0) + " voyage. Everyone on board was feeling pretty " + emo.get(0) + " about their trip — after all, what could go wrong on a ship that was basically the equivalent of a floating luxury " + noun.get(1) + "?");
                System.out.println("But then, on the night of " + date.get(1) +", disaster struck. The Titanic hit a(n) " + obj.get(0) + ", and within a few hours, it was at the bottom of the ocean.");
                System.out.println("The whole thing was probably a little like a bad reality show: 'Watch as this " + adj.get(1) + " ship, which everyone thought was invincible, sinks in front of an audience of rich " + pluralobj.get(0) + " trying to get to " + loc.get(0) +".' If only they had a 'Titanic for " + noun.get(2) + "' guide, maybe they would've known that, you know, avoiding icebergs is kind of important.");
                System.out.println("As the ship went down, there were reportedly a lot of people who were more concerned with finding their " + exThing.get(0) + " than actually getting into lifeboats. The rich passengers were reportedly screaming about their " + pluralobj.get(1) + " while the crew was scrambling to lower the lifeboats—like a weird version of '" + show.get(0) + ",' where the people who were supposed to survive were too busy packing their fancy clothes.");
                System.out.println("In the end, the Titanic's 'unsinkable' reputation sank " + adj.get(2) + " like the ship itself, and it became a cautionary tale for anyone who's ever thought, 'Hey, I don't need a life jacket, I'm on a luxury " + obj.get(1) + ".");
                
            } else if(story == 4) {
                
                System.out.println("Mystery has been selected");
                
                
                name(name, scanner);
                verb(verb,scanner);
                strt(strt, scanner);
                name(name, scanner);
                event(event,scanner);
                exThing(exThing,scanner);
                emo(emo,scanner);
                name(name,scanner);
                name(name, scanner);
                food(food, scanner);
                adj(adj, scanner);
                pluralobj(pluralobj, scanner);
                pluralobj(pluralobj, scanner);
                time(time,scanner);
                time(time,scanner);
                
                
                System.out.println("Detective " + name.get(0) + " stood at the edge of the decaying " + strt.get(0) + ", feeling a strange unease as she approached the site of a long-unsolved case: a woman named " + name.get(1) + " vanished hours ago after the " + event.get(0) + ". In the " + strt.get(0) + " detective " + name.get(0) + " looked around the area and seemed to have run into a " + exThing.get(0) + " she quickly realized that it was owned by the victim.");
                System.out.println("Confused by the situation and having no big leads she felt very " + emo.get(0) + ", she called in a friend named " + name.get(2) + " who was " + verb.get(0) + ". She then heard...");
                System.out.println("The whispering from within, the fresh smell of " + food.get(0) + " leading to the cellar, and the heavy air hinted at " + adj.get(0) + " secrets still buried in the " + strt.get(0) + ".");
                System.out.println("In the cellar, " + name.get(0) + " uncovered an old chest filled with " + pluralobj.get(0) + " in the cellar she also saw many " + pluralobj.get(0) + " aswell addressed to her, each one hinting at forgotten truths. As she read the final truth, a voice echoed in the darkness behind her: 'I knew you'd come. The truth has always been waiting for you, Detective.' " + name.get(0) + " spun around but found nothing.");
                System.out.println("Then, a figure appeared named—" + name.get(3) + ", her face twisted by time. She remembered a person named " + name.get(3) + " in a case that was a " + time.get(0) + " ago. 'You do not remember, do you?' " + name.get(3) + " whispered. The truth hit " + name.get(0) + " like a shockwave: the " + strt.get(0) + " was not abandoned, and the case had never been solved. This was her past, and it was catching up with her. After the scene, it was said that " + name.get(2) + " never came and was found missing " + time.get(1) + " later....");
            } else {
                System.out.println("Please select one of the above options");
            }
        
            System.out.println("\nWould you like to go again? yes / no");
            String play = scanner.nextLine();
            if(play.equalsIgnoreCase("yes")){
                loop = true;
                
                // clears all the arrays once user types yes to play again.
                
                // this is so existing nouns,verbs,etc that were added don't intefere with the new stories inputs.
                
                noun.clear();
                adj.clear();
                verb.clear();
                color.clear();
                food.clear();
                loc.clear();
                obj.clear();
                action.clear();
                name.clear();
                strt.clear();
                exThing.clear();
                lrgTh.clear();
                carT.clear();
                state.clear();
                num.clear();
                date.clear();
                emo.clear();
                pluralobj.clear();
                show.clear();
                event.clear();
            } else {
                loop = false;
            }
        }
    }
        
    // These are all methods made to handle all the topics on the user input that ask the question and stores it into the corresponding array.
    
    // The .toUpperCase() is used so that the user can easily identify what was their words they added into the story.
    
     static void adj(ArrayList<String> adj, Scanner scanner) {
        System.out.println("Enter an adjective: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        adj.add(wordIn);
    }

     static void verb(ArrayList<String> verb, Scanner scanner) {
        System.out.println("Enter a verb: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        verb.add(wordIn);
    }

     static void food(ArrayList<String> food, Scanner scanner) {
        System.out.println("Enter a name of a food: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        food.add(wordIn);
    }

     static void loc(ArrayList<String> loc, Scanner scanner) {
        System.out.println("Enter a location: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        loc.add(wordIn);
    }
    
     static void color(ArrayList<String> color, Scanner scanner) {
        System.out.println("Enter a color: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        color.add(wordIn);
    }
     static void noun(ArrayList<String> noun, Scanner scanner) {
        System.out.println("Enter a noun: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        noun.add(wordIn);
    }
    static void obj(ArrayList<String> obj, Scanner scanner) {
        System.out.println("Enter an object: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        obj.add(wordIn);
    }
    static void action(ArrayList<String> action, Scanner scanner) {
        System.out.println("Enter an action: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        action.add(wordIn);
    }
    static void name(ArrayList<String> name, Scanner scanner) {
        System.out.println("Enter a name (personal name of an animal or human, not 'fox', but 'Bill'): ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        name.add(wordIn);
    }
    static void strt(ArrayList<String> strt, Scanner scanner) {
        System.out.println("Enter a structure (type of building or specific building): ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        strt.add(wordIn);
    }
    static void exThing(ArrayList<String> exThing, Scanner scanner) {
        System.out.println("Enter an expensive object: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        exThing.add(wordIn);
    }
    static void lrgTh(ArrayList<String> lrgTh, Scanner scanner) {
        System.out.println("Enter a large thing: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        lrgTh.add(wordIn);
    }
    static void carT(ArrayList<String> carT, Scanner scanner) {
        System.out.println("Enter a type of a car: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        carT.add(wordIn);
    }
    static void state(ArrayList<String> state, Scanner scanner) {
        System.out.println("Enter a state: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        state.add(wordIn);
    }
    static void num(ArrayList<String> num, Scanner scanner) {
        System.out.println("Enter a number: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        num.add(wordIn);
    }
    static void date(ArrayList<String> date, Scanner scanner) {
        System.out.println("Enter a date: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        date.add(wordIn);
    }
    static void emo(ArrayList<String> emo, Scanner scanner) {
        System.out.println("Enter an emotion: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        emo.add(wordIn);
    }
    static void time(ArrayList<String> time, Scanner scanner) {
        System.out.println("Enter a measurement of time: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        time.add(wordIn);
    }
    static void pluralobj(ArrayList<String> pluralobj, Scanner scanner) {
        System.out.println("Enter a plural object (an object in its plural form): ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        pluralobj.add(wordIn);
    }
    static void show(ArrayList<String> show, Scanner scanner) {
        System.out.println("Enter a TV show: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        show.add(wordIn);
    }
    static void event(ArrayList<String> event, Scanner scanner) {
        System.out.println("Enter a event/celebration, ex: birthday part,etc: ");
        String wordIn = scanner.nextLine();
        wordIn  = wordIn.toUpperCase();
        event.add(wordIn);
        }
}
