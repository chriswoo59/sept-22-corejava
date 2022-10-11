package com.cognixia.jump.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsDemoDriver {

	public static void main(String[] args) {

		int[] primitives = { 2, 4, 6, 8, 10 };

		// Convert the above array of primitive int into an array of Integer Objects
		Integer[] intArray = new Integer[primitives.length];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = primitives[i];
		}

		System.out.println("Primitive int array: " + Arrays.toString(primitives));
		System.out.println("Integer Object array: " + Arrays.toString(intArray));

		// Now doing above, but using streams
		Integer[] intArray2 = Arrays.stream(primitives).boxed().toArray(Integer[]::new);
		System.out.println("Integer Object array using Stream API: " + Arrays.toString(intArray2));

		// Using built in list that takes in
		List<Integer> intList = Arrays.asList(intArray);

		System.out.println("For Each example:");
		// Printing using method referencing
		intList.forEach(System.out::println);
		// Using lambda to format print more
		intList.forEach(n -> System.out.println(n + " custom message!"));

		// Uses reduce to perform lambda expression cumulatively on all elements in
		// stream
		// Starts with 0 + intList[0], then uses that value as new num1 and next value
		// in list as new num2
		int sum = intList.stream().reduce(0, (num1, num2) -> num1 + num2);
		System.out.println("Sum of integers: " + sum);

		// Use reduce for logical, binary choices, get max value
		// ? = if true : = else
		int max = intList.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2) // ternary evaluation, which is not
				.get();
		System.out.println("Max integer: " + max);

		// Streaming custom objects
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Patterson", 110_000, "Production"));
		employees.add(new Employee("Mandeep", 200_000, "Director"));
		employees.add(new Employee("Xavier", 150_000, "Script Writer"));
		employees.add(new Employee("Matthew", 0, "IT"));
		employees.add(new Employee("Arun", Integer.MAX_VALUE, "Secret"));

		// Return the employee with the lowest salary
		Employee lowest = employees.stream().reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2).get();
		System.out.println("Employee with lowest salary is: " + lowest);

		// Search for employee with specific salary
		String searchValue = "mandeep";
		Optional<Employee> search = employees.stream().filter(e -> e.getName().equalsIgnoreCase(searchValue))
				.findFirst();
		if (search.isPresent()) {
			System.out.println(search.get());
		} else {
			System.out.println(searchValue + " not found.");
		}
		
		//.map() applies a custom function to all entries in the stream
		List<Integer> employeesAfterRaise = employees.stream()
				.map(e -> e.getSalary()*2)	// at this point we are not working with a stream of integers
				.collect(Collectors.toList());
		employees.forEach(e -> e.setSalary(e.getSalary()*2));
		System.out.println(employees);
		

	}

}
