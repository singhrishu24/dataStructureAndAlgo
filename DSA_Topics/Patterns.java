import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

public class Patterns{

     public static void main(String[] args) {
        int n = 4;
        int m = 5;
        
        //---> 1.Hollow Rectangle
       /*for(int i=1; i<=n; i++){
        for(int j=1; j<=m; j++){
            if(i==1 || j ==1 || i==n ||j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }  
        }
        System.out.println();
       }*/
    
    
       /* 
     //---> 2.Half Pyramid<----- 
       for(int i=1; i<=n; i++) {
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
       
       
       //------>Half Pyramid reverse<----
       for(int i=n; i>=1; i--){    //Pattern reversed 
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    */
       
       
       
       
    /*    
       // ---->3.rotated pyramid 
    for(int i=1; i<=n; i++){
        //inner loop--> print space
        for(int j=1; j<=n-i; j++){   //value changes in each "i" thus "n-i"
            System.out.print(" ");
        }
        //inner loop--> print star
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    */
    
    
    /* 
    //------> 4.Number Pyramid 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    */
    

    //------> 5. Inverted Half Pyramid with Numbers 
    // use "m" for 5 rows 
    /*for(int i=1; i<=m; i++){
        for(int j=1; j<=m-i+1; j++){
            System.out.print(j+" ");
        }
        System.out.println();
      }*/
    
    }
    
} 
