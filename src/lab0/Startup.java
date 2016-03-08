package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) throws IllegalArgumentException{

        Employee emp;
        // Think about this code. It wouldn't work if lastName was null
        String fullNameInCaps ="";
        try{
            emp = new Employee("","Smith","3333333333",28);
            
        fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        } catch(IllegalArgumentException e){
            e.getMessage();
            System.out.println(e);
        }
        System.out.println(fullNameInCaps);
    }
}
