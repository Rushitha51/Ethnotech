import java.util.Scanner;
public class JaggedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[3][];
        marks[0] = new int[1];
        marks[1] = new int[2];
        marks[2] = new int[3];
        // Input
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject" + (j + 1) + ": ");
            marks[i][j] = sc.nextInt();
        }
    }
        // Output
        System.out.println("Marks are:");
        for(int i = 0; i < marks.length; i++) {
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}