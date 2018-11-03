import java.util.Scanner;

class Test {
	public static void main(String args[]) {
		Scanner s =  new Scanner(System.in);
		String str = s.nextLine();
		int arr[] = new int[str.length()];
		int temp;
		int k = s.nextInt();
		for(int i=0; i<str.length(); i++) {
			temp = str.charAt(i);
			if(temp>=48 && temp<=57) {
				arr[i] = 48 + (temp-48 + k%10)%10;
			}
			else if(temp>=65 && temp<=90) {
				arr[i] = 65 + (temp-65 + k%26)%26;
			}
			else if(temp>=97 && temp<=122) {
				arr[i] = 97 + (temp-97 + k%26)%26;
			}
			else arr[i] = temp;
		}
		for(int i=0; i<str.length(); i++) {
			System.out.print((char) arr[i]);
		}
	}
}