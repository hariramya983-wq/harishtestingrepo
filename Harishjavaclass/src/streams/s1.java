package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class s1 {

	public static void main(String[] args) 
	//map, reduce, filter, sorted  
		// list=> input
		// map    
		// do common operation to all the elements present in the list
		
		// map:  input: list      output: list (with changed values)
		// filter: input: list    output : list (number of elements may change)
		 {
		List<Integer> l = Arrays.asList(60,2,3,4,5,6);
		System.out.println(l); 
		
		// map:   add 10 to each and every element in the list
		
				List<Integer> result = l.stream().map(x-> x+10).collect(Collectors.toList());
				System.out.println(result);
				
				//element: division by 2 (Even Number)
				List<Integer> d = l.stream().filter(x-> x%2==0).collect(Collectors.toList());
				
				System.out.println(d);
				
				//element: greater than 6
				List<Integer> result1 = l.stream().filter(x-> x>6).collect(Collectors.toList());
			System.out.println(result1);
			
			//element: sort
			List<Integer> result2 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(result2);
		
		//reduce function
		
int addition=l.stream().filter(x-> x%2==0).reduce(0,(ans,i)-> ans+i);  // 0  60    60     62  
		
		//    60  2 3  4  5 6 
		//     60                  -> 0,60 -> 60
		//      2                  -> 60,2 -> 62
		//      3 
		//      4                  -> 62 , 4-> 66
		//        5
		// 6                         66,6-> 72
		
		System.out.println(addition);
	}

}
