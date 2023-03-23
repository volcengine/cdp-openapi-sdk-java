# LabelApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLabelDesc**](LabelApi.md#getLabelDesc) | **GET** /profile_platform/openApi/v2/cdpMeta/labelSystem/label/info/{id} | 获取标签精简信息
[**getLabelTree**](LabelApi.md#getLabelTree) | **GET** /profile_platform/openApi/v2/cdpMeta/labelSystem/labelTreeNode | 获取标签树信息
[**getOnlineTagsProp**](LabelApi.md#getOnlineTagsProp) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/onlineTags/{infoType} | 获取在线可用标签/属性列表

<a name="getLabelDesc"></a>
# **getLabelDesc**
> CommonResponseLabelMetaSimpleInfo getLabelDesc(id, xTenant)

获取标签精简信息

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.LabelApi;


LabelApi apiInstance = new LabelApi();
Integer id = 56; // Integer | 标签ID
Long xTenant = 789L; // Long | 租户ID
try {
    CommonResponseLabelMetaSimpleInfo result = apiInstance.getLabelDesc(id, xTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#getLabelDesc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 标签ID |
 **xTenant** | **Long**| 租户ID |

### Return type

[**CommonResponseLabelMetaSimpleInfo**](CommonResponseLabelMetaSimpleInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getLabelTree"></a>
# **getLabelTree**
> CommonResponseListLabelTreeNode getLabelTree(xTenant, subjectId)

获取标签树信息

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.LabelApi;


LabelApi apiInstance = new LabelApi();
Long xTenant = 789L; // Long | 租户ID
Integer subjectId = 56; // Integer | 主体ID
try {
    CommonResponseListLabelTreeNode result = apiInstance.getLabelTree(xTenant, subjectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#getLabelTree");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**| 租户ID |
 **subjectId** | **Integer**| 主体ID | [optional]

### Return type

[**CommonResponseListLabelTreeNode**](CommonResponseListLabelTreeNode.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getOnlineTagsProp"></a>
# **getOnlineTagsProp**
> CommonOnlineTagInfoResp getOnlineTagsProp(tenantCode, infoType, current, pageSize, idType)

获取在线可用标签/属性列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.LabelApi;


LabelApi apiInstance = new LabelApi();
String tenantCode = "tenantCode_example"; // String | 租户ID
String infoType = "infoType_example"; // String | 查询类型两个取值：label或property
Integer current = 56; // Integer | 当前页
Integer pageSize = 56; // Integer | 分页大小
Integer idType = 56; // Integer | id类型
try {
    CommonOnlineTagInfoResp result = apiInstance.getOnlineTagsProp(tenantCode, infoType, current, pageSize, idType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelApi#getOnlineTagsProp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantCode** | **String**| 租户ID |
 **infoType** | **String**| 查询类型两个取值：label或property |
 **current** | **Integer**| 当前页 | [optional]
 **pageSize** | **Integer**| 分页大小 | [optional]
 **idType** | **Integer**| id类型 | [optional]

### Return type

[**CommonOnlineTagInfoResp**](CommonOnlineTagInfoResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

