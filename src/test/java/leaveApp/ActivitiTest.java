package leaveApp;


import org.activiti.engine.*;
import org.junit.Assert;
import org.junit.Test;

public class ActivitiTest {

	@Test
	public void testActiviti(){
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		
		RuntimeService runtimeService = processEngine.getRuntimeService();
		RepositoryService repositoryService = processEngine.getRepositoryService();
		TaskService taskService = processEngine.getTaskService();
		ManagementService managementService = processEngine.getManagementService();
		IdentityService identityService = processEngine.getIdentityService();
		HistoryService historyService = processEngine.getHistoryService();
		FormService formService = processEngine.getFormService();
		

		System.out.println("Test");
		
		String s = null;
		Assert.assertNotNull(s);
	}
}
