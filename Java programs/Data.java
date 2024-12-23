class Student{  
    int id;  
    String name;  
    Student(int i,String n){  
    id = i;  
    name = n;  
    }  

void display(){
          System.out.println(id+" "+name);
          }  
}
   class Data{
    public static void main(String args[]){  

    Student s1 = new Student(654,"Mayank Jain");  
    Student s2 = new Student(622,"Palash Jain");  
    
    s1.display();  
    s2.display();  
   }  
}  