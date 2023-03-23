# SubjectApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSubjectIdTypes**](SubjectApi.md#getSubjectIdTypes) | **GET** /profile_platform/openApi/v2/cdpMeta/mapping/getSubjectIdTypes | 查询实体列表
[**getSubjects**](SubjectApi.md#getSubjects) | **GET** /profile_platform/openApi/v2/cdpMeta/mapping/getSubjects | 查询主体列表

<a name="getSubjectIdTypes"></a>
# **getSubjectIdTypes**
> ListIdType getSubjectIdTypes(subjectId)

查询实体列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SubjectApi;


SubjectApi apiInstance = new SubjectApi();
Integer subjectId = 56; // Integer | 
try {
    ListIdType result = apiInstance.getSubjectIdTypes(subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectApi#getSubjectIdTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subjectId** | **Integer**|  |

### Return type

[**ListIdType**](ListIdType.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getSubjects"></a>
# **getSubjects**
> ListSubjectMeta getSubjects(xTenant, orgId)

查询主体列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SubjectApi;


SubjectApi apiInstance = new SubjectApi();
Long xTenant = 789L; // Long | 
Long orgId = 789L; // Long | 
try {
    ListSubjectMeta result = apiInstance.getSubjects(xTenant, orgId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubjectApi#getSubjects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**|  |
 **orgId** | **Long**|  | [optional]

### Return type

[**ListSubjectMeta**](ListSubjectMeta.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

