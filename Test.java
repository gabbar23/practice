// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// class Main{
//     static int variable1;
//     int variable2;
    
    
//     Main(){
//         this.variable2=100;
//         System.out.println("Inside Constructor - Instance was Created");
//     }

//     static {
        
//         System.out.println("Static Block was Called");
//     }


//     static void printSomething(){

//         System.out.println("Inside the print method");
//     }

//      void printSomething2(){

//         System.out.println("Inside the print method");
//     }

//     public static void main(String[] args) {
//         Main m1=new Main();


//         Main.printSomething();
       
       


//     }

  

// }



























// // public class DatabaseConfig {
// //     public static String url;
// //     public static String user;
// //     public static String password;

// //     static {
// //         // Static block to initialize static variables
// //         url = "jdbc:mysql://localhost:3306/mydatabase";
// //         user = "root";
// //         password = "password";
// //         System.out.println("Database configuration initialized.");
// //     }
// // }

// // // Usage example
// // public class Test {
// //     public static void main(String[] args) {
        
// //         System.out.println("Database URL: " + DatabaseConfig.url);
// //         System.out.println("Database User: " + DatabaseConfig.user);
// //     }
// // }



final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
        System.out.println("This is a final class.");
        System.out.println("This is a final class.");
        System.out.println("This is a final class.");
        System.out.println("This is a final class nfjafgb.");



        // Title

        //whAt you changed - why you changed - what was the outcome
    }
}

// class SubClass extends FinalClass { // Compilation error: cannot inherit from final class
// }

public class Test extends FinalClass {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display(); // Output: This is a final class.
    }
}

