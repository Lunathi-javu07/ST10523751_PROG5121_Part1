package com.mycompany.chatapp;
import java.util.regex.Pattern;

public class Login {

     String username;
     String password;
     String cellPhoneNumber;
     
     

    // Login process
    Login(String username, String password, String cellPhoneNumber) {
        this.username = username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
    }

    // 1. Username validation
    // it must have an underscore
    // it must not have more than 4 characters long
    
    public boolean checkUserName(String ky_le) {
        return username.contains("_") && username.length() <= 5;
    }

    // 2. Password validation
    // Must be atleast 8 characters long 
    // Must have atleast 1 capital letter
    // Must have atleast one number
    // Must also consist of one special character(!,@,%,#,and many more.)
    
    public boolean checkPasswordComplexity(String Ghhtk8) {
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+=-]).{8,}$";
        
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            
            if(Character.isUpperCase(c)){
                hasCapital = true;
            }else if (Character.isDigit(c)){
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            } 
            }
            
             
            
        
        
        return Pattern.matches(regex, password);
        
       
    }

    // 3. Cell phone validation (South Africa: +27XXXXXXXXX)
    // Start with +27
    // it is no more than 12 characters longer
    
    public boolean checkCellPhoneNumber(String string) {
        String regex = "\\+27\\d{9}$";
        return Pattern.matches(regex, cellPhoneNumber);
    }

    // 4. Register user method
    // check username
    //check password
    //check phone number if is register to the south african cell 
    // collect the correct data after verification process
    // provide the correct feedback 
    public String registerUser(String ky_le, String Ghhtkt8, String string) {

        if (!checkUserName("ky_le")) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity("Ghhskle@8")) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        if (!checkCellPhoneNumber("+27691057256")) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        this.username =username;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;

        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }

    // 5. Login check
    // checking whether the information provided is correct.
    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

     public String returnLoginStatus(boolean success) {
         if (success){
             return "Welcome" + username + "It is great to see you again.";
         }else{
             return"Username or password incorrect, please try again.";
         }
      
    
        
    }
    }
