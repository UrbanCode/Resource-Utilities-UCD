/**
 * © Copyright IBM Corporation 2015, 2016.
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights: Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.urbancode.air

import com.urbancode.ud.client.ResourceClient

class UCDServerConnection {
    String webURL
    String userName
	String password

	UCDServerConnection(String weburl, String userName, String password) {
        this.webURL = weburl
		this.userName = userName
		this.password = password

    }
	String getWebURL() { return webURL }
	String getUserName() { return userName }
	String getPassword() { return password }
}
