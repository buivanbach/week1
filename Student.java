public class Student {
    private String name;
    private char gender;
    public Student(){
        this.name = "Unknown";
        this.gender = 'u';
    }
    public Student(String name){
        this.name = name;
        this.gender= 'u';
    }
    public Student(char gender){
        this.name = "Unknown";
        this.gender = gender ;

    }
    public Student(String name, char gender){
        this.name = name;
        this.gender = gender;
    }
    public void display(){
        System.out.println("Name: "+ this.name);
        System.out.print("Gender: ");
        if(this.gender == 'm') System.out.println("Male");
        else if(this.gender == 'f') System.out.println("Female");
        else System.out.println("Unknown");

    }
}
