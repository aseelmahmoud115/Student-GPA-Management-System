
package program;

public class Cources {
     private int Cources_ID  ; 
     private String Cources_Name ; 
     private double  First_exam ; 
     private double Second_exam ; 
     private double Final_exam ;   
     
     public Cources (){}
     public Cources(int Cources_id , String Cources_name , double first_exam  , double second_exam , double final_exam ) {
     this.Cources_ID=Cources_id ; 
     this.Cources_Name=Cources_name ; 
     this.First_exam=first_exam ; 
     this.Second_exam=second_exam ; 
     this.Final_exam=final_exam ; 
     
     }      
   
    public void setCources_ID(int Cources_ID) {
        this.Cources_ID = Cources_ID;
    } 
    public int getCources_ID() {
        return Cources_ID;
    }


    public void setCources_Name(String Cources_Name) {
        this.Cources_Name = Cources_Name;
    } 
    public String getCources_Name() {
        return Cources_Name;
    }

 
    public void setFirst_exam(double First_exam) {
        this.First_exam = First_exam;
    }
    public double getFirst_exam() {
        return First_exam;
    }

   
    
    public void setSecond_exam(double Second_exam) {
        this.Second_exam = Second_exam;
    }
    public double getSecond_exam() {
        return Second_exam;
    }

    public void setFinal_exam(double Final_exam) {
        this.Final_exam = Final_exam;
    }
     
    public double getFinal_exam() {
        return Final_exam;
    }

   public double  getTotal() {
        return this.First_exam + this.Second_exam+ this.Final_exam;   
        
    }
     
}
