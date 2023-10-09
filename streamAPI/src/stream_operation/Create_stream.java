package stream_operation;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class Create_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Stream API\n");
		
		
		//creating a stream using set of values
		Stream <Integer> st=Stream.of(1,2,3,4,5);
		Stream<Integer> star;
		//Creating a stream from array
		Integer[] ar=new Integer[] {10,9,7,6,8,6,9};
		star=Arrays.stream(ar);
		
		
		//intermediate methods ------map,filter,limit,distinct,sorted,skip
		System.out.println("Intermediate methods...........................");
		//map
		System.out.println("1.Map");
		System.out.println("Cubes of " + Arrays.toString(ar) + " is as follows :");
		Arrays.stream(ar).map(num->num*num*num).forEach(System.out::println);
		//limit
		System.out.println("2.Limit");
		Arrays.stream(ar).limit(3).forEach(System.out::println);
		//skip
		System.out.println("3.Skip");
		Arrays.stream(ar).skip(3).forEach(System.out::println);
		//distinct
		System.out.println("4.Distinct");
		Arrays.stream(ar).distinct().forEach(System.out::println);
		//sorted
		System.out.println("5.Sorted");
		Arrays.stream(ar).sorted().forEach(System.out::println);
		//filter
		System.out.println("6.Filter");
		Arrays.stream(ar).filter( a-> a>7 ).forEach(System.out::println);
		
		
		
		//terminal methods----------foreach,toArray,reduce,min,max,collect,count,anymatch,allmatch,nonematch,findfirst,findany
		System.out.println("Terminal Methods................................");
		Integer[] in = new Integer[] {87,32,55,98,22,43,2,4,17,19};
		Stream<Integer> n=Arrays.stream(in);
		List<String>source=Arrays.asList("Adhi","","Suresh","","Balaji","","Nithiya");
		
		//foreach
		System.out.println("1.ForEach method ");
		st.forEach(System.out::println);
		//isEmpty
		System.out.println("2.isEmpty method ");
		int c=  (int) source.stream().filter(a -> a.isEmpty()).count();
		System.out.printf("The List %s has %d empty strings ", source, c); 
		//count
		System.out.println("\n3.Count method ");	
		long count= source.stream().count();
		System.out.printf("The count is : %d",count);
		
		IntSummaryStatistics stats= n.mapToInt((s) -> s).summaryStatistics();
		//max
		
		System.out.println("\n 4.Max \n Highest prime number in List : " + stats.getMax()+ "\n"); 
		System.out.println("5.Min \n Lowest prime number in List : " + stats.getMin()+ "\n"); 
		System.out.println("6.sum \n Sum of all prime numbers : " + stats.getSum()+ "\n");
		System.out.println("7.Average \n Average of all prime numbers : " + stats.getAverage()+ "\n");
		
		
		
		
	}

}
