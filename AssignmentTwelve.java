import java.util.Scanner;
public class AssignmentTwelve{
public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter an email address to validate:");
String email = sc.nextLine();
if(isValidEmail(email)){
System.out.println("Email address is valid");
}else{
System.out. println("Invalid email");
}
   sc.close();
}
public static boolean isValidEmail(String email){

int atSymbolCount = 0;
for(int i = 0; i<email.length();i++){
     if (email.charAt(i)== '@'){
          atSymbolCount++;
    }
}
if(atSymbolCount != 1){
return false;
}

int atIndex = email.indexOf('@');
if(atIndex < 1 || atIndex == email.length() -1){
return false;
}

String domainPart = email.substring(atIndex + 1);
if(!domainPart.contains(".")){
return false;
}

int dotIndex = domainPart.indexOf('.');
if(dotIndex < 1|| dotIndex == domainPart.length()-1){
return false;
}

if(email.contains ("email")){
    return false;
  }
  return true;

}
}