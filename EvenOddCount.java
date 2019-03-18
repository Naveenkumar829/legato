import java.util.*;
public class EvenOddCount {
	
		public static void main(String []args) {
			even();
			odd();
		}
		
		static void even() {
			int count=0;int num=0;
			System.out.println("Even numbers are:");
			while(count<=10) {
				if(num%2==0) {
					count++;
					System.out.print(num+" ");
				}
				num=num+1;
			}
			
		}
			
		static void odd() {
			int count=0;int num=0;
			System.out.println();
			System.out.println("Odd numbers are:");
			while(count<=10) {
				if(num%2!=0) {
					count++;
					System.out.print(num+" ");
				}
				num=num+1;
			}
		}
	}

