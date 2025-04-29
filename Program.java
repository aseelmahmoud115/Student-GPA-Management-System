
package program;

import java.util.ArrayList;
import java.util.List;


public class Program {

  
    public static void main(String[] args) {     
        Cources C1 = new Cources (1,"computer architecture",20,18,50) ; 
        Cources C2 = new Cources(2,"Scientific research techniques and applied statistics",15,20,60) ; 
        
          List<Cources> CoursesForStudent1 = new ArrayList<>();    
            CoursesForStudent1.add(C1) ; 
            CoursesForStudent1.add(C2) ;  
            Student St1 = new Student(123,"mohammed","Alrabiy","male",CoursesForStudent1);
          
          
          List<Cources> CoursesForStudent2 = new ArrayList<>();  
            CoursesForStudent2.add(C1) ; 
            Student St2 = new Student(123,"Leen","Mahmood ","fmale",CoursesForStudent2);
        
          List<Student> Students = new ArrayList<>();
             Students.add(St1) ; 
             Students.add(St2) ; 
             
           
         for(Student S : Students ){ 
             System.out.println(S.GetFirstName()+"  "+S.GetLastName()+"  Has a Gpa of :"+S.GetGPA() +"%");
         
         
         }
    }
    
}
