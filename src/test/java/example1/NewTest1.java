    package example1;		
    // this is my package
    // this is also my packege
    import org.openqa.selenium.By;		
    import org.openqa.selenium.WebDriver;		
    import org.openqa.selenium.firefox.FirefoxDriver;		
    import org.testng.Assert;		
    import org.testng.annotations.Test;	
    import org.testng.annotations.BeforeTest;	
    import org.testng.annotations.AfterTest;		
    public class NewTest1 {		
    	    private WebDriver driver;		
    		@Test				
    		public void testEasy() {	
    			driver.get("http://www.guru99.com/selenium-tutorial.html");  
    			String title = driver.getTitle();				 
    			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
    		}	
    		@BeforeTest
    		public void beforeTest() {	
    		    driver = new FirefoxDriver();  
    		}		
    		@AfterTest
    		public void afterTest() {
    			driver.quit();			
    		}		
    }	
    
    // added to test jenkins job
// added second time
// added third time
