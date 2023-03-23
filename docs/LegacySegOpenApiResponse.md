# LegacySegOpenApiResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 分群id | 
**name** | **String** | 分群名称 | 
**idType** | **String** | 分群实体类型code | 
**idTypeName** | **String** | 分群实体类型名称 | 
**subjectId** | **Integer** | 主体id | 
**count** | **Long** | 分群数量 |  [optional]
**createdBy** | **String** | 分群创建人 | 
**path** | **String** | 分群离线文件地址 |  [optional]
**exportAt** | **String** | 分群离线文件导出时间，未就绪时为当前时间戳 | 
**exportStrategy** | [**ExportStrategyEnum**](#ExportStrategyEnum) | 分群更新方式 | 
**segStatus** | [**SegStatusEnum**](#SegStatusEnum) | 分群任务状态 | 
**sourceResultReady** | **Boolean** | 分群是否就绪 | 
**cantPublicType** | **String** | 废弃字段 |  [optional]
**hasPublicBefore** | **Boolean** | 废弃字段 |  [optional]
**createdAt** | **String** | 分群创建时间 | 
**version** | **Integer** | 分群在ck中的最新版本号 |  [optional]
**onlineSegStatus** | **Boolean** | 分群是否开启了在线服务配置 |  [optional]
**pdate** | [**LocalDate**](LocalDate.md) |  |  [optional]

<a name="ExportStrategyEnum"></a>
## Enum: ExportStrategyEnum
Name | Value
---- | -----
ONCE | &quot;Once&quot;
DAILY | &quot;Daily&quot;
TRIGGER | &quot;Trigger&quot;

<a name="SegStatusEnum"></a>
## Enum: SegStatusEnum
Name | Value
---- | -----
EXPORTING | &quot;Exporting&quot;
INVALID | &quot;Invalid&quot;
NORMAL | &quot;Normal&quot;
