/**
 * © Copyright IBM Corporation 2015, 2016.
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights: Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.urbancode.air

import com.urbancode.ud.client.ResourceClient
import org.codehaus.jettison.json.JSONObject
import org.codehaus.jettison.json.JSONArray

class ResourceClientConnection{

	ResourceClient client
	ResourceClientConnection(UCDServerConnection sc) {
		client = new ResourceClient(new URI(sc.getWebURL()), sc.getUserName(), sc.getPassword())
	}

	public JSONObject getUCDResourceByPath(String path) {

		return(client.getResourceByPath(path))
	}
}
