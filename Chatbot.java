import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Chatbot{
   public static final Map<String,String> responses=new HashMap<>();
   static{
       responses.put("hi", "Hello!! How can I help you?");
       responses.put("hello", "Hello there!!");
       responses.put("what is your name?", "I am a chatbot to assist you!");
       responses.put("good morning", "Have a nice day");
       responses.put("good afternoon", "Have a nice day");
       responses.put("good evening", "Have a nice day");
       responses.put("good night", "Sweet dreams"); 
       responses.put("thank you", "It's my pleasure!");
   }
   public static void main(String[] args){
       Scanner scanner=new Scanner(System.in);
       System.out.println("Welcome");
       while(true){
           System.out.println("You:");
           String userinput=scanner.nextLine().toLowerCase();
           if(userinput.equals("bye")){
                 System.out.println("Chatbot: Goodbye!");
                 break;
           }
           String responses=getResponse(userinput);
           System.out.println("Chatbot: " + responses);       
       }
  }
  private static String getResponse(String userinput){
     for(String key:responses.keySet()){
         if(userinput.contains(key)){
             return responses.get(key);
         }
      }
    return "I don't understand that";
  }
}

