package com.app.streamCustomObject1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Electronic");
		l.add("Mobile");
		
		List<String> l1 = new ArrayList<>();
		l1.add("Electronic");
		l1.add("Laptop");
		
		List<String> l2 = new ArrayList<>();
		l2.add("Fashion");
		l2.add("Hoodies");
		
		List<String> l3 = new ArrayList<>();
		l3.add("Electronic");
		l3.add("smartphone");
		
		List<String> l4 = new ArrayList<>();
		l4.add("Electronic");
		l4.add("tab");
		
		List<String> l5 = new ArrayList<>();
		l5.add("Electronic");
		l5.add("Mobile");
		
		List<String> l6 = new ArrayList<>();
		l6.add("Electronic");
		l6.add("smartphone");
		
		List<String> l7 = new ArrayList<>();
		l7.add("Electronic");
		l7.add("laptop");
		
		List<String> l8 = new ArrayList<>();
		l8.add("Electronic");
		l8.add("laptop");
		
		List<String> l9 = new ArrayList<>();
		l9.add("Electronic");
		l9.add("headphone");
		
		List<String> l10 = new ArrayList<>();
		l10.add("Electronic");
		l10.add("smartphone");
		
		

		
		
		Product p1 = new Product(1,"Samsung Galaxy s25","Electronic","Samsung",80000.0,10,4.8,"pune",l);
		Product p2 = new Product(2,"Wooden Sofa","Furniture","Urbanwooden",50000.0,5,4.5,"Asam",l1);
		Product p3 = new Product(3,"Smart Tv","Electronic","Sony",55000.0,8,4.7,"Mumbai",l2);
		Product p4 = new Product(101,"iPhone 15", "Smartphone","Apple",69999.00, 10, 4.5,"Pune",l3);
		Product p5 = new Product(101, "iPhone 16", "tab", "Apple", 150000.00, 10, 4.5, "Pune",l4);
		Product p6 = new Product(102, "Galaxy S24", "Smartphone", "Samsung", 74999.00, 8, 4.6, "Mumbai",l5);
		Product p7 = new Product(103, "MacBook Air", "Laptop", "Apple", 99999.00, 5, 4.8, "Delhi",l6);
		Product p8 = new Product(104, "ThinkPad E14", "Laptop", "Lenovo", 65999.00, 7, 4.4, "Bangalore",l7);
		Product p9 = new Product(105, "WH-1000XM5", "Headphones", "Sony", 29999.00, 12, 4.7, "Hyderabad",l8);
		Product p10 = new Product(106, "Redmi Note 14", "Smartphone", "Xiaomi", 18999.00, 15, 4.3, "Chennai",l9);
		
		List<Product> prds = new ArrayList<>();
		prds.add(p1);
		prds.add(p2);
		prds.add(p3);
		prds.add(p4);
		prds.add(p5);
		prds.add(p6);
		prds.add(p7);
		prds.add(p8);
		prds.add(p9);
		prds.add(p10);
		
		//lambda
		prds.stream().forEach(p->System.out.println(p));
		
		//Method Reference
		prds.stream().forEach(System.out::println);
		
		prds.stream().forEach(p->System.out.println(p.getName()+" "+p.getPrice()));
		
		prds.stream().filter(x->x.getCategory().equals("Electronic")).forEach(System.out::println);
		
		prds.stream().filter(p->p.getPrice()>1000).forEach(System.out::println);
		
		prds.stream().filter(s->s.getQuantity()<10).forEach(System.out::println);
		
		prds.stream().filter(r->r.getRating()>4.5).forEach(System.out::println);
		
		prds.stream().filter(b->b.getBrand().equals("Apple")).forEach(System.out::println);
		
		prds.stream().filter(b->b.getCity().equals("Pune")).forEach(System.out::println);
		
		prds.stream().sorted(Comparator.comparing(p->p.getPrice())).forEach(System.out::println);
		
		prds.stream().sorted(Comparator.comparing(p->p.getRating())).forEach(System.out::println);
		
		prds.stream().limit(5).forEach(System.out::println);
		
		prds.stream().sorted(Comparator.comparing((Product p)->p.getPrice()).reversed()).limit(3).forEach(System.out::println);
		
		prds.stream().filter(n->n.getBrand().equals("Apple")).forEach(n->System.out.println(n.getName()));
		
		prds.stream().filter(p->p.getPrice()>50000).forEach(n->System.out.println(n.getPrice()+" "+n.getName()));
		
		prds.stream().filter(r->r.getRating()>4.5).sorted(Comparator.comparing(n->n.getName())).forEach(n1->System.out.println(n1.getName()+" "+n1.getRating()));
		
		long l11 =prds.stream().count();
		System.out.println(l11);
		
		long l12 = prds.stream().filter(p->p.getBrand().equals("Apple")).count();
		System.out.println(l12);
		
		long l13= prds.stream().filter(p->p.getPrice()>50000).count();
		System.out.println(l13);
		
		
		
		

	}

}
