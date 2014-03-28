package org.levelup.studentmanager;

public class ResidentStudent extends Student{

    public ResidentStudent(String name, String studentNumber){
        super(name, studentNumber);
    }

    public Integer getFees(){
        return this.TUITION + this.ACCOMMODATION_FEE; 
    }
        
}
