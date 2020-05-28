package MyFirstJavaProject;

public class GeometryTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HW 2
		
		int width = 20;
		int height = 5;
		
		if ((width > 0) && (height >0)) { 
		
			for (int a = 1; a<= width + 2; a++) {
				
				System.out.print("-");
				
			}
			
			System.out.println();
			
			for (int y = 1; y <= height; y++) {
					
				System.out.print("|");
					
				for (int x = 1; x<= width; x++) {
						
					System.out.print("*");
						
				}
					
				System.out.print("|");
				System.out.println();
					
			}
							
			for (int b = 1; b<= width + 2; b++) {
				
				System.out.print("-");
				
			}
			
			System.out.println();
			
		} else {
			
			System.out.println("Your entries are not valid. Width and Height have to be positive integer numbers. Please check and try again.");
			
		}
		
		//HW 3: backward WHILE loop
		
		int i = 10;
		
		while(i >= 1) {
			
			System.out.println(i);
			
			i--;
			
			
		}

	}

}
