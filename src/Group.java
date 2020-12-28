import java.util.ArrayList;

public class Group {
	
	protected String name;
	protected String description;
	ArrayList<User> members;
	
	
	public Group(String name, String description) {
		
		this.name = name;
		this.description = description;
		members = new ArrayList<User>();
		
	}
	
	public Group() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addMember(User aUser) {
		
		
		if(members.contains(aUser))
			System.out.println(aUser.getName() + " is already member.");
		else {
			members.add(aUser);
			aUser.addGroup(this);
			System.out.println(aUser.getName() + " has been successfully enrolled in group " + this.name);
		}
	}		
	
	public boolean isMember(User aUser) {
		
		if(members.contains(aUser))
			return true;
		
		return false;
	}

	public void printMembers() {
			
			System.out.println("*******************************");
				
				if(members.isEmpty())
					System.out.println("This group has no members.");
				
				else {
					
					System.out.println("Members of group " + this.getName());
					System.out.println("*******************************");
					
					for(int i=0; i<this.members.size(); i++)
						System.out.println(i+1 + ": " + this.members.get(i).getName());
				}
				
				System.out.println("-----------------------------");
				
	}

}

