
package javaapplication37;


public class JavaApplication37 {

    public static void main(String[] args) {
        String name="Moon";
        String name1 ="moon";
        System.out.println(name1);
        //structure 1 for print string//
        
        String name2=new String("Tanzila");
        System.out.println(name2);
        //structure 2 for print string//
        
        int len= name2.length();
        System.out.println("length of name 2 =" + len);
        /*length of string=if we need to print lenfth of string 
        we need to len object
        
        */
        
        
        if(name==name1){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        }
        
        /*if we print(==) for  compare,then it doesn't compare with value of string
        So we need to take equal method for equalation
        */
        String name3="Moon";
        String name4 ="Moon";
        
        
        System.out.println("Uses of equal method -");
       if(name3.equals(name4)) {
          System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        } 
       
       
        String name5=" Tanzila";
        String name6 =" Sunmoon";
        
        String name7 = name5. concat ( name6 );
        System.out.println("Fullname ="+name7);
        
       //concat method =if we need to add with two string  then add concat method//
    
          String name8=" Tanzila";
        String name9 =" sunmoon";
       String uppername =name7.toUpperCase();
       System.out.println(uppername);
       //if we need to print uppercase,we can add uppercase method//
       
       String lowername =name7.toLowerCase();
       System.out.println(lowername);
       //if we need to print lowercase,we can add lowercasecase method//
        
        
        
        
       
           
       }
       
            
        
   
        
        
        
        
    }
    

