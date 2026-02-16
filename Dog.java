 class dog{
            String breed;   // Declaration and intiating the variable
            int age;
            String color;

        public void setDetails(String breed, int age, String color){
            this.breed = breed;
            this.age = age;
            this.color = color;
        
        }

        }
        public class Dog{
        public static void main(String args[]){
        dog obj = new dog();  // creating the object
        obj.setDetails("Pitbull", 4, "Brown");
        obj.printDetails();
        
        }
    }