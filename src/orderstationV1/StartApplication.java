//Note: Pre-equisites for this test to run
//Cutomer app must be signed-in already by an existing user
//Delivery Location, "Riyadh-Yasmin" must be a saved location in the customer app (Home)
//Tester must have orderstation and hungerstation installed in the device
//Tester must change the screenshots path directory accordingly 
//Tester must change the absolute path to .apk accordlingly 
//Tester must set device capabilities accordingly 

package orderstationV1;
 
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
public class StartApplication {

		private static final String C_USERS_OMER_QA_TEST_SCREENSHOTS = "C:\\Users\\ThinkPad\\QA Test Screenshots\\TC-";
		private static final String COM_HUNGERSTATION_ANDROID_RECEPTION_ID = "com.hungerstation.android.reception.debug:id";
		private static final String USER_DIR = "user.dir";
		private static AndroidDriver driver;
		private static WebElement element;
		public static void main(String[] args) throws MalformedURLException, InterruptedException, IOException {
 
			File classpathRoot = new File(System.getProperty(USER_DIR));
			File appDir = new File(classpathRoot, "/Apps/Orderstation/");
			File app = new File(appDir, "app-debug.apk");
 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			capabilities.setCapability("deviceName", "V1s-G");
			capabilities.setCapability("platformVersion", "6.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

			
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/btnManual").click();
			driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/et_company_code").click();//linking device test
			driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/et_company_code").sendKeys("204907999944"); //linking device test
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Linking Device Test(OS)");
			driver.findElementById("com.hungerstation.android.reception.debug:id/bt_go").click();    //linking device test
           
			Thread.sleep(3000);
          
		//customerApp Starts Here
			
       driver.navigate().back();
		    driver.navigate().back();
			MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("HungerStation");
			el1.click();		
			MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView");
			el2.click();
			MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView");
			el3.click();
			Thread.sleep(3000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Referral Code Page (HS)");
			MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el4.click();
			MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView");
			el5.click();
			MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView");
			el6.click();
			MobileElement el7 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/edt_name");
			el7.sendKeys("Omar");
			MobileElement el8 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/btn_update");
			el8.click();
			Thread.sleep(3000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Profile Page (HS)");
			MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el9.click();
			MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView");
			el10.click();
			MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView");
			el11.click();
			Thread.sleep(3000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Invoices Page (HS)");
			MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el12.click();
			MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView");
			el13.click();
			MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView");
			el14.click();
			Thread.sleep(3000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Payment Options Page (HS)");
			MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el15.click();
			MobileElement el16 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/more_item");
			el16.click();
			MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView");
			el17.click();
			Thread.sleep(3000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Support Page (HS)");
			MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
			el18.click();
			
			//MobileElement esl2 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/main_location_text");
			//esl2.click();
			driver.findElementById("com.hungerstation.android.web.debug:id/imgloc").click ();
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Choosing Adress (HS)");
			MobileElement esl3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView");
			esl3.click();
			MobileElement esl4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[2]");
			esl4.click();
			MobileElement esl5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
			esl5.click();
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Placing Order(HS)");
			MobileElement esl6 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/image_plus");
			esl6.click();
			MobileElement esl7 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/parent_layout");
			esl7.click();
			MobileElement esl8 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/parent_layout");
			esl8.click();
			MobileElement esl9 = (MobileElement) driver.findElementByAccessibilityId("Add note");
			esl9.click();
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Adding Customer Note (HS)");
			MobileElement esl10 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/edt_note");
			esl10.sendKeys("Automated Test Note");
			MobileElement esl11 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/pos_button");
			esl11.click();
			MobileElement esl12 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/txt_change");
			esl12.click();
			MobileElement esl13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup");
			esl13.click();
			MobileElement esl14 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/imageview_delivery_option_tick_two");
			esl14.click();
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Choosing Delivery Option (HS)");
			MobileElement esl15 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/btn_checkout");
			esl15.click();
			MobileElement esl1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.TextView");
			esl1.click();
			Thread.sleep(2000);
			screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Order Summary (HS)");
			
			driver.navigate().back();
		    driver.navigate().back();
			MobileElement el1s = (MobileElement) driver.findElementByAccessibilityId("Order Station");
			el1s.click();
			
			//Customer app ends here
			
            Thread.sleep(8000);
            
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Order Successfully Received(OS) ");
            
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/btnAccept").click();//accepting order test
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Choosing delivery time(OS) ");

            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_title").click();// accepting order test
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_buttonDefaultPositive").click(); // accepting order test
            Thread.sleep(5000);
            //screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Notified Device Out of Paper");
            //driver.findElementById("woyou.aidlservice.jiuiv5:id/textView_btn").click(); //deviceoutofpaper 
            Thread.sleep(3000);
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Order Accepted Test(OS)");
                  
            Thread.sleep(5000);
           
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/action_user").click(); //customer details test (human icon)
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Customer Information or Customer's previous no. of orders (OS)");         
            //driver.findElementById("com.hungerstation.android.reception:id/fab").click();
            //driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Other Apps']")).click () ;
            //Thread.sleep(5000);
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_buttonDefaultPositive").click(); //customer detail icon test 
            
            driver.findElement (By.className("android.widget.ImageButton")).click();
            
            Thread.sleep(5000);
            
            driver.findElementById("com.hungerstation.android.reception.debug:id"+"/menuIcon").click ();//View Menu
	          driver.findElementById("com.hungerstation.android.reception.debug:id"+"/actionMenu").click ();//view Bakery
	          driver.findElementById("com.hungerstation.android.reception.debug:id"+"/tv_name_group").click ();//View Bakery
	          Thread.sleep(3000);
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View bakery items in the menu(OS)");
            driver.findElementById("com.hungerstation.android.reception.debug:id"+"/sw_unavailable").click ();//View Bakery
	          driver.findElement (By.className("android.widget.ImageButton")).click();
	          driver.findElementByXPath("//android.widget.LinearLayout[@index='1']").click();// View Canned Food Items			  
	          Thread.sleep(5000);
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Canned Food Items(OS)");
	          driver.findElement (By.className("android.widget.ImageButton")).click();
	          driver.findElementByXPath("//android.widget.LinearLayout[@index='2']").click();//view food items in the menu
	          Thread.sleep(3000);
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Food Items(OS)");
	          driver.findElement (By.className("android.widget.ImageButton")).click();
	          driver.findElement (By.className("android.widget.ImageButton")).click();

	          Thread.sleep(5000);
	          
	          driver.findElementById("com.hungerstation.android.reception.debug:id/menuIcon").click ();//View Drivers from options
	          driver.findElementById("com.hungerstation.android.reception.debug:id/actionDrivers").click ();
	          Thread.sleep(3000);
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Drivers(OS)");
	          driver.findElementById("com.hungerstation.android.reception.debug:id/tv_name_driver").click ();
	          Thread.sleep(3000);
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Drivers Details(OS)");
	          driver.findElementById("android:id/button1").click ();
	          driver.findElementById("com.hungerstation.android.reception.debug:id/action_add_driver").click ();//Adding Drivers
			  driver.findElementById("com.hungerstation.android.reception.debug:id/et_name").sendKeys("XYZ Test"); 
			  driver.findElementById("com.hungerstation.android.reception.debug:id/et_number").sendKeys("+966533730467");
	          screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Adding drivers(OS)");
			  driver.findElementById("android:id/button1").click ();
			  
			  driver.findElementById("com.hungerstation.android.reception.debug:id/tv_name_driver").click ();//Deleting Drivers
			  driver.findElementById("com.hungerstation.android.reception.debug:id/iv_delete_driver").click ();//Deleting Drivers
			  Thread.sleep(3000);
			  screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Deleting Driver(OS)");
			  driver.findElementById("com.hungerstation.android.reception.debug:id/md_buttonDefaultPositive").click ();
	          driver.findElement (By.className("android.widget.ImageButton")).click();

	       
          //  Customer App Starts
	          driver.navigate().back();
			    driver.navigate().back();
				MobileElement e0l1 = (MobileElement) driver.findElementByAccessibilityId("HungerStation");
				e0l1.click();	
				 driver.findElementById("com.hungerstation.android.web.debug:id/restaurants_item").click ();
				//MobileElement el13a = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/main_location_text");
				//el13a.click();
			    driver.findElementById("com.hungerstation.android.web.debug:id/imgloc").click ();
				MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.RelativeLayout");
				el23.click();
				MobileElement el33 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/input");
				el33.sendKeys("Omar");
				screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Searching Restaurant(HS)");
				MobileElement el43 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/title");
				el43.click();
				MobileElement el53 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/rate_value");
				el53.click();
				screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Rate Restaurant Value (HS)");
				MobileElement el63 = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
				el63.click();
				MobileElement el73 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[1]");
				el73.click();
				MobileElement el83 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/image_plus");
				el83.click();
				MobileElement el93 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/parent_layout");
				el93.click();
				MobileElement el103 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
				el103.click();
				MobileElement el113 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/image_plus");
				el113.click();
				MobileElement el123 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/image_plus");
				el123.click();
				MobileElement el133 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/primary_label");
				el133.click();
				MobileElement el143 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/parent_layout");
				el143.click();
				MobileElement el153 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/imageview_delivery_option_tick_two");
				el153.click();
				Thread.sleep(3000);
				MobileElement el163 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/btn_checkout");
				el163.click();
				MobileElement el173 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/btn_help");
				el173.click();
			    MobileElement el183 = (MobileElement) driver.findElementById("com.hungerstation.android.web.debug:id/txtname");
				el183.click();
				screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"I Need Help (HS)");


				driver.navigate().back();
				driver.navigate().back();
			    driver.navigate().back();
				MobileElement el1ss = (MobileElement) driver.findElementByAccessibilityId("Order Station");
				el1ss.click();
				
				
				//Customer App Ends
            
            
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/btnShowMap").click ();//view map from pop up dialog test
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Changing Language Test");
            Thread.sleep(7000);
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View Map From Pop-up Test(OS)");

            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/btnDecline").click (); //declining order test
            
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_control").click (); //declining order test
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Pick a Reason for Decline Test(OS)");
            driver.findElementByXPath("//android.widget.LinearLayout[@index='4']").click();//Kitchen is busy            
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_buttonDefaultPositive").click (); //declining order test
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Kitchen is busy(OS)");
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/md_buttonDefaultPositive").click ();
            Thread.sleep(7000);
            
            driver.findElementById("com.hungerstation.android.reception.debug:id/txtOrderId").click ();//Out for delivery
            driver.findElementById("com.hungerstation.android.reception.debug:id/btnOutForDelivery").click ();
            driver.findElementById("android:id/button1").click ();
            //driver.findElementById("com.hungerstation.android.reception.debug:id/et_name").sendKeys("XYZZ Test"); 
			//driver.findElementById("com.hungerstation.android.reception.debug:id/et_number").sendKeys("+966558730467");
            //driver.findElementById("android:id/button1").click ();
            screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"Send Loation to Driver & Out for Delivery Button(OS)");
            //driver.findElementById("android:id/button1").click ();
           
            

            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/menuIcon").click (); //changing language test
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/actionSettings").click (); //changing language test
            driver.findElementById(COM_HUNGERSTATION_ANDROID_RECEPTION_ID+"/pspinnerLanguage").click (); //changing language test
            driver.findElementById("android:id/text1").click (); //changing language test
            driver.findElement(By.className("android.widget.ImageButton")).click(); //changing language test
           
			
			
		   driver.findElementById("com.hungerstation.android.reception.debug:id/menuIcon").click ();//view history
	       driver.findElementById("com.hungerstation.android.reception.debug:id/actionHistory").click ();//view history
	       Thread.sleep(3000);
		   screenshot(C_USERS_OMER_QA_TEST_SCREENSHOTS+"View History(OS)");
           Thread.sleep(3000);
           driver.findElementById("com.hungerstation.android.reception.debug:id/action_print").click ();
           
           driver.findElement(By.className("android.widget.ImageButton")).click();			  
   
	          
	        
	          
	          Thread.sleep(10000);
			driver.quit();
 
	}
		public static void screenshot(String path_screenshot) throws IOException{
            File srcFile=driver.getScreenshotAs(OutputType.FILE);
            //String filename=UUID.randomUUID().toString(); 
            File targetFile=new File(path_screenshot  +".jpg");
            FileUtils.copyFile(srcFile,targetFile);
     
		
}
}
