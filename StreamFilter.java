import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Optional;

public class StreamFilter {
    public static void main(String args[]){
        List<Integer> integerList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elments in list :");
        Integer num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter "+(i+1)+"th element");
            integerList.add(sc.nextInt());
        }
        System.out.println("Given list is :"+integerList);

        Optional<Integer> element = integerList.stream().filter(o->o%2 == 0).findFirst();
        System.out.println(element.get());
        
    }
}
