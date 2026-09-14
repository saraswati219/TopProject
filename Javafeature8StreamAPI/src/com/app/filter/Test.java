package com.app.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		//filter
		//List<Integer> number=List.of(5,10,15,20,25);
		//number.stream().filter(n->n>15).forEach(System.out::println);
		
		//map
		//List<String> names=List.of("java","spring");
		//names.stream().map(String::toUpperCase).forEach(System.out::println);
		
		//List<String> names= List.of("Amala","saraswati");
		//List<Integer> lengths = names.stream().map(String::length).toList();
		//System.out.println(lengths);
		
		//flatMap
		//List<List<Integer>> list = List.of(List.of(1,2),List.of(3,4),List.of(5,6));
		//list.stream().flatMap(Collection::stream).forEach(System.out::println);
		
		//distinct
		//List<Integer> numbers=List.of(10,20,30,20);
		//numbers.stream().distinct().forEach(System.out::println);
		
		//sorted
		//List<Integer> numbers= List.of(40,20,10,30);
		//numbers.stream().sorted().forEach(System.out::println);
		
		//numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//peek
		//List<Integer> numbers=List.of(1,2,3);
		//numbers.stream().peek(n->System.out.println("Before:"+n)).map(n->n*10).peek(n->System.out.println("After:"+n)).toList();
		
		//limit
		//List<Integer> numbers=List.of(10,20,50,30,20);
		//numbers.stream().limit(3).forEach(System.out::println);
		
		//skip
		//List<Integer> numbers=List.of(10,30,20,40);
		//numbers.stream().skip(2).forEach(System.out::println);
		
		//mapToInt
		List<String> names=List.of("java","spring");
		//int total=names.stream().mapToInt(String::length).sum();
		//System.out.println(total);
		
		//long total = List.of(10,20,30).stream().mapToLong(n->n).sum();
		//System.out.println(total);
		
		//mapToDouble
		//double avg = List.of(10,20,30).stream().mapToDouble(n->n).average().orElse(0);
		//System.out.println(avg);
		
		//boxed
		//List<Integer> list=IntStream.of(10,20,30).boxed().toList();
		//System.out.println(list);
		
		//----Terminal Operation List----
		//collect
		//List<Integer> result=List.of(10,20,30,40).stream().filter(n->n>20).collect(Collectors.toList());
		//System.out.println(result);
		
		//toList
		//List<Integer> result=List.of(10,20,30,40).stream().filter(n->n>20).toList();
		//System.out.println(result);
		
		//forEach
		//List<Integer> number = List.of(10,20,30,40);
		//number.stream().forEach(n->System.out.println(n));
		
		//count
		//List<Integer> numbers=List.of(10,20,30,40);
		//long result=numbers.stream().count();
		//System.out.println(result);
		
		//reduce
		//List<Integer> numbers = List.of(10,20,30);
		//int result=numbers.stream().reduce(0,(a,b)->a+b);
		//System.out.println(result);
		
		//findFirst
		//Optional<Integer> result =List.of(32,556).stream().findFirst();
		//List<Integer> list = new ArrayList<>();
		//Optional<Integer> n=list.stream().findFirst();
		//System.out.println(n.orElse(1));
		
		//findAny
		//Optional<Integer> result = List.of(10,20,30).stream().findAny();
		//System.out.println(result.orElse(0));
		
		//anyMatch
		//List<Integer> number = List.of(10,20,30,40);
		//boolean result=number.stream().anyMatch(n->n>35);
		//System.out.println(result);
		
		//allMatch
		//List<Integer> number = List.of(10,20,30,40);
		//boolean result = number.stream().allMatch(n->n>5);
		//System.out.println(result);
		
		//noneMatch
		//List<Integer> numbers=List.of(10,20,30);
		//boolean result =numbers.stream().noneMatch(n->n>100);
		//System.out.println(result);
		
		//max
		Optional<Integer> result = List.of(10,30,40,50).stream().max(Integer::compareTo);
		System.out.println(result.orElse(0));
		
		
		
		
	}

}
