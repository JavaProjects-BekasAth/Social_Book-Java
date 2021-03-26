import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		User u1 = new User("Makis", "iis1998@uom.edu.gr");
		User u2 = new User("Petros", "ics1924@uom.edu.gr");
		User u3 = new User("Maria", "iis2012@uom.edu.gr");
		User u4 = new User("Gianna", "iis19133@uom.edu.gr");
		User u5 = new User("Nikos", "dai1758@uom.edu.gr");
		User u6 = new User("Babis", "ics19104@uom.edu.gr");
		User u7 = new User("Stella", "dai1827@uom.edu.gr");
		User u8 = new User("Eleni", "ics2086@gmail.com");         
		
		Group g1 = new Group("WebGurus","A group for web passionates");
		ClosedGroup g2 = new ClosedGroup("ExamSolutions","Solutions to common examquestions"); 
		
		
		u1.addFriend(u2);
		u1.addFriend(u5);
		u5.addFriend(u6);
		u3.addFriend(u4);
		u3.addFriend(u2);
		u4.addFriend(u6);
		u5.addFriend(u3);
		u1.addFriend(u6);
		u5.addFriend(u2);
		u7.addFriend(u1);
		
		
		System.out.println("**************************************");
		
		System.out.println("Common friends of " + u5.getName() + " and " + u4.getName());
		
		System.out.println("**************************************");
		
		ArrayList<User> comFr = new ArrayList<User>();
		
		comFr = u5.commonFriends(u4);
		
		for(int i=0; i<comFr.size(); i++) {
			
			System.out.println(i+1 + ": " + comFr.get(i).getName());
		}
		
		System.out.println("--------------------------------------");
		
		
		System.out.println("**************************************");
		
		System.out.println("Common friends of " + u1.getName() + " and " + u5.getName());
		
		System.out.println("**************************************");
		
		comFr = u1.commonFriends(u5);
		
		for(int i=0; i<comFr.size(); i++) {
			
			System.out.println(i+1 + ": " + comFr.get(i).getName());
		}
		
		System.out.println("--------------------------------------");
		
		
		System.out.println("************************");
		
		u1.printFriends();
		
		System.out.println("-----------------------");
		
		
		System.out.println("************************");
		
		u3.printFriends();
		
		System.out.println("-----------------------");
		
		g1.addMember(u4);
		g1.addMember(u3);
		g1.addMember(u2);
		
		g2.addMember(u4);
		g2.addMember(u5);
		g2.addMember(u6);
		g2.addMember(u5);
		
		u4.printGroups();
		
		g1.printMembers();
		g2.printMembers();
		
		System.out.println("*******************************");
		
		System.out.println(u4.getName() + " has been infected. The following users have to be tested");
		
		ArrayList<User> people = new ArrayList<User>();
		
		people = u4.potentialInfected();
		
		System.out.println("*******************************");
		
		for(int i=0; i<people.size(); i++) {
			
			System.out.println(people.get(i).getName());
		}
		
		System.out.println("-----------------------------");

		  input.close();
	}

}
