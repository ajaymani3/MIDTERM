package com.cisc181.core;
import java.util.ArrayList;
import java.util.UUID;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		
		Semester FALL = new Semester();
		Semester SPRING = new Semester();
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		Semesters.add(FALL);
		Semesters.add(SPRING);
		
		Course ENGLISH = new Course();
		Course SPANISH = new Course();
		Course ECONOMICS = new Course();

		ArrayList<Course> Courses = new ArrayList<Course>();
		Courses.add(ENGLISH);
		Courses.add(SPANISH);
		Courses.add(ECONOMICS);

		ArrayList<Section> sections = new ArrayList<Section>();
		
		Section SECTION1 = new Section();
		Section SECTION2 = new Section();
		Section SECTION3 = new Section();
		Section SECTION4 = new Section();
		Section SECTION5 = new Section();
		Section SECTION6 = new Section();
		
		ArrayList<Student> STUDENT = new ArrayList<Student>();
		
		Student 01 = new Student();
		Student 02 = new Student();
		Student 03 = new Student();
		Student 04 = new Student();
		Student 05 = new Student();
		Student 06 = new Student();
		Student 07 = new Student();
		Student 08 = new Student();
		Student 09 = new Student();
		Student 10 = new Student();
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}