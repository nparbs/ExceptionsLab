package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    public static final int MAX_NAME_LENGTH = 30;
    public static final int MIN_NAME_LENGTH = 1;
    
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values

        setFirstName("Unknown");
        setLastName("Unknown");
        setDaysVacation(0);
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }
    
    //min days 0 max days 28
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException("Sorry vacation days must be between "
                    +MIN_VACATION_DAYS+"-"+MAX_VACATION_DAYS+" Characters");
        }
        
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    
    //cannot be null or empty
    //cannot be less than 1 or greater than 30
    public final void setFirstName(String firstName) throws IllegalArgumentException{
        if(firstName ==null || firstName.isEmpty() || firstName.length() < MIN_NAME_LENGTH || 
                firstName.length() > MAX_NAME_LENGTH){
        throw new IllegalArgumentException("Sorry First Name is invalid, Name must be between "
                    +MIN_NAME_LENGTH+"-"+MAX_NAME_LENGTH+" Characters");
        }
       
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    //cannot be null or empty
    //cannot be less than 1 or greater than 30
    public final void setLastName(String lastName) throws IllegalArgumentException{
        if(lastName ==null || lastName.isEmpty() || lastName.length() < MIN_NAME_LENGTH || 
                lastName.length() > MAX_NAME_LENGTH){
        throw new IllegalArgumentException("Sorry Last Name is invalid, Name must be between "
                    +MIN_NAME_LENGTH+"-"+MAX_NAME_LENGTH+" Characters");
        }
        
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }
    //skip
    public final void setSsn(String ssn) {
        
        this.ssn = ssn;
    }
    
    
    
}
