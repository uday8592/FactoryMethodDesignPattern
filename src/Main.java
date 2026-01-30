//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   Employee employee1 = FactoryMethod.getSalary("WEB DEVELOPER");
   System.out.println(employee1);
   System.out.println(employee1.salary());

   Employee employee2 = FactoryMethod.getSalary("BACKEND DEVELOPER");
   System.out.println(employee2);
   System.out.println(employee2.salary());
    }
}