class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void bark(){
     super.eat();
     System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){
    super.bark();
    System.out.println("weeping...");}  
}  
class Main{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
}}  

/*
output:
eating...
barking...
weeping...
*/
