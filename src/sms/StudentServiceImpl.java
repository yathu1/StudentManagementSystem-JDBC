/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sms;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class StudentServiceImpl implements StudentService{

     StudentRepo repo = new StudentRepoImpl();   
    
    Scanner input = new Scanner(System.in);
     Scanner input2 = new Scanner(System.in);
     
     
    @Override
    public void saveStudent() {
        System.out.print("\033[H\033[2J");
        System.out.println("\t--------- * ---------");
        System.out.println("\t     Add Student      ");
        System.out.println("\t--------- * ---------");
        
        System.out.print("Enter Your name : ");
        String name = input.nextLine();
       
        System.out.print("\nEnter Your Department : ");
        String department = input.nextLine();
        
        System.out.print("\nEnter Your District : ");
        String district = input.nextLine();
        
        System.out.print("\nEnter Your Nic : ");
        String nic = input.nextLine();
        
        System.out.print("\nEnter Your Gender : ");
        String gender = input.nextLine();
        
        System.out.print("\nEnter Your Performance : ");
        int performance = input.nextInt();
        
        System.out.print("\nEnter Your Age : ");
        int age = input.nextInt();

        Student student = new Student();
               student.setName(name);
               student.setAge(age);
               student.setDepartment(department);
               student.setDistrict(district);
               student.setGender(gender);
               student.setNic(nic);
               student.setPerformance(performance);
        
       
        System.out.println(repo.save(student));
        
       
    }

    @Override
    public void updateStudent() {
          System.out.print("\033[H\033[2J");
        System.out.println("\t--------- * ---------");
        System.out.println("\t     Update Student      ");
        System.out.println("\t--------- * ---------");
        
        System.out.print("Enter Your ID : ");
        int id = input2.nextInt();
        
        System.out.println(repo.getStudent(id));
        
        System.out.print("\nEnter Your name : ");
        String name = input.nextLine();
       
        System.out.print("\nEnter Your Department : ");
        String department = input.nextLine();
        
        System.out.print("\nEnter Your District : ");
        String district = input.nextLine();
        
        System.out.print("\nEnter Your Nic : ");
        String nic = input.nextLine();
        
        System.out.print("\nEnter Your Gender : ");
        String gender = input.nextLine();
        
        System.out.print("\nEnter Your Performance : ");
        int performance = input.nextInt();
        
        System.out.print("\nEnter Your Age : ");
        int age = input.nextInt();

        Student student = new Student();
               student.setId(id);
               student.setName(name);
               student.setAge(age);
               student.setDepartment(department);
               student.setDistrict(district);
               student.setGender(gender);
               student.setNic(nic);
               student.setPerformance(performance);
        
        
        System.out.println(repo.update(student));
        }

    @Override
    public void searchStudent() {
         System.out.print("\033[H\033[2J");
        System.out.println("\t--------- * ---------");
        System.out.println("\t     Search Student      ");
        System.out.println("\t--------- * ---------");
        
        System.out.print("Enter Your ID : ");
        int id = input2.nextInt();
        
        System.out.println(repo.getStudent(id));
    }

    @Override
    public void deleteStudent() {
         System.out.print("\033[H\033[2J");
        System.out.println("\t--------- * ---------");
        System.out.println("\t     Delete Student      ");
        System.out.println("\t--------- * ---------");
        
        System.out.print("Enter Your ID : ");
        int id = input2.nextInt();
        
        System.out.println(repo.deleteStudent(id));
        }
    
}
