/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa_sort;

/**
 *
 * @author ELCOT
 */
import java.util.*;  
  

class Student{  
int rollno;  
String name;  
float cgpa;  
Student(int rollno,String name,float cgpa){  
this.rollno=rollno;  
this.name=name;  
this.cgpa=cgpa;  
}  
} 

class CgpaComparator implements Comparator{  
@Override
public int compare(Object o1,Object o2){  
Student s1=(Student)o1;  
Student s2=(Student)o2;  
  
if(s1.cgpa==s2.cgpa)  
return 0;  
else if(s1.cgpa>s2.cgpa)  
return 1;  
else  
return -1;  
}  
}  
public class Cgpa_sort {

    /**
     * @param
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList al=new ArrayList();  
al.add(new Student(60,"Akash", (float) 6.0));  
al.add(new Student(62,"Ajay", (float) 6.3));  
al.add(new Student(100,"Agilesh", (float) 10.0)); 
al.add(new Student (82,"Manees", (float) 80.6));
al.add(new Student(90,"Ganesh", (float) 9.0));  
al.add(new Student(91,"Vasanth", (float) 9.8));  
al.add(new Student(92,"Ram", (float) 9.7)); 
al.add(new Student (93,"Dinesh", (float) 9.6));
al.add(new Student(90,"Raja", (float) 9.0));  
al.add(new Student(91,"gopi", (float) 9.8));  
al.add(new Student(92,"suresh", (float) 9.7)); 
al.add(new Student (93,"Messi", (float) 9.6));
al.add(new Student(90,"Sandeep", (float) 9.0));  
al.add(new Student(91,"Sharma", (float) 9.8));  
al.add(new Student(92,"Bigil", (float) 9.7)); 
al.add(new Student (93,"Ajay", (float) 9.6));
  

  
System.out.println("Sorting by CGPA");  
  
Collections.sort(al,new CgpaComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.cgpa);  
}
    }
    
}
