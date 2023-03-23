# LegacySegOpenApiInfoResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 分群id | 
**name** | **String** | 分群名称 | 
**createdBy** | **String** | 分群创建人 | 
**idType** | **String** | 分群实体类型code | 
**idTypeName** | **String** | 分群实体类型名称 | 
**result** | [**LegacySegResult**](LegacySegResult.md) |  | 
**segType** | [**SegTypeEnum**](#SegTypeEnum) | 分群类型 | 
**abaseEnabled** | **Boolean** | 是否开启了在线服务 |  [optional]
**detail** | [**DetailModel**](DetailModel.md) |  |  [optional]

<a name="SegTypeEnum"></a>
## Enum: SegTypeEnum
Name | Value
---- | -----
CONDITIONAL | &quot;Conditional&quot;
UPLOADED | &quot;Uploaded&quot;
ABI | &quot;ABI&quot;
LOOKALIKE | &quot;Lookalike&quot;
CHILDSEG | &quot;ChildSeg&quot;
PRIVATETRANSTOPUBLIC | &quot;PrivateTransToPublic&quot;
SUBJECTTRANS | &quot;SubjectTrans&quot;
FEATURERECOMMENDATION | &quot;FeatureRecommendation&quot;
INSIGHTEXPORT | &quot;InsightExport&quot;
INSIGHTEXPORTV2 | &quot;InsightExportV2&quot;
PUBLICCONDITIONAL | &quot;PublicConditional&quot;
FINDER | &quot;Finder&quot;
PUBLICMODELRESULT | &quot;PublicModelResult&quot;
PUBLICUPLOADED | &quot;PublicUploaded&quot;
MODEL | &quot;Model&quot;
PUBLICLOOKALIKE | &quot;PublicLookalike&quot;
PRIVATELOOKALIKE | &quot;PrivateLookalike&quot;
SQLEXPORT | &quot;SqlExport&quot;
