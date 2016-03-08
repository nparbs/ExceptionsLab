package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    
    private static final int LAST_NAME_IDX = 1;
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) throws IllegalArgumentException{
        if(fullName ==null || fullName.isEmpty()|| !fullName.contains(" ")){
            throw new IllegalArgumentException("Invalid Full Name");
        }
        
        String lastName = null;
        // Your code goes here. Assign your value to lastName
        String[] nameParts= fullName.split(" ");
        lastName=nameParts[LAST_NAME_IDX];
        return lastName;
    }
    

    
    
}
