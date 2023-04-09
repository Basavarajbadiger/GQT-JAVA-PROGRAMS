import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the no of university");
		int uni=sc.nextInt();
		System.out.println("enter the no of colleges under each university");
		int clg=sc.nextInt();
		System.out.println("enter the no of classrooms in each college");
		int cls=sc.nextInt();
		System.out.println("enter the no students in each classroom");
		int stu=sc.nextInt();
		int arr[][][][]=new int[uni][clg][cls][stu];
		for(int i=0;i<uni;i++) {
			System.out.println("IN RV UNIVERSITY :" +(i+1));
			for(int j=0;j<clg;j++) {
				System.out.println("COLLEGE UNDER RV UNIVERSITY :" +(j+1));
				for(int k=0;k<cls;k++) {
					System.out.println("FOR EACH CLASS IN A COLLEGE UNDER RV UNIVERSITY :" +(k+1));
					for(int l=0;l<stu;l++) {
						System.out.println("the marks of the student" +(l+1)+ " of university " +(i+1)+ " and belongs to the college" +(j+1)+" and of class" +(k+1)+"is:");
						arr[i][j][k][l]=sc.nextInt();
						
					}
					
				}
			}
		}
		for(int i=0;i<uni;i++) {
			System.out.println(" IN UNIVERSITY :" +(i+1));
			for(int j=0;j<clg;j++) {
				System.out.println(" IN EVERY COLLEGE OF EACH UNIVERSITY :" +(j+1));
				for(int k=0;k<uni;k++) {
					System.out.println(" IN EACH CLASS  EVERY COLLEGE OF EACH UNIVERSITY :" +(k+1));
					for(int l=0;l<cls;l++) { 
						System.out.println("the marks of the student " +(l+1)+ " of class" +(k+1)+ " of the college" +(j+1)+"of university"+(i+1)+"is:" +arr[i][j][k][l]);
					}
				}
				
			}
		}

	}

}
