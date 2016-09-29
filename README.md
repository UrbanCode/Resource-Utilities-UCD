# IBM UrbanCode Deploy Resource Utilities Plug-in
---
Note: This is not the plugin distributable! This is the source code. To find the installable plugin, please head over to the [Resource Utilities plug-in page](https://developer.ibm.com/urbancode/plugin/resource-utilities/) on the IBM UrbanCode Deploy website.

This IBM UrbanCode Deploy Resource Utilities plug-in supplements the existing UrbanCode Deploy Resources plug-in with additional steps to help manage large resource trees and the properties on resources in large trees.

### License
This plug-in is protected under the [Eclipse Public 1.0 License](http://www.eclipse.org/legal/epl-v10.html)

### The Resource Utilities plug-in includes the following steps:

Find Resource Properties Without Values
Find Specific Properties
List Resources

### Compatibility
	This plug-in requires version 6.0.1.0 or later of IBM UrbanCode Deploy.

### Installation
	The packaged zip is located in the dist folder. No special steps are required for installation.
	See Installing plug-ins in UrbanCode Deploy. Download this zip file if you wish to skip the
	manual build step. Otherwise, download the entire uDeploy-Resource-Utilities-Plugin and
	run the "gradle" command in the top level folder. This should compile the code and create
	a new distributable zip within the dist folder. Use this command if you wish to make
	your own changes to the plugin.
    gradle

### Build
    gradle

To compile the project locally, two additional jar files are required: HttpComponents-Util.jar and uDeployRestClient.jar. Place these jars in Resource-Utilties-UCD project's 'libs' folder located in the root directory. These jars can be found within IBM UrbanCode Deploy's installation directory.


### History
	Version 1
		Initial GitHub Release.
