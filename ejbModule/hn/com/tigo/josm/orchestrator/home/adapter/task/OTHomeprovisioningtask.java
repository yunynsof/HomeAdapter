package hn.com.tigo.josm.orchestrator.home.adapter.task;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import org.apache.log4j.Logger;


import hn.com.tigo.josm.common.adapter.AbstractAdapter;
import hn.com.tigo.josm.common.adapter.AdapterValidationType;
import hn.com.tigo.josm.common.adapter.dto.TaskRequestType;
import hn.com.tigo.josm.common.adapter.dto.TaskResponseType;
import hn.com.tigo.josm.common.adapter.task.AbstractTask;
import hn.com.tigo.josm.common.adapter.task.Task;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.driver.home.core.HomeDriver;
import hn.com.tigo.josm.orchestrator.driver.home.operation.OTHomeProvisioningTaskOperations;
import hn.com.tigo.josm.orchestrator.home.adapter.core.HomeAdapter;
import hn.com.tigo.josm.orchestrator.home.adapter.utils.HomeAdapterConstants;

/**
 * The Class OTHomeprovisioningtask is used to execute the method
 * OTHomeprovisioningtask (HomeDriver)
 * 
 * @author Laurent G. Caceres
 * @version 1.0.0
 * @since 17/08/2022
 */
@WebService
@Stateless(mappedName = "OTHomeprovisioningtask")
public class OTHomeprovisioningtask extends AbstractTask<OTHomeProvisioningTaskOperations, HomeDriver> implements Task {

	/** Attribute that determine log. */
	protected static final Logger LOGGER = Logger.getLogger(OTHomeprovisioningtask.class);

	@EJB
	private HomeAdapter homeAdapter;

	/**
	 * Method responsible for obtaining singleton instance that manages the adapter.
	 * 
	 * @return the singleton adapter
	 */
	@Override
	protected AbstractAdapter<HomeDriver> getSingletonAdapter() {
		return homeAdapter;
	}

	/**
	 * Method responsible to create the request for SymphonicaWorkflowOrderTask
	 * (NexusDriver) the incoming parameter.
	 * 
	 * @param taskType
	 *            the task type is an object with a set of parameters with pair
	 *            values.
	 * @return the v.
	 * @throws AdapterException
	 *             exception controlled
	 */
	@Override
	protected OTHomeProvisioningTaskOperations createRequest(final TaskRequestType taskType) throws AdapterException {
		final String json = HomeAdapter.getParameterValue(HomeAdapterConstants.JSON, taskType);
		printParameterValue(HomeAdapterConstants.JSON, json);
		validateParameter(HomeAdapterConstants.JSON, json, AdapterValidationType.ALL, true);

		return new OTHomeProvisioningTaskOperations(json);
	}

	/**
	 * Method main responsible to execute OTHomeprovisioningtask task. This method
	 * access method executeAccountDeleteTask ()
	 * 
	 * @throws AdapterException
	 *             the adapter exception
	 */
	@Override
	protected TaskResponseType executeDriverTask(HomeDriver driver) throws AdapterException {
		return driver.executeDriver(request);
	}
}
