package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student1 =new Student("rishav",21,98);
        Student student2 =new Student("amit",32,80);
        Student student3 =new Student("kunal",42,79);
        Student student4 =new Student("saurabh",14,65);
        Student student5 =new Student("shashank",42,55);
        Student student6 =new Student("ravi",34,68);


        //create HashSet object and add all the students object inside it
        Set<Student> students=new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        //return the HashSet object


        return students;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object
        Set<String> students = new TreeSet<>();

        //Use Iterator object of type <Student> to iterate through the studentSet
        Iterator<Student> iterator=studentSet.iterator();

        //get all the name and add it inside the TreeSet object
        while (iterator.hasNext()){
            Student student =iterator.next();
            students.add(student.getName());

        }

      //return the TreeSet object;
        return students;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>
        Map<String,Integer> map = new HashMap<>();

        //Use Iterator object of type <Student>to iterate through the studentSet
        Iterator<Student> iterator = studentSet.iterator();

        //retrieve the Student object from the iterator
        while (iterator.hasNext()){
            Student student =iterator.next();
            map.put(student.getName(),student.getTotalMarks());
        }

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

           return map;

    }

    public static void main(String[] args) {
        Set studentName = getAllStudentData();
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
