import java.util.Scanner;

public class  Game {

public static void main(String[] Args){
	
	Scanner scan = new Scanner(System.in);
	int loc,m;

//Data
	
	Thing[] things;
	Room[] rooms;

	things = new Thing[10];
	rooms = new Room[10];

	things[1] = new Thing(1,"A handheld lamp","glowing magically",1,true);
	things[2] = new Thing(2,"A snake","emerald green",3,true);
	things[3] = new Thing(3,"An altar","sinisterly pitted and pockmarked",3,false);

	rooms[1] = new Room(1,"The entrance","Shadows of glory",0,0,0,0);
	rooms[2] = new Room(2,"The dungeon","Dark and cobwebby",0,0,0,0);
	rooms[3] = new Room(3,"The main hall","Oppressively vast",0,0,0,0);
	
	
//Begin
	
	System.out.println("Welcome to adventure!");
		
	while (true) {
		System.out.print(">");
		loc = scan.nextInt();
		rooms[loc].describe();
		for (m=1;m<4;m++){
			if (things[m].loc==loc & things[m].carry) things[m].describe();
			}	
		for (m=1;m<4;m++){
			if (things[m].loc==loc & !things[m].carry) things[m].describe();
			}	
	}
}// main()
} //Game

