package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Trees.TreeNode;

public class JavaStreamExample {
	public static void main(String[] args) {
		List<Employee> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Employee(1, "HP Laptop"));
		productsList.add(new Employee(2, "Dell Laptop"));
		productsList.add(new Employee(3, "Lenevo Laptop"));
		productsList.add(new Employee(4, "Sony Laptop"));
		productsList.add(new Employee(5, "Dell Laptop"));
		List<String> productPriceList2 = productsList.stream().filter(e -> e.getEmpId() >= 3).map(Employee::getEmpName)
				.collect(Collectors.toList());
		long employeesCount = productsList.stream().count();

		System.out.println(employeesCount);

		List<Employee> productName = productsList.stream().filter(e -> e.getEmpName().equals("Dell Laptop"))
				.flatMap(e -> Stream.of(e)).collect(Collectors.toList());
		List<String> productName1 = productsList.stream().filter(e -> e.getEmpName().equals("Dell Laptop"))
				.map(e -> e.getEmpName()).collect(Collectors.toList());

		System.out.println("productName " + productPriceList2);

		System.out.println("productName using flatMap " + productName);

		System.out.println("productName1 using map " + productName1);
	}

	public void streams() {

	}
}
