# SegmentationResp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowDownload** | **Boolean** |  | 
**cantPublicType** | [**CantPublicTypeEnum**](#CantPublicTypeEnum) |  | 
**count** | **Long** |  | 
**createdAt** | **String** |  | 
**createdBy** | **String** |  | 
**exportAt** | **String** |  | 
**exportStrategy** | **String** |  | 
**groupInf** | [**List&lt;GroupInfo&gt;**](GroupInfo.md) |  |  [optional]
**hasPublicBefore** | **Boolean** |  | 
**hashMethod** | [**HashMethodEnum**](#HashMethodEnum) |  |  [optional]
**id** | **Integer** |  | 
**idType** | [**IdType**](IdType.md) |  | 
**idTypeName** | **String** |  | 
**isNewestVersion** | **Boolean** |  | 
**module** | **String** |  |  [optional]
**name** | **String** |  | 
**onlineSegStatus** | **Boolean** |  | 
**onlineSegSyncStatus** | **String** |  | 
**pDate** | **String** |  |  [optional]
**path** | **String** |  |  [optional]
**platform** | **String** |  |  [optional]
**reportId** | **Long** |  |  [optional]
**segDep** | [**SegDependency**](SegDependency.md) |  |  [optional]
**segPermission** | [**List&lt;SegPermission&gt;**](SegPermission.md) |  |  [optional]
**segStatus** | [**SegStatusEnum**](#SegStatusEnum) |  | 
**segTaskStatus** | [**List&lt;SegTaskStatus&gt;**](SegTaskStatus.md) |  |  [optional]
**segType** | [**SegTypeEnum**](#SegTypeEnum) |  | 
**sourceResultReady** | **Boolean** |  | 
**subSegmentations** | [**List&lt;SegmentationResp&gt;**](SegmentationResp.md) |  |  [optional]
**subjectId** | **Integer** |  | 
**uploadType** | [**UploadTypeEnum**](#UploadTypeEnum) |  |  [optional]
**version** | **Integer** |  |  [optional]

<a name="CantPublicTypeEnum"></a>
## Enum: CantPublicTypeEnum
Name | Value
---- | -----
IDTYPENOTSATISFIED | &quot;IdTypeNotSatisfied&quot;
COUNTNOTSATISFIED | &quot;CountNotSatisfied&quot;
AUTHNOTSATISFIED | &quot;AuthNotSatisfied&quot;
SATISFIED | &quot;Satisfied&quot;

<a name="HashMethodEnum"></a>
## Enum: HashMethodEnum
Name | Value
---- | -----
MD5 | &quot;MD5&quot;
SHA256 | &quot;SHA256&quot;
AES256 | &quot;AES256&quot;

<a name="SegStatusEnum"></a>
## Enum: SegStatusEnum
Name | Value
---- | -----
EXPORTING | &quot;Exporting&quot;
INVALID | &quot;Invalid&quot;
NORMAL | &quot;Normal&quot;
CHEXPORTING | &quot;CHExporting&quot;
PUBLICCOUNTINVALID | &quot;PublicCountInvalid&quot;
PATCHFAILED | &quot;PatchFailed&quot;

<a name="SegTypeEnum"></a>
## Enum: SegTypeEnum
Name | Value
---- | -----
UPLOADED | &quot;Uploaded&quot;
CONDITIONAL | &quot;Conditional&quot;
SEGBASED | &quot;SegBased&quot;
INSIGHTEXPORT | &quot;InsightExport&quot;
LOOKALIKE | &quot;Lookalike&quot;
PUBLICCONDITIONAL | &quot;PublicConditional&quot;
PUBLICUPLOADED | &quot;PublicUploaded&quot;
ABI | &quot;ABI&quot;
SUBJECTTRANS | &quot;SubjectTrans&quot;
CHILDSEG | &quot;ChildSeg&quot;
FEATURERECOMMENDATION | &quot;FeatureRecommendation&quot;
FINDER | &quot;Finder&quot;
TESTER | &quot;Tester&quot;
GMP | &quot;GMP&quot;

<a name="UploadTypeEnum"></a>
## Enum: UploadTypeEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
FILE | &quot;file&quot;
HDFS | &quot;hdfs&quot;
SQL | &quot;sql&quot;
LOOKALIKE | &quot;lookalike&quot;
SPLITLOOKALIKE | &quot;splitLookalike&quot;
INSIGHTREPORT | &quot;insightReport&quot;
FILE_FROM_FA | &quot;file_from_fa&quot;
PUBLICUPLOAD | &quot;publicUpload&quot;
FEATURERECOMMENDATION | &quot;FeatureRecommendation&quot;
