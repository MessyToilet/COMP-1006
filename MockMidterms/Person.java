//  A
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

    public static String[][] countPet(String pet, Person[] people) {
        String[][] countPetLis = new String[people.length][];
        for (int i = 0; i < people.length; i++) {
            int count = 0;
            for (int k = 0; k < people[i].petLis.length; i++) {
                if (people[i].petLis[k] == pet) {
                    count += 1;
                }
            }
            countPetLis[i][0] = people[i].name;
            countPetLis[i][1] = Integer.toString(count);
            count = 0;
        }
        return countPetLis;
    }
    public static void main(String[] args){

    }
}


