package solveProblem;

public class Task1 {

	public static void main(String[] args) {
		// Task 1

		//Write the Java code of a program that prints the first ten positive whole numbers. [Do NOT use loops]
        
		//define limit
        int limit = 20;
       
        System.out.println("Printing Even numbers between 1 and " + limit);
       
        for(int i=1; i <= limit; i++){
               
                // if the number is divisible by 2 then it is even
                if( i % 2 == 0){
                        System.out.print(i + " ");
                }
        }


	}

}
