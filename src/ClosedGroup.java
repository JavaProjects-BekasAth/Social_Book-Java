import java.util.ArrayList;

public class ClosedGroup extends Group{
	
	ArrayList<User> members;
	
	public ClosedGroup(String name, String description) {
		
		super(name, description);
		members = new ArrayList<User>();
		
	}
	
	public void addMember(User aUser) {
		
		if (members.contains(aUser))
			System.out.println(aUser.getName() + " is already member.");
		else {
			
				if(members.isEmpty()) {
				
					members.add(aUser);
					aUser.addGroup(this);
					System.out.println(aUser.getName() + " has been successfully enrolled in group "
							+ this.name);
				}
				else {
			
					boolean common = false;
				
					for(int i=0; i<aUser.friends.size(); i++) {
					
						if(members.contains(aUser.friends.get(i))) {
							common = true;
							break;
						}
					}
					
					if(common) {
						members.add(aUser);
						aUser.addGroup(this);
						System.out.println(aUser.getName() + " has been successfully enrolled in group "
								+ this.name);
					}
					else {
						System.out.println("FAILED: " +  aUser.getName() + " cannot be enrolled in group " 
								+ this.name);
					}
			}
		}
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
