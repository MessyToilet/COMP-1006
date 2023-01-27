
import java.util.Scanner;  // used to help with user input


public class BasicJava{

    public static void main(String[] args){
        primitive_types();
        strings();
        logic();
        branching();
        loops();
    }

    public static void loops(){
        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Repetition : Loops (while)");
		System.out.println("--------------------------------------------------");

        String code = """
            // simple while loop
            int bound = 7;
            int count = 0;
            while(count < bound){
                System.out.print(count + ",");
                count += 1;
            }
            System.out.println("END");
            """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // simple while loop
        int bound = 7;
        int count = 0;
        while(count < bound){
            System.out.print(count + ",");
            count += 1;
        }
        System.out.println("END");

        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("while with break");
		System.out.println("--------------------------------------------------");

        code = """
        // while loop with break
        bound = 342;
        count = 0;
        while(count < bound){
            if(count > 3){
                break; // exit loop
            }
            System.out.print(count + ",");
            count += 1;
        }
        System.out.println("END");                
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // while loop with break
        bound = 342;
        count = 0;
        while(count < bound){
            if(count > 3){
                break; // exit loop
            }
            System.out.print(count + ",");
            count += 1;
        }
        System.out.println("END");

        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("while with continue");
		System.out.println("--------------------------------------------------");

        code = """
        // while loop with continue
        bound = 10;
        count = 0;
        while(count < bound){
            if(count % 2 == 0){ // check if bound is EVEN
                count += 1;
                continue; // exit iteration
            }
            System.out.print(count + ",");
            count += 1;
        }
        System.out.println("END");
          """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // while loop with continue
        bound = 10;
        count = 0;
        while(count < bound){
            if(count % 2 == 0){ // check if bound is EVEN
                count += 1;
                continue; // exit iteration
            }
            System.out.print(count + ",");
            count += 1;
        }
        System.out.println("END");

        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("the do-while loop");
		System.out.println("--------------------------------------------------");

        code = """
        // do-while loop always has at LEAST one iteration
        boolean go = true;
        count = 1;
        do{
            System.out.println("inside the do-while, count = " + count);
            if(count > 3){
                go = false;
            }
            count += 1;
        }while( go == true ); 
        // Note: do{}while(); ends with semicolon! Be careful. 
            """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        

        // do-while loop always has at LEAST one iteration
        boolean go = true;
        count = 1;
        do{
            System.out.println("inside the do-while, count = " + count);
            if(count > 3){
                go = false;
            }
            count += 1;
        }while( go == true ); 
        // Note: do{}while(); ends with semicolon! Be careful. 


        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("for loops [DIFFERENT THAN PYTHON!!!!!!!!!!!!]");
		System.out.println("--------------------------------------------------");
        System.out.println("consider typical while loop for a fixed number of iterations");
        System.out.println("> int count = 0;           // counter initialization");
        System.out.println("> while(count < bound){    // loop condition");
        System.out.println(">    // do something");
        System.out.println(">    count +=1;            // counter increment");
        System.out.println("> }");
        System.out.println("");
        System.out.println("We put the counter initializtion, condition for looping and increment");
        System.out.println("all in one place with the for loop");
        System.out.println("");
        System.out.println("for(int count; count < bound; count += 1){//do something}");
        System.out.println("--------------------------------------------------");

        code = """
        // for loop
        bound = 7;
        for(int counter = 0; counter < bound; counter += 1){
            System.out.print(counter + ",");
        }
        System.out.println("END");
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // for loop
        bound = 7;
        for(int counter = 0; counter < bound; counter += 1){
            System.out.print(counter + ",");
        }
        System.out.println("END");

        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("for loops [DIFFERENT THAN PYTHON!]");
		System.out.println("--------------------------------------------------");

        code = """
        // for loop with different increment
        bound = 17;
        for(int i = 0; i < bound; i += 3){
            System.out.print(i + ",");
        }
        System.out.println("END");        
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // for loop with different increment
        bound = 17;
        for(int i = 0; i < bound; i += 3){
            System.out.print(i + ",");
        }
        System.out.println("END");

        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("enhanced for loops [SIMILAR TO PYTHON]");
		System.out.println("--------------------------------------------------");

        code = """
        // enhanced for loop : loop over a collection or array
        String[] words = {"cat", "dog", "eel"};
        for(String w : words){
            System.out.print(w);
        }
        // Note: you CANNOT change the words array here 
        // (use a normal loop if you want to change it)
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");
        // enhanced for loop : loop over a collection or array
        String[] words = {"cat", "dog", "eel"};
        for(String w : words){
            System.out.println(w);
        }
         // Note: you CANNOT change the words array here 
         // (use a normal loop if you want to change it)
        pause();

    }

    public static void branching(){
        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Branching (if)");
		System.out.println("--------------------------------------------------");

        String code = """
        // simple if statements
        if( 10 < 20 ){ 
            System.out.println("if(10<20) was true");
        }
        if( 99 < 3){ 
            System.out.println("if(99<3) was true" );
        }
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");

        // simple if statements" );
        if( 10 < 20 ){ 
            System.out.println("if(10<20) was true");
        }
        if( 99 < 3){ 
            System.out.println("if(99<3) was true" );
        }
        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Branching (if/else)");
		System.out.println("--------------------------------------------------");

        code = """
        // simple if/else statements
        if( 10 < 20 ){ 
            System.out.println("if(10<20) was true");
        }else{
            System.out.println("if(10<20) was false");
        }

        if( 99 < 3){ 
            System.out.println("if(99<3) was true" );
        }else{
            System.out.println("if(99<3) was false" );
        }
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");

        // simple if/else statements
        if( 10 < 20 ){ 
            System.out.println("if(10<20) was true");
        }else{
            System.out.println("if(10<20) was false");
        }

        if( 99 < 3){ 
            System.out.println("if(99<3) was true" );
        }else{
            System.out.println("if(99<3) was false" );
        }
        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Branching (if/else if/else)");
		System.out.println("--------------------------------------------------");

        code = """
        int a = 10, b = 30, c = 20; // multiple declarations and initializations 
        if( a > b ){ 
            System.out.println("a>b is true");
        }else if(b > c){
            System.out.println("b>c is true (and a>b must be false)");
        }else{
            System.out.println("a>b must be false and b>c must be false");
        }
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");

        int a = 10, b = 30, c = 20; // multiple declarations and initializations 
        if( a > b ){ 
            System.out.println("a>b is true");
        }else if(b > c){
            System.out.println("b>c is true (and a>b must be false)");
        }else{
            System.out.println("a>b must be false and b>c must be false");
        }
        pause();

        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Branching overview");
		System.out.println("--------------------------------------------------");

        System.out.println("""
        Branching with if/else if/else consists of
           one "if(condition)"  
           zero or more "else if(condition)"
           zero or one "else"

        to execute a block of code or not (if)
        to execute one block of code xor another block of code (if/else)
        to execute one of several blocks of code (if/else if/.../else)
        to execute one of several blocks of code or nothing (if/else if/.../else if) [no else] 
        """);
        pause();

    }


    public static void logic(){
        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Basic logic (or, and, negation/not)");
		System.out.println("--------------------------------------------------");

        String code = """
        boolean a = true;
        boolean b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("[NOT] !a = " + !a );          // ! means negation/not
        System.out.println("[OR]  a || b = " + (a || b)); // || means OR
        System.out.println("[AND] a && b = " + (a && b)); // && means AND
        // Note: we need the extra parentheses in the last two examples! (why?)
        """;
         
        display(code);
        System.out.println("--------------------------------------------------");

        boolean a = true;
        boolean b = false;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("[NOT] !a = " + !a );          // ! means negation/not
        System.out.println("[OR]  a || b = " + (a || b)); // || means OR
        System.out.println("[AND] a && b = " + (a && b)); // && means AND
        // Note: we need the extra parentheses in the last two examples! (why?)
        
        
        pause();

    }

    public static void strings(){
        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Strings in Java let us use text ");
		System.out.println("--------------------------------------------------");
		
        String code = """
        String name1 = "cat";             // strings are enclosed in double quotes
        String name2 = new String("dog"); // can create them with new operator (but don't!)
        String name3 = name1 + name2;     // can concatenate (add) strings with + operator
        
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + "\\"" + name3 + "\\""); // use \\" for quotes in a string
        """;
     
        display(code);
        System.out.println("--------------------------------------------------");

		String name1 = "cat";             // strings are enclosed in double quotes
		String name2 = new String("dog"); // can create them with new operator (but don't!)
		String name3 = name1 + name2;     // can concatenate (add) strings with + operator
		
		System.out.println("name1 = " + name1);
		System.out.println("name2 = " + name2);
		System.out.println("name3 = " + "\"" + name3 + "\""); // use \" for quotes in a string

        pause();

        code = """
            String word = "kittens in the kitchen";
            System.out.println("word = " + "\"" + word + "\"");
            System.out.println("word.length() = " + word.length());
            System.out.println("word.charAt(1) = " + "'" + word.charAt(1) + "'");
            System.out.println("word.substring(3,11) = " + "\""+ word.substring(3, 11) + "\"");
            System.out.println("\"a\".rerpeat(4) = " + "a".repeat(4));
            """;
     
        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Strings have many methods (lots of behaviour)  ");
        System.out.println("--------------------------------------------------");
            
        display(code);
        System.out.println("--------------------------------------------------");

        String word = "kittens in the kitchen";
        System.out.println("word = \"" + word + "\"");
        System.out.println("word.length() = " + word.length());
        System.out.println("word.charAt(1) = '" + word.charAt(1) + "'");
        System.out.println("word.substring(3,11) = \"" + word.substring(3, 11) + "\"");
        System.out.println("\"a\".rerpeat(4) = \"" + "a".repeat(4) + "\"");
        

    }

    public static void primitive_types(){
        System.out.println("\n\n--------------------------------------------------");
		System.out.println("Some primitive data types in Java");
		System.out.println("--------------------------------------------------");
		
        String code = """
            int     int_variable = 13;
            long    long_variable = 12345678901234L; // bigger than an int, we need the L here
            boolean boolean_variable = true;
            char    char_variable = 'q';             // use single quotes for chars
            double  double_variable = 3.145195;      // floating point numbers can be float or double
            // Java will automatically convert primitives to strings if you add them to a string		
            System.out.println("int_variable = " + int_variable);
            System.out.println("long_variable = " + long_variable);
            System.out.println("boolean_variable = " + boolean_variable);
            System.out.println("char_variable = " + char_variable);
            System.out.println("double_variable = " + double_variable);
            """;
     
        display(code);
        System.out.println("--------------------------------------------------");
	
		int     int_variable = 13;
		long    long_variable = 12345678901234L; // bigger than an int, we need the L here
		boolean boolean_variable = true;
		char    char_variable = 'q';             // use single quotes for chars
		double  double_variable = 3.145195;      // floating point numbers can be float or double
		// Java will automatically convert primitives to strings if you add them to a string		
		System.out.println("int_variable = " + int_variable);
		System.out.println("long_variable = " + long_variable);
		System.out.println("boolean_variable = " + boolean_variable);
		System.out.println("char_variable = " + char_variable);
		System.out.println("double_variable = " + double_variable);
        pause();
    }


    public static void pause(String message){
        int len = message.length();
        System.out.println("-".repeat(len+2));
        System.out.println(" " + message);
        System.out.println("-".repeat(len+2));
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        return;
    }

    public static void pause(){
        BasicJava.pause("Hit enter to continue.");
        // we did not need to specify the Class name (BasicJava)
        // when calling this static method, but we can. 
    }

    public static void display(String code){
        System.out.println("> " + code.replace("\n", "\n> "));
    }

    

}