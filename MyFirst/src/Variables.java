  public class Variables {
    public static void main(String[] args){
        String name = "James";
        int age = 25;

        double salary = 70000;

        char gender = 'M';

        boolean married = false;


        System.out.println("Hello" + " " + name + " " + "you are a " + age + " years old " + gender + "." + " You earn $" + salary);

        if (married){
            System.out.println("You are married");
        }
        else{
            System.out.println("You are not married");
        }
    }
}
