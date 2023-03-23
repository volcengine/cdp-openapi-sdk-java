# RealtimeRuleApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealtimeRuleList**](RealtimeRuleApi.md#getRealtimeRuleList) | **GET** /profile_platform/api/v2/onlineSource/openapi/tenants/{tenantsCode}/realtimeRule | 获取实时规则列表

<a name="getRealtimeRuleList"></a>
# **getRealtimeRuleList**
> RealtimeRuleListResp getRealtimeRuleList(tenantsCode, page, pageSize)

获取实时规则列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.RealtimeRuleApi;


RealtimeRuleApi apiInstance = new RealtimeRuleApi();
String tenantsCode = "tenantsCode_example"; // String | 租户ID
Integer page = 56; // Integer | 当前页
Integer pageSize = 56; // Integer | 分页大小
try {
    RealtimeRuleListResp result = apiInstance.getRealtimeRuleList(tenantsCode, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RealtimeRuleApi#getRealtimeRuleList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantsCode** | **String**| 租户ID |
 **page** | **Integer**| 当前页 |
 **pageSize** | **Integer**| 分页大小 |

### Return type

[**RealtimeRuleListResp**](RealtimeRuleListResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

