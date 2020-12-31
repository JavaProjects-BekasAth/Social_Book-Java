# Social_Book-Java
This is a supposed social media that includes Users and Groups and it can help to find infected people in a pandemic period. 
There are Users who have a list of friends, and two types of groups. The first type is the open group in which everyone can be member,
and the second a closed group in which user can be member only if they have a friend who is member. The main purpose of the program is to show the people
who have to be tested when a user has been infected (his/her friends and their friends).


code for email validation:
  Scanner input = new Scanner(System.in); 
     
     String email = input.nextLine();
     
     while(!(email.matches("(dai|iss|ics)[0-9]{3,5}@uom.edu.gr"))){
       
       System.out.println("try again");
       
       email = input.nextLine();
     }
     
     System.out.println("ok");
