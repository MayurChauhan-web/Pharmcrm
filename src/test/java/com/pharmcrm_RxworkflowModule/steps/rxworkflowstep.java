package com.pharmcrm_RxworkflowModule.steps;

import org.junit.Assert;
import com.pharmcrm_RxworkflowModule.pages.rxworkflowpage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class rxworkflowstep {

	private rxworkflowpage rxworkflowPage;

	// Runningline Level2 Status

	@Then("the user should be able to delete Runningline Level2 Status in Workflow Module test")
	public void verifyRunninglineLevel2StatusCanBeDeletedInWorkflowModule() {

		rxworkflowPage.shouldAllowDeletingRunninglineLevel2StatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowAddingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should not be able to delete Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineLevel2StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowDeletingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Level2 Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowEditingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineLevel2StatusInWorkflowModule() {

		rxworkflowPage.shouldAllowEditingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineLevel2StatusInWorkflowModule() {

		rxworkflowPage.shouldAllowAddingRunninglineLevel2StatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Level2 Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineLevel2StatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel2StatusUrl = Hooks.prop.getProperty("runninglineLevel2StatusUrl");
		Assert.assertNotNull("runninglineLevel2StatusUrl is missing in config", runninglineLevel2StatusUrl);
		String fullUrl = baseUrl + runninglineLevel2StatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineLevel2StatusPage(fullUrl);
		Assert.assertTrue("Runningline Level2 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel2Statuses"));

		rxworkflowPage.shouldAllowViewingRunninglineLevel2StatusInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level2 Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineLevel2StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineLevel2StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Runningline Level1 Status
	@Then("the user should be able to delete Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldAllowDeletingRunninglineLevel1StatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowAddingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldAllowEditingRunninglineLevel1StatusInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowDeletingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Level1 Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowEditingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineLevel1StatusInWorkflowModule() {

		rxworkflowPage.shouldAllowAddingRunninglineLevel1StatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Level1 Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineLevel1StatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineLevel1StatusUrl = Hooks.prop.getProperty("runninglineLevel1StatusUrl");
		Assert.assertNotNull("runninglineLevel1StatusUrl is missing in config", runninglineLevel1StatusUrl);
		String fullUrl = baseUrl + runninglineLevel1StatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineLevel1StatusPage(fullUrl);
		Assert.assertTrue("Runningline Level1 Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineLevel1Statuses"));

		rxworkflowPage.verifyRunninglineStatusCanBeViewedInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Level1 Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineLevel1StatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineLevel1StatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Runningline Status
	@Then("the user should be able to delete Runningline Status in Workflow Module test")
	public void userShouldBeAbleToDeleteRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldAllowDeletingRunninglineStatusInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Runningline Status in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToAddRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowAddingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to edit Runningline Status in Workflow Module test")
	public void userShouldBeAbleToEditRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldAllowEditingRunninglineStatusInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Runningline Status in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToDeleteRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowDeletingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should not be able to edit Runningline Status in Workflow Module test")
	public void userShouldNotBeAbleToEditRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldNotAllowEditingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to add Runningline Status in Workflow Module test")
	public void userShouldBeAbleToAddRunninglineStatusInWorkflowModule() {

		rxworkflowPage.shouldAllowAddingRunninglineStatusInWorkflowModule();

	}

	@Then("the user should be able to view Runningline Status in Workflow Module test")
	public void userShouldBeAbleToViewRunninglineStatusInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String runninglineStatusUrl = Hooks.prop.getProperty("runninglineStatusUrl");
		Assert.assertNotNull("runninglineStatusUrl is missing in config", runninglineStatusUrl);
		String fullUrl = baseUrl + runninglineStatusUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openRunninglineStatusPage(fullUrl);
		Assert.assertTrue("Runningline Status page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/RunninglineStatuses"));

		rxworkflowPage.verifyRunninglineStatusCanBeViewedInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Runningline Status in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteRunninglineStatusInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForRunninglineStatusInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Queue
	@Then("the user should be able to delete Queue in Workflow Module test")
	public void userShouldBeAbleToDeleteQueueInWorkflowModule() {

		rxworkflowPage.shouldAllowDeletingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Queue in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Queue in Workflow Module test")
	public void userShouldNotBeAbleToAddQueueInWorkflowModule() {

		rxworkflowPage.shouldNotAllowAddingQueueInWorkflowModule();

	}

	@Then("the user should be able to edit Queue in Workflow Module test")
	public void userShouldBeAbleToEditQueueInWorkflowModule() {

		rxworkflowPage.shouldAllowEditingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Queue in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndDeleteForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Queue in Workflow Module test")
	public void userShouldNotBeAbleToDeleteQueueInWorkflowModule() {

		rxworkflowPage.shouldNotAllowDeletingQueueInWorkflowModule();

	}

	@Then("the user should not be able to edit Queue in Workflow Module test")
	public void userShouldNotBeAbleToEditQueueInWorkflowModule() {

		rxworkflowPage.shouldNotAllowEditingQueueInWorkflowModule();

	}

	@Then("the user should be able to add Queue in Workflow Module test")
	public void userShouldBeAbleToAddQueueInWorkflowModule() {

		rxworkflowPage.shouldAllowAddingQueueInWorkflowModule();

	}

	@Then("the user should be able to view Queue in Workflow Module test")
	public void userShouldBeAbleToViewQueueInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String queuesPageUrl = Hooks.prop.getProperty("queuesPageUrl");
		Assert.assertNotNull("queuesPageUrl is missing in config", queuesPageUrl);
		String fullUrl = baseUrl + queuesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openQueuesPage(fullUrl);
		Assert.assertTrue("Queues page is not displayed", Hooks.driver.getCurrentUrl().contains("/Setup/Home/Queues"));

		rxworkflowPage.shouldAllowViewingQueueInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Queue in Workflow Module test")
	public void userWithViewAndAddAccessShouldNotEditOrDeleteQueueInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictEditAndDeleteForQueueInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Followup Trail Script
	@Then("the user should be able to delete Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToDeleteFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldAllowDeletingFollowupTrailScriptInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Followup Trail Script in Workflow Module test")
	public void userWithViewAndDeleteAccessShouldNotAddOrEditFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.shouldRestrictAddAndEditForFollowupTrailScriptInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to add Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToAddFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldNotAllowAddingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to edit Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToEditFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldAllowEditingFollowupTrailScriptInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Followup Trail Script in Workflow Module test")
	public void userWithViewAndEditAccessShouldNotAddOrDeleteFollowupTrailScriptInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.verifyProfileWithViewEditCannotAddOrDeleteFollowupTrailScript();
		rxworkflowPage.clickSubmitButton();

	}

	@Then("the user should not be able to delete Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToDeleteFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldNotAllowDeletingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should not be able to edit Followup Trail Script in Workflow Module test")
	public void userShouldNotBeAbleToEditFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldNotAllowEditingFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to add Followup Trail Script in Workflow Module test")
	public void userShouldBeAbleToAddFollowupTrailScriptInWorkflowModule() {

		rxworkflowPage.shouldAddFollowupTrailScriptInWorkflowModule();

	}

	@Then("the user should be able to view Followup Trail Script in Workflow Module test")
	public void shouldDisplayFollowupTrailScriptInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String callScriptsPageUrl = Hooks.prop.getProperty("callScriptsPageUrl");
		Assert.assertNotNull("callScriptsPageUrl is missing in config", callScriptsPageUrl);
		String fullUrl = baseUrl + callScriptsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openCallScriptsPage(fullUrl);
		Assert.assertTrue("Call Scripts page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/CallScripts"));

		rxworkflowPage.verifyFollowupTrailScriptVisibleInWorkflowModule();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Followup Trail Script in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteFollowupTrailScript() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFollowupTrailScriptViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Transfer Result Action
	@Then("the user should be able to delete Transfer Result Action in Workflow Module test")
	public void testUserCanDeleteTransferResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessTransferResultActionDeleteOnly();

	}

	@Then("the user should not be able to add Transfer Result Action in Workflow Module test")
	public void testUserCannotAddTransferResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessTransferResultActionNoAdd();

	}

	@Then("the user should not be able to delete Transfer Result Action in Workflow Module test")
	public void testUserCannotDeleteTransferResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessTransferResultActionNoDelete();

	}

	@Then("the user should not be able to edit Transfer Result Action in Workflow Module test")
	public void testUserCannotEditTransferResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessTransferResultActionNoEdit();

	}

	@Then("the user should be able to edit Transfer Result Action in Workflow Module test")
	public void testUserCanEditTransferResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessTransferResultActionEditOnly();

	}

	@Then("the user should be able to add Transfer Result Action in Workflow Module test")
	public void testUserCanAddTransferResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String transferResultActionsPageUrl = Hooks.prop.getProperty("transferResultActionsPageUrl");
		Assert.assertNotNull("transferResultActionsPageUrl is missing in config", transferResultActionsPageUrl);
		String fullUrl = baseUrl + transferResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openTransferResultActionsPage(fullUrl);
		Assert.assertTrue("Transfer Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TransferResultActions"));

		rxworkflowPage.testProfileAccessTransferResultActionAddOnly();

	}

	@Then("the user should be able to view Transfer Result Action in Workflow Module test")
	public void testUserCanViewTransferResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String transferResultActionsPageUrl = Hooks.prop.getProperty("transferResultActionsPageUrl");
		Assert.assertNotNull("transferResultActionsPageUrl is missing in config", transferResultActionsPageUrl);
		String fullUrl = baseUrl + transferResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openTransferResultActionsPage(fullUrl);
		Assert.assertTrue("Transfer Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/TransferResultActions"));

		rxworkflowPage.testProfileAccessTransferResultActionViewOnly();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndDeleteNoAddEditTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewDeleteOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndEditNoAddDeleteTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewEditOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Transfer Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteTransferResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessTransferResultActionViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Failure Result Action
	@Then("the user should be able to delete Failure Result Action in Workflow Module test")
	public void testUserCanDeleteFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionDeleteOnly();

	}

	@Then("the user should not be able to add Failure Result Action in Workflow Module test")
	public void testUserCannotAddFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionNoAdd();

	}

	@Then("the user should be able to edit Failure Result Action in Workflow Module test")
	public void testUserCanEditFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionEditOnly();

	}

	@Then("the user should not be able to delete Failure Result Action in Workflow Module test")
	public void testUserCannotDeleteFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionNoDelete();

	}

	@Then("the user should not be able to edit Failure Result Action in Workflow Module test")
	public void testUserCannotEditFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionNoEdit();

	}

	@Then("the user should be able to add Failure Result Action in Workflow Module test")
	public void testUserCanAddFailureResultActionInWorkflowModule() {

		rxworkflowPage.testProfileAccessFailureResultActionAddOnly();

	}

	@Then("the user should be able to view Failure Result Action in Workflow Module test")
	public void testUserCanViewFailureResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String failureResultActionsPageUrl = Hooks.prop.getProperty("failureResultActionsPageUrl");
		Assert.assertNotNull("failureResultActionsPageUrl is missing in config", failureResultActionsPageUrl);
		String fullUrl = baseUrl + failureResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openFailureResultActionsPage(fullUrl);
		Assert.assertTrue("Failure Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/FailureResultActions"));

		rxworkflowPage.testSuccessResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndDeleteNoAddEditFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewDeleteOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndEditNoAddDeleteFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewEditOnly();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Failure Result Action in Workflow Module test")
	public void testCreateProfileWithViewAndAddNoEditDeleteFailureResultAction() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testProfileAccessFailureResultActionViewAddOnly();
		rxworkflowPage.clickSubmitButton();

	}

	// Success Result Action
	@Then("the user should not be able to add Success Result Action in Workflow Module test")
	public void shouldNotAllowAddingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Success Result Action in Workflow Module test")
	public void shouldNotAllowDeletingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionCannotBeDeletedInWorkflowModule();

	}

	@Then("the user should not be able to edit Success Result Action in Workflow Module test")
	public void shouldNotAllowEditingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionCannotBeEditedInWorkflowModule();

	}

	@Then("the user should be able to delete Success Result Action in Workflow Module test")
	public void shouldAllowDeletingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionIsDeletableInWorkflowModule();

	}

	@Then("the user should be able to edit Success Result Action in Workflow Module test")
	public void shouldAllowEditingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionIsEditableInWorkflowModule();

	}

	@Then("the user should be able to add Success Result Action in Workflow Module test")
	public void shouldAllowAddingSuccessResultActionInWorkflowModule() {

		rxworkflowPage.testSuccessResultActionIsAddableInWorkflowModule();

	}

	@Then("the user should be able to view Success Result Action in Workflow Module test")
	public void shouldAllowViewingSuccessResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String successResultActionsPageUrl = Hooks.prop.getProperty("successResultActionsPageUrl");
		Assert.assertNotNull("successResultActionsPageUrl is missing in config", successResultActionsPageUrl);
		String fullUrl = baseUrl + successResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openSuccessResultActionsPage(fullUrl);
		Assert.assertTrue("Success Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/SuccessResultActions"));

		rxworkflowPage.testSuccessResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Success Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteSuccessResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testSuccessResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Reminder Result Action
	@Then("the user should not be able to add Reminder Result Action in Workflow Module test")
	public void shouldNotAllowAddingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Reminder Result Action in Workflow Module test")
	public void shouldNotAllowDeletingReminderResultActionInWorkflowModule() {

		rxworkflowPage.reminderResultActionShouldNotBeDeletableInWorkflowModule();

	}

	@Then("the user should not be able to edit Reminder Result Action in Workflow Module test")
	public void shouldNotAllowEditingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionCannotBeEditedInWorkflowModule();

	}

	@Then("the user should be able to edit Reminder Result Action in Workflow Module test")
	public void shouldAllowEditingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsEditableInWorkflowModule();

	}

	@Then("the user should be able to add Reminder Result Action in Workflow Module test")
	public void shouldAllowAddingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsAddableInWorkflowModule();

	}

	@Then("the user should be able to delete Reminder Result Action in Workflow Module test")
	public void shouldAllowDeletingReminderResultActionInWorkflowModule() {

		rxworkflowPage.testReminderResultActionIsDeletableInWorkflowModule();

	}

	@Then("the user should be able to view Reminder Result Action in Workflow Module test")
	public void shouldAllowViewingReminderResultActionInWorkflowModule() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String reminderResultActionsPageUrl = Hooks.prop.getProperty("reminderResultActionsPageUrl");
		Assert.assertNotNull("reminderResultActionsPageUrl is missing in config", reminderResultActionsPageUrl);
		String fullUrl = baseUrl + reminderResultActionsPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openReminderResultActionsPage(fullUrl);
		Assert.assertTrue("Reminder Result Actions page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/ReminderResultActions"));

		rxworkflowPage.testReminderResultActionIsViewableInWorkflowModule();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndDeleteButNotAddOrEditReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewDeleteOnlyNoAddEditInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Reminder Result Action in Workflow Module test")
	public void shouldAllowViewAndAddButNotEditOrDeleteReminderResultActionInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testReminderResultActionViewAddOnlyNoEditDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	// Medication SyncReminder Color Code
	@Then("the user should be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsDeletableInWorkflowModule();

	}

	@Then("the user should not be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowAddingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeAddedInWorkflowModule();

	}

	@Then("the user should not be able to delete Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowDeletingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeCannotBeDeletedInWorkflowModule();

	}

	@Then("the user should not be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldNotAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsNotEditableInWorkflowModule();

	}

	@Then("the user should be able to add Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToAddMedicationSyncReminderColorCodeInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanAddMedicationSyncReminderColorCode();

	}

	@Then("the user should be able to edit Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowEditingMedicationSyncReminderColorCodeInWorkflowModule() {

		rxworkflowPage.testMedicationSyncReminderColorCodeIsEditableInWorkflowModule();

	}

	@Then("the user should be able to view Medication Sync Reminder Color Code in Workflow Module test")
	public void userShouldBeAbleToViewMedicationSyncReminderColorCodeInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderColorCodesPageUrl = Hooks.prop
				.getProperty("medicationSyncReminderColorCodesPageUrl");
		Assert.assertNotNull("medicationSyncReminderColorCodesPageUrl is missing in config",
				medicationSyncReminderColorCodesPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderColorCodesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderColorCodesPage(fullUrl);
		Assert.assertTrue("Medication Sync Reminder Color Codes page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderColorCodes"));

		rxworkflowPage.verifyUserCanViewMedicationSyncReminderColorCode();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Medication Sync Reminder Color Code in Workflow Module test")
	public void testMedicationSyncReminderColorCodeViewDeleteOnlyNoAddEditInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.medicationSyncReminderColorCodeAccessControlViewDeleteOnlyInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void shouldAllowViewAndEditButNotAddOrDeleteMedicationSyncReminderColorCodeInWorkflowModule() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.testMedicationSyncReminderColorCodeViewEditOnlyNoAddDeleteInWorkflowModule();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Medication Sync Reminder Color Code in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForMedicationSyncReminderColorCodeTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForMedicationSyncReminderColorCode();
		rxworkflowPage.clickSubmitButton();

	}

	// Sync Workflow Settings
	@Then("the user should be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCannotAddSyncWorkflowSettings();

	}

	@Then("the user should be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanEditSyncWorkflowSettings();

	}

	@Then("the user should not be able to delete Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToDeleteSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCannotDeleteSyncWorkflowSettings();

	}

	@Then("the user should not be able to edit Sync Workflow Settings in Workflow Module test")
	public void userShouldNotBeAbleToEditSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.assertNoEditAccessToSyncWorkflowSettings();

	}

	@Then("the user should be able to add Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToAddSyncWorkflowSettingsInWorkflowModuleTest() {

		rxworkflowPage.verifyUserCanAddSyncWorkflowSettings();

	}

	@Then("the user should be able to view Sync Workflow Settings in Workflow Module test")
	public void userShouldBeAbleToViewSyncWorkflowSettingsInWorkflowModuleTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String medicationSyncReminderSettingPageUrl = Hooks.prop.getProperty("medicationSyncReminderSettingPageUrl");
		Assert.assertNotNull("medicationSyncReminderSettingPageUrl is missing in config",
				medicationSyncReminderSettingPageUrl);
		String fullUrl = baseUrl + medicationSyncReminderSettingPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openMedicationSyncReminderSettingPage(fullUrl);
		Assert.assertTrue("Sync Workflow Setting page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/MedicationSyncReminderSetting"));
		rxworkflowPage.assertUserViewAccessToSyncWorkflowSettings();

	}

	@And("I create a profile with View and Delete access but no Add or Edit access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndDeleteAccessNoAddOrEditForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewDeleteNoAddEditSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Edit access but no Add or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndEditAccessNoAddOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.setupProfileViewEditNoAddDeleteSyncWorkflow();
		rxworkflowPage.clickSubmitButton();

	}

	@And("I create a profile with View and Add access but no Edit or Delete access to Sync Workflow Settings in Workflow Module test")
	public void createProfileWithViewAndAddAccessNoEditOrDeleteForSyncWorkflowSettingsTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createProfileWithViewAddOnlyAccessForSyncWorkflowSettings();
		rxworkflowPage.clickSubmitButton();

	}

	// General

	@Then("the Rxworkflow user should be able to view Profiles")
	public void rxworkflowUserShouldBeAbleToViewProfiles() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String profilesPageUrl = Hooks.prop.getProperty("profilesPageUrl");
		String fullUrl = baseUrl + profilesPageUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openrxworkflowPage(fullUrl, "/Setup/Home/Profiles");
		Assert.assertTrue("Profiles page is not displayed",
				Hooks.driver.getCurrentUrl().contains("/Setup/Home/Profiles"));
		System.out.println("Rxworkflow user should be able to view Profiles test");
		Hooks.scenario.log("Rxworkflow user should be able to view Profiles test");

	}

	@And("I create a profile with No access to Workflow Module General Audit View test")
	public void createProfileWithNoAccessToWorkflowGeneralAuditViewTest() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createNoAccessProfileForWorkflowAuditViewTest();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@And("I create a profile with View access only to Rxworkflow Module General Audit View test")
	public void createProfileWithViewAccessOnlyToRxworkflowGeneralAuditView() {
		rxworkflowPage.clickFilterButton();
		rxworkflowPage.enterProfileName();
		rxworkflowPage.clickSearchButton();
		rxworkflowPage.clickActionMenu();
		rxworkflowPage.clickEditButton();
		rxworkflowPage.createViewOnlyProfileForRxworkflowAuditView();
		rxworkflowPage.clickSubmitButton();
		System.out.println("Profile updated with View access only to Rxworkflow Module General Audit View");
		Hooks.scenario.log("Profile updated with View access only to Rxworkflow Module General Audit View");
	}

	@Then("the user should not be able to view General Audit View settings in Workflow Module test")
	public void userShouldNotBeAbleToViewWorkflowGeneralAuditViewSettingsTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.verifyUserCannotViewWorkflowAuditSettings();

	}

	@Then("the user should be able to view Rxworkflow Module General Audit View test")
	public void userShouldBeAbleToViewRxworkflowGeneralAuditViewTest() {
		String baseUrl = Hooks.prop.getProperty("baseUrl");
		String workflowDashboardUrl = Hooks.prop.getProperty("workflowDashboardUrl");
		Assert.assertNotNull("workflowDashboardUrl is missing in config", workflowDashboardUrl);
		String fullUrl = baseUrl + workflowDashboardUrl;
		rxworkflowPage = new rxworkflowpage(Hooks.driver);
		rxworkflowPage.openWorkflowDashboardPage(fullUrl);
		Assert.assertTrue("Page is not displayed", Hooks.driver.getCurrentUrl().contains("/Workflow/Home/Dashboard"));
		rxworkflowPage.assertUserViewAccessToRxworkflowAuditView();

	}
}
