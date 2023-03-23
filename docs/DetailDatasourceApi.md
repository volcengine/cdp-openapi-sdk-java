# DetailDatasourceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailAttributes**](DetailDatasourceApi.md#getDetailAttributes) | **POST** /profile_platform/api/v2/detailAttributes/tenant/{tenantCode}/attributeId/{attributeId}/value | 获取明细数据源的枚举值

<a name="getDetailAttributes"></a>
# **getDetailAttributes**
> DetailAttributesResp getDetailAttributes(body, tenantCode, attributeId, keyword, current, pageSize)

获取明细数据源的枚举值

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DetailDatasourceApi;


DetailDatasourceApi apiInstance = new DetailDatasourceApi();
DetailAttributesReq body = new DetailAttributesReq(); // DetailAttributesReq | 
String tenantCode = "tenantCode_example"; // String | 租户ID
String attributeId = "attributeId_example"; // String | 要查枚举值的字段id
String keyword = "keyword_example"; // String | 查询关键字
Integer current = 56; // Integer | 当前页
Integer pageSize = 56; // Integer | 分页大小
try {
    DetailAttributesResp result = apiInstance.getDetailAttributes(body, tenantCode, attributeId, keyword, current, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DetailDatasourceApi#getDetailAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DetailAttributesReq**](DetailAttributesReq.md)|  |
 **tenantCode** | **String**| 租户ID |
 **attributeId** | **String**| 要查枚举值的字段id |
 **keyword** | **String**| 查询关键字 | [optional]
 **current** | **Integer**| 当前页 | [optional]
 **pageSize** | **Integer**| 分页大小 | [optional]

### Return type

[**DetailAttributesResp**](DetailAttributesResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

