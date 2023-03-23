# SegmentationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadSegFile**](SegmentationApi.md#downloadSegFile) | **GET** /profile_seg/api/v1/openapi/tenants/{tenantId}/segmentations/download/{segId} | 分群ID文件下载
[**legacyCreateUploadSegment**](SegmentationApi.md#legacyCreateUploadSegment) | **POST** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/recordSegShardInfo | 创建上传分群
[**legacyGetSegment**](SegmentationApi.md#legacyGetSegment) | **GET** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/{segId} | 分群详情
[**legacyGetSegmentList**](SegmentationApi.md#legacyGetSegmentList) | **GET** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations | 分群列表查看，分页
[**uploadSegFile**](SegmentationApi.md#uploadSegFile) | **POST** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/upload | 上传分群文件

<a name="downloadSegFile"></a>
# **downloadSegFile**
> File downloadSegFile(tenantId, segId, formatType, needEncrypt)

分群ID文件下载

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SegmentationApi;


SegmentationApi apiInstance = new SegmentationApi();
Integer tenantId = 56; // Integer | 
Integer segId = 56; // Integer | 
String formatType = "formatType_example"; // String | 文件格式，GZ, TXT, CSV 可选
Boolean needEncrypt = true; // Boolean | 
try {
    File result = apiInstance.downloadSegFile(tenantId, segId, formatType, needEncrypt);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#downloadSegFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Integer**|  |
 **segId** | **Integer**|  |
 **formatType** | **String**| 文件格式，GZ, TXT, CSV 可选 |
 **needEncrypt** | **Boolean**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="legacyCreateUploadSegment"></a>
# **legacyCreateUploadSegment**
> ByteDanceResponseRecordSegShardInfoResp legacyCreateUploadSegment(body, tenantId)

创建上传分群

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SegmentationApi;


SegmentationApi apiInstance = new SegmentationApi();
LegacyUploadedSegCreateRequest body = new LegacyUploadedSegCreateRequest(); // LegacyUploadedSegCreateRequest | 
Integer tenantId = 56; // Integer | 
try {
    ByteDanceResponseRecordSegShardInfoResp result = apiInstance.legacyCreateUploadSegment(body, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#legacyCreateUploadSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LegacyUploadedSegCreateRequest**](LegacyUploadedSegCreateRequest.md)|  |
 **tenantId** | **Integer**|  |

### Return type

[**ByteDanceResponseRecordSegShardInfoResp**](ByteDanceResponseRecordSegShardInfoResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

<a name="legacyGetSegment"></a>
# **legacyGetSegment**
> ByteDanceResponseSegmentationResp legacyGetSegment(tenantId, segId)

分群详情

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SegmentationApi;


SegmentationApi apiInstance = new SegmentationApi();
Integer tenantId = 56; // Integer | 
Integer segId = 56; // Integer | 
try {
    ByteDanceResponseSegmentationResp result = apiInstance.legacyGetSegment(tenantId, segId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#legacyGetSegment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Integer**|  |
 **segId** | **Integer**|  |

### Return type

[**ByteDanceResponseSegmentationResp**](ByteDanceResponseSegmentationResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="legacyGetSegmentList"></a>
# **legacyGetSegmentList**
> ByteDanceResponseSegmentationListResp legacyGetSegmentList(tenantId, current, pageSize, keyword, isSelfSee, isOnlySourceReady, idType, segTypes, sourcePlatform, isAbaseAvailable, isAbaseEnabled)

分群列表查看，分页

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SegmentationApi;


SegmentationApi apiInstance = new SegmentationApi();
Integer tenantId = 56; // Integer | 
Integer current = 56; // Integer | 页码
Integer pageSize = 56; // Integer | 每页大小
String keyword = "keyword_example"; // String | 关键词，模糊搜索分群名称和创建人
Boolean isSelfSee = true; // Boolean | 是否只看自己创建的
Boolean isOnlySourceReady = true; // Boolean | 是否分群就绪的（文件+洞察）
String idType = "idType_example"; // String | 实体类型code
String segTypes = "segTypes_example"; // String | 分群类型，逗号分隔，多选
String sourcePlatform = "sourcePlatform_example"; // String | 来源平台
Boolean isAbaseAvailable = true; // Boolean | 筛选在线服务是否可用
Boolean isAbaseEnabled = true; // Boolean | 筛选在线服务配置开启
try {
    ByteDanceResponseSegmentationListResp result = apiInstance.legacyGetSegmentList(tenantId, current, pageSize, keyword, isSelfSee, isOnlySourceReady, idType, segTypes, sourcePlatform, isAbaseAvailable, isAbaseEnabled);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#legacyGetSegmentList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | **Integer**|  |
 **current** | **Integer**| 页码 | [optional]
 **pageSize** | **Integer**| 每页大小 | [optional]
 **keyword** | **String**| 关键词，模糊搜索分群名称和创建人 | [optional]
 **isSelfSee** | **Boolean**| 是否只看自己创建的 | [optional]
 **isOnlySourceReady** | **Boolean**| 是否分群就绪的（文件+洞察） | [optional]
 **idType** | **String**| 实体类型code | [optional]
 **segTypes** | **String**| 分群类型，逗号分隔，多选 | [optional]
 **sourcePlatform** | **String**| 来源平台 | [optional]
 **isAbaseAvailable** | **Boolean**| 筛选在线服务是否可用 | [optional]
 **isAbaseEnabled** | **Boolean**| 筛选在线服务配置开启 | [optional]

### Return type

[**ByteDanceResponseSegmentationListResp**](ByteDanceResponseSegmentationListResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

<a name="uploadSegFile"></a>
# **uploadSegFile**
> ByteDanceResponseSegmentationUploadResp uploadSegFile(file, tenantId)

上传分群文件

### Example
```java
// Import classes:
//import code.byted.cdp.ApiException;
//import code.byted.cdp.openapi.SegmentationApi;


SegmentationApi apiInstance = new SegmentationApi();
File file = new File("file_example"); // File | 
Integer tenantId = 56; // Integer | 
try {
    ByteDanceResponseSegmentationUploadResp result = apiInstance.uploadSegFile(file, tenantId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SegmentationApi#uploadSegFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  |
 **tenantId** | **Integer**|  |

### Return type

[**ByteDanceResponseSegmentationUploadResp**](ByteDanceResponseSegmentationUploadResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain

