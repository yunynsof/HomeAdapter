package hn.com.tigo.josm.orchestrator.home.adapter.core;

import static javax.ejb.ConcurrencyManagementType.BEAN;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.apache.log4j.Logger;

import hn.com.tigo.josm.common.adapter.AbstractAdapter;
import hn.com.tigo.josm.common.adapter.config.AdapterConfig;
import hn.com.tigo.josm.common.exceptions.AdapterException;
import hn.com.tigo.josm.orchestrator.driver.home.core.HomeDriver;
import hn.com.tigo.josm.orchestrator.home.adapter.utils.HomeAdapterConstants;

/**
 * The Class ApiHomeConstantsDriver this class gets the configuration from the configuration file.
 * 
 * @author Laurent G. Cáceres
 * @version 1.0.0
 * @since 10/08/2022
 */
@Singleton
@Startup
@DependsOn("MonitoringManager")
@ConcurrencyManagement(BEAN)
public class HomeAdapter extends AbstractAdapter<HomeDriver>{

	
	/** The Constant LOGGER.*/
	private static final Logger LOGGER = Logger.getLogger(HomeAdapter.class);

	/**
	 * Instantiates a new NexusAdapter and create a HomeAdapter Monitor
	 * instance. Also Load the configuration and create the drivers.
	 */
	public HomeAdapter() {
		LOGGER.info("Init HomeAdapter Singleton");
	}
	
	/* (non-Javadoc)
	 * @see hn.com.tigo.josm.common.adapter.AbstractAdapter#createDriver()
	 */
	@Override
	public HomeDriver createDriver() throws AdapterException {
		final AdapterConfig config =  this.getConfigurationType();
		final String endpointHome = config.getDriverConfig().getConnections().get("homeCreator").getParameters().get(HomeAdapterConstants.URL);
	
		return new HomeDriver(endpointHome);
	}
	
}
