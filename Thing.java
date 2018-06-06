//Thing.java

public class Thing {

int nr;
String name;
String desc;
int loc;


public Thing(int nr, String na, String d, int  l){
	this.nr=nr;
	this.name=na;
	this.desc=d;
	this.loc=l;
} //Thing()

public void describe(){
	System.out.println(this.name);
	System.out.println(this.desc);
}  //describe()

} //Thing
