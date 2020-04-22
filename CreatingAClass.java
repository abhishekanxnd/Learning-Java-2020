
public class CreatingAClass {

	public static void main(String[] args) {
		//See class "Triangle" for reference.
		Triangle triangleA = new Triangle(15,8,15,8,17);  //create a variable "triangleA/B" of "Triangle" data type 
		Triangle triangleB = new Triangle(3,2.598,3,3,3); //and call the Constructor method Triangle defined in class named "Triangle"
		//Above are 2 triangle INSTANCES
		/*Now we will use method/function/behaviour "findArea" to calculate area and store it in a double(which is it's return type)
		  variable*/
		//use DOT operator to access 'findArea' function in a different class
		double triangleAArea = triangleA.findArea(); //calling function findArea 
		System.out.println("Triangle A's Area is " + triangleAArea);   //printing variable
		
		//Triangle.findArea() or Math.pow(2,3)?
		//Since findArea is an INSTANCE METHOD, we call it using a Triangle INSTANCE
		//like triangleA.findArea();
		
		//In case of Math.pow(), we don't need to create an instance of Math to use pow methods.
		//This is because pow() is NOT AN INSTANCE METHOD. It is a STATIC/CLASS method so we call it using Class name 'Math'
		//Usually when we call a method in another class, it is a static/class method and we use class name.
		
		double triangleBArea = triangleB.findArea();
		System.out.println("Triangle B's Area is " + triangleBArea);
		
		System.out.println(triangleA.sideLenThree);   //printing an instance variable from another class
		System.out.println(triangleB.base);  //A FUNCTION has parentheses '()'
		                                     //An ATTRIBUTE does not
       
		System.out.println(Triangle.numOfSides);   //Accessing STATIC variable(CONSTANT) from class "Triangle"
	}

}
