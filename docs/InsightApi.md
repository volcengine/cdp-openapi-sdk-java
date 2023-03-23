# InsightApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDSLInsightKey**](InsightApi.md#getDSLInsightKey) | **POST** /profile_application/api/v1/dsl/insightKey | 获取洞察跳转key
[**getInsightReportById**](InsightApi.md#getInsightReportById) | **GET** /profile_application/api/v1/openapi/insight/report/{reportId} | 洞察报告详情
[**getInsightReportList**](InsightApi.md#getInsightReportList) | **GET** /profile_application/api/v1/openapi/insight/report | 洞察报告列表

<a name="getDSLInsightKey"></a>
# **getDSLInsightKey**
> InlineResponse200 getDSLInsightKey(body)

获取洞察跳转key

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.InsightApi;


InsightApi apiInstance = new InsightApi();
Object body = null; // Object | dsl结构
try {
    InlineResponse200 result = apiInstance.getDSLInsightKey(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getDSLInsightKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| dsl结构 |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="getInsightReportById"></a>
# **getInsightReportById**
> InlineResponse2002 getInsightReportById(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate)

洞察报告详情

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.InsightApi;


InsightApi apiInstance = new InsightApi();
Long xTenant = 789L; // Long | 
Long reportId = 789L; // Long | 
String xEnv = "xEnv_example"; // String | 
Boolean singleValue = true; // Boolean | 
String insightSortObj = "insightSortObj_example"; // String | 
String sortType = "sortType_example"; // String | 
LocalDate pDate = new LocalDate(); // LocalDate | 
try {
    InlineResponse2002 result = apiInstance.getInsightReportById(xTenant, reportId, xEnv, singleValue, insightSortObj, sortType, pDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getInsightReportById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**|  |
 **reportId** | **Long**|  |
 **xEnv** | **String**|  | [optional]
 **singleValue** | **Boolean**|  | [optional]
 **insightSortObj** | **String**|  | [optional] [enum: Full, Effective]
 **sortType** | **String**|  | [optional] [enum: Tag, Tgi, Uv]
 **pDate** | **LocalDate**|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="getInsightReportList"></a>
# **getInsightReportList**
> InlineResponse2001 getInsightReportList(xTenant, xEnv)

洞察报告列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.InsightApi;


InsightApi apiInstance = new InsightApi();
Long xTenant = 789L; // Long | 
String xEnv = "xEnv_example"; // String | 
try {
    InlineResponse2001 result = apiInstance.getInsightReportList(xTenant, xEnv);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightApi#getInsightReportList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**|  |
 **xEnv** | **String**|  | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

