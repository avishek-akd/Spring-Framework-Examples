import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Abhi {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
	
	int m1[][];
	int m2[][];
	int m3[][];
	int sum = 0;
		
	 System.out.println("Enter 1st matrix row:-"); 
	 int r1 = sc.nextInt();
	 System.out.println("Enter 1st matrix col:-");  
	 int c1 = sc.nextInt();
	 System.out.println("Enter 2nd matrix row:-"); 
	 int r2 = sc.nextInt();
	 System.out.println("Enter 2nd matrix col:-");   
	 int c2 = sc.nextInt();
		
	 m1 = new int[r1][c1];
	 m2 = new int[r2][c2];
	 m3 = new int[r1][c2];
	 
	 if(c1==r2){
		 System.out.println("Enter 1st matrix elements:-");
		 for (int i = 0; i < r1; i++) {
			 for (int j = 0; j < c1; j++) {
					m1[i][j] = sc.nextInt();
				}
		}
		 
		 System.out.println("Enter 2nd matrix elements:-");
		 for (int i = 0; i < r2; i++) {
			 for (int j = 0; j < c2; j++) {
					m2[i][j] = sc.nextInt();
				}
		}
		
		 
		 for (int i = 0; i < r1; i++) {
			 for (int j = 0; j < c2; j++) {
				 for (int k = 0; k<c1; k++) {
					sum = sum+m1[i][k]*m2[k][j];
				}
				 m3[i][j] = sum;
				 sum=0;
			}
		}
		 
		 System.out.println(" 1st matrix");
		 for (int i = 0; i < r1; i++) {
			 for (int j = 0; j < c1; j++) {
					System.out.print(m1[i][j]);
					System.out.print("\t");
				}
			 System.out.println();
		}
		 
		 System.out.println(" 2nd matrix");
		 for (int i = 0; i < r2; i++) {
			 for (int j = 0; j < c2; j++) {
					System.out.print(m2[i][j]);
					System.out.print("\t");
				}
			 System.out.println();
		}
		 
		 System.out.println(" result matrix");
		 for (int i = 0; i < r1; i++) {
			 for (int j = 0; j < c2; j++) {
					System.out.print(m3[i][j]);
					System.out.print("\t");
				}
			 System.out.println();
		}
		 
		 System.out.println(" transpose of 1st matrix");
		 for (int i = 0; i < c1; i++) {
			 for (int j = 0; j < r1; j++) {
					System.out.print(m1[j][i]);
					System.out.print("\t");
				}
			 System.out.println();
		}
		 
	 }else{
		 System.out.println("Multiplication Not Possible");
	 }
	 
	}
}
