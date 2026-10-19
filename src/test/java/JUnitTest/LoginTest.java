/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package JUnitTest;


import com.mycompany.poe.Login;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void testValidUsername() {
        Login user = new Login(
                "Bokang_1", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertTrue(user.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Login user = new Login(
                "bktherula", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertFalse(user.checkUserName());
    }

    @Test
    public void testValidPassword() {
        Login user = new Login(
                "Sam_1", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertTrue(user.checkPasswordComplexity());
    }

    @Test
    public void testInvalidPassword() {
        Login user = new Login(
                "Sam_1", "password",
                "+27838968976", "Bokang", "Seboya");

        assertFalse(user.checkPasswordComplexity());
    }

    @Test
    public void testValidCellPhone() {
        Login user = new Login(
                "Sam_1", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertTrue(user.checkCellPhoneNumber());
    }

    @Test
    public void testSuccessfulLogin() {
        Login user = new Login(
                "Sam_1", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertTrue(user.loginUser("bk_1", "Password1!"));
    }

    @Test
    public void testFailedLogin() {
        Login user = new Login(
                "Sam_1", "Password1!",
                "+27838968976", "Bokang", "Seboya");

        assertFalse(user.loginUser("Sam", "wrong"));
    }
}

