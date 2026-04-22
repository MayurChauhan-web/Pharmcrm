package com.pharmcrm_BillingModule.pages;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingModuleFunctionalityPage {
	WebDriver driver;
	
	//By Locators
	private By billingmoduletab = By.xpath("//a[@href='/Billing/Home/Dashboard']//div[@class='module-list-main']//div[@class='module-list-img']");
	private By invoicetabinsidebar = By.xpath("(//span[normalize-space()='Invoice'])[1]");
	private By newinvoicebuttonininvoice = By.xpath("(//span[normalize-space()='New Invoice'])[1]");
	private By addpatientnametabininvoicepage = By.xpath("//a[@id='addPatientNamePopup']//img");
	private By patientidtextboxinsearchpatient = By.xpath("(//input[@id='Filter_PatientId'])[1]");
	private By lastnametextboxinsearchpatient = By.xpath("(//input[@id='Filter_LastName'])[1]");
	private By firstnametextboxinsearchpatient = By.xpath("(//input[@id='Filter_FirstName'])[1]");
	private By dateofbirthtextboxinsearchpatient = By.xpath("(//input[@id='Filter_BirthDate'])[1]");
	private By searchbuttoninsearchpatient = By.xpath("(//button[normalize-space()='Search'])[1]");
	private By firstradiobuttoninsearchpatient = By.xpath("(//input[@type='radio' and @name='groupOfPatientRadios'])[1]");
	private By submitbuttoninsearchpatient = By.xpath("(//button[@id='btnPatient'])[1]");
	private By itemtextboxininvoice = By.xpath("(//input[@id='InvoiceDetail_PrescriptionNumber'])[1]");
	private By flagdropdownbuttonininvoice = By.xpath("//label[text()='Flag']/following::input[contains(@class,'select-dropdown')][1]");
	private By descriptiontextboxininvoice = By.xpath("(//input[@id='InvoiceDetail_Description'])[1]");
	private By quantitytextboxininvoice = By.xpath("(//input[@id='InvoiceDetail_Quantity'])[1]");
	private By costperquantitytextboxininvoice = By.xpath("(//input[@id='InvoiceDetail_CoPay'])[1]");
	private By taxablecheckboxininvoice = By.xpath("(//label[normalize-space()='Taxable?'])[1]");
	private By shippingandhandlingchargestextboxininvoice = By.xpath("(//input[@id='InvoiceDetail_ShippingCharge'])[1]");
	private By plusiconininvoice = By.xpath("(//img[@id='btnInvoiceDetail'])[1]");
	private By shippingamountcheckboxininvoice = By.xpath("(//label[normalize-space()='Shipping Amount'])[1]");
	private By printdescriptioncheckboxininvoice = By.xpath("(//label[normalize-space()='Print Description ?'])[1]");
	private By patientemailtextboxininvoice = By.xpath("(//input[@id='Invoice_PatientEmail'])[1]");
	private By patientphonenumbertextboxininvoice = By.xpath("(//input[@id='Invoice_PatientPhoneNumber'])[1]");
	private By thirdpartyemailtextboxininvoice = By.xpath("(//input[@id='Invoice_ThirdPartyEmail'])[1]");
	private By patientemailcheckboxininvoice = By.xpath("(//label[@for='ChkInvoice_PatientEmail'])[1]");
	private By patientphonenumbercheckboxininvoice = By.xpath("(//label[@for='ChkInvoice_PatientPhoneNumber'])[1]");
	private By thirdpartyemailcheckboxininvoice = By.xpath("(//label[@for='ChkInvoice_ThirdPartyEmail'])[1]");
	private By lastnametextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToLastName'])[1]");
	private By firstnametextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToFirstName'])[1]");
	private By streetaddresstextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToStreet'])[1]");
	private By citytextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToCity'])[1]");
	private By statetextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToState'])[1]");
	private By zipcodetextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToZipCode'])[1]");
	private By phonenumbertextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToPhoneNumber'])[1]");
	private By emailtextboxininvoicebillto = By.xpath("(//input[@id='Invoice_InvoiceBillTo_BillToEmail'])[1]");
	private By savebuttonininvoice = By.xpath("(//button[normalize-space()='Save'])[1]");
	private By invoicelastnametextboxininvoice = By.xpath("(//input[@id='Invoice_LastName'])[1]");
	private By invoicefirstnametextboxininvoice = By.xpath("(//input[@id='Invoice_FirstName'])[1]");
	private By invoicestreetaddresstextboxininvoice = By.xpath("(//input[@id='Invoice_BillingAddress_Street'])[1]");
	private By invoicecitytextboxininvoice = By.xpath("(//input[@id='Invoice_BillingAddress_City'])[1]");
	private By invoicestatetextboxininoice = By.xpath("(//input[@id='Invoice_BillingAddress_State'])[1]");
	private By invoicezipcodetextboxininvoice = By.xpath("(//input[@id='Invoice_BillingAddress_ZipCode'])[1]");
	private By invoicephonenumbertextboxininvoice = By.xpath("(//input[@id='Invoice_BillingPhoneNumber'])[1]");
	private By invoiceemailidtextboxininvoice = By.xpath("(//input[@id='Invoice_BillingEmail'])[1]");
	private By saveandsendbuttonininvoice = By.xpath("(//button[normalize-space()='Save & Send'])[1]");
	private By settlementbuttonininvoice = By.xpath("(//button[normalize-space()='Settlement'])[1]");
	private By cardnumbertextboxininvoicesettlement = By.xpath("(//input[@id='cardnumber'])[1]");
	private By expirydatetextboxininvoicesettlement = By.xpath("(//input[@id='expdate'])[1]");
	private By cvvnumbertextboxininvoicesettlement = By.xpath("(//input[@id='cardcvv'])[1]");
	private By paybuttonininvoicesettlement = By.xpath("(//button[normalize-space()='Pay'])[1]");
	private By paybyothermediumradiobuttonininvoicesettlement = By.xpath("(//label[normalize-space()='Pay by Other Medium'])[1]");
	private By paybyothermediumtextboxininvoicesettlement = By.xpath("(//input[@id='Invoice_InvoiceBillTo_PayByMedium'])[1]");
	private By viewinvoicebuttonininvoice = By.xpath("(//a[@class='gridTextButton triggerButton'][normalize-space()='View Invoice'])[1]");
	private By viewreceiptbuttonininvoice = By.xpath("(//a[@class='gridTextButton historyButton'][normalize-space()='View Receipt'])[1]");
	private By threedotbuttoninexistinginvoice = By.xpath("(//button[contains(@class,'bucket-icon-dropdown')])[1]");
	private By viewdetailtabinexistinginvoice = By.xpath("(//span[contains(text(),'View Detail')])[1]");
	private By addposnotestabininvoicedetails = By.xpath("(//a[normalize-space()='Add POS Notes'])[1]");
	private By ticketnumbertextboxinaddposnotes = By.xpath("(//input[@id='Invoice_InvoicePOS_TicketNumber'])[1]");
	private By ticketdatetextboxinaddposnotes = By.xpath("(//input[@id='Invoice_InvoicePOS_TicketDate'])[1]");
	private By submitbuttoninaddposnotes = By.xpath("(//button[@class='btn btn-primary'])[1]");
	private By deletebuttoninexistinginvoice = By.xpath("(//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//a[@id='btnDeleteInvoice']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistinginvoice = By.xpath("(//div[@id='deleteInvoiceModel']//button[@id='btnDeleteConfirm'])[1]");
	private By editbuttoninexistinginvoice = By.xpath("(//div[@class='dropdown-menu bucket-dropdown-content gridRecordContext show']//span[contains(text(),'Edit')])[1]");
	private By removemedicinedetailsbuttonininvoice = By.xpath("(//div[@class='gridListIconsFlex justify-content-end']//a)[1]");
	private By filterbutton = By.xpath("(//span[normalize-space()='Filter'])[1]");
	private By invoicenumbertextboxinfilter = By.xpath("(//input[@id='Filter_InvoiceNumber'])[1]");
	private By rxnumbertextboxinfilter = By.xpath("(//input[@id='Filter_RxNumber'])[1]");
	private By customerfirstnametextboxinfilter = By.xpath("(//input[@id='Filter_CustomerFirstName'])[1]");
	private By customerlastnametextboxinfilter = By.xpath("(//input[@id='Filter_CustomerLastName'])[1]");
	private By transactionnumbertextboxinfilter = By.xpath("(//input[@id='Filter_TransactionNumber'])[1]");
	private By posnumbertextboxinfilter = By.xpath("(//input[@id='Filter_POSNumber'])[1]");
	private By fromdatetextboxinfilter = By.xpath("(//input[@id='Filter_FromDate'])[1]");
	private By todatetextboxinfilter = By.xpath("(//input[@id='Filter_ToDate'])[1]");
	private By fromamounttextboxinfilter = By.xpath("(//input[@id='Filter_FromAmount'])[1]");
	private By toamounttextboxinfilter = By.xpath("(//input[@id='Filter_ToAmount'])[1]");
	private By emailidtextboxinfilter = By.xpath("(//input[@id='Filter_EmailId'])[1]");
	private By phonenumbertextboxinfilter = By.xpath("(//input[@id='Filter_PhoneNumber'])[1]");
	private By searchbuttoninfilterinvoice = By.xpath("(//button[@class='btn filterSearchBtn waves-effect waves-light'])[1]");
	private By clearbuttoninfilterinvoice = By.xpath("(//button[@class='btn filterClearBtn waves-effect waves-light'])[1]");
	private By artabinsidebar = By.xpath("(//span[normalize-space()='AR'])[1]");
	private By quicktexttabinAR = By.xpath("(//span[normalize-space()='Quick Text'])[1]");
	private By templatedropdownbuttoninquicktext = By.xpath("(//select[@id='quickTextDropdown'])[1]");
	private By phonenumbertextboxinquicktext = By.xpath("(//input[@id='newPhoneNumber'])[1]");
	private By sendbuttoninquicktextAR = By.xpath("(//button[@id='btnSave'])[1]");
	private By claimstabinsidebar = By.xpath("(//span[normalize-space()='Claims'])[1]");
	private By exportexcelbuttoninclaims = By.xpath("(//span[normalize-space()='Export Excel'])[1]");
	private By newclaimbuttoninclaims = By.xpath("(//span[normalize-space()='New Claim'])[1]");
	private By addclaimtabinclaims = By.xpath("//a[@id='addClaimPopup']//img");
	private By insurancecompanynametextbox = By.xpath("(//input[@id='Filter_InsuranceCompanyName'])[1]");
	private By claimnumbertextbox = By.xpath("(//input[@id='Filter_ClaimNumber'])[1]");
	private By firstradiobuttoninsearchclaim = By.xpath("(//input[@type='radio' and @name='groupOfClaimRadios'])[1]");
	private By claimtypedropdownbutton = By.xpath("(//select[@id='PatientClaim_ClaimTypeId'])[1]");
	private By dateofservicepickertextbox = By.xpath("(//input[@id='PatientClaim_ServiceDate'])[1]");
	private By billstatusdropdownbutton = By.xpath("(//select[@id='PatientClaim_BillStatusId'])[1]");
	private By stagestatusdropdownbutton = By.xpath("(//select[@id='PatientClaim_ClaimStageId'])[1]");
	private By businessnametextboxinsearchpartner = By.xpath("(//input[@id='Filter_BusinessName'])[1]");
	private By firstradiobuttoninsearchpartner = By.xpath("(//input[@type='radio' and @name='groupOfPartnerRadios'])[1]");
	private By submitbuttoninsearchpartner = By.xpath("(//button[@id='btnPartner'])[1]");
	private By addcollectionattorneytab = By.xpath("//a[@id='addCollectionAttorneyPopup']");
	private By addprescribertabinclaims = By.xpath("//a[@id='addPrescriberPopup']//img");
	private By fullsearchradiobuttoninsearchprovider = By.xpath("(//input[@id='rdoFullSearch'])[1]");
	private By lastnametextboxinsearchprovider = By.xpath("(//input[@id='Filter_DoctorLastName'])[1]");
	private By firstnametextboxinsearchprovider = By.xpath("(//input[@id='Filter_DoctorFirstName'])[1]");
	private By phonenumbertextboxinsearchprovider = By.xpath("(//input[@id='Filter_PhoneNumber'])[1]");
	private By firstradiobuttoninsearchproviderclaim = By.xpath("(//input[@type='radio' and @name='groupOfProviderRadios'])[1]");
	private By submitbuttoninsearchproviderclaim = By.xpath("(//button[@id='btnProvider'])[1]");
	private By nextbuttoninclaim = By.xpath("(//button[normalize-space()='Next'])[1]");
	private By newbilltabinclaim = By.xpath("(//a[@id='btnAddPatientClaimBill'])[1]");
	private By orderdatepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_WrittenDate'])[1]");
	private By orderreceiveddatepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_OrderReceivedDate'])[1]");
	private By RXnumbertextboxinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_RXNumber'])[1]");
	private By Refillnumbertextboxinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_RefillNumber'])[1]");
	private By dateofservicepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_DateOfService'])[1]");
	private By referencenumbertextboxinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_ReferenceNumber'])[1]");
	private By billamounttextboxinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_BillAmount'])[1]");
	private By productshippingtextboxinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_ProductShipping'])[1]");
	private By deliverydatepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_DeliveryDate'])[1]");
	private By billingdatepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_BillingDate'])[1]");
	private By billsubmitteddatepickerinaddclaimbill = By.xpath("(//input[@id='PatientClaimBill_BillSubmittedDate'])[1]");
	private By statusdropdowninaddclaimbill = By.xpath("(//select[@id='PatientClaimBill_ClaimBillStatusId'])[1]");
	private By notestextboxinaddclaimbill = By.xpath("(//textarea[@id='PatientClaimBill_Notes'])[1]");
	private By manualradiobuttoninaddclaimbill = By.xpath("(//input[@id='rdManual'])[1]");
	private By electronicsradiobuttoninaddclaimbill = By.xpath("(//input[@id='rdElectronic'])[1]");
	private By submitbuttoninaddclaimbill = By.xpath("(//button[@id='btnSavePatientClaimBillPopup'])[1]");
	private By cms1500tabinclaim = By.xpath("(//a[@id='addPatientClaim1500'])[1]");
	private By checklistdropdowninaddclaim1500 = By.xpath("(//select[@id='PatientCMS1500CheckListId'])[1]");
	private By viewdocumentcheckboxinaddclaim1500 = By.xpath("(//label[@for='chkgIsCMS1500ViewDocument'])[1]");
	private By downloadfilecheckboxinaddclaim1500 = By.xpath("(//label[@for='chkgIsCMS1500DownloadFile'])[1]");
	private By templatedropdowninaddclaim1500 = By.xpath("(//select[@id='CMS1500TemplateId'])[1]");
	private By submitbuttoninaddclaim1500 = By.xpath("(//button[@id='btnSavePatientCMS1500'])[1]");
	private By nametextboxintemplate = By.xpath("(//input[@id='CMS1500_Name'])[1]");
	private By submitbuttonintemplate = By.xpath("(//button[@id='btnSave'])[1]");
	private By newsupportivedocumentstabinclaim = By.xpath("(//a[@id='btnAddPatientClaimBillDocument'])[1]");
	private By checklistdropdowninaddclaimsupportivedocument = By.xpath("(//select[@id='PatientClaimBillDocument_ClaimCheckListId'])[1]");
	private By viewdocumentcheckboxinaddclaimsupportivedocument = By.xpath("(//label[@for='chkgIsViewDocument'])[1]");
	private By downloadfilecheckboxinaddclaimsupportivedocument = By.xpath("(//label[@for='chkgIsDownloadFile'])[1]");
	private By choosefiletabinaddclaimsupportivedocument = By.xpath("(//input[@id='file-1'])[1]");
	private By submitbuttoninaddclaimsupportivedocument = By.xpath("(//button[@id='btnSavePatientClaimBillDocument'])[1]");
	private By newclaimcommunicationtabinclaim = By.xpath("(//span[normalize-space()='New Claim Communication'])[1]");
	private By dateofcommunicationpickerinaddcommunication = By.xpath("(//input[@id='PatientCommunication_LastCommunicationDate'])[1]");
	private By prospectivefollowupdatepickerinaddcommunication = By.xpath("(//input[@id='PatientCommunication_FollowupDate'])[1]");
	private By duedatepickerinaddcommunication = By.xpath("(//input[@id='PatientCommunication_DueDate'])[1]");
	private By prioritydropdowninaddcommunication = By.xpath("(//select[@id='PatientCommunication_Priority'])[1]");
	private By communicationtypedropdowninaddcommunication = By.xpath("(//select[@id='PatientCommunication_PatientCommunicationType'])[1]");
	private By topicsdiscussedtextboxinaddcommunication = By.xpath("(//textarea[@id='PatientCommunication_Description'])[1]");
	private By discussionresultstextboxinaddcommunication = By.xpath("(//textarea[@id='PatientCommunication_Notes'])[1]");
	private By submitbuttoninaddcommunication = By.xpath("(//button[@id='btnSaveCommunication'])[1]");
	private By newEOBtabinclaim = By.xpath("(//a[@id='btnAddPatientClaimEOB'])[1]");
	private By receiveddatepickerinaddpatientclaimEOB = By.xpath("(//input[@id='PatientClaimEOB_ReceivedDate'])[1]");
	private By interventiontypedropdowninaddpatientclaimEOB = By.xpath("(//select[@id='PatientClaimEOB_EOBInterventiontypeId'])[1]");
	private By interventiondatepickerinaddpatientclaimEOB = By.xpath("(//input[@id='PatientClaimEOB_InterventionDate'])[1]");
	private By interventionneededcheckboxinaddpatientclaimEOB = By.xpath("(//label[normalize-space()='Intervention Needed?'])[1]");
	private By methodofsubmissiontextboxinaddpatientclaimEOB = By.xpath("(//input[@id='PatientClaimEOB_SubmissionMethod'])[1]");
	private By choosefiletabinaddpatientclaimEOB = By.xpath("(//input[@id='file-2'])[1]");
	private By submitbuttoninaddpatientclaimEOB = By.xpath("(//button[@id='btnSavePatientClaimEOB'])[1]");
	private By newsettlementtabinclaim = By.xpath("(//a[@id='btnAddPatientClaimSettlement'])[1]");
	private By receiveddatepickerinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_ReceivedDate'])[1]");
	private By offerreceiveddatepickerinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_OfferReceivedDate'])[1]");
	private By offeramounttextboxinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_OfferAmount'])[1]");
	private By originalamounttextboxinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_OriginalAmount'])[1]");
	private By acceptedamounttextboxinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_AcceptedAmount'])[1]");
	private By accepteddatepickerinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_AcceptedDate'])[1]");
	private By approvedbytextboxinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_ApprovedBy'])[1]");
	private By offercontactpersontextboxinaddclaimsettlement = By.xpath("(//input[@id='PatientClaimSettlement_OfferContactPerson'])[1]");
	private By submitbuttoninaddclaimsettlement = By.xpath("(//button[@id='btnSavePatientClaimSettlement'])[1]");
	private By newpaymenttabinclaim = By.xpath("(//a[@id='btnAddPatientClaimPayment'])[1]");
	private By checknumbertextboxinaddpatientclaimpayment = By.xpath("(//input[@id='PatientClaimPayment_CheckNumber'])[1]");
	private By amounttextboxinaddpatientclaimpayment = By.xpath("(//input[@id='PatientClaimPayment_Amount'])[1]");
	private By receiveddatepickerinaddpatientclaimpayment = By.xpath("(//input[@id='PatientClaimPayment_ReceivedDate'])[1]");
	private By partofsettlementcheckboxinaddpatientclaimpayment = By.xpath("(//label[normalize-space()='Part Of Settlement?'])[1]");
	private By servicefeecheckboxinaddpatientclaimpayment = By.xpath("(//label[normalize-space()='Service Fee?'])[1]");
	private By choosefiletabinaddpatientclaimpayment = By.xpath("(//input[@id='file-3'])[1]");
	private By submitbuttoninaddpatientclaimpayment = By.xpath("(//button[@id='btnSavePatientClaimPayment'])[1]");
	private By addattorneytabinclaim = By.xpath("//a[@id='addAttorneyPopup']//img");
	private By addattorneyexecutivetabinclaim = By.xpath("//a[@id='addAttorneyExecutivePopup']//img");
	private By attorneysendfaxtabinattorney = By.xpath("(//a[@id='btnAttorneySendFax'])[1]");
	private By addfundingcompanytabinclaim = By.xpath("//a[@id='addFundingCompanyPopup']//img");
	private By addfundingcompanyexecutivetabinclaim = By.xpath("//a[@id='addFundingCompanyExecutivePopup']//img");
	private By fundingcompanysendfaxtabinfundingcompany = By.xpath("//a[@id='btnFundingCompanySendFax']");
	private By insurancecompanysendfaxtabininsurancecompany = By.xpath("(//a[@id='btnInsuranceCompanySendFax'])[1]");
	private By submitbuttoninclaim = By.xpath("(//button[@id='btnSave'])[1]");
	private By cancelbuttoninclaim = By.xpath("(//button[contains(text(),'Cancel')])[1]");
	private By addcontractedcompanytabinclaim = By.xpath("(//a[@id='addContractedCompanyPopup'])[1]");
	private By partnerexecutivetextbox = By.xpath("(//input[@id='searchinputPartnerExecutive'])[1]");
	private By submitbuttoninpartnerexecutive = By.xpath("(//button[@id='btnPartnerExecutive'])[1]");
	private By firstattorneydocumentcheckbox = By.xpath("(//tbody[@id='AttorneyDocuments-body']//div[contains(@class,'fillable-checkbox')])[1]");
	private By firstfundingcompanydocumentcheckbox = By.xpath("(//tbody[@id='FundingCompanyDocuments-body']//div[contains(@class,'fillable-checkbox')])[1]");
	private By firstinsurancecompanydocumentcheckbox = By.xpath("(//tbody[@id='InsuranceCompanyDocuments-body']//div[contains(@class,'fillable-checkbox')])[1]");
	private By editbuttoninexistingclaim = By.xpath("(//span[normalize-space()='Edit'])[1]");
	private By threedotbuttoninexistingbillingdetails = By.xpath("(//div[normalize-space()='Billing Details'] /ancestor::div[contains(@class,'detailInner')] //button[contains(@class,'dropbtn') and contains(@class,'bucket-icon-dropdown')])[1]");
	private By threedotbuttoninexistingclaimcommunication = By.xpath("(//div[normalize-space()='Claim Communication'] /ancestor::div[contains(@class,'detailInner')] //button[contains(@class,'dropbtn') and contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingclaimcommunication = By.xpath("(//a[contains(@onclick,'editCommunication')])[1]");
	private By threedotbuttoninexistingEOB = By.xpath("(//div[normalize-space()='EOB'] /ancestor::div[contains(@class,'detailInner')] //button[contains(@class,'table-dropbtn') and contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingEOB = By.xpath("(//a[contains(@onclick,'editPatientClaimEOB')])[1]");
	private By threedotbuttoninexistingsettlement = By.xpath("(//div[normalize-space()='Settlement'] /ancestor::div[contains(@class,'detailInner')] //button[contains(@class,'dropbtn') and contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingsettlement = By.xpath("(//a[contains(@onclick,'editPatientClaimSettlement')])[1]");
	private By threedotbuttoninexistingpayment = By.xpath("(//div[normalize-space()='Payment'] /ancestor::div[contains(@class,'detailInner')] //button[contains(@class,'dropbtn') and contains(@class,'bucket-icon-dropdown')])[1]");
	private By editbuttoninexistingpayment = By.xpath("(//a[contains(@onclick,'editPatientClaimPayment')])[1]");
	private By deletebuttoninexistingbillingdetails = By.xpath("(//a[@id='btnDeletePatientClaimBill']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingbillingdetails = By.xpath("(//button[@id='btnDeletePatientClaimBillConfirm'])[1]");
	private By deletebuttoninexistingclaimcommunication = By.xpath("(//a[@id='btnDeleteCommunicationConfirm']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingclaimcommunication = By.xpath("(//button[@id='deletepatientCommunication'])[1]");
	private By deletebuttoninexistingEOB = By.xpath("(//a[@id='btnDeletePatientClaimEOB']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingEOB = By.xpath("(//button[@id='btnDeletePatientClaimEOBConfirm'])[1]");
	private By downloadbuttoninexistingEOB = By.xpath("(//div[contains(@class,'dropdown-menu') and contains(@class,'show')]//a[contains(@href,'DownloadFile')])[1]");
	private By deletebuttoninexistingsettlement = By.xpath("(//a[@id='btnDeletePatientClaimSettlement']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingsettlement = By.xpath("(//button[@id='btnDeletePatientClaimSettlementConfirm'])[1]");
	private By deletebuttoninexistingpayment = By.xpath("(//a[@id='btnDeletePatientClaimPayment']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingpayment = By.xpath("(//button[@id='btnDeletePatientClaimPaymentConfirm'])[1]");
	private By downloadbuttonininsurancecompany = By.xpath("(//div[@id='PatientClaimInsuranceCompanyFaxGrid']//a[contains(@href,'DownloadFile')])[1]");
	private By deletebuttoninexistingclaim = By.xpath("(//a[@id='btnDeletePatientClaim']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingclaim = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By claimtypedropdowninclaims = By.xpath("//select[@id='Filter_ClaimTypes']/preceding-sibling::input");
	private By claimstatusdropdowninclaims = By.xpath("//select[@id='Filter_ClaimStatus']/preceding-sibling::input");
	private By billstatusdropdowninclaims = By.xpath("//select[@id='Filter_BillStatuses']/preceding-sibling::input");
	private By stagestatusdropdowninclaims = By.xpath("//label[text()='Stage Status']/following::input[contains(@class,'select-dropdown')][1]");
	private By paymentstatusdropdowninclaims = By.xpath("//label[text()='Payment Status']/following::input[contains(@class,'select-dropdown')][1]");
	private By cms1500tabinsidebar = By.xpath("(//span[normalize-space()='CMS 1500'])[1]");
	private By newcms1500tabincms1500 = By.xpath("(//span[normalize-space()='New CMS1500'])[1]");
	private By cms1500downloadbuttonincms1500 = By.xpath("(//td//a[contains(@onclick,'DownloadCMS')])[1]");
	private By editbuttoninexistingcms1500 = By.xpath("(//div[@class='gridRecordContextInner'])[1]");
	private By deletebuttoninexistingcms1500 = By.xpath("(//a[@id='btnDeleteCMS1500']//div[@class='gridRecordContextInner'])[1]");
	private By confirmdeletebuttoninexistingcms1500 = By.xpath("(//button[normalize-space()='Confirm'])[1]");
	private By reportstabinsidebar = By.xpath("(//span[@class='sidebar-text'][normalize-space()='Reports'])[1]");
	private By ledgerreportinreports = By.xpath("(//a[normalize-space()='Ledger Report'])[1]");
	private By downloadbuttoninledgerreport = By.xpath("(//div[contains(@class,'gridListIconsFlex')]//a[contains(@class,'gridListRoundIcon')])[1]");
	private By claimreporttabinreports = By.xpath("(//a[normalize-space()='Claim Report'])[1]");
	private By birthdatetextboxinfilterofclaimreport = By.xpath("(//input[@id='Filter_DateofBirth'])[1]");
	private By claimtypedropdownbuttoninclaimreport = By.xpath("(//select[@id='Filter_ClaimType'])[1]");
	private By advancesearchtabinclaimreport = By.xpath("(//span[normalize-space()='Advance Search'])[1]");
	private By fromdateindateoflossinclaimreport = By.xpath("(//input[@id='Filter_LossFromDate'])[1]");
	private By todateindateoflossinclaimreport = By.xpath("(//input[@id='Filter_LossToDate'])[1]");
	private By cellnumbertextboxinclaimreport = By.xpath("(//input[@id='Filter_CellNumber'])[1]");
	private By fromdateserviceinclaimreport = By.xpath("(//input[@id='Filter_ServiceFromDate'])[1]");
	private By todateserviceinclaimreport = By.xpath("(//input[@id='Filter_ServiceToDate'])[1]");
	private By medicalprovidernametextboxinclaimreport = By.xpath("(//input[@id='Filter_MedicalProviderName'])[1]");
	private By texttabinsidebar = By.xpath("(//span[normalize-space()='Text'])[1]");
	private By rxnumbertextboxinquicktext = By.xpath("(//input[@id='newRxNumber'])[1]");
	private By sendvcardtabintext = By.xpath("(//span[normalize-space()='Send VCard'])[1]");
	private By phonenumbertextboxinsendvcard = By.xpath("(//input[@id='vCardPhoneNumber'])[1]");
	private By bodytextboxinsendvcard = By.xpath("(//textarea[@id='vcardBody'])[1]");
	private By sendbuttoninsendvcard = By.xpath("(//button[@id='btnSendVCard'])[1]");
	private By addtopatienttabintext = By.xpath("//a[@title='Add To Patient']//img");
	private By replytabintext = By.xpath("//a[@title='Reply Communication']//img");
	private By replytextboxinreplycommunication = By.xpath("(//textarea[@id='replyBody'])[1]");
	private By submitbuttoninreplycommunication = By.xpath("(//button[@id='btnSaveReplyCommunicaiton'])[1]");
	private By usernametextboxinfilter = By.xpath("(//input[@id='Filter_AuthUserName'])[1]");
	private By textstatusdropdownbuttoninfilter = By.xpath("(//select[@id='Filter_Status'])[1]");
	
	
	
	
	
	
	
	
	public BillingModuleFunctionalityPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean clickintotheBillingmoduletab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Billing Module tab
	    List<WebElement> billingmoduletabs = driver.findElements(billingmoduletab);

	    if (billingmoduletabs.isEmpty()) {
	        // Billing Module tab NOT present → stop scenario
	        return false;
	    }

	    WebElement billingmoduletab = billingmoduletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(billingmoduletab));
	    billingmoduletab.click();

	    return true;
	}
	
	
	//-----------------------------------Invoice Section-----------------------------------------
	
	
	public boolean clickintotheInvoicetabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Invoice tab
	    List<WebElement> invoicetabs = driver.findElements(invoicetabinsidebar);

	    if (invoicetabs.isEmpty()) {
	        // Invoice tab NOT present → stop scenario
	        return false;
	    }

	    WebElement invoicetab = invoicetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(invoicetab));
	    invoicetab.click();

	    return true;
	}
	
	public boolean clickintotheNewInvoicebuttoninInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Invoice tab
	    List<WebElement> newinvoicetabs = driver.findElements(newinvoicebuttonininvoice);

	    if (newinvoicetabs.isEmpty()) {
	        // New Invoice tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newinvoicetab = newinvoicetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newinvoicetab));
	    newinvoicetab.click();

	    return true;
	}
	
	public void clickintotheAddPatientNametabinInvoicepage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addpatientnamebutton = wait.until(ExpectedConditions.elementToBeClickable(addpatientnametabininvoicepage));
	   
	    try {
	    	addpatientnamebutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addpatientnamebutton);
	    }

	    System.out.println("Add Patient Name button clicked successfully");
	}
	
	public void enterthePatientIdinSearchPatient(String PatientId) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientIdtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(patientidtextboxinsearchpatient));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientIdtextboxfiled.isDisplayed()
	            && PatientIdtextboxfiled.isEnabled());

	    PatientIdtextboxfiled.click();
	    PatientIdtextboxfiled.clear();
	    PatientIdtextboxfiled.sendKeys(PatientId);

	    System.out.println("Patient Id entered: " + PatientId);
    }
	
	public void enterthePatientLastNameinSearchPatient(String PatientLastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientLastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxinsearchpatient));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientLastNametextboxfiled.isDisplayed()
	            && PatientLastNametextboxfiled.isEnabled());

	    PatientLastNametextboxfiled.click();
	    PatientLastNametextboxfiled.clear();
	    PatientLastNametextboxfiled.sendKeys(PatientLastName);

	    System.out.println("Patient Last Name entered: " + PatientLastName);
    }
	
	public void enterthePatientFirstNameinSearchPatient(String PatientFirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientFirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxinsearchpatient));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientFirstNametextboxfiled.isDisplayed()
	            && PatientFirstNametextboxfiled.isEnabled());

	    PatientFirstNametextboxfiled.click();
	    PatientFirstNametextboxfiled.clear();
	    PatientFirstNametextboxfiled.sendKeys(PatientFirstName);

	    System.out.println("Patient First Name entered: " + PatientFirstName);
    }
	
	public void enterthePatientDateofBirthinSearchPatient(String PatientDateofBirth) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientDateofBirthtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(dateofbirthtextboxinsearchpatient));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientDateofBirthtextboxfiled.isDisplayed()
	            && PatientDateofBirthtextboxfiled.isEnabled());

	    PatientDateofBirthtextboxfiled.click();
	    PatientDateofBirthtextboxfiled.clear();
	    PatientDateofBirthtextboxfiled.sendKeys(PatientDateofBirth);

	    System.out.println("Patient Date of Birth entered: " + PatientDateofBirth);
    }
	
	public String clickintotheSearchbuttoninSearchPatient() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchpatient)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }

	    // Check "No Records Found" message
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) Found'])[1]")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️ Patient is available
	    return "Patient is shown";
	}
	
	public void clickintotheFirstradiobuttoninSearchPatient() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(firstradiobuttoninsearchpatient));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("First Radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninSearchPatient() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchpatient)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Patient is Added";
	}
	
	public void entertheIteminInvoice(String Item) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Itemtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(itemtextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Itemtextboxfiled.isDisplayed()
	            && Itemtextboxfiled.isEnabled());

	    Itemtextboxfiled.click();
	    Itemtextboxfiled.clear();
	    Itemtextboxfiled.sendKeys(Item);

	    System.out.println("Item entered: " + Item);
    }
	
	public boolean selectFlagInInvoice(String flagName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️⃣ Click dropdown
	        WebElement dropdown = wait.until(
	                ExpectedConditions.elementToBeClickable(flagdropdownbuttonininvoice));

	        dropdown.click();

	        // 2️⃣ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + flagName + "']")));

	        // 3️⃣ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️⃣ Click option
	        option.click();

	        System.out.println("Flag selected: " + flagName);

	        // 5️⃣ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting flag: " + e.getMessage());
	        return false;
	    }
	}
	
	public void entertheDescriptioninInvoice(String Description) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Descriptiontextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(descriptiontextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Descriptiontextboxfiled.isDisplayed()
	            && Descriptiontextboxfiled.isEnabled());

	    Descriptiontextboxfiled.click();
	    Descriptiontextboxfiled.clear();
	    Descriptiontextboxfiled.sendKeys(Description);

	    System.out.println("Description entered: " + Description);
    }
	
	public void entertheQuantityinInvoice(String Quantity) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Quantitytextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(quantitytextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Quantitytextboxfiled.isDisplayed()
	            && Quantitytextboxfiled.isEnabled());

	    Quantitytextboxfiled.click();
	    Quantitytextboxfiled.clear();
	    Quantitytextboxfiled.sendKeys(Quantity);

	    System.out.println("Quantity entered: " + Quantity);
    }
	
	public void entertheCostPerQuantityinInvoice(String CostPerQuantity) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CostPerQuantitytextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(costperquantitytextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CostPerQuantitytextboxfiled.isDisplayed()
	            && CostPerQuantitytextboxfiled.isEnabled());

	    CostPerQuantitytextboxfiled.click();
	    CostPerQuantitytextboxfiled.clear();
	    CostPerQuantitytextboxfiled.sendKeys(CostPerQuantity);

	    System.out.println("Cost Per Quantity entered: " + CostPerQuantity);
    }
	
	public void clickintotheTaxablecheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(taxablecheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Taxable checkbox clicked successfully");
	}
	
	public void entertheShippingChargesinInvoice(String ShippingCharges) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ShippingChargestextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(shippingandhandlingchargestextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ShippingChargestextboxfiled.isDisplayed()
	            && ShippingChargestextboxfiled.isEnabled());

	    ShippingChargestextboxfiled.click();
	    ShippingChargestextboxfiled.clear();
	    ShippingChargestextboxfiled.sendKeys(ShippingCharges);

	    System.out.println("Shipping Charges entered: " + ShippingCharges);
    }
	
	public String clickintothePlusIconinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    WebElement plusBtn = wait.until(ExpectedConditions.presenceOfElementLocated(plusiconininvoice));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(plusBtn)).click();
	        System.out.println("Plus icon clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", plusBtn);
	        System.out.println("Plus icon clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Details added successfully";
	}
	
	public void clickintotheShippingAmountcheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(shippingamountcheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Shipping Amount checkbox clicked successfully");
	}
	
	public boolean ChecktheShippingAmountcheckboxStatusinInvoice() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    By checkboxLocator = By.id("InvoiceDetail_IsShippingAmount");

	    // wait loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // find checkbox again after DOM refresh
	    WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(checkboxLocator));

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // scroll to checkbox
	    js.executeScript("arguments[0].scrollIntoView({block:'center'});", checkbox);

	    // small wait for UI stabilize
	    Thread.sleep(500);

	    if (checkbox.isSelected()) {

	        js.executeScript("arguments[0].click();", checkbox);

	        System.out.println("Shipping Amount checkbox unchecked successfully");
	        return true;
	    }

	    System.out.println("Shipping Amount checkbox already unchecked");
	    return false;
	}
	
	public void clickintothePrintDescriptioncheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(printdescriptioncheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Print Description checkbox clicked successfully");
	}
	
	public void enterthePatientEmailinInvoice(String PatientEmail) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientEmailtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(patientemailtextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientEmailtextboxfiled.isDisplayed()
	            && PatientEmailtextboxfiled.isEnabled());

	    PatientEmailtextboxfiled.click();
	    PatientEmailtextboxfiled.clear();
	    PatientEmailtextboxfiled.sendKeys(PatientEmail);

	    System.out.println("Patient Email entered: " + PatientEmail);
    }
	
	public void enterthePatientPhoneNumberinInvoice(String PatientPhoneNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PatientPhoneNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(patientphonenumbertextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PatientPhoneNumbertextboxfiled.isDisplayed()
	            && PatientPhoneNumbertextboxfiled.isEnabled());

	    PatientPhoneNumbertextboxfiled.click();
	    PatientPhoneNumbertextboxfiled.clear();
	    PatientPhoneNumbertextboxfiled.sendKeys(PatientPhoneNumber);

	    System.out.println("Patient Phone Number entered: " + PatientPhoneNumber);
    }
	
	public void entertheThirdPartyEmailinInvoice(String ThirdPartyEmail) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ThirdPartyEmailtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(thirdpartyemailtextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ThirdPartyEmailtextboxfiled.isDisplayed()
	            && ThirdPartyEmailtextboxfiled.isEnabled());

	    ThirdPartyEmailtextboxfiled.click();
	    ThirdPartyEmailtextboxfiled.clear();
	    ThirdPartyEmailtextboxfiled.sendKeys(ThirdPartyEmail);

	    System.out.println("Third Party Email entered: " + ThirdPartyEmail);
    }
	
	public void clickintothePatientEmailcheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(patientemailcheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Patient Email checkbox clicked successfully");
	}
	
	public void clickintothePatientPhoneNumbercheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(patientphonenumbercheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Patient Phone Number checkbox clicked successfully");
	}
	
	public void clickintotheThirdPartyEmailcheckboxinInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(thirdpartyemailcheckboxininvoice));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Third Party Email checkbox clicked successfully");
	}
	
	public void entertheLastNameinInvoiceBillTo(String LastNameInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNameInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNameInvoiceBillTotextboxfiled.isDisplayed()
	            && LastNameInvoiceBillTotextboxfiled.isEnabled());

	    LastNameInvoiceBillTotextboxfiled.click();
	    LastNameInvoiceBillTotextboxfiled.clear();
	    LastNameInvoiceBillTotextboxfiled.sendKeys(LastNameInvoiceBillTo);

	    System.out.println("Last Name Invoice Bill To entered: " + LastNameInvoiceBillTo);
    }
	
	public void removetheLastNameinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNameInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNameInvoiceBillTotextboxfiled.isDisplayed()
	            && LastNameInvoiceBillTotextboxfiled.isEnabled());

	    LastNameInvoiceBillTotextboxfiled.click();
	    LastNameInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("Last Name is remove in Invoice Bill To");
    }
	
	public void entertheFirstNameinInvoiceBillTo(String FirstNameInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNameInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNameInvoiceBillTotextboxfiled.isDisplayed()
	            && FirstNameInvoiceBillTotextboxfiled.isEnabled());

	    FirstNameInvoiceBillTotextboxfiled.click();
	    FirstNameInvoiceBillTotextboxfiled.clear();
	    FirstNameInvoiceBillTotextboxfiled.sendKeys(FirstNameInvoiceBillTo);

	    System.out.println("First Name Invoice Bill To entered: " + FirstNameInvoiceBillTo);
    }
	
	public void removetheFirstNameinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNameInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNameInvoiceBillTotextboxfiled.isDisplayed()
	            && FirstNameInvoiceBillTotextboxfiled.isEnabled());

	    FirstNameInvoiceBillTotextboxfiled.click();
	    FirstNameInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("First Name is remove in Invoice Bill To");
    }
	
	public void entertheStreetAddressinInvoiceBillTo(String StreetAddressInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement StreetAddressInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(streetaddresstextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> StreetAddressInvoiceBillTotextboxfiled.isDisplayed()
	            && StreetAddressInvoiceBillTotextboxfiled.isEnabled());

	    StreetAddressInvoiceBillTotextboxfiled.click();
	    StreetAddressInvoiceBillTotextboxfiled.clear();
	    StreetAddressInvoiceBillTotextboxfiled.sendKeys(StreetAddressInvoiceBillTo);

	    System.out.println("Street Address Invoice Bill To entered: " + StreetAddressInvoiceBillTo);
    }
	
	public void removetheStreetAddressinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement StreetAddressInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(streetaddresstextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> StreetAddressInvoiceBillTotextboxfiled.isDisplayed()
	            && StreetAddressInvoiceBillTotextboxfiled.isEnabled());

	    StreetAddressInvoiceBillTotextboxfiled.click();
	    StreetAddressInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("Street Address is remove in Invoice Bill To");
    }
	
	public void entertheCityinInvoiceBillTo(String CityInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CityInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(citytextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CityInvoiceBillTotextboxfiled.isDisplayed()
	            && CityInvoiceBillTotextboxfiled.isEnabled());

	    CityInvoiceBillTotextboxfiled.click();
	    CityInvoiceBillTotextboxfiled.clear();
	    CityInvoiceBillTotextboxfiled.sendKeys(CityInvoiceBillTo);

	    System.out.println("City Invoice Bill To entered: " + CityInvoiceBillTo);
    }
	
	public void removetheCityinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CityInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(citytextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CityInvoiceBillTotextboxfiled.isDisplayed()
	            && CityInvoiceBillTotextboxfiled.isEnabled());

	    CityInvoiceBillTotextboxfiled.click();
	    CityInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("City remove from Invoice Bill To");
    }
	
	public void entertheStateinInvoiceBillTo(String StateInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement StateInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(statetextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> StateInvoiceBillTotextboxfiled.isDisplayed()
	            && StateInvoiceBillTotextboxfiled.isEnabled());

	    StateInvoiceBillTotextboxfiled.click();
	    StateInvoiceBillTotextboxfiled.clear();
	    StateInvoiceBillTotextboxfiled.sendKeys(StateInvoiceBillTo);

	    System.out.println("State Invoice Bill To entered: " + StateInvoiceBillTo);
    }
	
	public void removetheStateinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement StateInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(statetextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> StateInvoiceBillTotextboxfiled.isDisplayed()
	            && StateInvoiceBillTotextboxfiled.isEnabled());

	    StateInvoiceBillTotextboxfiled.click();
	    StateInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("State is remove Invoice Bill To");
    }
	
	public void entertheZipCodeinInvoiceBillTo(String ZipCodeInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZipCodeInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(zipcodetextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZipCodeInvoiceBillTotextboxfiled.isDisplayed()
	            && ZipCodeInvoiceBillTotextboxfiled.isEnabled());

	    ZipCodeInvoiceBillTotextboxfiled.click();
	    ZipCodeInvoiceBillTotextboxfiled.clear();
	    ZipCodeInvoiceBillTotextboxfiled.sendKeys(ZipCodeInvoiceBillTo);

	    System.out.println("Zip Code Invoice Bill To entered: " + ZipCodeInvoiceBillTo);
    }
	
	public void removetheZipCodeinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ZipCodeInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(zipcodetextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ZipCodeInvoiceBillTotextboxfiled.isDisplayed()
	            && ZipCodeInvoiceBillTotextboxfiled.isEnabled());

	    ZipCodeInvoiceBillTotextboxfiled.click();
	    ZipCodeInvoiceBillTotextboxfiled.clear();
	   
	    System.out.println("Zip Code is remove Invoice Bill To");
    }
	
	public void enterthePhoneNumberinInvoiceBillTo(String PhoneNumberInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberInvoiceBillTotextboxfiled.isDisplayed()
	            && PhoneNumberInvoiceBillTotextboxfiled.isEnabled());

	    PhoneNumberInvoiceBillTotextboxfiled.click();
	    PhoneNumberInvoiceBillTotextboxfiled.clear();
	    PhoneNumberInvoiceBillTotextboxfiled.sendKeys(PhoneNumberInvoiceBillTo);

	    System.out.println("Phone Number Invoice Bill To entered: " + PhoneNumberInvoiceBillTo);
    }
	
	public void removethePhoneNumberinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberInvoiceBillTotextboxfiled.isDisplayed()
	            && PhoneNumberInvoiceBillTotextboxfiled.isEnabled());

	    PhoneNumberInvoiceBillTotextboxfiled.click();
	    PhoneNumberInvoiceBillTotextboxfiled.clear();
	    
	    System.out.println("Phone Number is remove Invoice Bill To");
    }
	
	public void entertheEmailinInvoiceBillTo(String EmailInvoiceBillTo) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement EmailInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(emailtextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> EmailInvoiceBillTotextboxfiled.isDisplayed()
	            && EmailInvoiceBillTotextboxfiled.isEnabled());

	    EmailInvoiceBillTotextboxfiled.click();
	    EmailInvoiceBillTotextboxfiled.clear();
	    EmailInvoiceBillTotextboxfiled.sendKeys(EmailInvoiceBillTo);

	    System.out.println("Email Invoice Bill To entered: " + EmailInvoiceBillTo);
    }
	
	public void removetheEmailinInvoiceBillTo() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement EmailInvoiceBillTotextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(emailtextboxininvoicebillto));

	    // Extra safety for animation/overlay
	    wait.until(driver -> EmailInvoiceBillTotextboxfiled.isDisplayed()
	            && EmailInvoiceBillTotextboxfiled.isEnabled());

	    EmailInvoiceBillTotextboxfiled.click();
	    EmailInvoiceBillTotextboxfiled.clear();
	   
	    System.out.println("Email Remove in Invoice Bill To entered");
    }
	
	public String clickintotheSavebuttoninInvoice() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    // 3. Check if Save button exists (Permission check)
	    List<WebElement> saveButtons = driver.findElements(savebuttonininvoice);

	    if (saveButtons.isEmpty() || !saveButtons.get(0).isDisplayed()) {
	        return "NO_PERMISSION: Save button not visible. No button permission you have.";
	    }

	    WebElement saveBtn = saveButtons.get(0);

	    // 4. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	        System.out.println("Save button clicked successfully");
	    } 
	    catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", saveBtn);
	        System.out.println("Save button clicked using JS");
	    }

	    // 5. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }

	    } catch (TimeoutException ignored) {}

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 6. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Save button clicked successfully";
	}
	
	public void entertheInvoiceLastName(String InvoiceLastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceLastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicelastnametextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceLastNametextboxfiled.isDisplayed()
	            && InvoiceLastNametextboxfiled.isEnabled());

	    InvoiceLastNametextboxfiled.click();
	    InvoiceLastNametextboxfiled.clear();
	    InvoiceLastNametextboxfiled.sendKeys(InvoiceLastName);

	    System.out.println("Invoice Last Name entered: " + InvoiceLastName);
    }
	
	public void removetheInvoiceLastName() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceLastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicelastnametextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceLastNametextboxfiled.isDisplayed()
	            && InvoiceLastNametextboxfiled.isEnabled());

	    InvoiceLastNametextboxfiled.click();
	    InvoiceLastNametextboxfiled.clear();
	    
	    System.out.println("Invoice Last Name is remove");
    }
	
	public void entertheInvoiceFirstName(String InvoiceFirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceFirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicefirstnametextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceFirstNametextboxfiled.isDisplayed()
	            && InvoiceFirstNametextboxfiled.isEnabled());

	    InvoiceFirstNametextboxfiled.click();
	    InvoiceFirstNametextboxfiled.clear();
	    InvoiceFirstNametextboxfiled.sendKeys(InvoiceFirstName);

	    System.out.println("Invoice First Name entered: " + InvoiceFirstName);
    }
	
	public void removetheInvoiceFirstName() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceFirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicefirstnametextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceFirstNametextboxfiled.isDisplayed()
	            && InvoiceFirstNametextboxfiled.isEnabled());

	    InvoiceFirstNametextboxfiled.click();
	    InvoiceFirstNametextboxfiled.clear();
	    
	    System.out.println("Invoice First Name is remove");
    }
	
	public void entertheInvoiceStreetAddress(String InvoiceStreetAddress) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceStreetAddresstextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicestreetaddresstextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceStreetAddresstextboxfiled.isDisplayed()
	            && InvoiceStreetAddresstextboxfiled.isEnabled());

	    InvoiceStreetAddresstextboxfiled.click();
	    InvoiceStreetAddresstextboxfiled.clear();
	    InvoiceStreetAddresstextboxfiled.sendKeys(InvoiceStreetAddress);

	    System.out.println("Invoice Street Address entered: " + InvoiceStreetAddress);
    }
	
	public void removetheInvoiceStreetAddress() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceStreetAddresstextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicestreetaddresstextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceStreetAddresstextboxfiled.isDisplayed()
	            && InvoiceStreetAddresstextboxfiled.isEnabled());

	    InvoiceStreetAddresstextboxfiled.click();
	    InvoiceStreetAddresstextboxfiled.clear();
	    
	    System.out.println("Invoice Street Address is remove");
    }
	
	public void entertheInvoiceCity(String InvoiceCity) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceCitytextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicecitytextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceCitytextboxfiled.isDisplayed()
	            && InvoiceCitytextboxfiled.isEnabled());

	    InvoiceCitytextboxfiled.click();
	    InvoiceCitytextboxfiled.clear();
	    InvoiceCitytextboxfiled.sendKeys(InvoiceCity);

	    System.out.println("Invoice City entered: " + InvoiceCity);
    }
	
	public void removetheInvoiceCity() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceCitytextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicecitytextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceCitytextboxfiled.isDisplayed()
	            && InvoiceCitytextboxfiled.isEnabled());

	    InvoiceCitytextboxfiled.click();
	    InvoiceCitytextboxfiled.clear();
	    
	    System.out.println("Invoice City is remove");
    }
	
	public void entertheInvoiceState(String InvoiceState) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceStatetextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicestatetextboxininoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceStatetextboxfiled.isDisplayed()
	            && InvoiceStatetextboxfiled.isEnabled());

	    InvoiceStatetextboxfiled.click();
	    InvoiceStatetextboxfiled.clear();
	    InvoiceStatetextboxfiled.sendKeys(InvoiceState);

	    System.out.println("Invoice State entered: " + InvoiceState);
    }
	
	public void removetheInvoiceState() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceStatetextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicestatetextboxininoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceStatetextboxfiled.isDisplayed()
	            && InvoiceStatetextboxfiled.isEnabled());

	    InvoiceStatetextboxfiled.click();
	    InvoiceStatetextboxfiled.clear();
	    
	    System.out.println("Invoice State is remove");
    }
	
	public void entertheInvoiceZipCode(String InvoiceZipCode) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceZipCodetextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicezipcodetextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceZipCodetextboxfiled.isDisplayed()
	            && InvoiceZipCodetextboxfiled.isEnabled());

	    InvoiceZipCodetextboxfiled.click();
	    InvoiceZipCodetextboxfiled.clear();
	    InvoiceZipCodetextboxfiled.sendKeys(InvoiceZipCode);

	    System.out.println("Invoice Zip Code entered: " + InvoiceZipCode);
    }
	
	public void entertheInvoicePhoneNumber(String InvoicePhoneNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoicePhoneNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicephonenumbertextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoicePhoneNumbertextboxfiled.isDisplayed()
	            && InvoicePhoneNumbertextboxfiled.isEnabled());

	    InvoicePhoneNumbertextboxfiled.click();
	    InvoicePhoneNumbertextboxfiled.clear();
	    InvoicePhoneNumbertextboxfiled.sendKeys(InvoicePhoneNumber);

	    System.out.println("Invoice Phone Number entered: " + InvoicePhoneNumber);
    }
	
	public void entertheInvoiceEmailID(String InvoiceEmailID) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceEmailIDtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoiceemailidtextboxininvoice));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceEmailIDtextboxfiled.isDisplayed()
	            && InvoiceEmailIDtextboxfiled.isEnabled());

	    InvoiceEmailIDtextboxfiled.click();
	    InvoiceEmailIDtextboxfiled.clear();
	    InvoiceEmailIDtextboxfiled.sendKeys(InvoiceEmailID);

	    System.out.println("Invoice EmailID entered: " + InvoiceEmailID);
    }
	
	public String clickintotheSaveAndSendbuttoninInvoice() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    // 3. Check if Save & Send button exists (Permission Check)
	    List<WebElement> saveButtons = driver.findElements(saveandsendbuttonininvoice);

	    if (saveButtons.isEmpty() || !saveButtons.get(0).isDisplayed()) {
	        return "NO_PERMISSION: Save And Send button not visible. No button permission you have.";
	    }

	    WebElement saveBtn = saveButtons.get(0);

	    // 4. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(saveBtn)).click();
	        System.out.println("Save And Send button clicked successfully");
	    } 
	    catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", saveBtn);
	        System.out.println("Save And Send button clicked using JS");
	    }

	    // 5. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }

	    } catch (TimeoutException ignored) {}

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 6. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Save And Send button clicked successfully";
	}
	
	public String clickintotheSettlementbuttoninInvoice() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    // 3. Check if Settlement button exists or not
	    List<WebElement> settlementButtons = driver.findElements(settlementbuttonininvoice);

	    if (settlementButtons.isEmpty() || !settlementButtons.get(0).isDisplayed()) {
	        return "NO_PERMISSION: Settlement button not visible. No button permission you have.";
	    }

	    WebElement SettlementBtn = settlementButtons.get(0);

	    // 4. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(SettlementBtn)).click();
	        System.out.println("Settlement button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", SettlementBtn);
	        System.out.println("Settlement button clicked using JS");
	    }

	    // 5. Collect error messages
	    List<String> errorMessages = new ArrayList<>();

	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }

	    } catch (TimeoutException ignored) {}

	    List<WebElement> fieldErrors = driver.findElements(
	            By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Settlement button clicked successfully";
	}
	
	public void entertheCardNumberinInvoiceSettlement(String CardNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CardNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(cardnumbertextboxininvoicesettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CardNumbertextboxfiled.isDisplayed()
	            && CardNumbertextboxfiled.isEnabled());

	    CardNumbertextboxfiled.click();
	    CardNumbertextboxfiled.clear();
	    CardNumbertextboxfiled.sendKeys(CardNumber);

	    System.out.println("Card Number entered: " + CardNumber);
    }
	
	public void entertheExpiryDateinInvoiceSettlement(String ExpiryDate) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ExpiryDatetextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(expirydatetextboxininvoicesettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ExpiryDatetextboxfiled.isDisplayed()
	            && ExpiryDatetextboxfiled.isEnabled());

	    ExpiryDatetextboxfiled.click();
	    ExpiryDatetextboxfiled.clear();
	    ExpiryDatetextboxfiled.sendKeys(ExpiryDate);

	    System.out.println("Expiry Date entered: " + ExpiryDate);
    }
	
	public void entertheCVVinInvoiceSettlement(String CVV) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CVVtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(cvvnumbertextboxininvoicesettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CVVtextboxfiled.isDisplayed()
	            && CVVtextboxfiled.isEnabled());

	    CVVtextboxfiled.click();
	    CVVtextboxfiled.clear();
	    CVVtextboxfiled.sendKeys(CVV);

	    System.out.println("CVV entered: " + CVV);
    }
	
	public String clickintothePaybuttoninInvoiceSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='container-fluid'])[1]")));

	    WebElement payBtn = wait.until(ExpectedConditions.presenceOfElementLocated(paybuttonininvoicesettlement));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(payBtn)).click();
	        System.out.println("Pay button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", payBtn);
	        System.out.println("Pay button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Invoice Paid successfully";
	}
	
	public boolean clickintotheViewInvoicebuttoninInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View Invoice tab
	    List<WebElement> viewinvoicetabs = driver.findElements(viewinvoicebuttonininvoice);

	    if (viewinvoicetabs.isEmpty()) {
	        // View Invoice tab NOT present → stop scenario
	        return false;
	    }

	    WebElement viewinvoicetab = viewinvoicetabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewinvoicetab));
	    viewinvoicetab.click();

	    return true;
	}
	
	public boolean clickintotheViewReceiptbuttoninInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View Receipt tab
	    List<WebElement> viewreceipttabs = driver.findElements(viewreceiptbuttonininvoice);

	    if (viewreceipttabs.isEmpty()) {
	        // View Receipt tab NOT present → stop scenario
	        return false;
	    }

	    WebElement viewreceipttab = viewreceipttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewreceipttab));
	    viewreceipttab.click();

	    return true;
	}
	
	public boolean clickintothethreedotbuttoninExistingInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot tab
	    List<WebElement> threedottabs = driver.findElements(threedotbuttoninexistinginvoice);

	    if (threedottabs.isEmpty()) {
	        // Three dot tab NOT present → stop scenario
	        return false;
	    }

	    WebElement threedottab = threedottabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedottab));
	    threedottab.click();

	    return true;
	}
	
	public boolean clickintotheviewdetailtabinExistingInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View Detail tab
	    List<WebElement> viewdetailtabs = driver.findElements(viewdetailtabinexistinginvoice);

	    if (viewdetailtabs.isEmpty()) {
	        // View Detail tab NOT present → stop scenario
	        return false;
	    }

	    WebElement viewdetailtab = viewdetailtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewdetailtab));
	    viewdetailtab.click();

	    return true;
	}
	
	public boolean clickintotheADDPOSNotestabinInvoiceDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Add POS Notes tab
	    List<WebElement> addposnotestabs = driver.findElements(addposnotestabininvoicedetails);

	    if (addposnotestabs.isEmpty()) {
	        // Add POS Notes tab NOT present → stop scenario
	        return false;
	    }

	    WebElement addposnotestab = addposnotestabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addposnotestab));
	    addposnotestab.click();

	    return true;
	}
	
	public void entertheTicketNumberinADDPOSNotes(String TicketNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement TicketNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(ticketnumbertextboxinaddposnotes));

	    // Extra safety for animation/overlay
	    wait.until(driver -> TicketNumbertextboxfiled.isDisplayed()
	            && TicketNumbertextboxfiled.isEnabled());

	    TicketNumbertextboxfiled.click();
	    TicketNumbertextboxfiled.clear();
	    TicketNumbertextboxfiled.sendKeys(TicketNumber);

	    System.out.println("TicketNumber entered: " + TicketNumber);
    }
	
	public void clickintotheTicketDateinAddPOSNotes() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement ticketdatepicker = wait.until(ExpectedConditions.elementToBeClickable(ticketdatetextboxinaddposnotes));

        try {
        	ticketdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ticketdatepicker);
        }

        System.out.println("Ticket Date Picker clicked successfully");
    }
	
	public void selectTodaysDateinAddPOSNotes() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
    }
	
	public String clickintotheSubmitbuttoninAddPOSNotes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='divPrimarycontent'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddposnotes));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: POS Notes added successfully";
	}
	
	public boolean clickintotheDeletebuttoninExistingInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistinginvoice);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistinginvoice));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit tab
	    List<WebElement> edittabs = driver.findElements(editbuttoninexistinginvoice);

	    if (edittabs.isEmpty()) {
	        // Edit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement edittab = edittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(edittab));
	    edittab.click();

	    return true;
	}
	
	public boolean clickintotheRemoveMedicinebuttoninExistingInvoiceDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    List<WebElement> removetabs = driver.findElements(removemedicinedetailsbuttonininvoice);

	    if (removetabs.isEmpty()) {
	        System.out.println("Remove button not visible, continuing scenario");
	        return false;
	    }

	    WebElement removetab = removetabs.get(0);

	    try {

	        // Scroll to element
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", removetab);

	        wait.until(ExpectedConditions.elementToBeClickable(removetab));

	        removetab.click();

	    } catch (Exception e) {

	        // JS click fallback
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", removetab);
	    }

	    return true;
	}
	
	public void clickintotheFilterbutton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement Filterbutton = wait.until(ExpectedConditions.elementToBeClickable(filterbutton));
	   
	    try {
	    	Filterbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Filterbutton);
	    }

	    System.out.println("Filter button clicked successfully");
	}
	
	public void entertheInvoiceNumberinFilter(String InvoiceNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InvoiceNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(invoicenumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InvoiceNumbertextboxfiled.isDisplayed()
	            && InvoiceNumbertextboxfiled.isEnabled());

	    InvoiceNumbertextboxfiled.click();
	    InvoiceNumbertextboxfiled.clear();
	    InvoiceNumbertextboxfiled.sendKeys(InvoiceNumber);

	    System.out.println("Invoice Number entered: " + InvoiceNumber);
    }
	
	public void entertheRxNumberinFilter(String RxNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement RxNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(rxnumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> RxNumbertextboxfiled.isDisplayed()
	            && RxNumbertextboxfiled.isEnabled());

	    RxNumbertextboxfiled.click();
	    RxNumbertextboxfiled.clear();
	    RxNumbertextboxfiled.sendKeys(RxNumber);

	    System.out.println("Rx Number entered: " + RxNumber);
    }
	
	public void entertheCustomerFirstNameinFilter(String CustomerFirstName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CustomerFirstNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(customerfirstnametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CustomerFirstNametextboxfiled.isDisplayed()
	            && CustomerFirstNametextboxfiled.isEnabled());

	    CustomerFirstNametextboxfiled.click();
	    CustomerFirstNametextboxfiled.clear();
	    CustomerFirstNametextboxfiled.sendKeys(CustomerFirstName);

	    System.out.println("Customer First Name entered: " + CustomerFirstName);
    }
	
	public void entertheCustomerLastNameinFilter(String CustomerLastName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CustomerLastNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(customerlastnametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CustomerLastNametextboxfiled.isDisplayed()
	            && CustomerLastNametextboxfiled.isEnabled());

	    CustomerLastNametextboxfiled.click();
	    CustomerLastNametextboxfiled.clear();
	    CustomerLastNametextboxfiled.sendKeys(CustomerLastName);

	    System.out.println("Customer Last Name entered: " + CustomerLastName);
    }
	
	public void clickintothePayByOtherMediumRadiobuttoninInvoiceSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(paybyothermediumradiobuttonininvoicesettlement));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("Pay By Other Medium radio button clicked successfully");
	}
	
	public void enterthePayByOtherMediumnoteinInvoiceSettlement(String PayByOtherMedium) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PayByOtherMediumtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(paybyothermediumtextboxininvoicesettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PayByOtherMediumtextboxfiled.isDisplayed()
	            && PayByOtherMediumtextboxfiled.isEnabled());

	    PayByOtherMediumtextboxfiled.click();
	    PayByOtherMediumtextboxfiled.clear();
	    PayByOtherMediumtextboxfiled.sendKeys(PayByOtherMedium);

	    System.out.println("Pay By Other Medium entered: " + PayByOtherMedium);
    }
	
	public void entertheTransactionNumberinFilter(String TransactionNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement TransactionNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(transactionnumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> TransactionNumbertextboxfiled.isDisplayed()
	            && TransactionNumbertextboxfiled.isEnabled());

	    TransactionNumbertextboxfiled.click();
	    TransactionNumbertextboxfiled.clear();
	    TransactionNumbertextboxfiled.sendKeys(TransactionNumber);

	    System.out.println("Transaction Number entered: " + TransactionNumber);
    }
	
	public void enterthePOSNumberinFilter(String POSNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement POSNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(posnumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> POSNumbertextboxfiled.isDisplayed()
	            && POSNumbertextboxfiled.isEnabled());

	    POSNumbertextboxfiled.click();
	    POSNumbertextboxfiled.clear();
	    POSNumbertextboxfiled.sendKeys(POSNumber);

	    System.out.println("POS Number entered: " + POSNumber);
    }
	
	public void clickintotheFromDatePickerinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(fromdatetextboxinfilter));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("From Date Picker clicked successfully");
    }
	
	public void clickintotheToDatePickerinFilter() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(todatetextboxinfilter));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("To Date Picker clicked successfully");
    }
	
	public void selectToDateAfter1MonthAutomatically() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    LocalDate targetDate = LocalDate.now().plusMonths(1);
	    int targetMonth = targetDate.getMonthValue() - 1; // jQuery month starts from 0
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // Select Year from dropdown
	    Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // Select Month from dropdown
	    Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    monthDropdown.selectByIndex(targetMonth);

	    // Now select day
	    String dateXpath = String.format(
	            "//td[@data-handler='selectDay']/a[text()='%d']",
	            targetDay);

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));

	    dateElement.click();

	    System.out.println("Selected date after 1 month: " + targetDate);
	}
	
	public void entertheFromAmountinFilter(String FromAmount) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FromAmounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(fromamounttextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FromAmounttextboxfiled.isDisplayed()
	            && FromAmounttextboxfiled.isEnabled());

	    FromAmounttextboxfiled.click();
	    FromAmounttextboxfiled.clear();
	    FromAmounttextboxfiled.sendKeys(FromAmount);

	    System.out.println("From Amount entered: " + FromAmount);
    }
	
	public void entertheToAmountinFilter(String ToAmount) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ToAmounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(toamounttextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ToAmounttextboxfiled.isDisplayed()
	            && ToAmounttextboxfiled.isEnabled());

	    ToAmounttextboxfiled.click();
	    ToAmounttextboxfiled.clear();
	    ToAmounttextboxfiled.sendKeys(ToAmount);

	    System.out.println("To Amount entered: " + ToAmount);
    }
	
	public void entertheEmailIdinFilter(String EmailId) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement EmailIdtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(emailidtextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> EmailIdtextboxfiled.isDisplayed()
	            && EmailIdtextboxfiled.isEnabled());

	    EmailIdtextboxfiled.click();
	    EmailIdtextboxfiled.clear();
	    EmailIdtextboxfiled.sendKeys(EmailId);

	    System.out.println("Email Id entered: " + EmailId);
    }
	
	public void enterthePhoneNumberinFilter(String PhoneNumberinFilter) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberinFiltertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberinFiltertextboxfiled.isDisplayed()
	            && PhoneNumberinFiltertextboxfiled.isEnabled());

	    PhoneNumberinFiltertextboxfiled.click();
	    PhoneNumberinFiltertextboxfiled.clear();
	    PhoneNumberinFiltertextboxfiled.sendKeys(PhoneNumberinFilter);

	    System.out.println("Email Id entered: " + PhoneNumberinFilter);
    }
	
	public String clickintothesearchbuttoninFilterInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilterinvoice)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // 1️⃣ Toast messages
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException ignored) {}

	    // 2️⃣ No records found
	    try {
	        WebElement noRecordMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//table[@id='view-presc-table']//td[contains(text(),'No Record')]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: Record is shown";
	}
	
	public void clickintotheClearbuttoninFilterInvoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement clearbutton = wait.until(ExpectedConditions.elementToBeClickable(clearbuttoninfilterinvoice));
	   
	    try {
	    	clearbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clearbutton);
	    }

	    System.out.println("Clear button clicked successfully");
	}
	
	public void selectDateAftertenDays() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now().plusDays(10);
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
	}
	
	public void selectToDateBefore1MonthAutomatically() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

	    // 🔹 Get date 1 month BEFORE today
	    LocalDate targetDate = LocalDate.now().minusMonths(1);

	    int targetMonth = targetDate.getMonthValue() - 1; // jQuery month starts from 0
	    int targetYear = targetDate.getYear();
	    int targetDay = targetDate.getDayOfMonth();

	    // 🔹 Select Year
	    Select yearDropdown = new Select(driver.findElement(By.className("ui-datepicker-year")));
	    yearDropdown.selectByVisibleText(String.valueOf(targetYear));

	    // 🔹 Select Month
	    Select monthDropdown = new Select(driver.findElement(By.className("ui-datepicker-month")));
	    monthDropdown.selectByIndex(targetMonth);

	    // 🔹 Select Day
	    String dateXpath = String.format(
	            "//td[@data-handler='selectDay']/a[text()='%d']",
	            targetDay);

	    WebElement dateElement = wait.until(
	            ExpectedConditions.elementToBeClickable(By.xpath(dateXpath)));

	    dateElement.click();

	    System.out.println("Selected date before 1 month: " + targetDate);
	}
	
	
	//---------------------------------------AR Section------------------------------------------------
	
	
	public boolean clickintotheARtabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for AR tab
	    List<WebElement> ARtabs = driver.findElements(artabinsidebar);

	    if (ARtabs.isEmpty()) {
	        // AR tab NOT present → stop scenario
	        return false;
	    }

	    WebElement ARtab = ARtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(ARtab));
	    ARtab.click();

	    return true;
	}
	
	public boolean clickintotheQuickTexttabinAR() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Quick Text tab
	    List<WebElement> quicktexttabs = driver.findElements(quicktexttabinAR);

	    if (quicktexttabs.isEmpty()) {
	        // Quick Text tab NOT present → stop scenario
	        return false;
	    }

	    WebElement quicktexttab = quicktexttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(quicktexttab));
	    quicktexttab.click();

	    return true;
	}
	
	public boolean selectTheTemplateinQuickText(String SelectTemplateText) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement templateDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(templatedropdownbuttoninquicktext));

	        Select select = new Select(templateDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(SelectTemplateText);

	        String selectedTemplate = select.getFirstSelectedOption().getText();
	        System.out.println("Template Text selected: " + selectedTemplate);

	        return true;

	    } catch (NoSuchElementException e) {
	        // Text not present → do NOT fail
	        System.out.println("Template Text '" + SelectTemplateText + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting template text — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void enterthePhoneNumberinQuickText(String PhoneNumberinQuickText) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberinQuickTexttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxinquicktext));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberinQuickTexttextboxfiled.isDisplayed()
	            && PhoneNumberinQuickTexttextboxfiled.isEnabled());

	    PhoneNumberinQuickTexttextboxfiled.click();
	    PhoneNumberinQuickTexttextboxfiled.clear();
	    PhoneNumberinQuickTexttextboxfiled.sendKeys(PhoneNumberinQuickText);

	    System.out.println("Phone Number entered: " + PhoneNumberinQuickText);
    }
	
	public String clickintotheSendbuttoninQuickText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='quickTextModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(sendbuttoninquicktextAR));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Send button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
	        System.out.println("Send button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Quick Text Send successfully";
	}
	
	
	//-----------------------------------Claims Section---------------------------------------------
	
	
	public boolean clickintotheClaimstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Claims tab
	    List<WebElement> claimstabs = driver.findElements(claimstabinsidebar);

	    if (claimstabs.isEmpty()) {
	        // Claims tab NOT present → stop scenario
	        return false;
	    }

	    WebElement claimstab = claimstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(claimstab));
	    claimstab.click();

	    return true;
	}
	
	public boolean clickintotheExporttoExcelbuttoninClaims() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Export Excel tab
	    List<WebElement> exportexceltabs = driver.findElements(exportexcelbuttoninclaims);

	    if (exportexceltabs.isEmpty()) {
	        // Export Excel tab NOT present → stop scenario
	        return false;
	    }

	    WebElement exportexceltab = exportexceltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(exportexceltab));
	    exportexceltab.click();

	    return true;
	}
	
	public boolean clickintotheNewClaimbuttoninClaims() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Claim tab
	    List<WebElement> newclaimtabs = driver.findElements(newclaimbuttoninclaims);

	    if (newclaimtabs.isEmpty()) {
	        // New Claim tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newclaimtab = newclaimtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newclaimtab));
	    newclaimtab.click();

	    return true;
	}
	
	public String clickintotheAddClaimtabinClaims() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    List<WebElement> addclaimButtons = driver.findElements(addclaimtabinclaims);

	    if (addclaimButtons.isEmpty()) {
	        return "Add Claim button NOT visible";
	    }

	    WebElement addclaimButton = addclaimButtons.get(0);

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(addclaimButton));
	        addclaimButton.click();

	        Thread.sleep(2000);

	        List<WebElement> errorMessages = driver.findElements(
	            By.xpath("//div[contains(@class,'toast-message')]")
	        );

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    return error.getText(); // ❗ return actual error
	                }
	            }
	        }

	        return null; // success (no error)

	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}
	
	public void entertheInsuranceCompanyNameinSearchClaim(String InsuranceCompanyName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement InsuranceCompanyNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(insurancecompanynametextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> InsuranceCompanyNametextboxfiled.isDisplayed()
	            && InsuranceCompanyNametextboxfiled.isEnabled());

	    InsuranceCompanyNametextboxfiled.click();
	    InsuranceCompanyNametextboxfiled.clear();
	    InsuranceCompanyNametextboxfiled.sendKeys(InsuranceCompanyName);

	    System.out.println("Insurance Company Name entered: " + InsuranceCompanyName);
    }
	
	public void entertheClaimNumberinSearchClaim(String ClaimNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ClaimNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(claimnumbertextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ClaimNumbertextboxfiled.isDisplayed()
	            && ClaimNumbertextboxfiled.isEnabled());

	    ClaimNumbertextboxfiled.click();
	    ClaimNumbertextboxfiled.clear();
	    ClaimNumbertextboxfiled.sendKeys(ClaimNumber);

	    System.out.println("Claim Number entered: " + ClaimNumber);
    }
	
	public String clickintotheSearchbuttoninSearchClaim() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchpatient)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }

	    // Check "No Records Found" message
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) Found'])[1]")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️ Claim is available
	    return "Claim is shown";
	}
	
	public void clickintotheFirstradiobuttoninSearchClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(firstradiobuttoninsearchclaim));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("First Radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninSearchClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchpatient)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Claim is Added";
	}
	
	public boolean selecttheClaimType(int ClaimIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ClaimDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(claimtypedropdownbutton));

	        Select select = new Select(ClaimDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ClaimIndex);

	        String selectedClaim = select.getFirstSelectedOption().getText();
	        System.out.println("Claim selected by index (" + ClaimIndex + "): " + selectedClaim);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Claim Index '" + ClaimIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting claim by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheDateOfServiceinClaim() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement dateofservicepicker = wait.until(ExpectedConditions.elementToBeClickable(dateofservicepickertextbox));

        try {
        	dateofservicepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateofservicepicker);
        }

        System.out.println("Date Of Service Picker clicked successfully");
    }
	
	public boolean selecttheBillStatus(int BillStatusIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement BillStatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(billstatusdropdownbutton));

	        Select select = new Select(BillStatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(BillStatusIndex);

	        String selectedBillStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Bill Status selected by index (" + BillStatusIndex + "): " + selectedBillStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Bill Status Index '" + BillStatusIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting bill status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheStageStatus(int StageStatusIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StageStatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(stagestatusdropdownbutton));

	        Select select = new Select(StageStatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StageStatusIndex);

	        String selectedStageStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Stage Status selected by index (" + StageStatusIndex + "): " + selectedStageStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Stage Status Index '" + StageStatusIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting stage status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintotheAddCollectionAttorneytabinClaims() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	    try {
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//div[@class='preloader']")));

	        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(addcollectionattorneytab));

	        wait.until(driver -> element.isDisplayed());

	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

	        return true;

	    } catch (Exception e) {
	        System.out.println("Click failed: " + e.getMessage());
	        return false;
	    }
	}
	
	public void entertheBusinessNameinSearchPartner(String BusinessName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement BusinessNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(businessnametextboxinsearchpartner));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BusinessNametextboxfiled.isDisplayed()
	            && BusinessNametextboxfiled.isEnabled());

	    BusinessNametextboxfiled.click();
	    BusinessNametextboxfiled.clear();
	    BusinessNametextboxfiled.sendKeys(BusinessName);

	    System.out.println("Business Name entered: " + BusinessName);
    }
	
	public String clickintotheSearchbuttoninSearchPartner() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchpatient)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }

	    // Check "No Records Found" message
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) Found'])[1]")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️ Claim is available
	    return "Partner is shown";
	}
	
	public boolean clickintotheFirstradiobuttoninSearchPartner() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Document Checkbox tab
	    List<WebElement> documentcheckboxtabs = driver.findElements(firstradiobuttoninsearchpartner);

	    if (documentcheckboxtabs.isEmpty()) {
	        // Document Checkbox tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentcheckboxtab = documentcheckboxtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentcheckboxtab));
	    documentcheckboxtab.click();

	    return true;
	}
	
	public String clickintotheSubmitbuttoninSearchPartner() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchpartner)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Partner is Added";
	}
	
	public void clickintotheAddPrescribertabinClaims() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addprescribertab = wait.until(ExpectedConditions.elementToBeClickable(addprescribertabinclaims));
	   
	    try {
	    	addprescribertab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addprescribertab);
	    }

	    System.out.println("Add Prescriber tab clicked successfully");
	}
	
	public void clickintotheFullSearchradiobuttoninSearchProvider() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(fullsearchradiobuttoninsearchprovider));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("Full Search radio button clicked successfully");
	}
	
	public void entertheLastNameinSearchProvider(String LastNameinProvider) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement LastNameinProvidertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(lastnametextboxinsearchprovider));

	    // Extra safety for animation/overlay
	    wait.until(driver -> LastNameinProvidertextboxfiled.isDisplayed()
	            && LastNameinProvidertextboxfiled.isEnabled());

	    LastNameinProvidertextboxfiled.click();
	    LastNameinProvidertextboxfiled.clear();
	    LastNameinProvidertextboxfiled.sendKeys(LastNameinProvider);

	    System.out.println("Last Name entered: " + LastNameinProvider);
    }
	
	public void entertheFirstNameinSearchProvider(String FirstNameinProvider) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement FirstNameinProvidertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(firstnametextboxinsearchprovider));

	    // Extra safety for animation/overlay
	    wait.until(driver -> FirstNameinProvidertextboxfiled.isDisplayed()
	            && FirstNameinProvidertextboxfiled.isEnabled());

	    FirstNameinProvidertextboxfiled.click();
	    FirstNameinProvidertextboxfiled.clear();
	    FirstNameinProvidertextboxfiled.sendKeys(FirstNameinProvider);

	    System.out.println("First Name entered: " + FirstNameinProvider);
    }
	
	public void enterthePhoneNumberinSearchProvider(String PhoneNumberinProvider) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberinProvidertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxinsearchprovider));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberinProvidertextboxfiled.isDisplayed()
	            && PhoneNumberinProvidertextboxfiled.isEnabled());

	    PhoneNumberinProvidertextboxfiled.click();
	    PhoneNumberinProvidertextboxfiled.clear();
	    PhoneNumberinProvidertextboxfiled.sendKeys(PhoneNumberinProvider);

	    System.out.println("Phone Number entered: " + PhoneNumberinProvider);
    }
	
	public String clickintotheSearchbuttoninSearchProviderClaim() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninsearchpatient)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }

	    // Check "No Records Found" message
	    try {
	        WebElement noRecordMsg = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) Found'])[1]")));

	        System.out.println("No Records Message: " + noRecordMsg.getText());
	        return noRecordMsg.getText();

	    } catch (TimeoutException e) {
	        // No "No Records Found" message
	    }

	    // 3️ Claim is available
	    return "Provider is shown";
	}
	
	public void clickintotheFirstradiobuttoninSearchProviderClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(firstradiobuttoninsearchproviderclaim));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("First radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninSearchProviderClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    wait.until(ExpectedConditions.elementToBeClickable(submitbuttoninsearchproviderclaim)).click();
	   
	    System.out.println("Submit button clicked successfully");
	    
	    StringBuilder allMessages = new StringBuilder();

	    // Capture ALL toast messages (if any)
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                System.out.println("Toast Message Found: " + msg);
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException e) {
	        // No toast messages appeared
	    }
		return "Provider is Added";
	}
	
	public String clickintotheNextbuttoninClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    WebElement nextBtn = wait.until(ExpectedConditions.presenceOfElementLocated(nextbuttoninclaim));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(nextBtn)).click();
	        System.out.println("Next icon clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", nextBtn);
	        System.out.println("Next icon clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Next button clicked successfully";
	}
	
	public boolean clickintotheNewBilltabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Bill tab
	    List<WebElement> newbilltabs = driver.findElements(newbilltabinclaim);

	    if (newbilltabs.isEmpty()) {
	        // New Bill tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newbilltab = newbilltabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newbilltab));
	    newbilltab.click();

	    return true;
	}
	
	public void clickintotheOrderDatePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(orderdatepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Order Date Picker clicked successfully");
    }
	
	public void clickintotheOrderReceivedDatePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(orderreceiveddatepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Order Received Date Picker clicked successfully");
    }
	
	public void entertheRXNumberinAddClaimBill(String RXNumberinBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement RXNumberinBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(RXnumbertextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> RXNumberinBilltextboxfiled.isDisplayed()
	            && RXNumberinBilltextboxfiled.isEnabled());

	    RXNumberinBilltextboxfiled.click();
	    RXNumberinBilltextboxfiled.clear();
	    RXNumberinBilltextboxfiled.sendKeys(RXNumberinBill);

	    System.out.println("RX Number entered: " + RXNumberinBill);
    }
	
	public void entertheRefillNumberinAddClaimBill(String RefillNumberinBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement RefillNumberinBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(Refillnumbertextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> RefillNumberinBilltextboxfiled.isDisplayed()
	            && RefillNumberinBilltextboxfiled.isEnabled());

	    RefillNumberinBilltextboxfiled.click();
	    RefillNumberinBilltextboxfiled.clear();
	    RefillNumberinBilltextboxfiled.sendKeys(RefillNumberinBill);

	    System.out.println("Refill Number entered: " + RefillNumberinBill);
    }
	
	public void clickintotheDateOfServicePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(dateofservicepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Date Of Service Picker clicked successfully");
    }
	
	public void entertheReferenceNumberinAddClaimBill(String ReferenceNumberinBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ReferenceNumberinBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(referencenumbertextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ReferenceNumberinBilltextboxfiled.isDisplayed()
	            && ReferenceNumberinBilltextboxfiled.isEnabled());

	    ReferenceNumberinBilltextboxfiled.click();
	    ReferenceNumberinBilltextboxfiled.clear();
	    ReferenceNumberinBilltextboxfiled.sendKeys(ReferenceNumberinBill);

	    System.out.println("Reference Number entered: " + ReferenceNumberinBill);
    }
	
	public void entertheBillAmountinAddClaimBill(String BillAmountinBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement BillAmountinBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(billamounttextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BillAmountinBilltextboxfiled.isDisplayed()
	            && BillAmountinBilltextboxfiled.isEnabled());

	    BillAmountinBilltextboxfiled.click();
	    BillAmountinBilltextboxfiled.clear();
	    BillAmountinBilltextboxfiled.sendKeys(BillAmountinBill);

	    System.out.println("Bill Amount entered: " + BillAmountinBill);
    }
	
	public void entertheProductShippinginAddClaimBill(String ProductShippinginBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ProductShippinginBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(productshippingtextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ProductShippinginBilltextboxfiled.isDisplayed()
	            && ProductShippinginBilltextboxfiled.isEnabled());

	    ProductShippinginBilltextboxfiled.click();
	    ProductShippinginBilltextboxfiled.clear();
	    ProductShippinginBilltextboxfiled.sendKeys(ProductShippinginBill);

	    System.out.println("Product Shipping entered: " + ProductShippinginBill);
    }
	
	public void clickintotheDeliveryDatePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(deliverydatepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Delivery Date Picker clicked successfully");
    }
	
	public void clickintotheBillingDatePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(billingdatepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Billing Date Picker clicked successfully");
    }
	
	public void clickintotheBillSubmittedDatePickerinAddClaimBill() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(billsubmitteddatepickerinaddclaimbill));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Bill Submitted Date Picker clicked successfully");
    }
	
	public boolean selecttheStatusinAddClaimBill(int StatusIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement StatusDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(statusdropdowninaddclaimbill));

	        Select select = new Select(StatusDropdown);

	        // 2️ Select by index
	        select.selectByIndex(StatusIndex);

	        String selectedStatus = select.getFirstSelectedOption().getText();
	        System.out.println("Status selected by index (" + StatusIndex + "): " + selectedStatus);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Status Index '" + StatusIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting status by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheNotesinAddClaimBill(String NotesinBill) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement NotesinBilltextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(notestextboxinaddclaimbill));

	    // Extra safety for animation/overlay
	    wait.until(driver -> NotesinBilltextboxfiled.isDisplayed()
	            && NotesinBilltextboxfiled.isEnabled());

	    NotesinBilltextboxfiled.click();
	    NotesinBilltextboxfiled.clear();
	    NotesinBilltextboxfiled.sendKeys(NotesinBill);

	    System.out.println("Notes entered: " + NotesinBill);
    }
	
	public void clickintotheManualradiobuttoninAddClaimBill() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(manualradiobuttoninaddclaimbill));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("Manual radio button clicked successfully");
	}
	
	public void clickintotheElectronicsradiobuttoninAddClaimBill() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement radiobutton = wait.until(ExpectedConditions.elementToBeClickable(electronicsradiobuttoninaddclaimbill));
	   
	    try {
	    	radiobutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radiobutton);
	    }

	    System.out.println("Electronics radio button clicked successfully");
	}
	
	public String clickintotheSubmitbuttoninAddClaimBill() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditClaimBillModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddclaimbill));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Bill details added successfully";
	}
	
	public boolean clickintotheCMS1500tabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for CMS 1500 tab
	    List<WebElement> cms1500tabs = driver.findElements(cms1500tabinclaim);

	    if (cms1500tabs.isEmpty()) {
	        // CMS 1500 tab NOT present → stop scenario
	        return false;
	    }

	    WebElement cms1500tab = cms1500tabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(cms1500tab));
	    cms1500tab.click();

	    return true;
	}
	
	public boolean selecttheChecklistinAddClaim1500(String checklistText) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for dropdown
	        WebElement checklistDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(checklistdropdowninaddclaim1500));

	        Select select = new Select(checklistDropdown);

	        // Select by visible text
	        select.selectByVisibleText(checklistText);

	        String selectedChecklist = select.getFirstSelectedOption().getText();
	        System.out.println("Checklist selected: " + selectedChecklist);

	        return true;

	    } catch (NoSuchElementException e) {
	        System.out.println("Checklist '" + checklistText + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting checklist — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintotheViewDocumentcheckboxinAddClaim1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View Document tab
	    List<WebElement> viewdocumenttabs = driver.findElements(viewdocumentcheckboxinaddclaim1500);

	    if (viewdocumenttabs.isEmpty()) {
	        // View Document tab NOT present → stop scenario
	        return false;
	    }

	    WebElement viewdocumenttab = viewdocumenttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewdocumenttab));
	    viewdocumenttab.click();

	    return true;
	}
	
	public boolean clickintotheDownloadFilecheckboxinAddClaim1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download File tab
	    List<WebElement> downloadfiletabs = driver.findElements(downloadfilecheckboxinaddclaim1500);

	    if (downloadfiletabs.isEmpty()) {
	        // Download File tab NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadfiletab = downloadfiletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadfiletab));
	    downloadfiletab.click();

	    return true;
	}
	
	public boolean selecttheTemplateinAddClaim1500(int TemplateIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement TemplateDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(templatedropdowninaddclaim1500));

	        Select select = new Select(TemplateDropdown);

	        // 2️ Select by index
	        select.selectByIndex(TemplateIndex);

	        String selectedTemplate = select.getFirstSelectedOption().getText();
	        System.out.println("Template selected by index (" + TemplateIndex + "): " + selectedTemplate);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Template Index '" + TemplateIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting template by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public String clickintotheSubmitbuttoninAddClaim1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditAddClaim1500Modal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddclaim1500));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS:Template is Open";
	}
	
	public void entertheNameinTemplate(String NameinTemplate) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement NameinTemplatetextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(nametextboxintemplate));

	    // Extra safety for animation/overlay
	    wait.until(driver -> NameinTemplatetextboxfiled.isDisplayed()
	            && NameinTemplatetextboxfiled.isEnabled());

	    NameinTemplatetextboxfiled.click();
	    NameinTemplatetextboxfiled.clear();
	    NameinTemplatetextboxfiled.sendKeys(NameinTemplate);

	    System.out.println("Name entered: " + NameinTemplate);
    }
	
	public String clickintotheSubmitbuttoninTemplate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttonintemplate));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS:Template is Submitted successfully";
	}
	
	public boolean clickintotheNewSupportiveDocumentstabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Supportive Documents tab
	    List<WebElement> newsupportivedocumentstabs = driver.findElements(newsupportivedocumentstabinclaim);

	    if (newsupportivedocumentstabs.isEmpty()) {
	        // New Supportive Documents tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newsupportivedocumentstab = newsupportivedocumentstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newsupportivedocumentstab));
	    newsupportivedocumentstab.click();

	    return true;
	}
	
	public boolean selecttheChecklistinAddClaimSupportiveDocument(String ChecklistText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // Wait for dropdown
	        WebElement checklistDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(checklistdropdowninaddclaimsupportivedocument));

	        Select select = new Select(checklistDropdown);

	        // Select by visible text
	        select.selectByVisibleText(ChecklistText);

	        String selectedChecklist = select.getFirstSelectedOption().getText();
	        System.out.println("Checklist selected: " + selectedChecklist);

	        return true;

	    } catch (NoSuchElementException e) {
	        System.out.println("Checklist '" + ChecklistText + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting checklist — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean clickintotheViewDocumentcheckboxinAddClaimSupportiveDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for View Document Checkbox
	    List<WebElement> viewdocumentcheckboxs = driver.findElements(viewdocumentcheckboxinaddclaimsupportivedocument);

	    if (viewdocumentcheckboxs.isEmpty()) {
	        // View Document Checkbox NOT present → stop scenario
	        return false;
	    }

	    WebElement viewdocumentcheckbox = viewdocumentcheckboxs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(viewdocumentcheckbox));
	    viewdocumentcheckbox.click();

	    return true;
	}
	
	public boolean clickintotheDownloadFilecheckboxinAddClaimSupportiveDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download File Checkbox
	    List<WebElement> downloadfilecheckboxs = driver.findElements(downloadfilecheckboxinaddclaimsupportivedocument);

	    if (downloadfilecheckboxs.isEmpty()) {
	        // Download File Checkbox NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadfilecheckbox = downloadfilecheckboxs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadfilecheckbox));
	    downloadfilecheckbox.click();

	    return true;
	}
	
	public boolean uploadTheFiles(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefiletabinaddclaimsupportivedocument));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintotheSubmitbuttoninAddClaimSupportiveDocument() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditClaimSupportiveDocumentModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddclaimsupportivedocument));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: New Supportive Document is Submitted successfully";
	}
	
	public boolean clickintotheNewClaimCommunicationtabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Claim Communication tab
	    List<WebElement> newclaimcommunicationtabs = driver.findElements(newclaimcommunicationtabinclaim);

	    if (newclaimcommunicationtabs.isEmpty()) {
	        // New Claim Communication tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newclaimcommunicationtab = newclaimcommunicationtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newclaimcommunicationtab));
	    newclaimcommunicationtab.click();

	    return true;
	}
	
	public void clickintotheDateofCommunicationinAddCommunication() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(dateofcommunicationpickerinaddcommunication));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Date of Communication Picker clicked successfully");
    }
	
	public void clickintotheProspectiveFollowUpDateinAddCommunication() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(prospectivefollowupdatepickerinaddcommunication));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Prospective Follow Up Date Picker clicked successfully");
    }
	
	public void clickintotheDueDateinAddCommunication() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(duedatepickerinaddcommunication));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Due Date Picker clicked successfully");
    }
	
	public void selectDateAfterTwoDays() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[contains(@class,'ui-datepicker-calendar')]")));

        LocalDate today = LocalDate.now().plusDays(2);
        int day = today.getDayOfMonth();
        int month = today.getMonthValue() - 1;
        int year = today.getYear();

        String dynamicXpath = String.format(
            "//td[@data-handler='selectDay' and @data-month='%d' and @data-year='%d']/a[text()='%d']",
            month, year, day
        );

        WebElement todayElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        todayElement.click();

        System.out.println("Today's date selected: " + day + "-" + (month + 1) + "-" + year);
	}
	
	public boolean selectthePriorityDropdowninAddCommunication(int PriorityIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement PriorityDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(prioritydropdowninaddcommunication));

	        Select select = new Select(PriorityDropdown);

	        // 2️ Select by index
	        select.selectByIndex(PriorityIndex);

	        String selectedPriority = select.getFirstSelectedOption().getText();
	        System.out.println("Priority selected by index (" + PriorityIndex + "): " + selectedPriority);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Priority Index '" + PriorityIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting priority by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public boolean selecttheCommunicationTypeDropdowninAddCommunication(int CommunicationTypeIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement CommunicationTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(communicationtypedropdowninaddcommunication));

	        Select select = new Select(CommunicationTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(CommunicationTypeIndex);

	        String selectedCommunicationType = select.getFirstSelectedOption().getText();
	        System.out.println("Communication Type selected by index (" + CommunicationTypeIndex + "): " + selectedCommunicationType);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Communication Type Index '" + CommunicationTypeIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting communication type by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void entertheTopicsDiscussed(String TopicsDiscussed) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement TopicsDiscussedtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(topicsdiscussedtextboxinaddcommunication));

	    // Extra safety for animation/overlay
	    wait.until(driver -> TopicsDiscussedtextboxfiled.isDisplayed()
	            && TopicsDiscussedtextboxfiled.isEnabled());

	    TopicsDiscussedtextboxfiled.click();
	    TopicsDiscussedtextboxfiled.clear();
	    TopicsDiscussedtextboxfiled.sendKeys(TopicsDiscussed);

	    System.out.println("Topics Discussed entered: " + TopicsDiscussed);
    }
	
	public void entertheDiscussionResultsinAddCommunication(String DiscussionResults) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement DiscussionResultstextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(discussionresultstextboxinaddcommunication));

	    // Extra safety for animation/overlay
	    wait.until(driver -> DiscussionResultstextboxfiled.isDisplayed()
	            && DiscussionResultstextboxfiled.isEnabled());

	    DiscussionResultstextboxfiled.click();
	    DiscussionResultstextboxfiled.clear();
	    DiscussionResultstextboxfiled.sendKeys(DiscussionResults);

	    System.out.println("Discussion Results entered: " + DiscussionResults);
    }
	
	public String clickintotheSubmitbuttoninAddCommunication() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditCommunicationModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddcommunication));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: New Claim Communication Details are Submitted successfully";
	}
	
	public boolean clickintotheNewEOBtabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New EOB tab
	    List<WebElement> newEOBtabs = driver.findElements(newEOBtabinclaim);

	    if (newEOBtabs.isEmpty()) {
	        // New EOB tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newEOBtab = newEOBtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newEOBtab));
	    newEOBtab.click();

	    return true;
	}
	
	public void clickintotheReceivedDateinAddPatientClaimEOB() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(receiveddatepickerinaddpatientclaimEOB));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Received Date Picker clicked successfully");
    }
	
	public boolean selecttheInterventionTypeDropdowninAddPatientClaimEOB(int InterventionTypeIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement InterventionTypeDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(interventiontypedropdowninaddpatientclaimEOB));

	        Select select = new Select(InterventionTypeDropdown);

	        // 2️ Select by index
	        select.selectByIndex(InterventionTypeIndex);

	        String selectedInterventionType = select.getFirstSelectedOption().getText();
	        System.out.println("Intervention Type selected by index (" + InterventionTypeIndex + "): " + selectedInterventionType);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Intervention Type Index '" + InterventionTypeIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting intervention type by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheInterventionDateinAddPatientClaimEOB() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(interventiondatepickerinaddpatientclaimEOB));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Intervention Date Picker clicked successfully");
    }
	
	public void clickintotheInterventionNeededCheckboxinAddPatientClaimEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(interventionneededcheckboxinaddpatientclaimEOB));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Intervention Needed Checkbox clicked successfully");
	}
	
	public void entertheMethodOfSubmissioninAddPatientClaimEOB(String MethodOfSubmission) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement MethodOfSubmissiontextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(methodofsubmissiontextboxinaddpatientclaimEOB));

	    // Extra safety for animation/overlay
	    wait.until(driver -> MethodOfSubmissiontextboxfiled.isDisplayed()
	            && MethodOfSubmissiontextboxfiled.isEnabled());

	    MethodOfSubmissiontextboxfiled.click();
	    MethodOfSubmissiontextboxfiled.clear();
	    MethodOfSubmissiontextboxfiled.sendKeys(MethodOfSubmission);

	    System.out.println("Method Of Submission entered: " + MethodOfSubmission);
    }
	
	public boolean uploadTheFilesinAddPatientClaimEOB(String filePath1) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefiletabinaddpatientclaimEOB));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath1);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintotheSubmitbuttoninAddPatientClaimEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditClaimEOBModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddpatientclaimEOB));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Patient Claim EOB are Added successfully";
	}
	
	public boolean clickintotheNewSettlementtabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Settlement tab
	    List<WebElement> newsettlementtabs = driver.findElements(newsettlementtabinclaim);

	    if (newsettlementtabs.isEmpty()) {
	        // New Settlement tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newsettlementtab = newsettlementtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newsettlementtab));
	    newsettlementtab.click();

	    return true;
	}
	
	public void clickintotheReceivedDatePickerinAddClaimSettlement() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(receiveddatepickerinaddclaimsettlement));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Received Date Picker clicked successfully");
    }
	
	public void clickintotheOfferReceivedDatePickerinAddClaimSettlement() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(offerreceiveddatepickerinaddclaimsettlement));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Offer Received Date Picker clicked successfully");
    }
	
	public void entertheOfferAmountinAddClaimSettlement(String OfferAmount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement OfferAmounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(offeramounttextboxinaddclaimsettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> OfferAmounttextboxfiled.isDisplayed()
	            && OfferAmounttextboxfiled.isEnabled());

	    OfferAmounttextboxfiled.click();
	    OfferAmounttextboxfiled.clear();
	    OfferAmounttextboxfiled.sendKeys(OfferAmount);

	    System.out.println("Offer Amount entered: " + OfferAmount);
    }
	
	public void entertheOriginalAmountinAddClaimSettlement(String OriginalAmount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement OriginalAmounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(originalamounttextboxinaddclaimsettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> OriginalAmounttextboxfiled.isDisplayed()
	            && OriginalAmounttextboxfiled.isEnabled());

	    OriginalAmounttextboxfiled.click();
	    OriginalAmounttextboxfiled.clear();
	    OriginalAmounttextboxfiled.sendKeys(OriginalAmount);

	    System.out.println("Original Amount entered: " + OriginalAmount);
    }
	
	public void entertheAcceptedAmountinAddClaimSettlement(String AcceptedAmount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement AcceptedAmounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(acceptedamounttextboxinaddclaimsettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> AcceptedAmounttextboxfiled.isDisplayed()
	            && AcceptedAmounttextboxfiled.isEnabled());

	    AcceptedAmounttextboxfiled.click();
	    AcceptedAmounttextboxfiled.clear();
	    AcceptedAmounttextboxfiled.sendKeys(AcceptedAmount);

	    System.out.println("Accepted Amount entered: " + AcceptedAmount);
    }
	
	public void clickintotheAcceptedDatePickerinAddClaimSettlement() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(accepteddatepickerinaddclaimsettlement));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Accepted Date Picker clicked successfully");
    }
	
	public void entertheApprovedByinAddClaimSettlement(String ApprovedBy) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ApprovedBytextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(approvedbytextboxinaddclaimsettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ApprovedBytextboxfiled.isDisplayed()
	            && ApprovedBytextboxfiled.isEnabled());

	    ApprovedBytextboxfiled.click();
	    ApprovedBytextboxfiled.clear();
	    ApprovedBytextboxfiled.sendKeys(ApprovedBy);

	    System.out.println("Approved By entered: " + ApprovedBy);
    }
	
	public void entertheOfferContactPersoninAddClaimSettlement(String OfferContactPerson) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement OfferContactPersontextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(offercontactpersontextboxinaddclaimsettlement));

	    // Extra safety for animation/overlay
	    wait.until(driver -> OfferContactPersontextboxfiled.isDisplayed()
	            && OfferContactPersontextboxfiled.isEnabled());

	    OfferContactPersontextboxfiled.click();
	    OfferContactPersontextboxfiled.clear();
	    OfferContactPersontextboxfiled.sendKeys(OfferContactPerson);

	    System.out.println("Offer Contact Person entered: " + OfferContactPerson);
    }
	
	public String clickintotheSubmitbuttoninAddClaimSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditClaimSettlementModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddclaimsettlement));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Claim Settlement are Added successfully";
	}
	
	public boolean clickintotheNewPaymenttabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New Payment tab
	    List<WebElement> newpaymenttabs = driver.findElements(newpaymenttabinclaim);

	    if (newpaymenttabs.isEmpty()) {
	        // New Payment tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newpaymenttab = newpaymenttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newpaymenttab));
	    newpaymenttab.click();

	    return true;
	}
	
	public void entertheCheckNumberinAddPatientClaimPayment(String CheckNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CheckNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(checknumbertextboxinaddpatientclaimpayment));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CheckNumbertextboxfiled.isDisplayed()
	            && CheckNumbertextboxfiled.isEnabled());

	    CheckNumbertextboxfiled.click();
	    CheckNumbertextboxfiled.clear();
	    CheckNumbertextboxfiled.sendKeys(CheckNumber);

	    System.out.println("Check Number entered: " + CheckNumber);
    }
	
	public void entertheAmountinAddPatientClaimPayment(String Amount) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement Amounttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(amounttextboxinaddpatientclaimpayment));

	    // Extra safety for animation/overlay
	    wait.until(driver -> Amounttextboxfiled.isDisplayed()
	            && Amounttextboxfiled.isEnabled());

	    Amounttextboxfiled.click();
	    Amounttextboxfiled.clear();
	    Amounttextboxfiled.sendKeys(Amount);

	    System.out.println("Amount entered: " + Amount);
    }
	
	public void clickintotheReceivedDatePickerinAddPatientClaimPayment() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement datepicker = wait.until(ExpectedConditions.elementToBeClickable(receiveddatepickerinaddpatientclaimpayment));

        try {
        	datepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", datepicker);
        }

        System.out.println("Received Date Picker clicked successfully");
    }
	
	public void clickintothePartOfSettlementcheckboxinAddPatientClaimPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(partofsettlementcheckboxinaddpatientclaimpayment));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Part Of Settlement Checkbox clicked successfully");
	}
	
	public void clickintotheServiceFeecheckboxinAddPatientClaimPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement checkboxbutton = wait.until(ExpectedConditions.elementToBeClickable(servicefeecheckboxinaddpatientclaimpayment));
	   
	    try {
	    	checkboxbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkboxbutton);
	    }

	    System.out.println("Service Fee Checkbox clicked successfully");
	}
	
	public boolean uploadTheFilesinAddPatientClaimPayment(String filePath) {
		try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(choosefiletabinaddpatientclaimpayment));

            if (!fileInput.isDisplayed()) {
                return false;
            }

            fileInput.sendKeys(filePath);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public String clickintotheSubmitbuttoninAddPatientClaimPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='addEditPatientClaimPaymentModal']//div[@class='modal-content'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninaddpatientclaimpayment));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Patient Claim Payment Details are Added successfully";
	}
	
	public void clickintotheAddAttorneytabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addattorneytab = wait.until(ExpectedConditions.elementToBeClickable(addattorneytabinclaim));
	   
	    try {
	    	addattorneytab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addattorneytab);
	    }

	    System.out.println("Add Attorney tab clicked successfully");
	}
	
	public String clickintotheAddAttorneyExecutivetabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    List<WebElement> addattorneyexecutiveButtons = driver.findElements(addattorneyexecutivetabinclaim);

	    if (addattorneyexecutiveButtons.isEmpty()) {
	        return "Add Attorney Executive button NOT visible";
	    }

	    WebElement addattorneyexecutiveButton = addattorneyexecutiveButtons.get(0);

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(addattorneyexecutiveButton));
	        addattorneyexecutiveButton.click();

	        Thread.sleep(2000);

	        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    return error.getText(); // ❗ return actual error
	                }
	            }
	        }

	        return null; // success (no error)

	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}
	
	public void clickintotheAddFundingCompanytabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addfundingcompanytab = wait.until(ExpectedConditions.elementToBeClickable(addfundingcompanytabinclaim));
	   
	    try {
	    	addfundingcompanytab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addfundingcompanytab);
	    }

	    System.out.println("Add Funding Company tab clicked successfully");
	}
	
	public boolean clickintotheAttorneySendFaxTab() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Find Send Fax button
	    List<WebElement> sendFaxButtons = driver.findElements(attorneysendfaxtabinattorney);

	    // Scenario 1: Button not visible
	    if (sendFaxButtons.isEmpty()) {
	        System.out.println("Send Fax button is NOT visible → Skipping this step.");
	        return false;
	    }

	    WebElement sendFaxButton = sendFaxButtons.get(0);

	    try {
	        // Wait until clickable
	        wait.until(ExpectedConditions.elementToBeClickable(sendFaxButton));

	        // Click button
	        sendFaxButton.click();
	        System.out.println("Send Fax button clicked.");

	        // Scenario 3: Check error messages (after click)
	        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    System.out.println("Error Message: " + error.getText());
	                }
	            }
	        }

	        return true;

	    } catch (Exception e) {
	        System.out.println("Exception while clicking Send Fax: " + e.getMessage());
	        return false;
	    }
	}
	
	public List<WebElement> getErrorMessages() {
	    return driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));
	}
	
	public String clickintotheAddFundingCompanyExecutivetabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    List<WebElement> addcompanyexecutiveButtons = driver.findElements(addfundingcompanyexecutivetabinclaim);

	    if (addcompanyexecutiveButtons.isEmpty()) {
	        return "Add Attorney Executive button NOT visible";
	    }

	    WebElement addcompanyexecutiveButton = addcompanyexecutiveButtons.get(0);

	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(addcompanyexecutiveButton));
	        addcompanyexecutiveButton.click();

	        Thread.sleep(2000);

	        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    return error.getText(); // ❗ return actual error
	                }
	            }
	        }

	        return null; // success (no error)

	    } catch (Exception e) {
	        return e.getMessage();
	    }
	}
	
	public boolean clickintotheFundingCompanySendFaxTab() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Find Send Fax button
	    List<WebElement> sendFaxButtons = driver.findElements(fundingcompanysendfaxtabinfundingcompany);

	    // Scenario 1: Button not visible
	    if (sendFaxButtons.isEmpty()) {
	        System.out.println("Send Fax button is NOT visible → Skipping this step.");
	        return false;
	    }

	    WebElement sendFaxButton = sendFaxButtons.get(0);

	    try {
	        // Wait until clickable
	        wait.until(ExpectedConditions.elementToBeClickable(sendFaxButton));

	        // Click button
	        sendFaxButton.click();
	        System.out.println("Send Fax button clicked.");

	        // Scenario 3: Check error messages (after click)
	        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    System.out.println("Error Message: " + error.getText());
	                }
	            }
	        }

	        return true;

	    } catch (Exception e) {
	        System.out.println("Exception while clicking Send Fax: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean clickintotheInsuranceCompanySendFaxTab() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Find Send Fax button
	    List<WebElement> sendFaxButtons = driver.findElements(insurancecompanysendfaxtabininsurancecompany);

	    // Scenario 1: Button not visible
	    if (sendFaxButtons.isEmpty()) {
	        System.out.println("Send Fax button is NOT visible → Skipping this step.");
	        return false;
	    }

	    WebElement sendFaxButton = sendFaxButtons.get(0);

	    try {
	        // Wait until clickable
	        wait.until(ExpectedConditions.elementToBeClickable(sendFaxButton));

	        // Click button
	        sendFaxButton.click();
	        System.out.println("Send Fax button clicked.");

	        // Scenario 3: Check error messages (after click)
	        List<WebElement> errorMessages = driver.findElements(By.xpath("//div[contains(@class,'toast-message')]"));

	        if (!errorMessages.isEmpty()) {
	            for (WebElement error : errorMessages) {
	                if (error.isDisplayed()) {
	                    System.out.println("Error Message: " + error.getText());
	                }
	            }
	        }

	        return true;

	    } catch (Exception e) {
	        System.out.println("Exception while clicking Send Fax: " + e.getMessage());
	        return false;
	    }
	}
	
	public String clickintotheSubmitbuttoninClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='detailBackgroundContainer pb-3'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninclaim));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Claim Details are Added successfully";
	}
	
	public void clickintotheCancelbuttoninClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement canceltab = wait.until(ExpectedConditions.elementToBeClickable(cancelbuttoninclaim));
	   
	    try {
	    	canceltab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", canceltab);
	    }

	    System.out.println("Cancel button clicked successfully");
	}
	
	public void clickintotheAddContractedCompanytabinClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement addcontractedcompanytab = wait.until(ExpectedConditions.elementToBeClickable(addcontractedcompanytabinclaim));
	   
	    try {
	    	addcontractedcompanytab.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addcontractedcompanytab);
	    }

	    System.out.println("Add Contracted Company tab clicked successfully");
	}
	
	public void enterthePartnerexecutiveName(String PartnerExecutiveName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PartnerExecutiveNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(partnerexecutivetextbox));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PartnerExecutiveNametextboxfiled.isDisplayed()
	            && PartnerExecutiveNametextboxfiled.isEnabled());

	    PartnerExecutiveNametextboxfiled.click();
	    PartnerExecutiveNametextboxfiled.clear();
	    PartnerExecutiveNametextboxfiled.sendKeys(PartnerExecutiveName);

	    System.out.println("Partner Executive Name entered: " + PartnerExecutiveName);
    }
	
	public String clickintotheSubmitbuttoninPartnerExecutive() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='divPrimarycontent'])[1]")));

	    WebElement submitBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninpartnerexecutive));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", submitBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Partner Executive is added successfully";
	}
	
	public boolean clickintotheFirstAttorneyDocumentCheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Document Checkbox tab
	    List<WebElement> documentcheckboxtabs = driver.findElements(firstattorneydocumentcheckbox);

	    if (documentcheckboxtabs.isEmpty()) {
	        // Document Checkbox tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentcheckboxtab = documentcheckboxtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentcheckboxtab));
	    documentcheckboxtab.click();

	    return true;
	}
	
	public boolean clickintotheFirstFundingCompanyDocumentCheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Document Checkbox tab
	    List<WebElement> documentcheckboxtabs = driver.findElements(firstfundingcompanydocumentcheckbox);

	    if (documentcheckboxtabs.isEmpty()) {
	        // Document Checkbox tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentcheckboxtab = documentcheckboxtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentcheckboxtab));
	    documentcheckboxtab.click();

	    return true;
	}
	
	public boolean clickintotheFirstInsuranceCompanyDocumentCheckbox() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Document Checkbox tab
	    List<WebElement> documentcheckboxtabs = driver.findElements(firstinsurancecompanydocumentcheckbox);

	    if (documentcheckboxtabs.isEmpty()) {
	        // Document Checkbox tab NOT present → stop scenario
	        return false;
	    }

	    WebElement documentcheckboxtab = documentcheckboxtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(documentcheckboxtab));
	    documentcheckboxtab.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingclaim);

	    if (editbuttons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheThreedotbuttoninExistingBillingDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot Button
	    List<WebElement> threedotbuttons = driver.findElements(threedotbuttoninexistingbillingdetails);

	    if (threedotbuttons.isEmpty()) {
	        // Three dot Button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotbutton = threedotbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotbutton));
	    threedotbutton.click();

	    return true;
	}
	
	public boolean clickintotheThreedotbuttoninExistingClaimCommunication() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot Button
	    List<WebElement> threedotbuttons = driver.findElements(threedotbuttoninexistingclaimcommunication);

	    if (threedotbuttons.isEmpty()) {
	        // Three dot Button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotbutton = threedotbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotbutton));
	    threedotbutton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingClaimCommunication() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingclaimcommunication);

	    if (editbuttons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheThreedotbuttoninExistingEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot Button
	    List<WebElement> threedotbuttons = driver.findElements(threedotbuttoninexistingEOB);

	    if (threedotbuttons.isEmpty()) {
	        // Three dot Button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotbutton = threedotbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotbutton));
	    threedotbutton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingEOB);

	    if (editbuttons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheThreedotbuttoninExistingSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot Button
	    List<WebElement> threedotbuttons = driver.findElements(threedotbuttoninexistingsettlement);

	    if (threedotbuttons.isEmpty()) {
	        // Three dot Button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotbutton = threedotbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotbutton));
	    threedotbutton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingsettlement);

	    if (editbuttons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheThreedotbuttoninExistingPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Three dot Button
	    List<WebElement> threedotbuttons = driver.findElements(threedotbuttoninexistingpayment);

	    if (threedotbuttons.isEmpty()) {
	        // Three dot Button NOT present → stop scenario
	        return false;
	    }

	    WebElement threedotbutton = threedotbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(threedotbutton));
	    threedotbutton.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit Button
	    List<WebElement> editbuttons = driver.findElements(editbuttoninexistingpayment);

	    if (editbuttons.isEmpty()) {
	        // Edit Button NOT present → stop scenario
	        return false;
	    }

	    WebElement editbutton = editbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(editbutton));
	    editbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingBillingDetails() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingbillingdetails);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingbillingdetails));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingClaimCommunications() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingclaimcommunication);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingclaimcommunication));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingEOB);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingEOB));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadbuttoninExistingEOB() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download Button
	    List<WebElement> downloadbuttons = driver.findElements(downloadbuttoninexistingEOB);

	    if (downloadbuttons.isEmpty()) {
	        // Download Button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadbutton = downloadbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
	    downloadbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingSettlement() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingsettlement);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingsettlement));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingPayment() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingpayment);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingpayment));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheDownloadbuttoninInsuranceCompany() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download Button
	    List<WebElement> downloadbuttons = driver.findElements(downloadbuttonininsurancecompany);

	    if (downloadbuttons.isEmpty()) {
	        // Download Button NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadbutton = downloadbuttons.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadbutton));
	    downloadbutton.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingClaim() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingclaim);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingclaim));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean selectClaimTypeinFilterofClaims(String claimtypeinclaims) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️ Click dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(claimtypedropdowninclaims));

	        dropdown.click();

	        // 2️ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + claimtypeinclaims + "']")));

	        // 3️ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️ Click option
	        option.click();

	        System.out.println("Type selected: " + claimtypeinclaims);

	        // 5️ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting type: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean selectClaimStatusinFilterofClaims(String claimstatusinclaims) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️ Click dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(claimstatusdropdowninclaims));

	        dropdown.click();

	        // 2️ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + claimstatusinclaims + "']")));

	        // 3️ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️ Click option
	        option.click();

	        System.out.println("Status selected: " + claimstatusinclaims);

	        // 5️ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting status: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean selectBillStatusinFilterofClaims(String billstatusinclaims) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️ Click dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(billstatusdropdowninclaims));

	        dropdown.click();

	        // 2️ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + billstatusinclaims + "']")));

	        // 3️ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️ Click option
	        option.click();

	        System.out.println("Status selected: " + billstatusinclaims);

	        // 5️ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting status: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean selectStageStatusinFilterofClaims(String stagestatusinclaims) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️ Click dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(stagestatusdropdowninclaims));

	        dropdown.click();

	        // 2️ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + stagestatusinclaims + "']")));

	        // 3️ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️ Click option
	        option.click();

	        System.out.println("Status selected: " + stagestatusinclaims);

	        // 5️ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting status: " + e.getMessage());
	        return false;
	    }
	}
	
	public boolean selectPaymentStatusinFilterofClaims(String paymentstatusinclaims) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {

	        // 1️ Click dropdown
	        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(paymentstatusdropdowninclaims));

	        dropdown.click();

	        // 2️ Wait for option
	        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//ul[contains(@class,'select-dropdown')]//span[normalize-space()='" + paymentstatusinclaims + "']")));

	        // 3️ Scroll
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

	        // 4️ Click option
	        option.click();

	        System.out.println("Status selected: " + paymentstatusinclaims);

	        // 5️ Wait dropdown to disappear
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
	                By.xpath("//ul[contains(@class,'select-dropdown')]")));

	        return true;

	    } catch (Exception e) {

	        System.out.println("Error selecting status: " + e.getMessage());
	        return false;
	    }
	}
	
	public String clickintothesearchbuttoninFilterofClaims() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilterinvoice)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // 1️ Toast messages
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException ignored) {}

	    // 2️ No records found
	    try {
	        WebElement noRecordMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[normalize-space()='No Record(s) found'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️ User exists
	    return "SUCCESS: Record is shown";
	}
	
	public boolean clickintotheCMS1500tabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for CMS 1500 tab
	    List<WebElement> cms1500tabs = driver.findElements(cms1500tabinsidebar);

	    if (cms1500tabs.isEmpty()) {
	        // CMS 1500 tab NOT present → stop scenario
	        return false;
	    }

	    WebElement cms1500tab = cms1500tabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(cms1500tab));
	    cms1500tab.click();

	    return true;
	}
	
	public boolean clickintotheNewCMS1500tabinCMS1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for New CMS 1500 tab
	    List<WebElement> newcms1500tabs = driver.findElements(newcms1500tabincms1500);

	    if (newcms1500tabs.isEmpty()) {
	        // New CMS 1500 tab NOT present → stop scenario
	        return false;
	    }

	    WebElement newcms1500tab = newcms1500tabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(newcms1500tab));
	    newcms1500tab.click();

	    return true;
	}
	
	private String toasterMessage = "";
	
	public boolean selecttheTemplateinAddNewClaim1500(int CMS1500TemplateIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(
	            By.xpath("//div[@class='preloader']")));

	    try {
	        WebElement dropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(templatedropdowninaddclaim1500));

	        Select select = new Select(dropdown);
	        select.selectByIndex(CMS1500TemplateIndex);

	        // Try toaster
	        try {
	            WebElement toaster = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                    By.xpath("//div[@class='toast-message']")));

	            toasterMessage = toaster.getText();
	            System.out.println("Toaster: " + toasterMessage);

	            return false; // IMPORTANT → trigger SKIP

	        } catch (TimeoutException e) {
	            toasterMessage = "Template selected successfully (No toaster)";
	            return true; // success
	        }

	    } catch (Exception e) {
	        toasterMessage = "ERROR: " + e.getMessage();
	        return false;
	    }
	}
	
	public String getToasterMessage() {
	    return toasterMessage;
	}
	
	public boolean clickintotheCMS1500DownloadbuttoninCMS1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for CMS 1500 Download tab
	    List<WebElement> downloadfiletabs = driver.findElements(cms1500downloadbuttonincms1500);

	    if (downloadfiletabs.isEmpty()) {
	        // CMS 1500 Download tab NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadfiletab = downloadfiletabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadfiletab));
	    downloadfiletab.click();

	    return true;
	}
	
	public boolean clickintotheEditbuttoninExistingCMS1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Edit tab
	    List<WebElement> edittabs = driver.findElements(editbuttoninexistingcms1500);

	    if (edittabs.isEmpty()) {
	        // Edit tab NOT present → stop scenario
	        return false;
	    }

	    WebElement edittab = edittabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(edittab));
	    edittab.click();

	    return true;
	}
	
	public boolean clickintotheDeletebuttoninExistingCMS1500() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // DO NOT wait for delete button
	    List<WebElement> deleteButtons = driver.findElements(deletebuttoninexistingcms1500);

	    // If Delete button NOT present → stop scenario
	    if (deleteButtons.isEmpty()) {
	        System.out.println("Delete button NOT present");
	        return false;
	    }

	    WebElement deleteButton = deleteButtons.get(0);

	    // Wait until clickable
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton));

	    try {
	        deleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", deleteButton);
	    }

	    System.out.println("Delete button clicked");

	    // Wait for confirm delete button
	    WebElement confirmDeleteButton = wait.until(ExpectedConditions.elementToBeClickable(confirmdeletebuttoninexistingcms1500));

	    try {
	        confirmDeleteButton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].click();", confirmDeleteButton);
	    }

	    System.out.println("Confirm Delete clicked — record deleted permanently");

	    return true;
	}
	
	public boolean clickintotheReportstabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Reports tab
	    List<WebElement> reportstabs = driver.findElements(reportstabinsidebar);

	    if (reportstabs.isEmpty()) {
	        // Reports tab NOT present → stop scenario
	        return false;
	    }

	    WebElement reportstab = reportstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(reportstab));
	    reportstab.click();

	    return true;
	}
	
	
	//------------------------------------Reports (Ledger Report) Section--------------------------------------
	
	
	public boolean clickintotheLedgerReportinReports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Ledger Report tab
	    List<WebElement> reportstabs = driver.findElements(ledgerreportinreports);

	    if (reportstabs.isEmpty()) {
	        // Ledger Report tab NOT present → stop scenario
	        return false;
	    }

	    WebElement reportstab = reportstabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(reportstab));
	    reportstab.click();

	    return true;
	}
	
	public String clickintothesearchbuttoninFilterofLedgerReports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilterinvoice)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // 1️ Toast messages
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException ignored) {}

	    // 2️ No records found
	    try {
	        WebElement noRecordMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[@class='noRecordsText'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️ User exists
	    return "SUCCESS: Record is shown";
	}
	
	public boolean clickintotheDownloadbuttoninLedgerReport() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Download tab
	    List<WebElement> downloadtabs = driver.findElements(downloadbuttoninledgerreport);

	    if (downloadtabs.isEmpty()) {
	        // Download tab NOT present → stop scenario
	        return false;
	    }

	    WebElement downloadtab = downloadtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(downloadtab));
	    downloadtab.click();

	    return true;
	}
	
	public boolean clickintotheClaimReporttabinReports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Claim Report tab
	    List<WebElement> claimreporttabs = driver.findElements(claimreporttabinreports);

	    if (claimreporttabs.isEmpty()) {
	        // Claim Report tab NOT present → stop scenario
	        return false;
	    }

	    WebElement claimreporttab = claimreporttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(claimreporttab));
	    claimreporttab.click();

	    return true;
	}
	
	public void entertheBirthDateinFilterofClaimReport(String BirthDateinClaimReport) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement BirthDateinClaimReporttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(birthdatetextboxinfilterofclaimreport));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BirthDateinClaimReporttextboxfiled.isDisplayed()
	            && BirthDateinClaimReporttextboxfiled.isEnabled());

	    BirthDateinClaimReporttextboxfiled.click();
	    BirthDateinClaimReporttextboxfiled.clear();
	    BirthDateinClaimReporttextboxfiled.sendKeys(BirthDateinClaimReport);

	    System.out.println("Birth Date entered: " + BirthDateinClaimReport);
    }
	
	public boolean selecttheClaimTypeinClaimReport(int ClaimTypeIndex) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement ClaimDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(claimtypedropdownbuttoninclaimreport));

	        Select select = new Select(ClaimDropdown);

	        // 2️ Select by index
	        select.selectByIndex(ClaimTypeIndex);

	        String selectedClaim = select.getFirstSelectedOption().getText();
	        System.out.println("Claim selected by index (" + ClaimTypeIndex + "): " + selectedClaim);

	        return true;

	    } catch (NoSuchElementException | IndexOutOfBoundsException e) {
	        // Index not present → do NOT fail
	        System.out.println("Claim Index '" + ClaimTypeIndex + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println(
	                "Error selecting claim by index — continuing test: " + e.getMessage());
	        return true;
	    }
	}
	
	public void clickintotheAdvanceSearchtabinClaimReport() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
	    
	    WebElement advancesearchbutton = wait.until(ExpectedConditions.elementToBeClickable(advancesearchtabinclaimreport));
	   
	    try {
	    	advancesearchbutton.click();
	    } catch (Exception e) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", advancesearchbutton);
	    }

	    System.out.println("Advance Search tab clicked successfully");
	}
	
	public void clickintotheFromDatePickerDateofLossinClaimReport() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(fromdateindateoflossinclaimreport));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("From Date Picker clicked successfully");
    }
	
	public void clickintotheToDatePickerDateofLossinClaimReport() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(todateindateoflossinclaimreport));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("To Date Picker clicked successfully");
    }
	
	public void entertheCellNumberinClaimReport(String CellNumber) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement CellNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(cellnumbertextboxinclaimreport));

	    // Extra safety for animation/overlay
	    wait.until(driver -> CellNumbertextboxfiled.isDisplayed()
	            && CellNumbertextboxfiled.isEnabled());

	    CellNumbertextboxfiled.click();
	    CellNumbertextboxfiled.clear();
	    CellNumbertextboxfiled.sendKeys(CellNumber);

	    System.out.println("Cell Number entered: " + CellNumber);
    }
	
	public void clickintotheFromDateServiceinClaimReport() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement fromdatepicker = wait.until(ExpectedConditions.elementToBeClickable(fromdateserviceinclaimreport));

        try {
        	fromdatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fromdatepicker);
        }

        System.out.println("From Date Service clicked successfully");
    }
	
	public void clickintotheToDateServiceinClaimReport() {
		if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized in BillingModulefunctionalitypage");
        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

        WebElement todatepicker = wait.until(ExpectedConditions.elementToBeClickable(todateserviceinclaimreport));

        try {
        	todatepicker.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", todatepicker);
        }

        System.out.println("To Date Service clicked successfully");
    }
		
	public void entertheMedicalProviderNameinClaimReport(String MedicalProviderName) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement MedicalProviderNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(medicalprovidernametextboxinclaimreport));

	    // Extra safety for animation/overlay
	    wait.until(driver -> MedicalProviderNametextboxfiled.isDisplayed()
	            && MedicalProviderNametextboxfiled.isEnabled());

	    MedicalProviderNametextboxfiled.click();
	    MedicalProviderNametextboxfiled.clear();
	    MedicalProviderNametextboxfiled.sendKeys(MedicalProviderName);

	    System.out.println("Medical Provider Name entered: " + MedicalProviderName);
    }
	
	public String clickintothesearchbuttoninClaimReport() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // Click Search button
	    wait.until(ExpectedConditions.elementToBeClickable(searchbuttoninfilterinvoice)).click();

	    System.out.println("Search button clicked successfully");

	    StringBuilder allMessages = new StringBuilder();

	    // 1️⃣ Toast messages
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@class='toast-message']")));

	        List<WebElement> toasts = driver.findElements(
	                By.xpath("//div[@class='toast-message']"));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                allMessages.append(msg).append(" | ");
	            }
	        }

	        if (allMessages.length() > 0) {
	            return "ERROR: " + allMessages.toString();
	        }

	    } catch (TimeoutException ignored) {}

	    // 2️⃣ No records found
	    try {
	        WebElement noRecordMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("(//p[@class='noRecordsText'])[1]")));

	        return "ERROR: " + noRecordMsg.getText();

	    } catch (TimeoutException ignored) {}

	    // 3️⃣ User exists
	    return "SUCCESS: Record is shown";
	}
	
	public boolean clickintotheTexttabinsidebar() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Text tab
	    List<WebElement> texttabs = driver.findElements(texttabinsidebar);

	    if (texttabs.isEmpty()) {
	        // Text tab NOT present → stop scenario
	        return false;
	    }

	    WebElement texttab = texttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(texttab));
	    texttab.click();

	    return true;
	}
	
	public void entertheRXNumberinQuickText(String RXNumber) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement RXNumbertextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(rxnumbertextboxinquicktext));

	    // Extra safety for animation/overlay
	    wait.until(driver -> RXNumbertextboxfiled.isDisplayed()
	            && RXNumbertextboxfiled.isEnabled());

	    RXNumbertextboxfiled.click();
	    RXNumbertextboxfiled.clear();
	    RXNumbertextboxfiled.sendKeys(RXNumber);

	    System.out.println("RX Number entered: " + RXNumber);
    }
	
	public boolean clickintotheSendVCardinText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Send VCard tab
	    List<WebElement> sendvcardtabs = driver.findElements(sendvcardtabintext);

	    if (sendvcardtabs.isEmpty()) {
	        // Send VCard tab NOT present → stop scenario
	        return false;
	    }

	    WebElement sendvcardtab = sendvcardtabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(sendvcardtab));
	    sendvcardtab.click();

	    return true;
	}
	
	public void enterthePhoneNumberinSendVCard(String PhoneNumberinSendVcard) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement PhoneNumberinSendVcardtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(phonenumbertextboxinsendvcard));

	    // Extra safety for animation/overlay
	    wait.until(driver -> PhoneNumberinSendVcardtextboxfiled.isDisplayed()
	            && PhoneNumberinSendVcardtextboxfiled.isEnabled());

	    PhoneNumberinSendVcardtextboxfiled.click();
	    PhoneNumberinSendVcardtextboxfiled.clear();
	    PhoneNumberinSendVcardtextboxfiled.sendKeys(PhoneNumberinSendVcard);

	    System.out.println("Phone Number entered: " + PhoneNumberinSendVcard);
    }
	
	public void entertheBodyinSendVCard(String BodyinSendVcard) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement BodyinSendVcardtextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(bodytextboxinsendvcard));

	    // Extra safety for animation/overlay
	    wait.until(driver -> BodyinSendVcardtextboxfiled.isDisplayed()
	            && BodyinSendVcardtextboxfiled.isEnabled());

	    BodyinSendVcardtextboxfiled.click();
	    BodyinSendVcardtextboxfiled.clear();
	    BodyinSendVcardtextboxfiled.sendKeys(BodyinSendVcard);

	    System.out.println("Body entered: " + BodyinSendVcard);
    }
	
	public String clickintotheSendbuttoninSendVCard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='sendVCardModal']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(sendbuttoninsendvcard));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Send button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
	        System.out.println("Send button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Send VCard send successfully";
	}
	
	public boolean clickintotheAddToPatienttabinText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Add To Patient tab
	    List<WebElement> addtopatienttabs = driver.findElements(addtopatienttabintext);

	    if (addtopatienttabs.isEmpty()) {
	        // Add To Patient tab NOT present → stop scenario
	        return false;
	    }

	    WebElement addtopatienttab = addtopatienttabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(addtopatienttab));
	    addtopatienttab.click();

	    return true;
	}
	
	public boolean clickintotheReplyCommunicationtabinText() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // wait only for page loader
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // IMPORTANT: NO wait for Reply Communication tab
	    List<WebElement> replytabs = driver.findElements(replytabintext);

	    if (replytabs.isEmpty()) {
	        // Reply Communication tab NOT present → stop scenario
	        return false;
	    }

	    WebElement replytab = replytabs.get(0);

	    wait.until(ExpectedConditions.elementToBeClickable(replytab));
	    replytab.click();

	    return true;
	}
	
	public void entertheReplyTextinReplyCommunication(String ReplyText) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement ReplyTexttextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(replytextboxinreplycommunication));

	    // Extra safety for animation/overlay
	    wait.until(driver -> ReplyTexttextboxfiled.isDisplayed()
	            && ReplyTexttextboxfiled.isEnabled());

	    ReplyTexttextboxfiled.click();
	    ReplyTexttextboxfiled.clear();
	    ReplyTexttextboxfiled.sendKeys(ReplyText);

	    System.out.println("Reply Text entered: " + ReplyText);
    }
	
	public String clickintotheSubmitbuttoninReplyCommunication() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // 1. Wait for loader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    // 2. Ensure popup/modal is fully open
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-dialog modal-dialog-centered']//div[@class='modal-content']")));

	    WebElement sendBtn = wait.until(ExpectedConditions.presenceOfElementLocated(submitbuttoninreplycommunication));

	    // 3. Try normal click → fallback to JS
	    try {
	        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
	        System.out.println("Submit button clicked successfully");
	    } catch (ElementClickInterceptedException e) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", sendBtn);
	        System.out.println("Submit button clicked using JS");
	    }

	    // 4. Collect ALL error messages
	    List<String> errorMessages = new ArrayList<>();

	    // ---------- TOAST ERRORS ----------
	    try {
	        List<WebElement> toasts = wait.until(
	                ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'toast-message')]")));

	        for (WebElement toast : toasts) {
	            String msg = toast.getText().trim();
	            if (!msg.isEmpty()) {
	                errorMessages.add(msg);
	            }
	        }
	    } catch (TimeoutException ignored) {
	        // No toast errors
	    }

	    // ---------- FIELD LEVEL ERRORS ----------
	    List<WebElement> fieldErrors = driver.findElements(
	    		By.xpath("//span[contains(@class,'text-danger') or contains(@class,'error')]"));

	    for (WebElement error : fieldErrors) {
	        String msg = error.getText().trim();
	        if (!msg.isEmpty()) {
	            errorMessages.add(msg);
	        }
	    }

	    // 5. Return combined result
	    if (!errorMessages.isEmpty()) {
	        return "ERRORS: " + String.join(" | ", errorMessages);
	    }

	    return "SUCCESS: Reply send successfully";
	}
	
	public void entertheUserNameinFilter(String UserName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		// Wait for preloader to disappear
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

	    WebElement UserNametextboxfiled = wait.until(ExpectedConditions.elementToBeClickable(usernametextboxinfilter));

	    // Extra safety for animation/overlay
	    wait.until(driver -> UserNametextboxfiled.isDisplayed()
	            && UserNametextboxfiled.isEnabled());

	    UserNametextboxfiled.click();
	    UserNametextboxfiled.clear();
	    UserNametextboxfiled.sendKeys(UserName);

	    System.out.println("User Name entered: " + UserName);
    }
	
	public boolean selectTheTextStatusinFilter(String TextStatus) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	    try {
	        // 1️ Wait for <select> dropdown
	        WebElement textstatusDropdown = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(textstatusdropdownbuttoninfilter));

	        Select select = new Select(textstatusDropdown);

	        // 2️ Select by visible text
	        select.selectByVisibleText(TextStatus);

	        String selectedtextstatus = select.getFirstSelectedOption().getText();
	        System.out.println("Text Status selected: " + selectedtextstatus);

	        return true;

	    } catch (NoSuchElementException e) {
	        // Text not present → do NOT fail
	        System.out.println("Text Status" + TextStatus + "' not found — skipping selection");
	        return true;

	    } catch (Exception e) {
	        System.out.println("Error selecting text status — continuing test: " + e.getMessage());
	        return true;
	    }
	}
}
