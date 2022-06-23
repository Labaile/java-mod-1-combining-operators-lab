public class Main {
    public static void main(String[] args) {

       // To the user: to display the AND logic, change both variables to "true"
       //              to display the OR logic, change one of the variable to "false"
        
       boolean r, s;

        r = true;
        s = true;

        //and logic
        if (r == true && s == true ){
            System.out.println(" Truth Table for && Operator ");
            System.out.println(" true && true = true");
            System.out.println(" true && false = false");
            System.out.println(" false && false = false");
            System.out.println(" false && true = false ");
        } 
        // or logic
            else if(r == true || s == true) {
            System.out.println(" Truth Table for || Operator ");
            System.out.println(" true || true = true");
            System.out.println(" true || false = true");
            System.out.println(" false || false = false");
            System.out.println(" false || true = true ");
               
            }else{
                return;
            }
    
    
    
    
    
    
    
    
        
        
        }
}
        