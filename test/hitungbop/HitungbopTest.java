/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbop;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class HitungbopTest {
    Hitungbop hb = new Hitungbop();
    
    public HitungbopTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEmail() {
         System.out.println("-------------------------------------------------");
        System.out.println("--Test Email--");
        String expResultEmail = "Hitungbop@gmail.com";
        String resultEmail = Hitungbop.email(expResultEmail);
        assertEquals(expResultEmail, resultEmail);
        System.out.println("Exp result email: "+expResultEmail);
        System.out.println("Result email: "+resultEmail);
    }
    
    @Test
    public void testPassword() {
       System.out.println("-------------------------------------------------");
        System.out.println("--Test Password--");
        String expResultPassword = "beasiswa";
        String resultPassword = Hitungbop.password(expResultPassword);
        assertEquals(expResultPassword, resultPassword);
        System.out.println("Exp result email: "+expResultPassword);
        System.out.println("Result email: "+resultPassword);
    }
    
     @Test
     public void TestContaintEmail(){
         System.out.println("-------------------------------------------------");
         System.out.println("--Test Containt Email--");
         System.out.println("Email is containt '@gmail.com' ");
         String email = Hitungbop.email("Hitungbop@gmail.com");
         assertThat(email, containsString("@gmail.com"));
     }

     @Test
     public void TestEmailEndWith(){
         System.out.println("-------------------------------------------------");
         System.out.println("--Test Email End With--");
         System.out.println("Email Ends with '.com' ");
         String email = Hitungbop.email("Hitungbop@gmail.com");
         assertThat(email, endsWith(".com"));
     }
     
     @Test
    public void TestPasswordNotNull(){
         System.out.println("-------------------------------------------------");
         System.out.println("--Test Password Not Null--");
         System.out.println("Password is Not Null");
         String pass = Hitungbop.password("beasiswa");
         assertThat(pass, is(not(nullValue())));   
     }
  
    @Test
    public void testGetGol() {
        System.out.println("----------------------------------------------------");
        System.out.println("getGol");
        hb.setGol(2);
        assertEquals(2, hb.getGol());
    }

    @Test
    public void testGetBulan() {
        System.out.println("----------------------------------------------------");
        System.out.println("getBulan");
        hb.setBulan(30);
        assertEquals(30, hb.getBulan());
    }
    
    @Test
    public void testHitungpotongan() {
        System.out.println("----------------------------------------------------");
        System.out.println("hitungpotongan");
        int bulan = 6;
        Hitungbop instance = new Hitungbop();
        int expResult = 300000;
        int result = instance.hitungpotongan(bulan);
        assertEquals(expResult, result);
    }

    @Test
    public void testHitungbeasiswa() {
        System.out.println("----------------------------------------------------");
        System.out.println("hitungbeasiswa");
        int pokok = 500000;
        int potongan = 300000;
        Hitungbop instance = new Hitungbop();
        int expResult = 200000;
        int result = instance.hitungbeasiswa(pokok, potongan);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckgol() {
        System.out.println("----------------------------------------------------");
        System.out.println("checkgol");
        int gol = 2;
        int potongan = 300000;
        Hitungbop instance = new Hitungbop();
        int expResult = 700000;
        int result = instance.checkgol(gol, potongan);
        assertEquals(expResult, result);
    }

    
}
