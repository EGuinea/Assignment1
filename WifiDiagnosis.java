/*
 * Class: CMSC203 CRN 23661 
 * Instructor: Ping-Wei Tsai
 * Description: A program that helps you diagnose your Wifi connectivity.
 * Due: 9/13/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Edwin Andrew Guinea
*/
import java.util.Scanner;
public class WifiDiagnosis {

public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String response;
			System.out.print("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
			System.out.println("Reboot your computer and try to connect");
			System.out.println("Are you able to connect with the internet? (yes or no)");
			response = input.next();
			if (response.equalsIgnoreCase("no")) 
			{
				System.out.println("Reboot your router.");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				response = input.next();
				if (response.equalsIgnoreCase("no")) 
				{
					System.out.println("Make sure the cables to your router are plugged in firmly and your router is getting power.");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					response = input.next();
					if(response.equalsIgnoreCase("no")) 
					{
						System.out.println("Move the computer close to the router and try to connect.");
						System.out.println("Now are you able to connect with the internet? (yes or no)");
						response = input.next();
						if(response.equalsIgnoreCase("no")) 
						{
							System.out.println("Contact your ISP");
						}
						else if(response.equalsIgnoreCase("yes"))
						{
							System.out.println("Done!");
						}

						else {
							System.out.println("Invalid answer; try again");
						}
					}
					else if(response.equalsIgnoreCase("yes"))
					{
						System.out.println("Done!");
					}

					else {
						System.out.println("Invalid answer; try again");
					}
				}

			}

			else if(response.equalsIgnoreCase("yes"))
			{
				System.out.println("Done!");
			}

			else {
				System.out.println("Invalid answer; try again");
			}
			input.close();
		}
}