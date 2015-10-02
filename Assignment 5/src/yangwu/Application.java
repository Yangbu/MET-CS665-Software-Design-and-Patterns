package yangwu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		try{
			boolean done = false;
			boolean done1 = false;
			while (!done){
				System.out.println("Choose the user:(A:Administrator/D:Developer/O:Operator/M:Monitor) "
						+ "or enter quit to stop");
				// read a choice
				String text = in.readLine();
				while(!done1){
					//if enter quit, exit the loop
					if (text.equalsIgnoreCase("quit")){
						done = true;
						done1 = true;
						System.out.println("The operation was done!");
					} else{
						UserFactory factory = new UserFactory();
						System.out.println(	factory.createUser(text).getResponsibility() + "\n" 
						+ "Please enter the command(lowercase) or back to the parent:" );
						// read a base command
						String text2 = in.readLine();
						//if enter correct command, run the command; or enter back to the previous operation
						if(	factory.createUser(text).getResponsibility().toLowerCase().contains(text2)){
							factory.createUser(text).function();
						}else if(text2.equalsIgnoreCase("back")){
							break ;
						}else
					System.out.println("Wrong command or you don't have the privilege");
				}
	
					
			}
			}
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}	
}
}
