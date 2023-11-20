package Task21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStream {

    public static void main(String[] args) {

         List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(numbers);

        List<Integer> evenNumbers=new ArrayList<>();

        evenNumbers= numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);


        List<Integer> squares=new ArrayList<>();

        squares=numbers.stream().map(n->n*n).collect(Collectors.toList()); 

        System.out.println(squares);

        long count=numbers.stream().count();
        System.out.println(count);

        int sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println("sum of the numbers"+sum);


        




















        
    }

   
    
}
