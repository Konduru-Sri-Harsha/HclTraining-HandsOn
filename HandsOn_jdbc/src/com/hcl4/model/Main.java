package com.hcl4.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.hcl4.dao.Empdao;
import com.hcl4.dao.Empdaoimpl;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee emp = new Employee();
		Empdao db = new Empdaoimpl();
		
		System.out.println("Choose the options to perform\n 1.Insert\n 2.Delete\n 3.Get Details\n 4.Get the List");
		int e = Integer.parseInt(br.readLine());
		switch (e) {
		case 1:
			System.out.println("Enter Employee number");
			int eno=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			String ename= br.readLine();
			System.out.println("Enter address");
			String address= br.readLine();
			boolean inserted = db.insert(new Employee(eno, ename, address));
			System.out.println(inserted);
			break;
		case 2:
			System.out.println("Enter the Employee number whose details you want to delete");
			int num = Integer.parseInt(br.readLine());
			boolean deleted = db.delete(num);
			System.out.println(deleted);
			break;
		case 3:
			System.out.println("Enter the Employee number whose details you want to view");
			int number = Integer.parseInt(br.readLine());
			Employee E = db.get(number);
			System.out.println(E);
			break;
		case 4:
			List<Employee> EMP = db.getAll();
			System.out.println(EMP);
			break;
		}

	}

}
