# OnlineApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkHitRealtimeRule**](OnlineApi.md#checkHitRealtimeRule) | **POST** /online/api/v1/projects/{tenantCode}/users/realtimeRule | 判断是否命中实时规则,高速接口
[**getIdMapping**](OnlineApi.md#getIdMapping) | **POST** /openapi/online/v1/mapping/online/sync | idmapping映射,高速接口
[**getUserProfileWithPrivacy**](OnlineApi.md#getUserProfileWithPrivacy) | **POST** /openapi/online/v2/user/profiles | 查询标签和属性
[**queryUserSeg**](OnlineApi.md#queryUserSeg) | **GET** /openapi/online/v1/user/{id}/segs | 查询用户是否命中人群,高速接口

<a name="checkHitRealtimeRule"></a>
# **checkHitRealtimeRule**
> CheckRealtimeRuleResponse checkHitRealtimeRule(body, tenantCode)

判断是否命中实时规则,高速接口

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.OnlineApi;


OnlineApi apiInstance = new OnlineApi();
CheckRealtimeRuleRequest body = new CheckRealtimeRuleRequest(); // CheckRealtimeRuleRequest | 
String tenantCode = "tenantCode_example"; // String | 租户code
try {
    CheckRealtimeRuleResponse result = apiInstance.checkHitRealtimeRule(body, tenantCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnlineApi#checkHitRealtimeRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckRealtimeRuleRequest**](CheckRealtimeRuleRequest.md)|  |
 **tenantCode** | **String**| 租户code |

### Return type

[**CheckRealtimeRuleResponse**](CheckRealtimeRuleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="getIdMapping"></a>
# **getIdMapping**
> IDMResp getIdMapping(body)

idmapping映射,高速接口

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.OnlineApi;


OnlineApi apiInstance = new OnlineApi();
IDMReq body = new IDMReq(); // IDMReq | 
try {
    IDMResp result = apiInstance.getIdMapping(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnlineApi#getIdMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**IDMReq**](IDMReq.md)|  |

### Return type

[**IDMResp**](IDMResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="getUserProfileWithPrivacy"></a>
# **getUserProfileWithPrivacy**
> OnlineUserProfileRespWithPrivacy getUserProfileWithPrivacy(body)

查询标签和属性

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.OnlineApi;


OnlineApi apiInstance = new OnlineApi();
OnlineGetUserProfileRequest body = new OnlineGetUserProfileRequest(); // OnlineGetUserProfileRequest | 
try {
    OnlineUserProfileRespWithPrivacy result = apiInstance.getUserProfileWithPrivacy(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnlineApi#getUserProfileWithPrivacy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OnlineGetUserProfileRequest**](OnlineGetUserProfileRequest.md)|  |

### Return type

[**OnlineUserProfileRespWithPrivacy**](OnlineUserProfileRespWithPrivacy.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="queryUserSeg"></a>
# **queryUserSeg**
> ByteDanceSeqResponseString queryUserSeg(id, segIds, xTenant)

查询用户是否命中人群,高速接口

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.OnlineApi;


OnlineApi apiInstance = new OnlineApi();
String id = "id_example"; // String | 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询
String segIds = "segIds_example"; // String | 分群id。多个分群用逗号分割。
Long xTenant = 789L; // Long | 项目ID
try {
    ByteDanceSeqResponseString result = apiInstance.queryUserSeg(id, segIds, xTenant);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OnlineApi#queryUserSeg");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| 用户id，需要和分群包的id类型保持一致。比如分群结果是手机号，则需要用手机号来查询 |
 **segIds** | **String**| 分群id。多个分群用逗号分割。 |
 **xTenant** | **Long**| 项目ID |

### Return type

[**ByteDanceSeqResponseString**](ByteDanceSeqResponseString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

