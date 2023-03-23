# openapi-client

CDP开放接口
- API version: 2023-02-10
  - Build date: 2023-03-23T12:09:51.626+08:00[Asia/Shanghai]

No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>code.byted.cdp</groupId>
  <artifactId>openapi-client</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "code.byted.cdp:openapi-client:1.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-client-1.0.0-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import code.byted.cdp.*;
import code.byted.cdp.auth.*;
import code.byted.cdp.model.*;
import code.byted.cdp.openapi.DatasourceApi;

import java.io.File;
import java.util.*;

public class DatasourceApiExample {

    public static void main(String[] args) {
        
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
    }
}
import code.byted.cdp.*;
import code.byted.cdp.auth.*;
import code.byted.cdp.model.*;
import code.byted.cdp.openapi.DatasourceApi;

import java.io.File;
import java.util.*;

public class DatasourceApiExample {

    public static void main(String[] args) {
        
        DatasourceApi apiInstance = new DatasourceApi();
        Integer dataSourceId = 56; // Integer | 数据源id
        try {
            ListCdpEventVo result = apiInstance.queryeventList(dataSourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#queryeventList");
            e.printStackTrace();
        }
    }
}
import code.byted.cdp.*;
import code.byted.cdp.auth.*;
import code.byted.cdp.model.*;
import code.byted.cdp.openapi.DatasourceApi;

import java.io.File;
import java.util.*;

public class DatasourceApiExample {

    public static void main(String[] args) {
        
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
    }
}
import code.byted.cdp.*;
import code.byted.cdp.auth.*;
import code.byted.cdp.model.*;
import code.byted.cdp.openapi.DatasourceApi;

import java.io.File;
import java.util.*;

public class DatasourceApiExample {

    public static void main(String[] args) {
        
        DatasourceApi apiInstance = new DatasourceApi();
        Integer dataSourceId = 56; // Integer | 数据源id
        try {
            ListCdpPropertyVo result = apiInstance.querypropertyList(dataSourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#querypropertyList");
            e.printStackTrace();
        }
    }
}
import code.byted.cdp.*;
import code.byted.cdp.auth.*;
import code.byted.cdp.model.*;
import code.byted.cdp.openapi.DatasourceApi;

import java.io.File;
import java.util.*;

public class DatasourceApiExample {

    public static void main(String[] args) {
        
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to */*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DatasourceApi* | [**queryDataSourceList**](docs/DatasourceApi.md#queryDataSourceList) | **GET** /profile_platform/cdpMeta/openApi/dataSource/queryDataSourceList | 查询数据源列表openapi
*DatasourceApi* | [**queryeventList**](docs/DatasourceApi.md#queryeventList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/eventList | 查询事件列表
*DatasourceApi* | [**queryeventPropertyList**](docs/DatasourceApi.md#queryeventPropertyList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/eventPropertyList | 查询事件属性列表
*DatasourceApi* | [**querypropertyList**](docs/DatasourceApi.md#querypropertyList) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/propertyList | 查询单个数据源的表属性字段列表openapi
*DatasourceApi* | [**querypropertyValues**](docs/DatasourceApi.md#querypropertyValues) | **GET** /profile_platform/cdpMeta/openApi/dataSourceProperty/property/values | 查询属性枚举值
*DetailDatasourceApi* | [**getDetailAttributes**](docs/DetailDatasourceApi.md#getDetailAttributes) | **POST** /profile_platform/api/v2/detailAttributes/tenant/{tenantCode}/attributeId/{attributeId}/value | 获取明细数据源的枚举值
*FileDateAssetApi* | [**downloadFileDateAsset**](docs/FileDateAssetApi.md#downloadFileDateAsset) | **GET** /profile_platform/api/v2/open/platform/file_data_asset/download/task/{taskId} | 下载分群明细
*FileDateAssetApi* | [**getFileDateAssetTaskList**](docs/FileDateAssetApi.md#getFileDateAssetTaskList) | **GET** /profile_platform/api/v2/open/platform/file_data_asset/tasklist | 获取分群明细任务列表
*IdTypeApi* | [**listIdTypeMetaByTenant**](docs/IdTypeApi.md#listIdTypeMetaByTenant) | **GET** /profile_platform/api/v2/openapi/cdp/idTypes | 获取idType元信息
*InsightApi* | [**getDSLInsightKey**](docs/InsightApi.md#getDSLInsightKey) | **POST** /profile_application/api/v1/dsl/insightKey | 获取洞察跳转key
*InsightApi* | [**getInsightReportById**](docs/InsightApi.md#getInsightReportById) | **GET** /profile_application/api/v1/openapi/insight/report/{reportId} | 洞察报告详情
*InsightApi* | [**getInsightReportList**](docs/InsightApi.md#getInsightReportList) | **GET** /profile_application/api/v1/openapi/insight/report | 洞察报告列表
*LabelApi* | [**getLabelDesc**](docs/LabelApi.md#getLabelDesc) | **GET** /profile_platform/openApi/v2/cdpMeta/labelSystem/label/info/{id} | 获取标签精简信息
*LabelApi* | [**getLabelTree**](docs/LabelApi.md#getLabelTree) | **GET** /profile_platform/openApi/v2/cdpMeta/labelSystem/labelTreeNode | 获取标签树信息
*LabelApi* | [**getOnlineTagsProp**](docs/LabelApi.md#getOnlineTagsProp) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/onlineTags/{infoType} | 获取在线可用标签/属性列表
*OnlineApi* | [**checkHitRealtimeRule**](docs/OnlineApi.md#checkHitRealtimeRule) | **POST** /online/api/v1/projects/{tenantCode}/users/realtimeRule | 判断是否命中实时规则,高速接口
*OnlineApi* | [**getIdMapping**](docs/OnlineApi.md#getIdMapping) | **POST** /openapi/online/v1/mapping/online/sync | idmapping映射,高速接口
*OnlineApi* | [**getUserProfileWithPrivacy**](docs/OnlineApi.md#getUserProfileWithPrivacy) | **POST** /openapi/online/v2/user/profiles | 查询标签和属性
*OnlineApi* | [**queryUserSeg**](docs/OnlineApi.md#queryUserSeg) | **GET** /openapi/online/v1/user/{id}/segs | 查询用户是否命中人群,高速接口
*RealtimeRuleApi* | [**getRealtimeRuleList**](docs/RealtimeRuleApi.md#getRealtimeRuleList) | **GET** /profile_platform/api/v2/onlineSource/openapi/tenants/{tenantsCode}/realtimeRule | 获取实时规则列表
*SegmentationApi* | [**downloadSegFile**](docs/SegmentationApi.md#downloadSegFile) | **GET** /profile_seg/api/v1/openapi/tenants/{tenantId}/segmentations/download/{segId} | 分群ID文件下载
*SegmentationApi* | [**legacyCreateUploadSegment**](docs/SegmentationApi.md#legacyCreateUploadSegment) | **POST** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/recordSegShardInfo | 创建上传分群
*SegmentationApi* | [**legacyGetSegment**](docs/SegmentationApi.md#legacyGetSegment) | **GET** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/{segId} | 分群详情
*SegmentationApi* | [**legacyGetSegmentList**](docs/SegmentationApi.md#legacyGetSegmentList) | **GET** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations | 分群列表查看，分页
*SegmentationApi* | [**uploadSegFile**](docs/SegmentationApi.md#uploadSegFile) | **POST** /profile_seg/api/v1//openapi/tenants/{tenantId}/segmentations/upload | 上传分群文件
*SubjectApi* | [**getSubjectIdTypes**](docs/SubjectApi.md#getSubjectIdTypes) | **GET** /profile_platform/openApi/v2/cdpMeta/mapping/getSubjectIdTypes | 查询实体列表
*SubjectApi* | [**getSubjects**](docs/SubjectApi.md#getSubjects) | **GET** /profile_platform/openApi/v2/cdpMeta/mapping/getSubjects | 查询主体列表
*TagApi* | [**addOrModifyManualTags**](docs/TagApi.md#addOrModifyManualTags) | **POST** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags | 添加或者修改某个用户身上的人工标签
*TagApi* | [**deleteManualTagsInUser**](docs/TagApi.md#deleteManualTagsInUser) | **DELETE** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags/{baseId} | 删除某个用户身上的人工标签
*TagApi* | [**getManualTagsList**](docs/TagApi.md#getManualTagsList) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/manualTags | 查询某个用户身上的人工标签列表
*TagApi* | [**getTagValues**](docs/TagApi.md#getTagValues) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/meta/tags/{tagId}/values | 获取某个标签的取值
*TagApi* | [**getTagsList**](docs/TagApi.md#getTagsList) | **GET** /profile_platform/api/v2/openapi/cdp/tenants/{tenantCode}/profiles/tags | 获取所有标签列表，包含各个标签的取值

## Documentation for Models

 - [AggregateCondition](docs/AggregateCondition.md)
 - [AggregateFilter](docs/AggregateFilter.md)
 - [AllowCopy](docs/AllowCopy.md)
 - [AllowDownload](docs/AllowDownload.md)
 - [AllowInsight](docs/AllowInsight.md)
 - [AllowOnlineQuery](docs/AllowOnlineQuery.md)
 - [AllowPush](docs/AllowPush.md)
 - [AllowRetry](docs/AllowRetry.md)
 - [AllowUpdateData](docs/AllowUpdateData.md)
 - [AvailableMappingIdsDetail](docs/AvailableMappingIdsDetail.md)
 - [ByteDanceNormalResponseIdTypeResp](docs/ByteDanceNormalResponseIdTypeResp.md)
 - [ByteDanceNormalResponseString](docs/ByteDanceNormalResponseString.md)
 - [ByteDanceResponseRecordSegShardInfoResp](docs/ByteDanceResponseRecordSegShardInfoResp.md)
 - [ByteDanceResponseSegmentationListResp](docs/ByteDanceResponseSegmentationListResp.md)
 - [ByteDanceResponseSegmentationResp](docs/ByteDanceResponseSegmentationResp.md)
 - [ByteDanceResponseSegmentationUploadResp](docs/ByteDanceResponseSegmentationUploadResp.md)
 - [ByteDanceSeqResponseOpenApiManualTagInfo](docs/ByteDanceSeqResponseOpenApiManualTagInfo.md)
 - [ByteDanceSeqResponseSeqDomainGroupedTags](docs/ByteDanceSeqResponseSeqDomainGroupedTags.md)
 - [ByteDanceSeqResponseString](docs/ByteDanceSeqResponseString.md)
 - [ByteDanceSeqResponseTagValueResp](docs/ByteDanceSeqResponseTagValueResp.md)
 - [CdpEventPropertyVo](docs/CdpEventPropertyVo.md)
 - [CdpEventVo](docs/CdpEventVo.md)
 - [CdpPropertyVo](docs/CdpPropertyVo.md)
 - [CheckRealtimeRuleRequest](docs/CheckRealtimeRuleRequest.md)
 - [CheckRealtimeRuleResponse](docs/CheckRealtimeRuleResponse.md)
 - [CommonOnlineTagInfoResp](docs/CommonOnlineTagInfoResp.md)
 - [CommonResponse](docs/CommonResponse.md)
 - [CommonResponseLabelMetaSimpleInfo](docs/CommonResponseLabelMetaSimpleInfo.md)
 - [CommonResponseListLabelTreeNode](docs/CommonResponseListLabelTreeNode.md)
 - [Current](docs/Current.md)
 - [DataSourceListItemVo](docs/DataSourceListItemVo.md)
 - [DateMaybeWithTime](docs/DateMaybeWithTime.md)
 - [DetailAttributesReq](docs/DetailAttributesReq.md)
 - [DetailAttributesResp](docs/DetailAttributesResp.md)
 - [DetailModel](docs/DetailModel.md)
 - [DistanceFilter](docs/DistanceFilter.md)
 - [DomainGroupedTags](docs/DomainGroupedTags.md)
 - [FileDataTaskSimpleResult](docs/FileDataTaskSimpleResult.md)
 - [GraphSimpleResult](docs/GraphSimpleResult.md)
 - [GroupInfo](docs/GroupInfo.md)
 - [IDMReq](docs/IDMReq.md)
 - [IDMResp](docs/IDMResp.md)
 - [IdFilter](docs/IdFilter.md)
 - [IdType](docs/IdType.md)
 - [IdTypeDetail](docs/IdTypeDetail.md)
 - [IdTypeMapping](docs/IdTypeMapping.md)
 - [IdTypeMappingStrategy](docs/IdTypeMappingStrategy.md)
 - [IdTypeMeta](docs/IdTypeMeta.md)
 - [IdTypes](docs/IdTypes.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InputStream](docs/InputStream.md)
 - [InputStreamResource](docs/InputStreamResource.md)
 - [InsightRecord](docs/InsightRecord.md)
 - [InsightSummarySegObj](docs/InsightSummarySegObj.md)
 - [InsightSummaryTagObj](docs/InsightSummaryTagObj.md)
 - [LabelInfo](docs/LabelInfo.md)
 - [LabelMetaSimpleInfo](docs/LabelMetaSimpleInfo.md)
 - [LabelTreeNode](docs/LabelTreeNode.md)
 - [LegacySegOpenApiInfoResponse](docs/LegacySegOpenApiInfoResponse.md)
 - [LegacySegOpenApiResponse](docs/LegacySegOpenApiResponse.md)
 - [LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse](docs/LegacySegOpenApiSegPageResponseLegacySegOpenApiResponse.md)
 - [LegacySegResult](docs/LegacySegResult.md)
 - [LegacyUploadedSegCreateRequest](docs/LegacyUploadedSegCreateRequest.md)
 - [LegacyUploadedSegmentDetail](docs/LegacyUploadedSegmentDetail.md)
 - [ListCdpEventPropertyVo](docs/ListCdpEventPropertyVo.md)
 - [ListCdpEventVo](docs/ListCdpEventVo.md)
 - [ListCdpPropertyVo](docs/ListCdpPropertyVo.md)
 - [ListDataSourceListItemVo](docs/ListDataSourceListItemVo.md)
 - [ListIdType](docs/ListIdType.md)
 - [ListString](docs/ListString.md)
 - [ListSubjectMeta](docs/ListSubjectMeta.md)
 - [LookalikeOption](docs/LookalikeOption.md)
 - [ManualPersonTagRequest](docs/ManualPersonTagRequest.md)
 - [MapString](docs/MapString.md)
 - [None](docs/None.md)
 - [OnlineGetUserProfileRequest](docs/OnlineGetUserProfileRequest.md)
 - [OnlineTagInfoResp](docs/OnlineTagInfoResp.md)
 - [OnlineUserProfileRequest](docs/OnlineUserProfileRequest.md)
 - [OnlineUserProfileRespWithPrivacy](docs/OnlineUserProfileRespWithPrivacy.md)
 - [OpenAPiInsightReportListResp](docs/OpenAPiInsightReportListResp.md)
 - [OpenAPiInsightReportResp](docs/OpenAPiInsightReportResp.md)
 - [OpenApiManualTagInfo](docs/OpenApiManualTagInfo.md)
 - [OptionLookalikeOption](docs/OptionLookalikeOption.md)
 - [ParamCondition](docs/ParamCondition.md)
 - [ParamFilter](docs/ParamFilter.md)
 - [PeriodFilter](docs/PeriodFilter.md)
 - [PrivateSegInfo](docs/PrivateSegInfo.md)
 - [ProfileFilter](docs/ProfileFilter.md)
 - [ProfileTag](docs/ProfileTag.md)
 - [RealTimeRuleItem](docs/RealTimeRuleItem.md)
 - [RealtimeRuleListResp](docs/RealtimeRuleListResp.md)
 - [RealtimeRuleListRespData](docs/RealtimeRuleListRespData.md)
 - [SegDependency](docs/SegDependency.md)
 - [SegInfo](docs/SegInfo.md)
 - [SegOpenApiFileUploadResponse](docs/SegOpenApiFileUploadResponse.md)
 - [SegPermission](docs/SegPermission.md)
 - [SegSimpleInfo](docs/SegSimpleInfo.md)
 - [SegTaskStatus](docs/SegTaskStatus.md)
 - [SegmentationResp](docs/SegmentationResp.md)
 - [SegmentationResult](docs/SegmentationResult.md)
 - [SegmentationsUploadBody](docs/SegmentationsUploadBody.md)
 - [SeqFileDataTaskSimpleResult](docs/SeqFileDataTaskSimpleResult.md)
 - [StrategyDetail](docs/StrategyDetail.md)
 - [SubjectMeta](docs/SubjectMeta.md)
 - [SummaryResult](docs/SummaryResult.md)
 - [TagBasicInfo](docs/TagBasicInfo.md)
 - [TagResult](docs/TagResult.md)
 - [TagValueResp](docs/TagValueResp.md)
 - [TimeCondition](docs/TimeCondition.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


