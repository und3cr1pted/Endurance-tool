import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Scanner scanner1 = new Scanner(System.in);		
		int choice1;
		
		String project_directory = new File(".").getCanonicalPath().replace("\\", "/");		
		String shutdown_cmd = project_directory + "/" + "shutdown.cmd";	
		String plankerton_w5_cmd = project_directory + "/" + "Plankerton_wave_5.cmd";
			
		while (true) {
			
			System.out.println("=============================" + '\n'
			                 + " Endurance tool by moon_wifi" + '\n'
							 + "=============================" + '\n');


			System.out.println("Select an option:" + '\n' + '\n'
			                 + "1: Stonewood" + '\n'
					         + "2: Plankerton" + '\n'
			                 + "3: Canny Valley" + '\n'
					         + "4: Twine Peaks" + '\n');
			
			choice1 = scanner1.nextInt();
			
			if (choice1 >= 1 && choice1 <= 4) {
				
				scanner1.close();
				break;
			}
		}
	
		Thread.sleep(250);
		System.out.println('\n' + "Starting in:");
		System.out.println("5");
		Thread.sleep(1000);
		System.out.println("4");
		Thread.sleep(1000);
		System.out.println("3");
		Thread.sleep(1000);
		System.out.println("2");
		Thread.sleep(1000);
		System.out.println("1" + '\n');
		Thread.sleep(1000);

		System.out.println("Shutdown in 2 hours and 35 minutes" + '\n');
		//new ProcessBuilder("cmd", "/c", shutdown_cmd).start();
		System.out.println("[debug] shutdown.cmd located at --> " + shutdown_cmd + '\n'); //debug
		
		
		if (choice1 == 1) {
			
			System.out.println("Choice: Stonewood" + '\n');
			
		
		}
		
		
		else if (choice1 == 2) {
			
			System.out.println("Choice: Plankerton" + '\n');
			
			int delay1 = (13 * 60 + 40) * 1000;
			Thread.sleep(delay1);			
			
		//	new ProcessBuilder("cmd", "/c", plankerton_w5_cmd).start();
			System.out.println("Wave 5 (Ufo-Modifier)");
			System.out.println("[debug] Plankerton_wave_5.cmd located at --> " + plankerton_w5_cmd); //debug
			
			Thread.sleep(60000);
		}
		
		
		else if (choice1 == 3) {
			
			System.out.println("Choice: Canny Valley" + '\n');

		}
		
		
		else if (choice1 == 4) {
			
			System.out.println("Choice: Twine Peaks" + '\n');

		}

		Thread.sleep(10000); //temporary
		
	}

	public static void endurance_waves() {

		/* 	Thread.sleep();
		System.out.println("Wave 1"); // 21
		
		Thread.sleep();    
		System.out.println("Wave 2"); // 213

		Thread.sleep();
		System.out.println("Wave 3"); // 421 

		Thread.sleep();
		System.out.println("Wave 4"); // 

		Thread.sleep();
		System.out.println("Wave 5"); // 

		Thread.sleep();
		System.out.println("Wave 6"); // 

		Thread.sleep();
		System.out.println("Wave 7"); //   

		Thread.sleep();
		System.out.println("Wave 8"); //   

		Thread.sleep();
		System.out.println("Wave 9"); //   

		Thread.sleep();
		System.out.println("Wave 10"); //   

		Thread.sleep();
		System.out.println("Wave 11"); //   

		Thread.sleep();
		System.out.println("Wave 12"); //   

		Thread.sleep();
		System.out.println("Wave 13"); //   

		Thread.sleep();
		System.out.println("Wave 14"); // 

		Thread.sleep();
		System.out.println("Wave 15"); // 

		Thread.sleep();
		System.out.println("Wave 16"); // 

		Thread.sleep();
		System.out.println("Wave 17"); // 

		Thread.sleep();
		System.out.println("Wave 18"); // 

		Thread.sleep();
		System.out.println("Wave 19"); // 

		Thread.sleep();
		System.out.println("Wave 20"); // 

		Thread.sleep();
		System.out.println("Wave 21"); // 

		Thread.sleep();
		System.out.println("Wave 22"); // 

		Thread.sleep();
		System.out.println("Wave 23"); // 

		Thread.sleep();
		System.out.println("Wave 24"); // 

		Thread.sleep();
		System.out.println("Wave 25"); // 

		Thread.sleep();
		System.out.println("Wave 26"); // 

		Thread.sleep();
		System.out.println("Wave 27"); // 

		Thread.sleep();
		System.out.println("Wave 28"); // 

		Thread.sleep();
		System.out.println("Wave 29"); // 

		Thread.sleep();
		System.out.println("Wave 30"); // 
   */
  
	}
}
