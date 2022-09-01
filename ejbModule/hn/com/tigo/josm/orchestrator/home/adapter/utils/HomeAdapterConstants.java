package hn.com.tigo.josm.orchestrator.home.adapter.utils;

import java.io.Serializable;

/**
 * This class contains the necessary constants for all processes within HomeAdapter.
 *
 * @author Yuny Rene Rodriguez Perez {@literal<mailto: yrodriguez@hightech-corp.com />}
 * @version  1.0.0
 * @since 09-01-2022 02:35:36 PM 2022
 */
public class HomeAdapterConstants implements Serializable {

	/** Attribute that determine a Constant of serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The Constant CODE_EXITO. */
	public static final int CODE_EXITO = 0;

	/** The Constant RESPONSE. */
	public static final String RESPONSE = "Operation successfully.";

	/** Attribute that determine a Constant of ENDPOINT. */
	public static final String ENDPOINT = "url";

	/** Attribute that determine a Constant of URL. */
	public static final String URL = "url";

	/** Attribute that determine a Constant of JSON. */
	public static final String JSON = "JSON";

	/** Attribute that determine a Constant of XML. */
	public static final String XML = "XML";

	/** Attribute that determine a Constant of CORRECT_JSON_STRUCTURE. */
	public static final String CORRECT_JSON_STRUCTURE = "The structure of the json is not valid";

	/**
	 * Instantiates a new Api Home constants adapter.
	 */
	private HomeAdapterConstants(){
	}

}
