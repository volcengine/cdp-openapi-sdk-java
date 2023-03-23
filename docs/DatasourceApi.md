# DatasourceApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryDataSourceList**](DatasourceApi.md#queryDataSourceList) | **GET** /profile_platform/cdpMeta/openApi/dataSource/queryDataSourceList | 查询数据源列表openapi
[**queryeventList**](DatasourceApi.md#queryeventList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/eventList | 查询事件列表
[**queryeventPropertyList**](DatasourceApi.md#queryeventPropertyList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/eventPropertyList | 查询事件属性列表
[**querypropertyList**](DatasourceApi.md#querypropertyList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/propertyList | 查询单个数据源的表属性字段列表openapi
[**querypropertyValues**](DatasourceApi.md#querypropertyValues) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/property/values | 查询属性枚举值

<a name="queryDataSourceList"></a>
# **queryDataSourceList**
> ListDataSourceListItemVo queryDataSourceList(xTenant, sourceName)

查询数据源列表openapi

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DatasourceApi;


DatasourceApi apiInstance = new DatasourceApi();
Long xTenant = 789L; // Long | 
String sourceName = "sourceName_example"; // String | 数据源名称
try {
    ListDataSourceListItemVo result = apiInstance.queryDataSourceList(xTenant, sourceName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourceApi#queryDataSourceList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**|  |
 **sourceName** | **String**| 数据源名称 | [optional]

### Return type

[**ListDataSourceListItemVo**](ListDataSourceListItemVo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="queryeventList"></a>
# **queryeventList**
> ListCdpEventVo queryeventList(dataSourceId)

查询事件列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DatasourceApi;


DatasourceApi apiInstance = new DatasourceApi();
Integer dataSourceId = 56; // Integer | 数据源id
try {
    ListCdpEventVo result = apiInstance.queryeventList(dataSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourceApi#queryeventList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataSourceId** | **Integer**| 数据源id |

### Return type

[**ListCdpEventVo**](ListCdpEventVo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="queryeventPropertyList"></a>
# **queryeventPropertyList**
> ListCdpEventPropertyVo queryeventPropertyList(xTenant, eventId)

查询事件属性列表

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DatasourceApi;


DatasourceApi apiInstance = new DatasourceApi();
Long xTenant = 789L; // Long | 
Integer eventId = 56; // Integer | 事件id
try {
    ListCdpEventPropertyVo result = apiInstance.queryeventPropertyList(xTenant, eventId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourceApi#queryeventPropertyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xTenant** | **Long**|  |
 **eventId** | **Integer**| 事件id |

### Return type

[**ListCdpEventPropertyVo**](ListCdpEventPropertyVo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="querypropertyList"></a>
# **querypropertyList**
> ListCdpPropertyVo querypropertyList(dataSourceId)

查询单个数据源的表属性字段列表openapi

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DatasourceApi;


DatasourceApi apiInstance = new DatasourceApi();
Integer dataSourceId = 56; // Integer | 数据源id
try {
    ListCdpPropertyVo result = apiInstance.querypropertyList(dataSourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourceApi#querypropertyList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataSourceId** | **Integer**| 数据源id |

### Return type

[**ListCdpPropertyVo**](ListCdpPropertyVo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="querypropertyValues"></a>
# **querypropertyValues**
> ListString querypropertyValues(id, dataSourceId, page, pageSize, keyword)

查询属性枚举值

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.DatasourceApi;


DatasourceApi apiInstance = new DatasourceApi();
Integer id = 56; // Integer | 字段id
Integer dataSourceId = 56; // Integer | 数据源id
Integer page = 56; // Integer | 页码
Integer pageSize = 56; // Integer | 页大小
String keyword = "keyword_example"; // String | 关键字
try {
    ListString result = apiInstance.querypropertyValues(id, dataSourceId, page, pageSize, keyword);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatasourceApi#querypropertyValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 字段id |
 **dataSourceId** | **Integer**| 数据源id |
 **page** | **Integer**| 页码 | [optional]
 **pageSize** | **Integer**| 页大小 | [optional]
 **keyword** | **String**| 关键字 | [optional]

### Return type

[**ListString**](ListString.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

