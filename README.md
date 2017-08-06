# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

## How to Use

The following section explains how to use the ARTIKCloudAPI library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *ARTIKCloudAPILib* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

Clicking the ``` Add ``` button will open a dialog where you need to specify ARTIKCloudAPI in ``` Group Id ``` and ARTIKCloudAPILib in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=ARTIK%20Cloud%20API-Java&workspaceName=ARTIKCloudAPI&projectName=ARTIKCloudAPILib&rootNamespace=cloud.artik.api)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *ARTIKCloudAPILib* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| oAuthClientId | OAuth 2 Client ID |
| oAuthRedirectUri | OAuth 2 Redirection endpoint or Callback Uri |



API client can be initialized as following.

```java
// Configuration parameters and credentials
String oAuthClientId = "oAuthClientId"; // OAuth 2 Client ID
String oAuthRedirectUri = "oAuthRedirectUri"; // OAuth 2 Redirection endpoint or Callback Uri

ARTIKCloudAPIClient client = new ARTIKCloudAPIClient(oAuthClientId, oAuthRedirectUri);
```

You must authorize now authorize the client.

### Authorizing your client

Your application must obtain user authorization before it can execute an endpoint call.
The SDK uses *OAuth 2.0 Implicit Grant* to obtain a user's consent to perform an API request on user's behalf.

This process requires the presence of a client-side JavaScript code on the redirect URI page to 
receive the *access token* after the consent step is completed.

#### 1. Obtain consent

To obtain user's consent, you must redirect the user to the authorization page.
The `buildAuthorizationUrl()` method creates the URL to the authorization page.
 You must pass the *[scopes](#scopes)* for which you need permission to access.
```java
authUrl = client.auth().buildAuthorizationUrl(scopes);
httpServletResponse.sendRedirect(authUrl);
```

#### 2. Handle the OAuth server response

Once the user responds to the consent request, the OAuth 2.0 server responds to your application's access request by redirecting the user to the redirect URI specified set in `Configuration`.

The redirect URI will receive the *access token* as the `access_token` argument in the URL fragment.

```
https://example.com/oauth/callback#access_token=XXXXXXXXXXXXXXXXXXXXXXXXX
```

The access token must be extracted by the client-side JavaScript code. The access token can be used to authorize any further endpoint calls by the JavaScript code.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the `cloud.artik.api.Models.OAuthScopeEnum` enumeration.

| Scope Name | Description |
| --- | --- |
| `READARTIKCLOUD` | Read from ARTIK Cloud |
| `WRITEARTIKCLOUD` | Write from ARTIK Cloud |



# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [SubscriptionsController](#subscriptions_controller)
* [DevicesSharesController](#devices_shares_controller)
* [DevicesManagementController](#devices_management_controller)
* [DevicesStatusController](#devices_status_controller)
* [RegistrationsController](#registrations_controller)
* [TokensController](#tokens_controller)
* [MessagesController](#messages_controller)
* [RulesController](#rules_controller)
* [ExportController](#export_controller)
* [TagsController](#tags_controller)
* [DeviceTypesController](#device_types_controller)
* [DevicesController](#devices_controller)
* [UsersController](#users_controller)

## <a name="subscriptions_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.SubscriptionsController") SubscriptionsController

### Get singleton instance

The singleton instance of the ``` SubscriptionsController ``` class can be accessed from the API Client.

```java
SubscriptionsController subscriptions = client.getSubscriptions();
```

### <a name="create_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.createSubscriptionAsync") createSubscriptionAsync

> Create Subscription


```java
void createSubscriptionAsync(
        final SubscriptionInfo subscriptionInfo,
        final APICallBack<SubscriptionEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subscriptionInfo |  ``` Required ```  | Subscription details |


#### Example Usage

```java
try {
    SubscriptionInfo subscriptionInfo = new SubscriptionInfo();
    // Invoking the API call with sample inputs
    subscriptions.createSubscriptionAsync(subscriptionInfo, new APICallBack<SubscriptionEnvelope>() {
        public void onSuccess(HttpContext context, SubscriptionEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.deleteSubscriptionAsync") deleteSubscriptionAsync

> Delete Subscription


```java
void deleteSubscriptionAsync(
        final String subId,
        final APICallBack<SubscriptionEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subId |  ``` Required ```  | Subscription ID. |


#### Example Usage

```java
String subId = "subId";
// Invoking the API call with sample inputs
subscriptions.deleteSubscriptionAsync(subId, new APICallBack<SubscriptionEnvelope>() {
    public void onSuccess(HttpContext context, SubscriptionEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.getSubscriptionAsync") getSubscriptionAsync

> Get Subscription


```java
void getSubscriptionAsync(
        final String subId,
        final APICallBack<SubscriptionEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subId |  ``` Required ```  | Subscription ID. |


#### Example Usage

```java
String subId = "subId";
// Invoking the API call with sample inputs
subscriptions.getSubscriptionAsync(subId, new APICallBack<SubscriptionEnvelope>() {
    public void onSuccess(HttpContext context, SubscriptionEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_messages_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.getMessagesAsync") getMessagesAsync

> Get Messages


```java
void getMessagesAsync(
        final String notifId,
        final Integer offset,
        final Integer count,
        final String order,
        final APICallBack<NotifMessagesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| notifId |  ``` Required ```  | Notification ID. |
| offset |  ``` Optional ```  | Offset for pagination. |
| count |  ``` Optional ```  | Desired count of items in the result set. |
| order |  ``` Optional ```  | Sort order of results by ts. Either 'asc' or 'desc'. |


#### Example Usage

```java
String notifId = "notifId";
Integer offset = 212;
Integer count = 212;
String order = "order";
// Invoking the API call with sample inputs
subscriptions.getMessagesAsync(notifId, offset, count, order, new APICallBack<NotifMessagesResponse>() {
    public void onSuccess(HttpContext context, NotifMessagesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_all_subscriptions_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.getAllSubscriptionsAsync") getAllSubscriptionsAsync

> Get All Subscriptions


```java
void getAllSubscriptionsAsync(
        final String uid,
        final Integer offset,
        final Integer count,
        final APICallBack<SubscriptionsEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| uid |  ``` Optional ```  | User ID |
| offset |  ``` Optional ```  | Offset for pagination. |
| count |  ``` Optional ```  | Desired count of items in the result set. |


#### Example Usage

```java
String uid = "uid";
Integer offset = 212;
Integer count = 212;
// Invoking the API call with sample inputs
subscriptions.getAllSubscriptionsAsync(uid, offset, count, new APICallBack<SubscriptionsEnvelope>() {
    public void onSuccess(HttpContext context, SubscriptionsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_validate_subscription_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.SubscriptionsController.createValidateSubscriptionAsync") createValidateSubscriptionAsync

> Validate Subscription


```java
void createValidateSubscriptionAsync(
        final String subId,
        final ValidationCallbackInfo validationCallbackRequest,
        final APICallBack<SubscriptionEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subId |  ``` Required ```  | Subscription ID. |
| validationCallbackRequest |  ``` Required ```  | Subscription validation callback request |


#### Example Usage

```java
try {
    String subId = "subId";
    ValidationCallbackInfo validationCallbackRequest = new ValidationCallbackInfo();
    // Invoking the API call with sample inputs
    subscriptions.createValidateSubscriptionAsync(subId, validationCallbackRequest, new APICallBack<SubscriptionEnvelope>() {
        public void onSuccess(HttpContext context, SubscriptionEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="devices_shares_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.DevicesSharesController") DevicesSharesController

### Get singleton instance

The singleton instance of the ``` DevicesSharesController ``` class can be accessed from the API Client.

```java
DevicesSharesController devicesShares = client.getDevicesShares();
```

### <a name="create_share_for_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesSharesController.createShareForDeviceAsync") createShareForDeviceAsync

> Share a device 


```java
void createShareForDeviceAsync(
        final String deviceId,
        final DeviceShareInfo deviceShareInfo,
        final APICallBack<DeviceSharingId> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| deviceShareInfo |  ``` Required ```  | Device object that needs to be added |


#### Example Usage

```java
try {
    String deviceId = "deviceId";
    DeviceShareInfo deviceShareInfo = new DeviceShareInfo();
    // Invoking the API call with sample inputs
    devicesShares.createShareForDeviceAsync(deviceId, deviceShareInfo, new APICallBack<DeviceSharingId>() {
        public void onSuccess(HttpContext context, DeviceSharingId response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_all_shares_for_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesSharesController.getAllSharesForDeviceAsync") getAllSharesForDeviceAsync

> List all shares for the given device id


```java
void getAllSharesForDeviceAsync(
        final String deviceId,
        final Integer count,
        final Integer offset,
        final APICallBack<DeviceSharingEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| count |  ``` Optional ```  | Desired count of items in the result set. |
| offset |  ``` Optional ```  | Offset for pagination. |


#### Example Usage

```java
String deviceId = "deviceId";
Integer count = 212;
Integer offset = 212;
// Invoking the API call with sample inputs
devicesShares.getAllSharesForDeviceAsync(deviceId, count, offset, new APICallBack<DeviceSharingEnvelope>() {
    public void onSuccess(HttpContext context, DeviceSharingEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_sharing_for_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesSharesController.deleteSharingForDeviceAsync") deleteSharingForDeviceAsync

> Delete specific share of the given device id


```java
void deleteSharingForDeviceAsync(
        final String deviceId,
        final String shareId,
        final APICallBack<DeviceSharingId> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| shareId |  ``` Required ```  | Share ID. |


#### Example Usage

```java
String deviceId = "deviceId";
String shareId = "shareId";
// Invoking the API call with sample inputs
devicesShares.deleteSharingForDeviceAsync(deviceId, shareId, new APICallBack<DeviceSharingId>() {
    public void onSuccess(HttpContext context, DeviceSharingId response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sharing_for_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesSharesController.getSharingForDeviceAsync") getSharingForDeviceAsync

> Get specific share of the given device id


```java
void getSharingForDeviceAsync(
        final String deviceId,
        final String shareId,
        final APICallBack<DeviceSharing> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| shareId |  ``` Required ```  | Share ID. |


#### Example Usage

```java
String deviceId = "deviceId";
String shareId = "shareId";
// Invoking the API call with sample inputs
devicesShares.getSharingForDeviceAsync(deviceId, shareId, new APICallBack<DeviceSharing>() {
    public void onSuccess(HttpContext context, DeviceSharing response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="devices_management_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.DevicesManagementController") DevicesManagementController

### Get singleton instance

The singleton instance of the ``` DevicesManagementController ``` class can be accessed from the API Client.

```java
DevicesManagementController devicesManagement = client.getDevicesManagement();
```

### <a name="get_all_by_did_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getAllByDidAsync") getAllByDidAsync

> Returns the list of tasks for a particular device id with optional status filter.


```java
void getAllByDidAsync(
        final String did,
        final Integer count,
        final Integer offset,
        final String status,
        final String order,
        final String sort,
        final APICallBack<TaskByDidListEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| did |  ``` Required ```  | Device ID. |
| count |  ``` Optional ```  | Max results count. |
| offset |  ``` Optional ```  | Result starting offset. |
| status |  ``` Optional ```  | Status filter. Comma-separated statuses. |
| order |  ``` Optional ```  | Sort results by a field. Valid fields: createdOn. |
| sort |  ``` Optional ```  | Sort order. Valid values: asc or desc. |


#### Example Usage

```java
String did = "did";
Integer count = 212;
Integer offset = 212;
String status = "status";
String order = "order";
String sort = "sort";
// Invoking the API call with sample inputs
devicesManagement.getAllByDidAsync(did, count, offset, status, order, sort, new APICallBack<TaskByDidListEnvelope>() {
    public void onSuccess(HttpContext context, TaskByDidListEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_task_by_id_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getTaskByIDAsync") getTaskByIDAsync

> Returns the details and global status of a specific task id.


```java
void getTaskByIDAsync(
        final String tid,
        final APICallBack<TaskEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tid |  ``` Required ```  | Task ID. |


#### Example Usage

```java
String tid = "tid";
// Invoking the API call with sample inputs
devicesManagement.getTaskByIDAsync(tid, new APICallBack<TaskEnvelope>() {
    public void onSuccess(HttpContext context, TaskEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_tasks_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.createTasksAsync") createTasksAsync

> Create a new task for one or more devices


```java
void createTasksAsync(
        final TaskRequest taskPayload,
        final APICallBack<TaskEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| taskPayload |  ``` Required ```  | Task object to be created |


#### Example Usage

```java
try {
    TaskRequest taskPayload = new TaskRequest();
    // Invoking the API call with sample inputs
    devicesManagement.createTasksAsync(taskPayload, new APICallBack<TaskEnvelope>() {
        public void onSuccess(HttpContext context, TaskEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="delete_server_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.deleteServerPropertiesAsync") deleteServerPropertiesAsync

> Deletes a device's properties.


```java
void deleteServerPropertiesAsync(
        final String did,
        final APICallBack<MetadataEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| did |  ``` Required ```  | Device ID. |


#### Example Usage

```java
String did = "did";
// Invoking the API call with sample inputs
devicesManagement.deleteServerPropertiesAsync(did, new APICallBack<MetadataEnvelope>() {
    public void onSuccess(HttpContext context, MetadataEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_manifest_properties1_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getManifestProperties1Async") getManifestProperties1Async

> Get a device type's device management manifest properties


```java
void getManifestProperties1Async(
        final String dtid,
        final APICallBack<MetadataPropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dtid |  ``` Required ```  | Device Type ID. |


#### Example Usage

```java
String dtid = "dtid";
// Invoking the API call with sample inputs
devicesManagement.getManifestProperties1Async(dtid, new APICallBack<MetadataPropertiesEnvelope>() {
    public void onSuccess(HttpContext context, MetadataPropertiesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_types_info_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getDeviceTypesInfoAsync") getDeviceTypesInfoAsync

> Read a device type device management information.


```java
void getDeviceTypesInfoAsync(
        final String dtid,
        final APICallBack<DeviceTypesInfoEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dtid |  ``` Required ```  | Device type ID. |


#### Example Usage

```java
String dtid = "dtid";
// Invoking the API call with sample inputs
devicesManagement.getDeviceTypesInfoAsync(dtid, new APICallBack<DeviceTypesInfoEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTypesInfoEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_task_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.updateTaskAsync") updateTaskAsync

> Updates a task for all devices - For now just allows changing the state to cancelled.


```java
void updateTaskAsync(
        final String tid,
        final TaskUpdateRequest taskUpdateRequest,
        final APICallBack<TaskUpdateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tid |  ``` Required ```  | Task ID. |
| taskUpdateRequest |  ``` Required ```  | Task update request |


#### Example Usage

```java
try {
    String tid = "tid";
    TaskUpdateRequest taskUpdateRequest = new TaskUpdateRequest();
    // Invoking the API call with sample inputs
    devicesManagement.updateTaskAsync(tid, taskUpdateRequest, new APICallBack<TaskUpdateResponse>() {
        public void onSuccess(HttpContext context, TaskUpdateResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_tasks_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getTasksAsync") getTasksAsync

> Returns the all the tasks for a device type.


```java
void getTasksAsync(
        final String dtid,
        final Integer count,
        final Integer offset,
        final String status,
        final String order,
        final String sort,
        final APICallBack<TaskListEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dtid |  ``` Required ```  | Device Type ID. |
| count |  ``` Optional ```  | Max results count. |
| offset |  ``` Optional ```  | Result starting offset. |
| status |  ``` Optional ```  | Status filter. Comma-separated statuses. |
| order |  ``` Optional ```  | Sort results by a field. Valid fields: createdOn. |
| sort |  ``` Optional ```  | Sort order. Valid values: asc or desc. |


#### Example Usage

```java
String dtid = "dtid";
Integer count = 212;
Integer offset = 212;
String status = "status";
String order = "order";
String sort = "sort";
// Invoking the API call with sample inputs
devicesManagement.getTasksAsync(dtid, count, offset, status, order, sort, new APICallBack<TaskListEnvelope>() {
    public void onSuccess(HttpContext context, TaskListEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_statuses_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getStatusesAsync") getStatusesAsync

> Returns the details and status of a task id and the individual statuses of each device id in the list.


```java
void getStatusesAsync(
        final String tid,
        final Integer count,
        final Integer offset,
        final String status,
        final String dids,
        final APICallBack<TaskStatusesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tid |  ``` Required ```  | Task ID. |
| count |  ``` Optional ```  | Max results count. |
| offset |  ``` Optional ```  | Result starting offset. |
| status |  ``` Optional ```  | Status filter. Comma-separated statuses. |
| dids |  ``` Optional ```  | Devices filter. Comma-separated device IDs. |


#### Example Usage

```java
String tid = "tid";
Integer count = 212;
Integer offset = 212;
String status = "status";
String dids = "dids";
// Invoking the API call with sample inputs
devicesManagement.getStatusesAsync(tid, count, offset, status, dids, new APICallBack<TaskStatusesEnvelope>() {
    public void onSuccess(HttpContext context, TaskStatusesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_task_for_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.updateTaskForDeviceAsync") updateTaskForDeviceAsync

> Updates a task for a specific device - For now just allows changing the state to cancelled.


```java
void updateTaskForDeviceAsync(
        final String tid,
        final String did,
        final DeviceTaskUpdateRequest deviceTaskUpdateRequest,
        final APICallBack<DeviceTaskUpdateResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tid |  ``` Required ```  | Task ID. |
| did |  ``` Required ```  | Device ID. |
| deviceTaskUpdateRequest |  ``` Required ```  | Device task update request |


#### Example Usage

```java
try {
    String tid = "tid";
    String did = "did";
    DeviceTaskUpdateRequest deviceTaskUpdateRequest = new DeviceTaskUpdateRequest();
    // Invoking the API call with sample inputs
    devicesManagement.updateTaskForDeviceAsync(tid, did, deviceTaskUpdateRequest, new APICallBack<DeviceTaskUpdateResponse>() {
        public void onSuccess(HttpContext context, DeviceTaskUpdateResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_statuses_history_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getStatusesHistoryAsync") getStatusesHistoryAsync

> Returns the history of the status changes for a specific task id, or for a specific device id in that task.


```java
void getStatusesHistoryAsync(
        final String tid,
        final String did,
        final APICallBack<TaskStatusesHistoryEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tid |  ``` Required ```  | Task ID. |
| did |  ``` Optional ```  | Device ID. Optional. |


#### Example Usage

```java
String tid = "tid";
String did = "did";
// Invoking the API call with sample inputs
devicesManagement.getStatusesHistoryAsync(tid, did, new APICallBack<TaskStatusesHistoryEnvelope>() {
    public void onSuccess(HttpContext context, TaskStatusesHistoryEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_server_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.updateServerPropertiesAsync") updateServerPropertiesAsync

> Updates a device's server properties.


```java
void updateServerPropertiesAsync(
        final String did,
        final Object deviceProperties,
        final APICallBack<MetadataEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| did |  ``` Required ```  | Device ID. |
| deviceProperties |  ``` Required ```  | Device properties object to be set |


#### Example Usage

```java
try {
    String did = "did";
    Object deviceProperties = new Object();
    // Invoking the API call with sample inputs
    devicesManagement.updateServerPropertiesAsync(did, deviceProperties, new APICallBack<MetadataEnvelope>() {
        public void onSuccess(HttpContext context, MetadataEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_query_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getQueryPropertiesAsync") getQueryPropertiesAsync

> Query device properties across devices.


```java
void getQueryPropertiesAsync(
        final String dtid,
        final Integer count,
        final Integer offset,
        final String filter,
        final Boolean includeTimestamp,
        final APICallBack<MetadataQueryEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dtid |  ``` Required ```  | Device Type ID. |
| count |  ``` Optional ```  | Max results count. |
| offset |  ``` Optional ```  | Result starting offset. |
| filter |  ``` Optional ```  | Query filter. Comma-separated key=value pairs |
| includeTimestamp |  ``` Optional ```  | Include timestamp. |


#### Example Usage

```java
String dtid = "dtid";
Integer count = 212;
Integer offset = 212;
String filter = "filter";
Boolean includeTimestamp = true;
// Invoking the API call with sample inputs
devicesManagement.getQueryPropertiesAsync(dtid, count, offset, filter, includeTimestamp, new APICallBack<MetadataQueryEnvelope>() {
    public void onSuccess(HttpContext context, MetadataQueryEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.getPropertiesAsync") getPropertiesAsync

> Read a device's properties.


```java
void getPropertiesAsync(
        final String did,
        final Boolean includeTimestamp,
        final APICallBack<MetadataEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| did |  ``` Required ```  | Device ID. |
| includeTimestamp |  ``` Optional ```  | Include timestamp. |


#### Example Usage

```java
String did = "did";
Boolean includeTimestamp = true;
// Invoking the API call with sample inputs
devicesManagement.getPropertiesAsync(did, includeTimestamp, new APICallBack<MetadataEnvelope>() {
    public void onSuccess(HttpContext context, MetadataEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_device_types_info_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesManagementController.updateDeviceTypesInfoAsync") updateDeviceTypesInfoAsync

> Updates a device type information


```java
void updateDeviceTypesInfoAsync(
        final String dtid,
        final DeviceTypesInfo deviceTypeInfo,
        final APICallBack<DeviceTypesInfoEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dtid |  ``` Required ```  | Device type ID. |
| deviceTypeInfo |  ``` Required ```  | Device type info object to be set |


#### Example Usage

```java
try {
    String dtid = "dtid";
    DeviceTypesInfo deviceTypeInfo = new DeviceTypesInfo();
    // Invoking the API call with sample inputs
    devicesManagement.updateDeviceTypesInfoAsync(dtid, deviceTypeInfo, new APICallBack<DeviceTypesInfoEnvelope>() {
        public void onSuccess(HttpContext context, DeviceTypesInfoEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="devices_status_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.DevicesStatusController") DevicesStatusController

### Get singleton instance

The singleton instance of the ``` DevicesStatusController ``` class can be accessed from the API Client.

```java
DevicesStatusController devicesStatus = client.getDevicesStatus();
```

### <a name="get_devices_status_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesStatusController.getDevicesStatusAsync") getDevicesStatusAsync

> Get Devices Status


```java
void getDevicesStatusAsync(
        final String dids,
        final Boolean includeSnapshot,
        final Boolean includeSnapshotTimestamp,
        final APICallBack<DeviceStatusBatch> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| dids |  ``` Required ```  | List of device ids (comma-separated) for which the statuses are requested. |
| includeSnapshot |  ``` Optional ```  | Include device snapshot into the response |
| includeSnapshotTimestamp |  ``` Optional ```  | Include device snapshot timestamp into the response |


#### Example Usage

```java
String dids = "dids";
Boolean includeSnapshot = true;
Boolean includeSnapshotTimestamp = true;
// Invoking the API call with sample inputs
devicesStatus.getDevicesStatusAsync(dids, includeSnapshot, includeSnapshotTimestamp, new APICallBack<DeviceStatusBatch>() {
    public void onSuccess(HttpContext context, DeviceStatusBatch response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="put_device_status_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesStatusController.putDeviceStatusAsync") putDeviceStatusAsync

> Update Device Status


```java
void putDeviceStatusAsync(
        final String deviceId,
        final DeviceStatusPut body,
        final APICallBack<DeviceStatus> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| body |  ``` Optional ```  | Body |


#### Example Usage

```java
try {
    String deviceId = "deviceId";
    DeviceStatusPut body = new DeviceStatusPut();
    // Invoking the API call with sample inputs
    devicesStatus.putDeviceStatusAsync(deviceId, body, new APICallBack<DeviceStatus>() {
        public void onSuccess(HttpContext context, DeviceStatus response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_device_status_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesStatusController.getDeviceStatusAsync") getDeviceStatusAsync

> Get Device Status


```java
void getDeviceStatusAsync(
        final String deviceId,
        final Boolean includeSnapshot,
        final Boolean includeSnapshotTimestamp,
        final APICallBack<DeviceStatus> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |
| includeSnapshot |  ``` Optional ```  | Include device snapshot into the response |
| includeSnapshotTimestamp |  ``` Optional ```  | Include device snapshot timestamp into the response |


#### Example Usage

```java
String deviceId = "deviceId";
Boolean includeSnapshot = true;
Boolean includeSnapshotTimestamp = true;
// Invoking the API call with sample inputs
devicesStatus.getDeviceStatusAsync(deviceId, includeSnapshot, includeSnapshotTimestamp, new APICallBack<DeviceStatus>() {
    public void onSuccess(HttpContext context, DeviceStatus response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="registrations_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.RegistrationsController") RegistrationsController

### Get singleton instance

The singleton instance of the ``` RegistrationsController ``` class can be accessed from the API Client.

```java
RegistrationsController registrations = client.getRegistrations();
```

### <a name="delete_unregister_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RegistrationsController.deleteUnregisterDeviceAsync") deleteUnregisterDeviceAsync

> Unregister Device


```java
void deleteUnregisterDeviceAsync(
        final String deviceId,
        final APICallBack<UnregisterDeviceResponseEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
registrations.deleteUnregisterDeviceAsync(deviceId, new APICallBack<UnregisterDeviceResponseEnvelope>() {
    public void onSuccess(HttpContext context, UnregisterDeviceResponseEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_request_status_for_user_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RegistrationsController.getRequestStatusForUserAsync") getRequestStatusForUserAsync

> Get Request Status For User


```java
void getRequestStatusForUserAsync(
        final String requestId,
        final APICallBack<DeviceRegStatusResponseEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| requestId |  ``` Required ```  | Request ID. |


#### Example Usage

```java
String requestId = "requestId";
// Invoking the API call with sample inputs
registrations.getRequestStatusForUserAsync(requestId, new APICallBack<DeviceRegStatusResponseEnvelope>() {
    public void onSuccess(HttpContext context, DeviceRegStatusResponseEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_confirm_user_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RegistrationsController.updateConfirmUserAsync") updateConfirmUserAsync

> Confirm User


```java
void updateConfirmUserAsync(
        final DeviceRegConfirmUserRequest registrationInfo,
        final APICallBack<DeviceRegConfirmUserResponseEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| registrationInfo |  ``` Required ```  | Device Registration information. |


#### Example Usage

```java
try {
    DeviceRegConfirmUserRequest registrationInfo = new DeviceRegConfirmUserRequest();
    // Invoking the API call with sample inputs
    registrations.updateConfirmUserAsync(registrationInfo, new APICallBack<DeviceRegConfirmUserResponseEnvelope>() {
        public void onSuccess(HttpContext context, DeviceRegConfirmUserResponseEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="tokens_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.TokensController") TokensController

### Get singleton instance

The singleton instance of the ``` TokensController ``` class can be accessed from the API Client.

```java
TokensController tokens = client.getTokens();
```

### <a name="get_token_info_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TokensController.getTokenInfoAsync") getTokenInfoAsync

> Token Info


```java
void getTokenInfoAsync(final APICallBack<TokenInfoSuccessResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
tokens.getTokenInfoAsync(new APICallBack<TokenInfoSuccessResponse>() {
    public void onSuccess(HttpContext context, TokenInfoSuccessResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_check_token_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TokensController.createCheckTokenAsync") createCheckTokenAsync

> Check Token


```java
void createCheckTokenAsync(
        final TokenRequest tokenInfo,
        final APICallBack<CheckTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| tokenInfo |  ``` Required ```  | Token object to be checked |


#### Example Usage

```java
try {
    TokenRequest tokenInfo = new TokenRequest();
    // Invoking the API call with sample inputs
    tokens.createCheckTokenAsync(tokenInfo, new APICallBack<CheckTokenResponse>() {
        public void onSuccess(HttpContext context, CheckTokenResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_refresh_token_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TokensController.createRefreshTokenAsync") createRefreshTokenAsync

> Refresh Token


```java
void createRefreshTokenAsync(
        final String grantType,
        final String refreshToken,
        final APICallBack<RefreshTokenResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| grantType |  ``` Required ```  | Grant Type. |
| refreshToken |  ``` Required ```  | Refresh Token. |


#### Example Usage

```java
String grantType = "grant_type";
String refreshToken = "refresh_token";
// Invoking the API call with sample inputs
tokens.createRefreshTokenAsync(grantType, refreshToken, new APICallBack<RefreshTokenResponse>() {
    public void onSuccess(HttpContext context, RefreshTokenResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="messages_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.MessagesController") MessagesController

### Get singleton instance

The singleton instance of the ``` MessagesController ``` class can be accessed from the API Client.

```java
MessagesController messages = client.getMessages();
```

### <a name="get_field_presence_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getFieldPresenceAsync") getFieldPresenceAsync

> Get normalized message presence


```java
void getFieldPresenceAsync(
        final long startDate,
        final long endDate,
        final String interval,
        final String sdid,
        final String fieldPresence,
        final APICallBack<FieldPresenceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| startDate |  ``` Required ```  | startDate |
| endDate |  ``` Required ```  | endDate |
| interval |  ``` Required ```  | String representing grouping interval. One of: 'minute' (1 hour limit), 'hour' (1 day limit), 'day' (31 days limit), 'month' (1 year limit), or 'year' (10 years limit). |
| sdid |  ``` Optional ```  | Source device ID of the messages being searched. |
| fieldPresence |  ``` Optional ```  | String representing a field from the specified device ID. |


#### Example Usage

```java
long startDate = 170;
long endDate = 170;
String interval = "interval";
String sdid = "sdid";
String fieldPresence = "fieldPresence";
// Invoking the API call with sample inputs
messages.getFieldPresenceAsync(startDate, endDate, interval, sdid, fieldPresence, new APICallBack<FieldPresenceEnvelope>() {
    public void onSuccess(HttpContext context, FieldPresenceEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_aggregates_histogram_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getAggregatesHistogramAsync") getAggregatesHistogramAsync

> Get Normalized Message Histogram


```java
void getAggregatesHistogramAsync(
        final long startDate,
        final long endDate,
        final String sdid,
        final String field,
        final String interval,
        final APICallBack<AggregatesHistogramResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| startDate |  ``` Required ```  | Timestamp of earliest message (in milliseconds since epoch). |
| endDate |  ``` Required ```  | Timestamp of latest message (in milliseconds since epoch). |
| sdid |  ``` Optional ```  | Source device ID of the messages being searched. |
| field |  ``` Optional ```  | Message field being queried for building histogram. |
| interval |  ``` Optional ```  | Interval of time for building histogram blocks. (Valid values: minute, hour, day, month, year) |


#### Example Usage

```java
long startDate = 170;
long endDate = 170;
String sdid = "sdid";
String field = "field";
String interval = "interval";
// Invoking the API call with sample inputs
messages.getAggregatesHistogramAsync(startDate, endDate, sdid, field, interval, new APICallBack<AggregatesHistogramResponse>() {
    public void onSuccess(HttpContext context, AggregatesHistogramResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_send_actions_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.createSendActionsAsync") createSendActionsAsync

> Send Actions


```java
void createSendActionsAsync(
        final Actions data,
        final APICallBack<MessageIDEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Actions that are passed in the body |


#### Example Usage

```java
try {
    Actions data = new Actions();
    // Invoking the API call with sample inputs
    messages.createSendActionsAsync(data, new APICallBack<MessageIDEnvelope>() {
        public void onSuccess(HttpContext context, MessageIDEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_send_message_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.createSendMessageAsync") createSendMessageAsync

> Send Message


```java
void createSendMessageAsync(
        final Message data,
        final APICallBack<MessageIDEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| data |  ``` Required ```  | Message object that is passed in the body |


#### Example Usage

```java
try {
    Message data = new Message();
    // Invoking the API call with sample inputs
    messages.createSendMessageAsync(data, new APICallBack<MessageIDEnvelope>() {
        public void onSuccess(HttpContext context, MessageIDEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_message_snapshots_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getMessageSnapshotsAsync") getMessageSnapshotsAsync

> Get Message Snapshots


```java
void getMessageSnapshotsAsync(
        final String sdids,
        final Boolean includeTimestamp,
        final APICallBack<SnapshotResponses> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sdids |  ``` Required ```  | Device IDs for which the snapshots are requested. Max 100 device ids per call. |
| includeTimestamp |  ``` Optional ```  | Indicates whether to return timestamps of the last update for each field. |


#### Example Usage

```java
String sdids = "sdids";
Boolean includeTimestamp = true;
// Invoking the API call with sample inputs
messages.getMessageSnapshotsAsync(sdids, includeTimestamp, new APICallBack<SnapshotResponses>() {
    public void onSuccess(HttpContext context, SnapshotResponses response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_normalized_actions_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getNormalizedActionsAsync") getNormalizedActionsAsync

> Get Normalized Actions


```java
void getNormalizedActionsAsync(
        final String uid,
        final String ddid,
        final String mid,
        final String offset,
        final Integer count,
        final Long startDate,
        final Long endDate,
        final String order,
        final APICallBack<NormalizedActionsEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| uid |  ``` Optional ```  | User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. |
| ddid |  ``` Optional ```  | Destination device ID of the actions being searched. |
| mid |  ``` Optional ```  | The message ID being searched. |
| offset |  ``` Optional ```  | A string that represents the starting item, should be the value of 'next' field received in the last response. (required for pagination) |
| count |  ``` Optional ```  | count |
| startDate |  ``` Optional ```  | startDate |
| endDate |  ``` Optional ```  | endDate |
| order |  ``` Optional ```  | Desired sort order: 'asc' or 'desc' |


#### Example Usage

```java
String uid = "uid";
String ddid = "ddid";
String mid = "mid";
String offset = "offset";
Integer count = 170;
Long startDate = 170;
Long endDate = 170;
String order = "order";
// Invoking the API call with sample inputs
messages.getNormalizedActionsAsync(uid, ddid, mid, offset, count, startDate, endDate, order, new APICallBack<NormalizedActionsEnvelope>() {
    public void onSuccess(HttpContext context, NormalizedActionsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_last_normalized_messages_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getLastNormalizedMessagesAsync") getLastNormalizedMessagesAsync

> Get Last Normalized Message


```java
void getLastNormalizedMessagesAsync(
        final Integer count,
        final String sdids,
        final String fieldPresence,
        final APICallBack<NormalizedMessagesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| count |  ``` Optional ```  | Number of items to return per query. |
| sdids |  ``` Optional ```  | Comma separated list of source device IDs (minimum: 1). |
| fieldPresence |  ``` Optional ```  | String representing a field from the specified device ID. |


#### Example Usage

```java
Integer count = 170;
String sdids = "sdids";
String fieldPresence = "fieldPresence";
// Invoking the API call with sample inputs
messages.getLastNormalizedMessagesAsync(count, sdids, fieldPresence, new APICallBack<NormalizedMessagesEnvelope>() {
    public void onSuccess(HttpContext context, NormalizedMessagesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_normalized_messages_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getNormalizedMessagesAsync") getNormalizedMessagesAsync

> Get Normalized Messages


```java
void getNormalizedMessagesAsync(
        final String uid,
        final String sdid,
        final String mid,
        final String fieldPresence,
        final String filter,
        final String offset,
        final Integer count,
        final Long startDate,
        final Long endDate,
        final String order,
        final APICallBack<NormalizedMessagesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| uid |  ``` Optional ```  | User ID. If not specified, assume that of the current authenticated user. If specified, it must be that of a user for which the current authenticated user has read access to. |
| sdid |  ``` Optional ```  | Source device ID of the messages being searched. |
| mid |  ``` Optional ```  | The message ID being searched. |
| fieldPresence |  ``` Optional ```  | String representing a field from the specified device ID. |
| filter |  ``` Optional ```  | Filter. |
| offset |  ``` Optional ```  | A string that represents the starting item, should be the value of 'next' field received in the last response. (required for pagination) |
| count |  ``` Optional ```  | count |
| startDate |  ``` Optional ```  | startDate |
| endDate |  ``` Optional ```  | endDate |
| order |  ``` Optional ```  | Desired sort order: 'asc' or 'desc' |


#### Example Usage

```java
String uid = "uid";
String sdid = "sdid";
String mid = "mid";
String fieldPresence = "fieldPresence";
String filter = "filter";
String offset = "offset";
Integer count = 170;
Long startDate = 170;
Long endDate = 170;
String order = "order";
// Invoking the API call with sample inputs
messages.getNormalizedMessagesAsync(uid, sdid, mid, fieldPresence, filter, offset, count, startDate, endDate, order, new APICallBack<NormalizedMessagesEnvelope>() {
    public void onSuccess(HttpContext context, NormalizedMessagesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_message_aggregates_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.MessagesController.getMessageAggregatesAsync") getMessageAggregatesAsync

> Get Normalized Message Aggregates


```java
void getMessageAggregatesAsync(
        final String sdid,
        final String field,
        final long startDate,
        final long endDate,
        final APICallBack<AggregatesResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| sdid |  ``` Required ```  | Source device ID of the messages being searched. |
| field |  ``` Required ```  | Message field being queried for aggregates. |
| startDate |  ``` Required ```  | Timestamp of earliest message (in milliseconds since epoch). |
| endDate |  ``` Required ```  | Timestamp of latest message (in milliseconds since epoch). |


#### Example Usage

```java
String sdid = "sdid";
String field = "field";
long startDate = 170;
long endDate = 170;
// Invoking the API call with sample inputs
messages.getMessageAggregatesAsync(sdid, field, startDate, endDate, new APICallBack<AggregatesResponse>() {
    public void onSuccess(HttpContext context, AggregatesResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="rules_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.RulesController") RulesController

### Get singleton instance

The singleton instance of the ``` RulesController ``` class can be accessed from the API Client.

```java
RulesController rules = client.getRules();
```

### <a name="delete_rule_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RulesController.deleteRuleAsync") deleteRuleAsync

> Delete Rule


```java
void deleteRuleAsync(
        final String ruleId,
        final APICallBack<RuleEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ruleId |  ``` Required ```  | Rule ID. |


#### Example Usage

```java
String ruleId = "ruleId";
// Invoking the API call with sample inputs
rules.deleteRuleAsync(ruleId, new APICallBack<RuleEnvelope>() {
    public void onSuccess(HttpContext context, RuleEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_rule_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RulesController.getRuleAsync") getRuleAsync

> Get Rule


```java
void getRuleAsync(
        final String ruleId,
        final APICallBack<RuleEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ruleId |  ``` Required ```  | Rule ID. |


#### Example Usage

```java
String ruleId = "ruleId";
// Invoking the API call with sample inputs
rules.getRuleAsync(ruleId, new APICallBack<RuleEnvelope>() {
    public void onSuccess(HttpContext context, RuleEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_rule_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RulesController.updateRuleAsync") updateRuleAsync

> Update Rule


```java
void updateRuleAsync(
        final String ruleId,
        final RuleUpdateInfo ruleInfo,
        final APICallBack<RuleEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ruleId |  ``` Required ```  | Rule ID. |
| ruleInfo |  ``` Required ```  | Rule object that needs to be updated |


#### Example Usage

```java
try {
    String ruleId = "ruleId";
    RuleUpdateInfo ruleInfo = new RuleUpdateInfo();
    // Invoking the API call with sample inputs
    rules.updateRuleAsync(ruleId, ruleInfo, new APICallBack<RuleEnvelope>() {
        public void onSuccess(HttpContext context, RuleEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="create_rule_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.RulesController.createRuleAsync") createRuleAsync

> Create Rule


```java
void createRuleAsync(
        final RuleCreationInfo ruleInfo,
        final String userId,
        final APICallBack<RuleEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| ruleInfo |  ``` Required ```  | Rule object that needs to be added |
| userId |  ``` Required ```  | User ID |


#### Example Usage

```java
try {
    RuleCreationInfo ruleInfo = new RuleCreationInfo();
    String userId = "userId";
    // Invoking the API call with sample inputs
    rules.createRuleAsync(ruleInfo, userId, new APICallBack<RuleEnvelope>() {
        public void onSuccess(HttpContext context, RuleEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="export_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.ExportController") ExportController

### Get singleton instance

The singleton instance of the ``` ExportController ``` class can be accessed from the API Client.

```java
ExportController export = client.getExport();
```

### <a name="get_export_status_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.ExportController.getExportStatusAsync") getExportStatusAsync

> Check Export Status


```java
void getExportStatusAsync(
        final String exportId,
        final APICallBack<ExportStatusResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exportId |  ``` Required ```  | Export ID of the export query. |


#### Example Usage

```java
String exportId = "exportId";
// Invoking the API call with sample inputs
export.getExportStatusAsync(exportId, new APICallBack<ExportStatusResponse>() {
    public void onSuccess(HttpContext context, ExportStatusResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_export_result_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.ExportController.getExportResultAsync") getExportResultAsync

> Get Export Result


```java
void getExportResultAsync(
        final String exportId,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exportId |  ``` Required ```  | Export ID of the export query. |


#### Example Usage

```java
String exportId = "exportId";
// Invoking the API call with sample inputs
export.getExportResultAsync(exportId, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_export_request_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.ExportController.createExportRequestAsync") createExportRequestAsync

> Create Export Request


```java
void createExportRequestAsync(
        final ExportRequestInfo exportRequestInfo,
        final APICallBack<ExportRequestResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| exportRequestInfo |  ``` Required ```  | ExportRequest object that is passed in the body |


#### Example Usage

```java
try {
    ExportRequestInfo exportRequestInfo = new ExportRequestInfo();
    // Invoking the API call with sample inputs
    export.createExportRequestAsync(exportRequestInfo, new APICallBack<ExportRequestResponse>() {
        public void onSuccess(HttpContext context, ExportRequestResponse response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_export_history_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.ExportController.getExportHistoryAsync") getExportHistoryAsync

> Get Export History


```java
void getExportHistoryAsync(
        final String trialId,
        final Integer count,
        final Integer offset,
        final APICallBack<ExportHistoryResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| trialId |  ``` Optional ```  | Filter by trialId. |
| count |  ``` Optional ```  | Pagination count. |
| offset |  ``` Optional ```  | Pagination offset. |


#### Example Usage

```java
String trialId = "trialId";
Integer count = 170;
Integer offset = 170;
// Invoking the API call with sample inputs
export.getExportHistoryAsync(trialId, count, offset, new APICallBack<ExportHistoryResponse>() {
    public void onSuccess(HttpContext context, ExportHistoryResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="tags_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.TagsController") TagsController

### Get singleton instance

The singleton instance of the ``` TagsController ``` class can be accessed from the API Client.

```java
TagsController tags = client.getTags();
```

### <a name="get_tag_categories_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TagsController.getTagCategoriesAsync") getTagCategoriesAsync

> Get all categories


```java
void getTagCategoriesAsync(final APICallBack<TagsEnvelope> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
tags.getTagCategoriesAsync(new APICallBack<TagsEnvelope>() {
    public void onSuccess(HttpContext context, TagsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_tags_by_categories_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TagsController.getTagsByCategoriesAsync") getTagsByCategoriesAsync

> Get all tags of categories


```java
void getTagsByCategoriesAsync(
        final String categories,
        final APICallBack<TagsEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| categories |  ``` Optional ```  | Comma separated list of categories. |


#### Example Usage

```java
String categories = "categories";
// Invoking the API call with sample inputs
tags.getTagsByCategoriesAsync(categories, new APICallBack<TagsEnvelope>() {
    public void onSuccess(HttpContext context, TagsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_tag_suggestions_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.TagsController.getTagSuggestionsAsync") getTagSuggestionsAsync

> Get tag suggestions


```java
void getTagSuggestionsAsync(
        final EntityTypeEnum entityType,
        final String tags,
        final String name,
        final Integer count,
        final APICallBack<TagsEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| entityType |  ``` Optional ```  | Entity type name. |
| tags |  ``` Optional ```  | Comma separated list of tags. |
| name |  ``` Optional ```  | Name of tags used for type ahead. |
| count |  ``` Optional ```  | Number of results to return. Max 10. |


#### Example Usage

```java
EntityTypeEnum entityType = EntityTypeEnum.fromString("TAG");
String tags = "tags";
String name = "name";
Integer count = 170;
// Invoking the API call with sample inputs
tags.getTagSuggestionsAsync(entityType, tags, name, count, new APICallBack<TagsEnvelope>() {
    public void onSuccess(HttpContext context, TagsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="device_types_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.DeviceTypesController") DeviceTypesController

### Get singleton instance

The singleton instance of the ``` DeviceTypesController ``` class can be accessed from the API Client.

```java
DeviceTypesController deviceTypes = client.getDeviceTypes();
```

### <a name="get_latest_manifest_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getLatestManifestPropertiesAsync") getLatestManifestPropertiesAsync

> Get Latest Manifest Properties


```java
void getLatestManifestPropertiesAsync(
        final String deviceTypeId,
        final APICallBack<ManifestPropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceTypeId |  ``` Required ```  | Device Type ID. |


#### Example Usage

```java
String deviceTypeId = "deviceTypeId";
// Invoking the API call with sample inputs
deviceTypes.getLatestManifestPropertiesAsync(deviceTypeId, new APICallBack<ManifestPropertiesEnvelope>() {
    public void onSuccess(HttpContext context, ManifestPropertiesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_available_manifest_versions_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getAvailableManifestVersionsAsync") getAvailableManifestVersionsAsync

> Get Available Manifest Versions


```java
void getAvailableManifestVersionsAsync(
        final String deviceTypeId,
        final APICallBack<ManifestVersionsEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceTypeId |  ``` Required ```  | deviceTypeId |


#### Example Usage

```java
String deviceTypeId = "deviceTypeId";
// Invoking the API call with sample inputs
deviceTypes.getAvailableManifestVersionsAsync(deviceTypeId, new APICallBack<ManifestVersionsEnvelope>() {
    public void onSuccess(HttpContext context, ManifestVersionsEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_type_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getDeviceTypeAsync") getDeviceTypeAsync

> Get Device Type


```java
void getDeviceTypeAsync(
        final String deviceTypeId,
        final APICallBack<DeviceTypeEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceTypeId |  ``` Required ```  | deviceTypeId |


#### Example Usage

```java
String deviceTypeId = "deviceTypeId";
// Invoking the API call with sample inputs
deviceTypes.getDeviceTypeAsync(deviceTypeId, new APICallBack<DeviceTypeEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTypeEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_types_by_application_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getDeviceTypesByApplicationAsync") getDeviceTypesByApplicationAsync

> Get Device Types by Application


```java
void getDeviceTypesByApplicationAsync(
        final String appId,
        final Boolean productInfo,
        final Integer count,
        final Integer offset,
        final APICallBack<DeviceTypesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| appId |  ``` Required ```  | Application ID. |
| productInfo |  ``` Optional ```  | Flag to include the associated ProductInfo if present |
| count |  ``` Optional ```  | Desired count of items in the result set. |
| offset |  ``` Optional ```  | Offset for pagination. |


#### Example Usage

```java
String appId = "appId";
Boolean productInfo = true;
Integer count = 170;
Integer offset = 170;
// Invoking the API call with sample inputs
deviceTypes.getDeviceTypesByApplicationAsync(appId, productInfo, count, offset, new APICallBack<DeviceTypesEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTypesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_manifest_properties2_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getManifestProperties2Async") getManifestProperties2Async

> Get manifest properties


```java
void getManifestProperties2Async(
        final String deviceTypeId,
        final String version,
        final APICallBack<ManifestPropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceTypeId |  ``` Required ```  | Device Type ID. |
| version |  ``` Required ```  | Manifest Version. |


#### Example Usage

```java
String deviceTypeId = "deviceTypeId";
String version = "version";
// Invoking the API call with sample inputs
deviceTypes.getManifestProperties2Async(deviceTypeId, version, new APICallBack<ManifestPropertiesEnvelope>() {
    public void onSuccess(HttpContext context, ManifestPropertiesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_types_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DeviceTypesController.getDeviceTypesAsync") getDeviceTypesAsync

> Get Device Types


```java
void getDeviceTypesAsync(
        final String name,
        final Integer offset,
        final Integer count,
        final String tags,
        final APICallBack<DeviceTypesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Device Type name |
| offset |  ``` Optional ```  | Offset for pagination. |
| count |  ``` Optional ```  | Desired count of items in the result set |
| tags |  ``` Optional ```  | Elements tagged with the list of tags. (comma separated) |


#### Example Usage

```java
String name = "name";
Integer offset = 170;
Integer count = 170;
String tags = "tags";
// Invoking the API call with sample inputs
deviceTypes.getDeviceTypesAsync(name, offset, count, tags, new APICallBack<DeviceTypesEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTypesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="devices_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.DevicesController") DevicesController

### Get singleton instance

The singleton instance of the ``` DevicesController ``` class can be accessed from the API Client.

```java
DevicesController devices = client.getDevices();
```

### <a name="get_device_presence_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.getDevicePresenceAsync") getDevicePresenceAsync

> Get device presence information


```java
void getDevicePresenceAsync(
        final String deviceId,
        final APICallBack<PresenceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | Device ID. |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.getDevicePresenceAsync(deviceId, new APICallBack<PresenceEnvelope>() {
    public void onSuccess(HttpContext context, PresenceEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_device_token_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.deleteDeviceTokenAsync") deleteDeviceTokenAsync

> Delete Device Token


```java
void deleteDeviceTokenAsync(
        final String deviceId,
        final APICallBack<DeviceTokenEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.deleteDeviceTokenAsync(deviceId, new APICallBack<DeviceTokenEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTokenEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_device_token_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.updateDeviceTokenAsync") updateDeviceTokenAsync

> Update Device Token


```java
void updateDeviceTokenAsync(
        final String deviceId,
        final APICallBack<DeviceTokenEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.updateDeviceTokenAsync(deviceId, new APICallBack<DeviceTokenEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTokenEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_token_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.getDeviceTokenAsync") getDeviceTokenAsync

> Get Device Token


```java
void getDeviceTokenAsync(
        final String deviceId,
        final APICallBack<DeviceTokenEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.getDeviceTokenAsync(deviceId, new APICallBack<DeviceTokenEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTokenEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.deleteDeviceAsync") deleteDeviceAsync

> Delete Device


```java
void deleteDeviceAsync(
        final String deviceId,
        final APICallBack<DeviceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.deleteDeviceAsync(deviceId, new APICallBack<DeviceEnvelope>() {
    public void onSuccess(HttpContext context, DeviceEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.getDeviceAsync") getDeviceAsync

> Get Device


```java
void getDeviceAsync(
        final String deviceId,
        final APICallBack<DeviceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |


#### Example Usage

```java
String deviceId = "deviceId";
// Invoking the API call with sample inputs
devices.getDeviceAsync(deviceId, new APICallBack<DeviceEnvelope>() {
    public void onSuccess(HttpContext context, DeviceEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="add_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.addDeviceAsync") addDeviceAsync

> Add Device


```java
void addDeviceAsync(
        final Device device,
        final APICallBack<DeviceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| device |  ``` Required ```  | Device to be added to the user |


#### Example Usage

```java
try {
    Device device = new Device();
    // Invoking the API call with sample inputs
    devices.addDeviceAsync(device, new APICallBack<DeviceEnvelope>() {
        public void onSuccess(HttpContext context, DeviceEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_device_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.DevicesController.updateDeviceAsync") updateDeviceAsync

> Update Device


```java
void updateDeviceAsync(
        final String deviceId,
        final Device device,
        final APICallBack<DeviceEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| deviceId |  ``` Required ```  | deviceId |
| device |  ``` Required ```  | Device to be updated |


#### Example Usage

```java
try {
    String deviceId = "deviceId";
    Device device = new Device();
    // Invoking the API call with sample inputs
    devices.updateDeviceAsync(deviceId, device, new APICallBack<DeviceEnvelope>() {
        public void onSuccess(HttpContext context, DeviceEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


[Back to List of Controllers](#list_of_controllers)

## <a name="users_controller"></a>![Class: ](https://apidocs.io/img/class.png "cloud.artik.api.controllers.UsersController") UsersController

### Get singleton instance

The singleton instance of the ``` UsersController ``` class can be accessed from the API Client.

```java
UsersController users = client.getUsers();
```

### <a name="get_user_devices_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.getUserDevicesAsync") getUserDevicesAsync

> Get User Devices


```java
void getUserDevicesAsync(
        final String userId,
        final Integer offset,
        final Integer count,
        final Boolean includeProperties,
        final OwnerEnum owner,
        final Boolean includeShareInfo,
        final APICallBack<DevicesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User ID |
| offset |  ``` Optional ```  | Offset for pagination. |
| count |  ``` Optional ```  | Desired count of items in the result set |
| includeProperties |  ``` Optional ```  | Optional. Boolean (true/false) - If false, only return the user's device types. If true, also return device types shared by other users. |
| owner |  ``` Optional ```  | Return owned and/or shared devices. Default to ALL. |
| includeShareInfo |  ``` Optional ```  | Include share info |


#### Example Usage

```java
String userId = "userId";
Integer offset = 170;
Integer count = 170;
Boolean includeProperties = true;
OwnerEnum owner = OwnerEnum.fromString("ALL");
Boolean includeShareInfo = true;
// Invoking the API call with sample inputs
users.getUserDevicesAsync(userId, offset, count, includeProperties, owner, includeShareInfo, new APICallBack<DevicesEnvelope>() {
    public void onSuccess(HttpContext context, DevicesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_self_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.getSelfAsync") getSelfAsync

> Get Current User Profile


```java
void getSelfAsync(final APICallBack<UserEnvelope> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
users.getSelfAsync(new APICallBack<UserEnvelope>() {
    public void onSuccess(HttpContext context, UserEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="list_all_shares_for_user_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.listAllSharesForUserAsync") listAllSharesForUserAsync

> Get User shares


```java
void listAllSharesForUserAsync(
        final String userId,
        final String filter,
        final Integer count,
        final Integer offset,
        final APICallBack<DeviceSharingEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User ID. |
| filter |  ``` Required ```  | filter |
| count |  ``` Optional ```  | Desired count of items in the result set. |
| offset |  ``` Optional ```  | Offset for pagination. |


#### Example Usage

```java
String userId = "userId";
String filter = "filter";
Integer count = 7;
Integer offset = 7;
// Invoking the API call with sample inputs
users.listAllSharesForUserAsync(userId, filter, count, offset, new APICallBack<DeviceSharingEnvelope>() {
    public void onSuccess(HttpContext context, DeviceSharingEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_user_rules_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.getUserRulesAsync") getUserRulesAsync

> Get User Rules


```java
void getUserRulesAsync(
        final String userId,
        final Boolean excludeDisabled,
        final Integer count,
        final Integer offset,
        final Owner142Enum owner,
        final APICallBack<RulesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User ID. |
| excludeDisabled |  ``` Optional ```  | Exclude disabled rules in the result. |
| count |  ``` Optional ```  | Desired count of items in the result set. |
| offset |  ``` Optional ```  | Offset for pagination. |
| owner |  ``` Optional ```  | Rule owner |


#### Example Usage

```java
String userId = "userId";
Boolean excludeDisabled = false;
Integer count = 7;
Integer offset = 7;
Owner142Enum owner = Owner142Enum.fromString("user");
// Invoking the API call with sample inputs
users.getUserRulesAsync(userId, excludeDisabled, count, offset, owner, new APICallBack<RulesEnvelope>() {
    public void onSuccess(HttpContext context, RulesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_user_device_types_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.getUserDeviceTypesAsync") getUserDeviceTypesAsync

> Get User Device Types


```java
void getUserDeviceTypesAsync(
        final String userId,
        final Integer offset,
        final Integer count,
        final Boolean includeShared,
        final APICallBack<DeviceTypesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User ID. |
| offset |  ``` Optional ```  | Offset for pagination. |
| count |  ``` Optional ```  | Desired count of items in the result set |
| includeShared |  ``` Optional ```  | Optional. Boolean (true/false) - If false, only return the user's device types. If true, also return device types shared by other users. |


#### Example Usage

```java
String userId = "userId";
Integer offset = 7;
Integer count = 7;
Boolean includeShared = false;
// Invoking the API call with sample inputs
users.getUserDeviceTypesAsync(userId, offset, count, includeShared, new APICallBack<DeviceTypesEnvelope>() {
    public void onSuccess(HttpContext context, DeviceTypesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_user_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.deleteUserPropertiesAsync") deleteUserPropertiesAsync

> Delete User Application Properties


```java
void deleteUserPropertiesAsync(
        final String userId,
        final String aid,
        final APICallBack<PropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User Id |
| aid |  ``` Optional ```  | Application ID |


#### Example Usage

```java
String userId = "userId";
String aid = "aid";
// Invoking the API call with sample inputs
users.deleteUserPropertiesAsync(userId, aid, new APICallBack<PropertiesEnvelope>() {
    public void onSuccess(HttpContext context, PropertiesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_user_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.createUserPropertiesAsync") createUserPropertiesAsync

> Create User Application Properties


```java
void createUserPropertiesAsync(
        final String userId,
        final AppProperties properties,
        final String aid,
        final APICallBack<PropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User Id |
| properties |  ``` Required ```  | Properties to be updated |
| aid |  ``` Optional ```  | Application ID |


#### Example Usage

```java
try {
    String userId = "userId";
    AppProperties properties = new AppProperties();
    String aid = "aid";
    // Invoking the API call with sample inputs
    users.createUserPropertiesAsync(userId, properties, aid, new APICallBack<PropertiesEnvelope>() {
        public void onSuccess(HttpContext context, PropertiesEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="update_user_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.updateUserPropertiesAsync") updateUserPropertiesAsync

> Update User Application Properties


```java
void updateUserPropertiesAsync(
        final String userId,
        final AppProperties properties,
        final String aid,
        final APICallBack<PropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User Id |
| properties |  ``` Required ```  | Properties to be updated |
| aid |  ``` Optional ```  | Application ID |


#### Example Usage

```java
try {
    String userId = "userId";
    AppProperties properties = new AppProperties();
    String aid = "aid";
    // Invoking the API call with sample inputs
    users.updateUserPropertiesAsync(userId, properties, aid, new APICallBack<PropertiesEnvelope>() {
        public void onSuccess(HttpContext context, PropertiesEnvelope response) {
            // TODO success callback handler
        }
        public void onFailure(HttpContext context, Throwable error) {
            // TODO failure callback handler
        }
    });
} catch(JsonProcessingException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
```


### <a name="get_user_properties_async"></a>![Method: ](https://apidocs.io/img/method.png "cloud.artik.api.controllers.UsersController.getUserPropertiesAsync") getUserPropertiesAsync

> Get User application properties


```java
void getUserPropertiesAsync(
        final String userId,
        final String aid,
        final APICallBack<PropertiesEnvelope> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| userId |  ``` Required ```  | User Id |
| aid |  ``` Optional ```  | Application ID |


#### Example Usage

```java
String userId = "userId";
String aid = "aid";
// Invoking the API call with sample inputs
users.getUserPropertiesAsync(userId, aid, new APICallBack<PropertiesEnvelope>() {
    public void onSuccess(HttpContext context, PropertiesEnvelope response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



