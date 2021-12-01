package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;
import entities.User;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfStudents = 0;
		Set<Course> courses = new LinkedHashSet<>();
		Course a = new Course("A", new HashSet<User>());
		Course b = new Course("B", new HashSet<User>());
		Course c = new Course("C", new HashSet<User>());
		courses.add(a);
		courses.add(b);
		courses.add(c);

		Set<User> allUsers = new HashSet<User>();
		
		for (Course course : courses) {
			System.out.print("How many students for course " + course.getName() + ":");
			numberOfStudents = sc.nextInt();
			for (int i = 0; i < numberOfStudents; i++) {
				int id = sc.nextInt();
				course.getCadastredUsers().add(new User(id));
			}			
			
			allUsers.addAll(course.getCadastredUsers());
		}
		
		System.out.println("Total students: " + allUsers.size());
		
		
		
		sc.close();
	}

}
