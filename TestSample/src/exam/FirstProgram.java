package exam;
import java.util.ArrayList;
public class FirstProgram{
	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(4);
		arr.add(12);
		arr.add(8);
		arr.add(12);
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		for(int i:arr) {
			if(!arr1.contains(i)) {
				arr1.add(i);
			}
		}
		System.out.println(arr1);
	}
}