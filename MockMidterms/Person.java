//  A
/*
public class Person {
    public String name     = "";
    public String favPet   = "";
    public String[] petLis;
    
    Person(String name, String favPet, String[] pets) {
        this.name = name;
        this.favPet = favPet;
        this.petLis = pets;
    }
    public boolean SuperHappy() {
        int count = 0;
        for (int i = 0; i < this.petLis.length; i++) {
            if (this.petLis[i] == this.favPet) {
                count += 1;
            }
        }
        if (count >= (this.petLis.length + 1) / 2){
            return true;
        }
        else{
            return false;
        }
    }

    
    


    public static void main(String[] args) {
        Person p = new Person("John", "Cat", new String[]{"Cat", "Cat", "Cat", "Dog", "Cat"});
        

        System.out.println(p.name);
        System.out.println(p.SuperHappy());

    }
}
*/
// B

public class Person {
    public String name     = "";
    public String favPet   = "";
    public String[] petLis;
    
    Person(String name, String favPet, String[] pets) {
        this.name = name;
        this.favPet = favPet;
        this.petLis = pets;
    }
    public boolean SuperHappy() {
        int count = 0;
        for (int i = 0; i < this.petLis.length; i++) {
            if (this.petLis[i] == this.favPet) {
                count += 1;
            }
        }
        if (count >= (this.petLis.length + 1) / 2){
            return true;
        }
        else{
            return false;
        }
    }

    
    


    public static void main(String[] args) {
        Person p = new Person("John", "Cat", new String[]{"Cat", "Cat", "Cat", "Dog", "Cat"});
        

        System.out.println(p.name);
        System.out.println(p.SuperHappy());

    }
}