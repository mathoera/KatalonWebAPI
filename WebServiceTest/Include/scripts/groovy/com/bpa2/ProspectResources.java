package com.bpa2;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import internal.GlobalVariable;
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint;
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase;
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData;
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject;
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject;

import com.kms.katalon.core.annotation.Keyword;
import com.kms.katalon.core.checkpoint.Checkpoint;
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords;
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords;
import com.kms.katalon.core.model.FailureHandling;
import com.kms.katalon.core.testcase.TestCase;
import com.kms.katalon.core.testdata.TestData;
import com.kms.katalon.core.testobject.TestObject;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords;
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords;

public class ProspectResources {
	private static createProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode)
	{
		WS.sendRequest(findTestObject('ResourcesApi_CreateResource', [('longitude') : '', ('latitude') : '']))
	}
	private static deleteProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode) {}
	private static rejectProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode) {}
	private static approveProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode) {}
	private static unapproveProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode) {}
	private static sendProspect(String testCaseName, String request, String response, boolean validateResponse, int httpCode) {}

}