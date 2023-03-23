# TagApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrModifyManualTags**](TagApi.md#addOrModifyManualTags) | **POST** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags | 添加或者修改某个用户身上的人工标签
[**deleteManualTagsInUser**](TagApi.md#deleteManualTagsInUser) | **DELETE** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags/{baseId} | 删除某个用户身上的人工标签
[**getManualTagsList**](TagApi.md#getManualTagsList) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags | 查询某个用户身上的人工标签列表
[**getTagValues**](TagApi.md#getTagValues) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/meta/tags/{tagId}/values | 获取某个标签的取值
[**getTagsList**](TagApi.md#getTagsList) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/tags | 获取所有标签列表，包含各个标签的取值

<a name="addOrModifyManualTags"></a>
# **addOrModifyManualTags**
> ByteDanceNormalResponseString addOrModifyManualTags(body, tenantCode)

添加或者修改某个用户身上的人工标签

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.TagApi;


TagApi apiInstance = new TagApi();
ManualPersonTagRequest body = new ManualPersonTagRequest(); // ManualPersonTagRequest | 
String tenantCode = "tenantCode_example"; // String | 租户Code
try {
    ByteDanceNormalResponseString result = apiInstance.addOrModifyManualTags(body, tenantCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#addOrModifyManualTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ManualPersonTagRequest**](ManualPersonTagRequest.md)|  |
 **tenantCode** | **String**| 租户Code |

### Return type

[**ByteDanceNormalResponseString**](ByteDanceNormalResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="deleteManualTagsInUser"></a>
# **deleteManualTagsInUser**
> ByteDanceNormalResponseString deleteManualTagsInUser(tenantCode, baseId, tagId)

删除某个用户身上的人工标签

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.TagApi;


TagApi apiInstance = new TagApi();
String tenantCode = "tenantCode_example"; // String | 租户Code
Long baseId = 789L; // Long | 基准ID
Integer tagId = 56; // Integer | 人工标签ID
try {
    ByteDanceNormalResponseString result = apiInstance.deleteManualTagsInUser(tenantCode, baseId, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#deleteManualTagsInUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantCode** | **String**| 租户Code |
 **baseId** | **Long**| 基准ID |
 **tagId** | **Integer**| 人工标签ID |

### Return type

[**ByteDanceNormalResponseString**](ByteDanceNormalResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getManualTagsList"></a>
# **getManualTagsList**
> ByteDanceSeqResponseOpenApiManualTagInfo getManualTagsList(tenantCode)

查询某个用户身上的人工标签列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.TagApi;


TagApi apiInstance = new TagApi();
String tenantCode = "tenantCode_example"; // String | 租户Code
try {
    ByteDanceSeqResponseOpenApiManualTagInfo result = apiInstance.getManualTagsList(tenantCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getManualTagsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantCode** | **String**| 租户Code |

### Return type

[**ByteDanceSeqResponseOpenApiManualTagInfo**](ByteDanceSeqResponseOpenApiManualTagInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getTagValues"></a>
# **getTagValues**
> ByteDanceSeqResponseTagValueResp getTagValues(tenantCode, tagId)

获取某个标签的取值

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.TagApi;


TagApi apiInstance = new TagApi();
String tenantCode = "tenantCode_example"; // String | 租户Code
Integer tagId = 56; // Integer | 标签id
try {
    ByteDanceSeqResponseTagValueResp result = apiInstance.getTagValues(tenantCode, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTagValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantCode** | **String**| 租户Code |
 **tagId** | **Integer**| 标签id |

### Return type

[**ByteDanceSeqResponseTagValueResp**](ByteDanceSeqResponseTagValueResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getTagsList"></a>
# **getTagsList**
> ByteDanceSeqResponseSeqDomainGroupedTags getTagsList(tenantCode, idType, discardValue)

获取所有标签列表，包含各个标签的取值

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.TagApi;


TagApi apiInstance = new TagApi();
String tenantCode = "tenantCode_example"; // String | 租户Code
Integer idType = 56; // Integer | 标签的idType，传每个主题下的base_id类型的ID
Boolean discardValue = true; // Boolean | 是否移除标签取值势力。默认是false
try {
    ByteDanceSeqResponseSeqDomainGroupedTags result = apiInstance.getTagsList(tenantCode, idType, discardValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTagsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantCode** | **String**| 租户Code |
 **idType** | **Integer**| 标签的idType，传每个主题下的base_id类型的ID | [optional]
 **discardValue** | **Boolean**| 是否移除标签取值势力。默认是false | [optional]

### Return type

[**ByteDanceSeqResponseSeqDomainGroupedTags**](ByteDanceSeqResponseSeqDomainGroupedTags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

