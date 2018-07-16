import java.util.ArrayList;
import java.util.Scanner;

public class Hunter_7 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int ak = sc.nextInt();
	int arr[] = new int[ak];
	for (int i = 0; i < arr.length; i++) {

		arr[i]=sc.nextInt();
	}
	ArrayList arl=new ArrayList<>();
	
		for(int i=0;i<arr.length;i++) {
			
			if((i%2==0)&&(arr[i]%2==1)){
				arl.add(arr[i]);
			}
			if((i%2==1)&&(arr[i]%2==0)){
				arl.add(arr[i]);
			}
		}
		int ar[]=new int[arl.size()];
		for(int i=0;i<arl.size();i++) {
			ar[i]=(int) arl.get(i);
			System.out.print(ar[i]+" ");
			
		}
    }

}
