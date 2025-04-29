
package program;

import java.util.List;


public class Student {    
 private int Student_ID ; 
 private String FirstName ; 
 private String LastName ;  
 private String gender ;     
 private List<Cources> Courcse ;
 
 public Student (int Student_id ,String firstname  , String lastname  ,String gender ,  List<Cources> courcse ) { 
 this.Student_ID=Student_id ; 
 this.FirstName=firstname ; 
 this.LastName=lastname ; 
 this.gender=gender ;  
 this.Courcse=courcse ;
 
 } 
 public Student () {}
 

 public void SetStudentId (int id ) {
   this.Student_ID=id ; 
 }    
 public int GetStudentId() { 
     return this.Student_ID ; 
 }
 public void SetFirstName (String  Fi_name  ) {
   this.FirstName=Fi_name  ; 
 }    
 public String  GetFirstName () { 
     return this.FirstName ; 
 }
 public void SetLastName (String  La_name  ) {
   this.LastName=La_name  ; 
 }    
 public String  GetLastName() { 
     return this.LastName ; 
 }    
 

 public void setCourcse(List<Cources> courcse) {
        this.Courcse = courcse;
    }

    
public List<Cources> getCourcse() {
        return Courcse;
    }

public double GetGPA (){  
       double Total = 0 ;      // gettotal ارجاع جميع البيانات ف الكورس (علامة الامتحان الاول والثاني والنهائي)// total : المجموعه الكلي لدرجات الكورس 
    for(Cources C : Courcse) { 
      Total+=C.getTotal(); 
      }
return Total / Courcse.size();  // حساب ال GPA     size : هاي بتجيب عدد الكورسات في الكورسز 
}
    // total/size : قسمة المجموع الكلي للدرجات على عدد الكورسات   

/* 
مثال:
افترض أن الطالب لديه 3 كورسات، وكل كورس يحتوي على المجموع التالي:

كورس 1: مجموع الدرجات = 250
كورس 2: مجموع الدرجات = 270
كورس 3: مجموع الدرجات = 230


في هذه الحالة، المتغير total سيكون 250 + 270 + 230 = 750

 وعدد الكورسات courses.size() سيكون 3.



*/     

}


