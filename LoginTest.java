/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.chatapp.Login;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
     Login login;
    private Object result;

    public LoginTest() {
       
    }
    
    //Using public void to test 
    @Test
    public void testValidUsername() {
        
        /* calling username method to verify if username has an underscore
        */
        
        assertTrue(login.checkUserName("ky_le"));
    }
    @Test
    public void testInvalidUsername_NoUnderscore() {
        
        // checking an username with no underscore
        
        assertFalse(login.checkUserName("abcd1"));
    }
    @Test
    public void testInvalidUsername_TooLong(){
        
        //checking username length whether it meets the standard requirements needed.
        // The username is false because it exceeds the 5 characters it is supposed to be.
        
        assertFalse(login.checkUserName("abongile_"));
        
    }
    
    // Verifying whether the password is valid
    
    @Test
    public void testValidPassword() {
        // Verifying valid password must have 6 characters and has a special character
        
        assertTrue(login.checkPasswordComplexity("Ghhskle@8"));
    }
    // Testing if whether the password has an special a Capital letter
    
    @Test
    public void testInvalidPassword() {
        assertFalse(login.checkPasswordComplexity("hhh@th7"));
    }
    // Testing whether the password has an special character 
    
    @Test
  public void testInvalidPassword_NoCapital() {
      assertFalse(login.checkPasswordComplexity("Hhhhty7"));
  }
  
  // Verifying the cell Phone Number
  
  // Verifying if the number has an SA code 
  @Test
  public void testValidPhoneNumber() {
      assertTrue(login.checkCellPhoneNumber("+27691057256"));
  }
  
  //Checking whether if Phone number is not <> 10
  
  @Test
  public void testInvalidPhoneNumber() {
      assertFalse(login.checkCellPhoneNumber("+276910572577"));
  }
  
  //Testing the log in process if it operates
  @Test
  
  public void testLoginSuccess() {
      
        //Register with the correct details inorder to procceed with the logging in procces
        
        login.registerUser("ky_le","Ghht@t8","+27691057256");
        
        assertEquals("User registeres successfully.",result);
  }
}
