public class Triangle {       //CLASS or BLUEPRINT
	
	  //Adding STATIC variables. See STATIC vs INSTANCE variables for clarity
	  //STATIC variables are also called CONSTANTS
	   static int numOfSides = 3;
	
	
       double base;             //instance variable : SCOPE is NOT just limited to this class
       double height;            //instance variable
       double sideLenOne;        //instance variable
       double sideLenTwo;        //instance variable
       double sideLenThree;      //instance variable
       
       public Triangle (double base, double height, double sideLenOne, double sideLenTwo     //instance method or CONSTRUCTOR
    		            , double sideLenThree /*PARAMETERS*/) {                  
    	   this.base = base;                         //ATTRIBUTES corresponding to PARAMETERS
    	   this.height = height;                     //The dot (.) attribute along with the keyword 'this' are 
    	   this.sideLenOne = sideLenOne;             //used to separate attributes from corresponding parameters. 
    	   this.sideLenTwo = sideLenTwo;             //It is not necessary for both of them to be equal. 
    	   this.sideLenThree = sideLenThree;
    	  
       }
       
       public double findArea() {                      //BEHAVIOUR or FUNCTION or METHOD
    	   return (this.base * this.height) / 2;       //using attributes of constructor declared above in the same class. 
    	   //Returning a double                        //SCOPE of these attributes is limited to this class "Triangle"
       }
}
