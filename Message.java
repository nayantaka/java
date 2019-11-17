/**
 * @(#)Message.java
 *
 *
 * @author 
 * @version 1.00 2019/11/17
 */


public class Message { // declare a class
String name, email, phone;
public Message(String theName, String theEmail, String thePhone){ // declare a constructor for initialization
	name = theName;
	email = theEmail;
	phone = thePhone;
}
void displayEmail(){ // declare a function
	System.out.println("Email:" + email);
}
void displayPhone(){ // declare a function
	System.out.println("Phone:" + phone);
}
public static void main(String[] args) { // main function
	Message JACK = new Message ("JACK", "JACK@xxx.xxx", "678-xxx-9999"); //create an object JACK,and call constructor
	System.out.println(JACK.name);
	JACK.displayEmail( ); // call a function
	Message ANDY = new Message ("ANDY", "ANDY@xxx.xxx", "567-xxx-0000"); //create an object ANDY, and call constructor
	System.out.println(ANDY.name);
	ANDY.displayPhone( ); // call a function
}
}