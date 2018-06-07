//Thing.java

public class Thing {

int nr;
String name;
String desc;
int loc;
boolean carry;

public Thing(int nr, String na, String d, int  l, boolean carry){
	this.nr=nr;
	this.name=na;
	this.desc=d;
	this.loc=l;
	this.carry=carry;
} //Thing()

public void describe(){
	System.out.print(this.name); System.out.print(" - ");
	System.out.println(this.desc);
}  //describe()

} //Thing
