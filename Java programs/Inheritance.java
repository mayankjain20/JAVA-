class Animal{
    
      void eat(){
             System.out.println("animal are eating grass");
            }
         }
 class Dog extends Animal {
           void bark(){
            System.out.println("dogs are barking on the road ");
         }
    } 
  class Inheritance{
          public static void main (String args[]){
          Dog obj=new Dog();
          obj.bark();
          obj.eat();
}
}
