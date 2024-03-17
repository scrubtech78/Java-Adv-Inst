import java.time.LocalDate;
import java.time.LocalDateTime;

import model.Request;
import model.User;

public class PrsProjectApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Prs App");
		
		User user1 = new User (1,"grthe","djskjsk","ddjeej","928-4556-4567","djdjdj","djkfjkj",false,false);
		User user2 = new User (2,"shdskdj","ddk","sjdkdj","dfjdksfjd","fjdkfjd","hello",false,false);
		
		System.out.println(user1);
		
		Request r1= new Request(2,1,"scrubteh78", "stuff",LocalDate.now(),"pick-up","review",20.00,LocalDateTime.now(),"too much");
		System.out.println(r1);
		System.out.println("Bye");
	}

}
