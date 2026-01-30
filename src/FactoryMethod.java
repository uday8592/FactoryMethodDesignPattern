public class FactoryMethod {

    public static Employee getSalary(String employeeType){
        if(employeeType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        } else if (employeeType.trim().equalsIgnoreCase("BACKEND DEVELOPER")) {
            return new BackendDeveloper();

        }
        else {
            return null;
        }
    }
}
