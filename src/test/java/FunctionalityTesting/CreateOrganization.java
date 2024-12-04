package FunctionalityTesting;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBaseClass;
import com.crm.FileUtility.OrgExcel;
import com.crm.Pom.Organization;
@Listeners(com.crm.Listeners.VtigerListeners.class)
public class CreateOrganization extends VtigerBaseClass {

	@Test
	public void createOrg() throws InterruptedException, EncryptedDocumentException, IOException
	{
		

		
		
		Organization ref = new Organization(driver);
		ref.organization();
		ref.createOrg();
		ref.accountname().sendKeys(organization_name);
		ref.assigntype();
		ref.assignedUserId();
		ref.save();
	}
}
