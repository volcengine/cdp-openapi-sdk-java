# FileDateAssetApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFileDateAsset**](FileDateAssetApi.md#downloadFileDateAsset) | **GET** /profile_platform/api/v2/open/platform/file_data_asset/download/task/{taskId} | 下载分群明细
[**getFileDateAssetTaskList**](FileDateAssetApi.md#getFileDateAssetTaskList) | **GET** /profile_platform/api/v2/open/platform/file_data_asset/tasklist | 获取分群明细任务列表

<a name="downloadFileDateAsset"></a>
# **downloadFileDateAsset**
> File downloadFileDateAsset(xTenant, taskId, segId, file)

下载分群明细

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.FileDateAssetApi;


FileDateAssetApi apiInstance = new FileDateAssetApi();
String xTenant = "xTenant_example"; // String | 
Integer taskId = 56; // Integer | 
Integer segId = 56; // Integer | 
String file = "file_example"; // String | 
try {
    File result = apiInstance.downloadFileDateAsset(xTenant, taskId, segId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileDateAssetApi#downloadFileDateAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **String**|  |
 **taskId** | **Integer**|  |
 **segId** | **Integer**|  |
 **file** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getFileDateAssetTaskList"></a>
# **getFileDateAssetTaskList**
> SeqFileDataTaskSimpleResult getFileDateAssetTaskList(xTenant)

获取分群明细任务列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.FileDateAssetApi;


FileDateAssetApi apiInstance = new FileDateAssetApi();
String xTenant = "xTenant_example"; // String | 
try {
    SeqFileDataTaskSimpleResult result = apiInstance.getFileDateAssetTaskList(xTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileDateAssetApi#getFileDateAssetTaskList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **String**|  |

### Return type

[**SeqFileDataTaskSimpleResult**](SeqFileDataTaskSimpleResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

