# SegmentationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abaseEnabled** | **Boolean** |  |  [optional]
**count** | **Long** |  | 
**exportAt** | **String** |  | 
**hashMethod** | [**HashMethodEnum**](#HashMethodEnum) |  |  [optional]
**id** | **Integer** |  | 
**idType** | [**IdType**](IdType.md) |  |  [optional]
**isLookalikeReady** | **Boolean** |  |  [optional]
**lookalikeOption** | [**OptionLookalikeOption**](OptionLookalikeOption.md) |  | 
**originCount** | **Long** |  |  [optional]
**parentId** | **Integer** |  |  [optional]
**path** | **String** |  |  [optional]
**segStatus** | [**SegStatusEnum**](#SegStatusEnum) |  |  [optional]
**splitResult** | **List&lt;String&gt;** |  |  [optional]
**targetIdType** | [**IdType**](IdType.md) |  |  [optional]
**targetPath** | **String** |  |  [optional]

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
