package FunctionalityTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.VtigerBaseClass;
import com.crm.FileUtility.OrgExcel;
import com.crm.Pom.Organization;

public class Create_Organization_withIndustry extends VtigerBaseClass {

	@Test
	public void createOrgWithIndustry() throws InterruptedException, EncryptedDocumentException, IOException
	{
		

		
		
		Organization ref = new Organization(driver);
		ref.organization();
		ref.createOrg();
		ref.accountname().sendKeys(organization_name);
		ref.industry();
		ref.assigntype();
		ref.assignedUserId();
		ref.save();
	}
}
