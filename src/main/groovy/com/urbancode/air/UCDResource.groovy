/**
 * © Copyright IBM Corporation 2015, 2016.
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights: Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.urbancode.air

import org.codehaus.jettison.json.JSONArray
import org.codehaus.jettison.json.JSONObject

class UCDResource {
	String id
	JSONObject RawJSON

    UCDResource(String id, JSONObject rawJSON) {
        this.id = id
		this.RawJSON = rawJSON
    }
	public JSONObject getJSON() { return RawJSON }
}
