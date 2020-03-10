package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object streetaddress
     
    /**
     * <p></p>
     */
    public static Object zipcode
     
    /**
     * <p></p>
     */
    public static Object firstname
     
    /**
     * <p></p>
     */
    public static Object lastname
     
    /**
     * <p></p>
     */
    public static Object contactnumber
     
    /**
     * <p></p>
     */
    public static Object emailaddress
     
    /**
     * <p></p>
     */
    public static Object businessName
     
    /**
     * <p></p>
     */
    public static Object federalTaxId
     
    /**
     * <p></p>
     */
    public static Object NoOfEmployees
     
    /**
     * <p></p>
     */
    public static Object NoOfLocations
     
    /**
     * <p></p>
     */
    public static Object Internet
     
    /**
     * <p></p>
     */
    public static Object FiberInternet
     
    /**
     * <p></p>
     */
    public static Object FiveHundredMbps
     
    /**
     * <p></p>
     */
    public static Object Addons
     
    /**
     * <p></p>
     */
    public static Object CommunicationsPack
     
    /**
     * <p></p>
     */
    public static Object AdditionalAddons
     
    /**
     * <p></p>
     */
    public static Object AlwaysOnInternetWirelessBackup
     
    /**
     * <p></p>
     */
    public static Object Equipment
     
    /**
     * <p></p>
     */
    public static Object UseYourOwnModem
     
    /**
     * <p></p>
     */
    public static Object Voice
     
    /**
     * <p></p>
     */
    public static Object OfficeSuite
     
    /**
     * <p></p>
     */
    public static Object AdBS
     
    /**
     * <p></p>
     */
    public static Object SDWAN
     
    /**
     * <p></p>
     */
    public static Object MPLS
     
    /**
     * <p></p>
     */
    public static Object OTCharge
     
    /**
     * <p></p>
     */
    public static Object Install
     
    /**
     * <p></p>
     */
    public static Object ActivationFee
     
    /**
     * <p></p>
     */
    public static Object TotalBill
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            streetaddress = selectedVariables['streetaddress']
            zipcode = selectedVariables['zipcode']
            firstname = selectedVariables['firstname']
            lastname = selectedVariables['lastname']
            contactnumber = selectedVariables['contactnumber']
            emailaddress = selectedVariables['emailaddress']
            businessName = selectedVariables['businessName']
            federalTaxId = selectedVariables['federalTaxId']
            NoOfEmployees = selectedVariables['NoOfEmployees']
            NoOfLocations = selectedVariables['NoOfLocations']
            Internet = selectedVariables['Internet']
            FiberInternet = selectedVariables['FiberInternet']
            FiveHundredMbps = selectedVariables['FiveHundredMbps']
            Addons = selectedVariables['Addons']
            CommunicationsPack = selectedVariables['CommunicationsPack']
            AdditionalAddons = selectedVariables['AdditionalAddons']
            AlwaysOnInternetWirelessBackup = selectedVariables['AlwaysOnInternetWirelessBackup']
            Equipment = selectedVariables['Equipment']
            UseYourOwnModem = selectedVariables['UseYourOwnModem']
            Voice = selectedVariables['Voice']
            OfficeSuite = selectedVariables['OfficeSuite']
            AdBS = selectedVariables['AdBS']
            SDWAN = selectedVariables['SDWAN']
            MPLS = selectedVariables['MPLS']
            OTCharge = selectedVariables['OTCharge']
            Install = selectedVariables['Install']
            ActivationFee = selectedVariables['ActivationFee']
            TotalBill = selectedVariables['TotalBill']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
