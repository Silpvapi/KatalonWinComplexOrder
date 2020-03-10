import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.sendKeys
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.Color as Color
import java.text.DateFormat as DateFormat
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

WebUI.openBrowser('')

WebUI.maximizeWindow()
WebUI.deleteAllCookies()

//Navigate to Windstream Site Selector URL
WebUI.navigateToUrl(GlobalVariable.URL)
//WebUI.waitForElementClickable(findTestObject('Object Repository/SMB Site/SMBSite'), 5)

//Click SMB Site
WebUI.click(findTestObject('Object Repository/SMB Site/SMBSite'))

// Click Location
WebUI.click(findTestObject('Object Repository/SMB Site/Location'))

//Type Location Street Address
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/SMB Site/address'),GlobalVariable.streetaddress)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/address') , Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/SMB Site/locationPopup'))

//Verify the zipcode populated
attribute = WebUI.getAttribute(findTestObject('Object Repository/SMB Site/zipCode'), 'value')
WebUI.verifyEqual(attribute, GlobalVariable.zipcode)

//Click Check Availability Button
WebUI.click(findTestObject('Object Repository/SMB Site/checkAvailabilityButton'))
WebUI.delay(10)


//Verify Page
WST = WebUI.getText(findTestObject('Object Repository/SMB Site/whatAreYouShopping'))
WebUI.verifyEqual(WST, 'What are you shopping for today?')

TestData data = findTestData("Data Files/SMBDATA");
int rowcount = data.getRowNumbers();
//product selector
String product1 = data.getValue("Products", 1);
println(product1);
String product2 = data.getValue("Products", 2);
println(product2);
String product3 = data.getValue("Products", 3);
println(product3);

//Verify available products
PrInternet = WebUI.getText(findTestObject('Object Repository/SMB Site/productInternet'))
WebUI.verifyEqual(PrInternet, product1)

PrVoice = WebUI.getText(findTestObject('Object Repository/SMB Site/productVoice'))
WebUI.verifyEqual(PrVoice, product2)

PrAdBS = WebUI.getText(findTestObject('Object Repository/SMB Site/productAdBS'))
WebUI.verifyEqual(PrAdBS, product3)

//Choose Internet
WebUI.click(findTestObject('Object Repository/SMB Site/chooseInternet'))
WebUI.click(findTestObject('Object Repository/SMB Site/letsGetStarted'))

//Verify Internet Service Available in Location
ChooseInternet = WebUI.getText(findTestObject('Object Repository/SMB Site/chooseInternetService'))
WebUI.verifyEqual(ChooseInternet, 'Choose your internet service')

DedicatedInternet = WebUI.getText(findTestObject('Object Repository/SMB Site/dedicatedInternet'))
WebUI.verifyEqual(DedicatedInternet, 'Dedicated Internet')


TestData data1 = findTestData("Data Files/SMBDATA");
int rowcount1 = data1.getRowNumbers();
//product selector
String speed1 = data1.getValue("InternetSpeed", 1);
println(speed1);
String speed2 = data1.getValue("InternetSpeed", 2);
println(speed2);
String speed3 = data1.getValue("InternetSpeed", 3);
println(speed3);

OneG = WebUI.getText(findTestObject('Object Repository/SMB Site/1Gig'))
WebUI.verifyEqual(OneG, speed1)

Mbps = WebUI.getText(findTestObject('Object Repository/SMB Site/500Mbps'))
WebUI.verifyEqual(Mbps, speed2)

TwoMbps = WebUI.getText(findTestObject('Object Repository/SMB Site/200Mbps'))
WebUI.verifyEqual(TwoMbps, speed3)

//Choose 500 Mbps Speed
WebUI.click(findTestObject('Object Repository/SMB Site/choose500Mbps'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))
WebUI.delay(4)


//Verify IT Security & Communication Packs
TestData data2 = findTestData("Data Files/SMBDATA");
int rowcount2 = data2.getRowNumbers();
//product selector
String communication1 = data2.getValue("SecurityandCommunication", 1);
println(communication1);
String communication2 = data2.getValue("SecurityandCommunication", 2);
println(communication2);
String communication3 = data2.getValue("SecurityandCommunication", 3);
println(communication3);

Security = WebUI.getText(findTestObject('Object Repository/SMB Site/Security'))
WebUI.verifyEqual(Security, communication1)

Communications = WebUI.getText(findTestObject('Object Repository/SMB Site/Communications'))
WebUI.verifyEqual(Communications, communication2)

Complete = WebUI.getText(findTestObject('Object Repository/SMB Site/Complete'))
WebUI.verifyEqual(Complete, communication3)

//Click Communications Pack
WebUI.click(findTestObject('Object Repository/SMB Site/tollFreeCheckbox'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))
WebUI.delay(4)

//Verify Additional Service
TestData data3 = findTestData("Data Files/SMBDATA");
int rowcount3 = data3.getRowNumbers();
//product selector
String additionalservice1 = data3.getValue("AdditionalService", 1);
println(additionalservice1);
String additionalservice2 = data3.getValue("AdditionalService", 2);
println(additionalservice2);

FaxtoEmail = WebUI.getText(findTestObject('Object Repository/SMB Site/faxtoEmail'))
WebUI.verifyEqual(FaxtoEmail, additionalservice1)

internetWirelessBackup = WebUI.getText(findTestObject('Object Repository/SMB Site/internetWirelessBackup'))
WebUI.verifyEqual(internetWirelessBackup, additionalservice2)

//Choose Additional Service - WirelessInternetBackup
WebUI.click(findTestObject('Object Repository/SMB Site/AdditionalService'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))
WebUI.delay(4)

//Verify Modem Options
TestData data4 = findTestData("Data Files/SMBDATA");
int rowcount4 = data4.getRowNumbers();
//product selector
String ModemOptions1 = data4.getValue("ModemOptions", 1);
println(ModemOptions1);
String ModemOptions2 = data4.getValue("ModemOptions", 2);
println(ModemOptions2);

modemRental = WebUI.getText(findTestObject('Object Repository/SMB Site/modemRental'))
WebUI.verifyEqual(modemRental, ModemOptions1)

useyourownmodemchoice = WebUI.getText(findTestObject('Object Repository/SMB Site/useyourownmodemchoice'))
WebUI.verifyEqual(useyourownmodemchoice, ModemOptions2)

//Click Modem Option
WebUI.click(findTestObject('Object Repository/SMB Site/useYourOwnModem1'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))

//Professional Installation option is selected by default
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))
WebUI.delay(4)

//Select options for Voice
WebUI.click(findTestObject('Object Repository/SMB Site/Voice'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveForVoice'))
WebUI.delay(4)

//Verify Business Voice Solution
TestData data5 = findTestData("Data Files/SMBDATA");
int rowcount5 = data5.getRowNumbers();
//product selector
String BusinessSolutions1 = data5.getValue("BusinessVoiceSolution", 1);
println(BusinessSolutions1);
String BusinessSolutions2 = data5.getValue("BusinessVoiceSolution", 2);
println(BusinessSolutions2);

businessLine = WebUI.getText(findTestObject('Object Repository/SMB Site/businessLine'))
WebUI.verifyEqual(businessLine, BusinessSolutions1)

cloudbased = WebUI.getText(findTestObject('Object Repository/SMB Site/cloudbased'))
WebUI.verifyEqual(cloudbased, BusinessSolutions2)

//Click Cloud-Based Solution
WebUI.click(findTestObject('Object Repository/SMB Site/businessVoiceSolution'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))

//Skip Phone numbers
WebUI.click(findTestObject('Object Repository/SMB Site/skipToNext'))
WebUI.delay(4)

//Advanced Business Solutions
WebUI.click(findTestObject('Object Repository/SMB Site/advancedBusinessSolution'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAdBS'))
WebUI.delay(4)

// SDWAN
WebUI.click(findTestObject('Object Repository/SMB Site/SDWAN'))
WebUI.delay(4)

// MPLS
WebUI.click(findTestObject('Object Repository/SMB Site/MPLS'))
WebUI.click(findTestObject('Object Repository/SMB Site/saveAndContinue'))
WebUI.delay(4)

//Verify details in CheckOut Page
//Internet Details Verification
result = WebUI.getText(findTestObject('Object Repository/SMB Site/checkInternet'))
WebUI.verifyEqual(result, GlobalVariable.Internet)

Fiber = WebUI.getText(findTestObject('Object Repository/SMB Site/fiberInternet'))
WebUI.verifyEqual(Fiber, GlobalVariable.FiberInternet)

FiberInternet500 = WebUI.getText(findTestObject('Object Repository/SMB Site/FiberInternet500'))
WebUI.verifyEqual(FiberInternet500, GlobalVariable.FiveHundredMbps)

Addons = WebUI.getText(findTestObject('Object Repository/SMB Site/Addons'))
WebUI.verifyEqual(Addons, GlobalVariable.Addons)

CommunicationPack = WebUI.getText(findTestObject('Object Repository/SMB Site/communicationPack'))
WebUI.verifyEqual(CommunicationPack, GlobalVariable.CommunicationsPack)

AdditionalAddons = WebUI.getText(findTestObject('Object Repository/SMB Site/AdditionalAddons'))
WebUI.verifyEqual(AdditionalAddons, GlobalVariable.AdditionalAddons)

WirelessBackup = WebUI.getText(findTestObject('Object Repository/SMB Site/wirelessBackup'))
WebUI.verifyEqual(WirelessBackup, GlobalVariable.AlwaysOnInternetWirelessBackup)

Equipment = WebUI.getText(findTestObject('Object Repository/SMB Site/Equipment'))
WebUI.verifyEqual(Equipment, GlobalVariable.Equipment)

Modem = WebUI.getText(findTestObject('Object Repository/SMB Site/UseYourOwnModem'))
WebUI.verifyEqual(Modem, GlobalVariable.UseYourOwnModem)

//Verify Checkout options for Voice
CheckOutVoice = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckOutVoice'))
WebUI.verifyEqual(CheckOutVoice, GlobalVariable.Voice)

OfficeSuite = WebUI.getText(findTestObject('Object Repository/SMB Site/OfficeSuite'))
WebUI.verifyEqual(OfficeSuite, GlobalVariable.OfficeSuite)

//Verify Checkout options for Advanced Business Solutions
CheckAdBS = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckAdBS'))
WebUI.verifyEqual(CheckAdBS, GlobalVariable.AdBS)

CheckoutSDWAN = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckoutSDWAN'))
WebUI.verifyEqual(CheckoutSDWAN, GlobalVariable.SDWAN)

CheckoutMPLS = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckoutMPLS'))
WebUI.verifyEqual(CheckoutMPLS, GlobalVariable.MPLS)

CheckoutOneTimeCharge = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckoutOneTimeCharge'))
WebUI.verifyEqual(CheckoutOneTimeCharge, GlobalVariable.OTCharge)

CheckoutInstall = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckoutInstall'))
WebUI.verifyEqual(CheckoutInstall, GlobalVariable.Install)

Activation = WebUI.getText(findTestObject('Object Repository/SMB Site/Activation'))
WebUI.verifyEqual(Activation, GlobalVariable.ActivationFee)

CheckoutTotalBill = WebUI.getText(findTestObject('Object Repository/SMB Site/CheckoutTotalBill'))
WebUI.verifyEqual(CheckoutTotalBill, GlobalVariable.TotalBill)

WebUI.click(findTestObject('Object Repository/SMB Site/Checkout'))
WebUI.delay(4)


//Enter Contact & Billing Information
//Enter FirstName
WebUI.setText(findTestObject('Object Repository/SMB Site/firstName'),GlobalVariable.firstname)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/firstName') , Keys.chord(Keys.TAB))

//Enter LastName
WebUI.setText(findTestObject('Object Repository/SMB Site/lastName'),GlobalVariable.lastname)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/lastName') , Keys.chord(Keys.TAB))

//Enter contactNumber
WebUI.setText(findTestObject('Object Repository/SMB Site/contactNumber'),GlobalVariable.contactnumber)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/contactNumber') , Keys.chord(Keys.TAB))

//Enter emailaddress
WebUI.setText(findTestObject('Object Repository/SMB Site/emailAddress'),GlobalVariable.emailaddress)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/emailAddress') , Keys.chord(Keys.TAB))

//Enter businessName
WebUI.setText(findTestObject('Object Repository/SMB Site/businessName'),GlobalVariable.businessName)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/businessName') , Keys.chord(Keys.TAB))

//Enter federalTaxId
WebUI.setText(findTestObject('Object Repository/SMB Site/federalTaxId'),GlobalVariable.federalTaxId)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/federalTaxId') , Keys.chord(Keys.TAB))

//Enter NoOfEmployees
WebUI.setText(findTestObject('Object Repository/SMB Site/NoOfEmployees'),GlobalVariable.NoOfEmployees)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/NoOfEmployees') , Keys.chord(Keys.TAB))

//Enter NoOfLocations
WebUI.setText(findTestObject('Object Repository/SMB Site/NoOfLocations'),GlobalVariable.NoOfLocations)
WebUI.sendKeys(findTestObject('Object Repository/SMB Site/NoOfLocations') , Keys.chord(Keys.TAB))

//Click StayUpdated Checkbox
WebUI.click(findTestObject('Object Repository/SMB Site/StayUpdated'))

//Click sameAsServiceAddress
WebUI.click(findTestObject('Object Repository/SMB Site/sameAsServiceAddress'))
WebUI.click(findTestObject('Object Repository/SMB Site/cartSave'))

//Click Terms and Conditions
WebUI.click(findTestObject('Object Repository/SMB Site/termsandConditions'))


//Click placeOrder
//WebUI.click(findTestObject('Object Repository/SMB Site/placeOrder'))

//Order Confirmation
//orderConfirmation = WebUI.getText(findTestObject('Object Repository/SMB Site/orderConfirmation'))
//WebUI.verifyEqual(orderConfirmation, 'Thanks for your order, John !')

//WebUI.closeBrowser()



