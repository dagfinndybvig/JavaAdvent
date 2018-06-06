import java.util.Scanner;

public class  Game {

public static void main(String[] Args){
	
	Scanner scan = new Scanner(System.in);
	int loc;

	Thing[] things;
	Room[] rooms;

	things = new Thing[10];
	rooms = new Room[10];

	things[1] = new Thing(1,"A handheld lamp","glowing magically",1);
	things[2] = new Thing(2,"A snake","emerald green",2);

	rooms[1] = new Room(1,"The main hall","Shadows of glory",0,0,0,0);
	rooms[2] = new Room(2,"The dungeon","Dark and cobwebby",0,0,0,0);
	
	System.out.println("Welcome to adventure!");
	
	while (true) {
		loc = scan.nextInt();
		rooms[loc].describe();
		things[loc].describe();
		}	
	}	
}

