# IdTypeApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listIdTypeMetaByTenant**](IdTypeApi.md#listIdTypeMetaByTenant) | **GET** /profile_platform/api/v2/openapi/cdp/idTypes | 获取idType元信息

<a name="listIdTypeMetaByTenant"></a>
# **listIdTypeMetaByTenant**
> ByteDanceNormalResponseIdTypeResp listIdTypeMetaByTenant(xTenant)

获取idType元信息

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.IdTypeApi;


IdTypeApi apiInstance = new IdTypeApi();
String xTenant = "xTenant_example"; // String | tenantCode
try {
    ByteDanceNormalResponseIdTypeResp result = apiInstance.listIdTypeMetaByTenant(xTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdTypeApi#listIdTypeMetaByTenant");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **String**| tenantCode |

### Return type

[**ByteDanceNormalResponseIdTypeResp**](ByteDanceNormalResponseIdTypeResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

