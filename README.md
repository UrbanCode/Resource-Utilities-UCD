# IBM UrbanCode Deploy Resource Utilities Plug-in
---
Note: This is not the plug-in distributable! This is the source code. To find the installable plug-in, please head over to the [Resource Utilities plug-in page](https://developer.ibm.com/urbancode/plugin/resource-utilities/) on the IBM UrbanCode website.

This IBM UrbanCode Deploy Resource Utilities plug-in supplements the existing IBM UrbanCode Deploy Resources plug-in with additional steps to help manage large resource trees and the properties on resources in large trees.

### License
This plug-in is protected under the [Eclipse Public 1.0 License](http://www.eclipse.org/legal/epl-v10.html)

### The Resource Utilities plug-in includes the following steps:
    - Find Resource Properties Without Values
    - Find Specific Properties
    - List Resources

### Compatibility
	This plug-in requires version 6.0.1.0 or later of IBM UrbanCode Deploy.

### Installation
	The packaged zip is hosted on the Resource Utilities plug-in page on the IBM UrbanCode website.
    No special steps are required for installation. See Installing plug-ins in IBM UrbanCode Deploy.
    Download this zip file if you wish to skip the manual build step. Otherwise, download the entire
    Resource-Utilities-UCD repository and follow the "Build" direction below.

### Build
    gradle

To compile the project locally, two additional jar files are required: HttpComponents-Util.jar and uDeployRestClient.jar. Place these jars in Resource-Utilties-UCD project's 'libs' folder located in the root directory. These jars can be found within IBM UrbanCode Deploy's installation directory.


### History
	Version 1
		Initial GitHub Release.
