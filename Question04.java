public class Question04 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            int j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
		System.out.println();
		
        int rows = 5; 

        for ( i = 1; i <= rows; i++) {

            for ( int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
   
		
		
		
    }
	
}