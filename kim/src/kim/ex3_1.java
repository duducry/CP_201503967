package kim;
import java.util.Scanner;
public class ex3_1 {


      int year, month, day;
      String monthWord;
    
      public String east() {
         return (year + "." + month + "." + day);
      }
      
      			public String west() {
         String [] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
       monthWord = monthNames[month - 1];
         
         return (monthWord + " " + day + ", " + year);
      }
   }
