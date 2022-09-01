package hn.com.tigo.orchestrator.home.adapter.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import hn.com.tigo.josm.common.adapter.dto.ParameterArray;
import hn.com.tigo.josm.common.adapter.dto.ParameterType;
import hn.com.tigo.josm.common.adapter.dto.TaskRequestType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.home.adapter.utils.HomeAdapterConstants;

public class OTHomeProvisioningtaskTest extends AbstractTest {

	public OTHomeProvisioningtaskTest() throws Exception {
		super("java:global/HomeAdapter/OTHomeprovisioningtask!hn.com.tigo.josm.common.adapter.task.Task");
	}
	
	@Test
	public void test() {
		try {
			final TaskResponseType response = task.executeTask(buildTaskRequestCreate());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {

		}
	}
	
	@Test
	public void test2() {
		
		try {
			final TaskResponseType response = task.executeTask(buildTaskRequestCancel());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			
		}
	}
	
	@Test
	public void test3() {
		   
		try {
			final TaskResponseType response = task.executeTask(buildTaskRequestClose());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
		
		}
	}
	
	@Test
	public void test4() {
		
		try {
			final TaskResponseType response = task.executeTask(buildTaskRequestUninstall());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {
			
		}
	}
	
	@Test
	public void testErr() {
		
		try {
			final TaskResponseType response = task.executeTask(buildTaskRequestErr());
			assertEquals(0, response.getResponseCode());
		} catch (AdapterException e) {


		}
	}
	
	
	private TaskRequestType buildTaskRequestCreate() {
		final ParameterArray parameterArray = new ParameterArray();
		
		ParameterType parameterTypeReq = new ParameterType();
		parameterTypeReq.setName(HomeAdapterConstants.JSON);
		parameterTypeReq.setValue("{\"CreateOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}");
		parameterArray.getParameter().add(parameterTypeReq);

		final TaskRequestType taskRequestType = new TaskRequestType();
		taskRequestType.setParameters(parameterArray);
		return taskRequestType;
	}
	
	private TaskRequestType buildTaskRequestCancel() {
		final ParameterArray parameterArray = new ParameterArray();
		
		ParameterType parameterTypeReq = new ParameterType();
		parameterTypeReq.setName(HomeAdapterConstants.JSON);
		parameterTypeReq.setValue("{\"CancelOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}");
		parameterArray.getParameter().add(parameterTypeReq);

		final TaskRequestType taskRequestType = new TaskRequestType();
		taskRequestType.setParameters(parameterArray);
		return taskRequestType;
	}
	
	private TaskRequestType buildTaskRequestClose() {
		final ParameterArray parameterArray = new ParameterArray();
		
		ParameterType parameterTypeReq = new ParameterType();
		parameterTypeReq.setName(HomeAdapterConstants.JSON);
		parameterTypeReq.setValue("{\"CloseOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}");
		parameterArray.getParameter().add(parameterTypeReq);

		final TaskRequestType taskRequestType = new TaskRequestType();
		taskRequestType.setParameters(parameterArray);
		return taskRequestType;
	}
	
	private TaskRequestType buildTaskRequestUninstall() {
		final ParameterArray parameterArray = new ParameterArray();
		
		ParameterType parameterTypeReq = new ParameterType();
		parameterTypeReq.setName(HomeAdapterConstants.JSON);
		parameterTypeReq.setValue("{\"UninstallOrderRequest\": {\"basicRequest\": {\"externalApplicationID\": \"123\",\"externalTransactionID\": \"24886d60-9a28-47d0-b2fd-20c20416d489\",\"utiReference\": \"24886d60-9a28-47d0-b2fd-20c20416d489\"},\"additionals\": {\"additional\": [{\"name\": \"ACTION\",\"value\": \"PROVIDE\"}]}}}");
		parameterArray.getParameter().add(parameterTypeReq);

		final TaskRequestType taskRequestType = new TaskRequestType();
		taskRequestType.setParameters(parameterArray);
		return taskRequestType;
	}
	
	private TaskRequestType buildTaskRequestErr() {
		final ParameterArray parameterArray = new ParameterArray();
		
		ParameterType parameterTypeReq = new ParameterType();
		parameterTypeReq.setName(HomeAdapterConstants.JSON);
		parameterTypeReq.setValue("");
		parameterArray.getParameter().add(parameterTypeReq);

		final TaskRequestType taskRequestType = new TaskRequestType();
		taskRequestType.setParameters(parameterArray);
		return taskRequestType;
	}

}
