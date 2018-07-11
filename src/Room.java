public class Room {

int number;
String name;
String desc;
int e,w,n,s;

public Room(int nr,String na, String d, int e, int w, int n, int s){
	this.number=nr;
	this.name=na;
	this.desc=d;
	this.e=e;
	this.w=w;
	this.n=n;
	this.s=s;
}//Room()

public void describe(){
	System.out.println(this.name);
	System.out.println(this.desc);
} //Desc()

} //Room


