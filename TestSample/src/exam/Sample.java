package exam;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
// import java.util.HashMap;
public class Sample {
	public static void main(String args[]) {
		List <String> arr=new ArrayList<String>();
		Iterator<String> it = arr.iterator();
		arr.add("Aakash");
		arr.add("Abilash");
		arr.add("Akhil");
		arr.add(3,"Abel");
		System.out.println(arr);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

}
}