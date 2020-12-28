import java.util.ArrayList;

public class User {

	private String name;
	private String email;
	ArrayList<User> friends = new ArrayList<User>();
	ArrayList<Group> groups = new ArrayList<Group>();
	
	
	public User(String name, String email) {
		
		this.name = name;
		this.email = email;
	}

	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isFriendWith(User aUser) {
		
		if(this.equals(aUser)) {
			System.out.println("You can not be friends with yourshelf.");
		}
		
		if (friends.contains(aUser)) 
			return true;
		
		return false;
			
	}
	
	public void addFriend(User aUser) {
		
		if(aUser.equals(this))
			System.out.println("You can not be friends with yourshelf.");
		
		else if(friends.contains(aUser))
			System.out.println(aUser.getName() + " and " + this.name + " are already friends.");
		
		else {
			friends.add(aUser);
			aUser.friends.add(this);
			System.out.println(this.name + " and " + aUser.name + " are now friends!");
		}
	}
	
	public ArrayList<User> commonFriends(User aUser) {
		
		ArrayList<User> commonFriends = new ArrayList<User>();
		
		for(int i=0; i < this.friends.size(); i++) {
			
			if(aUser.friends.contains(this.friends.get(i)))
				commonFriends.add(this.friends.get(i));
			
		}
		
		return commonFriends;	
		
	}

	public void addGroup(Group aGroup) {
		
		groups.add(aGroup);	
	}
	
	public void printGroups() {
		
		System.out.println("************************************** ");
		System.out.println("Groups that " + this.name + " has been enrolled in ");
		System.out.println("************************************** ");
		
		for(int i=0; i<this.groups.size(); i++) {
			
			System.out.println(i+1 + ": " + groups.get(i).getName());
		}
		
		System.out.println("--------------------------------------");
		
	}
	
	public void printFriends() {
		
		if(this.friends.isEmpty()){
			
			System.out.println(this.name + " has no friends.");
		}else {
			
			System.out.println("Friends of " + this.name);
			System.out.println("************************");
			
			for(int i=0; i<friends.size(); i++) {
				System.out.println(i+1 + ": " + friends.get(i).getName());
			}
		}
		
	}
	
	
	public ArrayList<User> potentialInfected() {
		
		ArrayList<User> people = new ArrayList<User>();
		
		for(int i=0; i<this.friends.size(); i++) {
			
			people.add(this.friends.get(i));
			
			for(int j=0; j<this.friends.get(i).friends.size(); j++){
				
				if(!(people.contains(this.friends.get(i).friends.get(j))) &&  
						 !(this.friends.get(i).friends.get(j).equals(this))) {
					
					people.add(this.friends.get(i).friends.get(j));
				}
			}
			
		}
		
		return people;
		
	}
	
	
}
