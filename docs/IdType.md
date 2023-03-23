# IdType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableMappingIds** | [**List&lt;IdTypeMapping&gt;**](IdTypeMapping.md) |  |  [optional]
**code** | **String** |  | 
**dataType** | **String** |  | 
**entityType** | [**EntityTypeEnum**](#EntityTypeEnum) |  |  [optional]
**id** | **Integer** |  | 
**name** | **String** |  | 
**needEncrypt** | **Boolean** |  | 
**orgId** | **Integer** |  | 
**parentId** | **Integer** |  |  [optional]
**subjectId** | **Integer** |  | 
**subjectName** | **String** |  | 
**subjectType** | **String** |  | 

<a name="EntityTypeEnum"></a>
## Enum: EntityTypeEnum
Name | Value
---- | -----
BASEID | &quot;BaseId&quot;
PHONE | &quot;Phone&quot;
PHONE_SHA256 | &quot;Phone_SHA256&quot;
IDFA | &quot;IDFA&quot;
IDFA_MD5 | &quot;IDFA_MD5&quot;
IMEI | &quot;IMEI&quot;
IMEI_MD5 | &quot;IMEI_MD5&quot;
OAID | &quot;OAID&quot;
OAID_MD5 | &quot;OAID_MD5&quot;
DEVICEID | &quot;DeviceID&quot;
PRIVATEID | &quot;PrivateID&quot;
BYTEID | &quot;ByteId&quot;
DY_MPID_OPENID | &quot;DY_MpID_OpenID&quot;
DY_MPID_OPENID_MD5 | &quot;DY_MpID_OpenID_MD5&quot;
