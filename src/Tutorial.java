

public class Tutorial {
    public static void main(String[] args) {
        //makes this into a new line when printing
        System.out.println("hello world");
        //This one just makes it print in the same line
        System.out.print("yay");
        System.out.print("- test 2");
        //Numbers don't need quotes, only text
        System.out.println(55);
        System.out.print("1+2 is ");
        //it can do math :D
        System.out.print(1+2);
        /*multi
         * line
         * comments
         * :D
         */
        //variables must be set like - type VariableName = value
        int myNum = 5;               // Integer (whole number)
        float myFloatNumz = 5.99f;    // Floating point number
        char myLetterz = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String
        //you can set up a varuable and change it later
        int MyNum = 15;
            MyNum =20;
        System.out.println(MyNum);
        //Unless you put final, then it makes it a read only once intialized
        final int RealNum = 22;
        float myFloatNum = 5.99f ;
        char myLetter = 'D';

        //You can delcare more than one variable of the same type using commas
        int d = 5, f = 4, g = 5;
        System.out.println(d + f + g);

        //Using this same concept, you can apply one value to multiple variables
        int c, v, b;
        c = v = b = 44;
        System.out.println(c + v + b);

        //btw, variable names are actually called identifiers just make sure it isn't alreadu a java keyword like int or string

        /*there are two versions of floating point
         *The precision of float is only six or seven decimal digits, while double variables have a precision of about 16 digits.
         *  Therefore it is safer to use double for most calculations.
         */
        //btw floats should end with "f" while the double variation should end with "d"
        double MyNubs = 10.99d;

        //floats can display scientific numbers if you use "e"
        float f1 = 35e3f;
        System.out.println(f1);    //this will print out 35 * 10^3 or 35000

        //boolean... true or false, thats it
        //MOD is now % 
        //You can now do increment and decrements using double signs such as ++
        int x = 3;
         ++x;
       System.out.println(x);

       //Assisnment operators exist and its just like shorthand for the arithmetic operators
       int w = 5;
       w += 3 ; // w = w + 3	
       System.out.println(w);
    
       //we can do comparision using =. !=, and the < >
     System.out.println(x == w); //if x is euqal to w, will return bool
     System.out.println(x != w); //if x is not equal to w, will return boll
     System.out.println(x <= w); // if x is not less than or euqal to, return bool

        //Logical operators can test for logic between variables/values
        //"&&"	Returns true if both statements are true
        System.out.println(x > 3 && x < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
        //"||" Returns true only if one of the statements is true
        System.out.println(x > 3 || x < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)
        //"!" Reverse the result, returns false if the result is true

       //Use the "length()" to find well, the length of a string
       System.out.println("The length of the text string is: " + myText.length());

       //you can do magic by transforming the output of a class into all lower or all upper case
       String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
       
        //indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)
        System.out.println(txt.indexOf("locate")); //will output "7" since the first instance is in the 7th index position

        //not only can you add integers, you can add strings to make a string concatenation
        String ox = "10";
        String y = "-opps";
        String z = ox + y;  // z will be 10-opps (a String)

        //since you use quotes to yk, tell java that its a value instead of a method. These are the 3 ways you can add stuff
        System.out.println("they are called \"bears\" since its their mascot"); // the \" thing adds a double quote
        System.out.println("they\'re"); // the \' thing adds a single quote
        System.out.println("their pronouns are they//them"); // the \\ thing adds a backslash

        //random number generator :D
        Math.random(); //returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        int randomNum = (int)(Math.random() * 101);  // // 0 to 100

        //if, else, else if stuff
        /*
         * if statement - checks if the condition is true and runs the code (starts the decision making)
         * else statement - runs the code when an if statement is false or no conditions are true (fallback)
         * else if statement - provides an additional condition when the if statement is false and runs if this condition is true (adds more conditions to check)
         */

        if(randomNum >= 10){
            System.out.println("higher than 10");
        }   else if (randomNum >= 5) {
            System.out.println("higher than 5");
        }   else {
            System.out.println("lower than 10 & 5");
        }
        
        /*There is also a short-hand if else, which is known as the ternary operator because it consists of three operands/values
         * Syntax - 
         * variable = (condition) ? expressionTrue :  expressionFalse;
         */
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //if you have too many if else statments for a variable, you can use the switch command to use a dictionary type approch
        
        switch (time) {
            case 20 :
                System.out.println("its 20");
                break; //break out of the code block once its done executing
             case 30 :
                System.out.println("its 30");
                 break;
            default: //if no matches are found, this will be the defualt response/code to be executed
                System.out.println("please input a correct time");
                break;
        }

        //For loop
        /*
         * Syntax
         * for (initialization; condition; update) { statements }
         * Initialization:
             his is executed once, at the beginning of the loop.
             It’s typically used to initialize the loop counter variable.
           Condition:
            The loop will continue as long as this condition evaluates to true.
             When it evaluates to false, the loop terminates.
            Update:
             This part updates the loop counter variable after each iteration.
             Typically used to increment or decrement the counter.
         */
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
        /*Explanation:
        Initialization: int i = 0 (counter i starts at 0).
        Condition: i < 5 (loop runs while i is less than 5).
        Body: Prints the value of i.
        Update: i++ (increments i by 1 after each iteration).
         */

        // -------------------------------------------------------
        //nested loop 
        
        /*
            A nested loop in Java is a loop inside another loop. The inner loop runs completely for each iteration of the outer loop.
            Syntax - 
         * for (initialization; condition; update) { // Outer loop controls the # of times the inner runs
            for (initialization; condition; update) { // Inner loop runs iterations for each iteration of the outer loop.
             Code to be executed
                }
            }
         */
         for (int i = 1; i <= 5; i++) { // Outer loop (controls rows)
            for (int j = 1; j <= i; j++) { // Inner loop (controls columns)
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line
        }
        //Outer loop  controls the rows
        //Inner loop controls the number of stars according to the outer loop

        //For-each Loop
        int[] nubs = {1,2,3,4};
        for (int num : nubs){
            System.out.println(num);
        }
        //The loop iterates over each element in the numbers array.
        //The variable num holds the current element in each iteration.
        
         //you can use continue and break commands in while loops
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              continue;  // The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
            }
            if(i==10);{
                 System.out.println("yep, this is numbero 10");
                 //break;
            }
            System.out.println(i);
        }

        //--------------------------------------------------------------------------------------
        //ARRAY TIME
        /*
         *  1D Array: A single row of elements.
            2D Array: Rows and columns, like a table.
            3D Array: A collection of 2D arrays (layers of tables).
         */

        //A 1D array can hold multiple variables
        /*Syntax
         * Type[]array_name;  this sets up the array
         * Type[]array_name = {val, val2, val3};  this add stuff into it
         * System.out.println(array_name[0]); this prints out the first element within the array
         * array_name[0] = "val_new";  this changes the value of the specified element according to the index number
         * System.out.println(array_name.length);  this prints out the number of elements within an array (this one will print 3)
         */

        //Looping through an array

        //In the for-each loop, you iterate directly through the array using the brand1 variable
        String[] brand = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String brand1 : brand) {
            System.out.println(brand1);
        }

        //In this traditional for loop, you use an index to access and loop throught the array/
        //Using this, you can both access the index of each element (such as i==2 which is the 3rd item) & modify directly through i by array_name[i] = new_item
       // String[] brand = {"Volvo", "BMW", "Ford", "Mazda"};
         for (int i = 0; i < brand.length; i++) {
            System.out.println(brand[i]);
            }

        //btw you can initialize mutliple variables that have the same type in a line using commas
        float jkl, jkk, bhs;

        //A multidimensional array is an array of arrays. This just means any array with any number of dimensions to it like 2D, 3D, 1000D arrays

        //2D Array
        //This type of array has both rows & columns, guess why its called a 2D array...
        int[][] myNumbers = {
        
         {1, 2, 3, 4}, //Row 1
         {5, 6, 7, 8}     //Row 2
         };

         //You could also make this a Jagged Array where the row length are not the same, the initialization/syntax is the same as the 2D array

        //to access the data within the 2D array, you must use the index number that aligns with the row & column of such data
        //Accessing 2D Array Values - array[rowIndex][columnIndex];

        System.out.println(myNumbers[1][2]); //prints the value 6
        myNumbers[1][2] = 8; //changes the value of row 1, column 2 value to 8 (in this case, its no longer "6")
        System.out.println(myNumbers[1][2]); // prints the value 8

        //3D Array
        //guess what, its an array of 2D arrays. We now introduce the concept of depth, so its now kinda looks like a cube idk
        //Apparently jagged arrays can be applicable to all multidimensional arrays, so keep that in mind

        int[][][] cube = {
            {//Layer 1
                {1,2,3}, //Row 1
                {4,5,6} // Row 2
            },
            {//Layer 2
                {7,8,9}, //Row 1
                {10,11,12} // Row 2
            }
        };

        //Accessing values in a 3D array - array[layerIndex][rowIndex][columnIndex];
        System.out.println(cube[1][1][2]); // Layer 2, Row 2, Column 3 prints out value 12
        //Remember that the index system starts at 0, NOT "1"  / Index 1 = value 2

        //Nested Example of a 3D array
        //testing loop
        for (int i = 0; i < cube.length; i++) {           // Iterate over layers
            for (int j = 0; j < cube[i].length; j++) {    // Iterate over rows in each layer
                for (int k = 0; k < cube[i][j].length; k++) { // Iterate over columns in each row
                     System.out.print(cube[i][j][k] + " ");
                }
                System.out.println(); // Newline after each row
             }
            System.out.println(); // Separate layers with a blank line
         }
        
         
         
    }
}
