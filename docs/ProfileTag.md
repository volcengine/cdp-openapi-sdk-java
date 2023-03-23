# ProfileTag

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | 
**createWay** | [**CreateWayEnum**](#CreateWayEnum) |  | 
**createdAt** | **String** |  | 
**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  | 
**featureDataType** | [**FeatureDataTypeEnum**](#FeatureDataTypeEnum) |  | 
**id** | **Integer** |  | 
**idType** | **Integer** |  | 
**idTypeCode** | **String** |  |  [optional]
**name** | **String** |  | 
**originDataType** | [**OriginDataTypeEnum**](#OriginDataTypeEnum) |  |  [optional]
**originType** | [**OriginTypeEnum**](#OriginTypeEnum) |  |  [optional]
**readable** | **Boolean** |  |  [optional]
**tagDate** | **String** |  |  [optional]
**updatedAt** | **String** |  | 
**value** | **Object** |  |  [optional]

<a name="CreateWayEnum"></a>
## Enum: CreateWayEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
CALCU | &quot;calcu&quot;
RULE | &quot;rule&quot;
IMPORT | &quot;import&quot;
MANUAL | &quot;manual&quot;
SQL | &quot;sql&quot;
LOGIC | &quot;logic&quot;
COMBINE | &quot;combine&quot;
ML_MODEL | &quot;ml_model&quot;
ETL_MODEL | &quot;etl_model&quot;
CLICKHOUSE_SQL | &quot;clickhouse_sql&quot;
HIVE_SQL | &quot;hive_sql&quot;
MODEL | &quot;model&quot;
MULTI_STAGE | &quot;multi_stage&quot;
MAUTAG | &quot;mautag&quot;
RFM | &quot;rfm&quot;
STATISTICS | &quot;statistics&quot;
FIRST_LAST | &quot;first_last&quot;

<a name="DataTypeEnum"></a>
## Enum: DataTypeEnum
Name | Value
---- | -----
STRING | &quot;String&quot;
STRINGENUM | &quot;StringEnum&quot;
DECIMAL | &quot;Decimal&quot;
DECIMALENUM | &quot;DecimalEnum&quot;
DOUBLEDECIMAL | &quot;DoubleDecimal&quot;
INTDECIMAL | &quot;IntDecimal&quot;
DIMTLBTYPE | &quot;dimTlbType&quot;
ARRAY | &quot;Array&quot;
COMPOUND | &quot;Compound&quot;
COMPOUNDENUM | &quot;CompoundEnum&quot;
SEGTYPE | &quot;SegType&quot;
DATETIME | &quot;DateTime&quot;
DATE | &quot;Date&quot;
TIMESTAMP | &quot;Timestamp&quot;

<a name="FeatureDataTypeEnum"></a>
## Enum: FeatureDataTypeEnum
Name | Value
---- | -----
STRING | &quot;string&quot;
INT | &quot;int&quot;
BIGINT | &quot;bigint&quot;
DOUBLE | &quot;double&quot;
TIMESTAMP | &quot;timestamp&quot;
DECIMAL | &quot;decimal&quot;
LIST | &quot;list&quot;
DATE | &quot;date&quot;
DATETIME | &quot;datetime&quot;
ARRAY_STRING | &quot;array_string&quot;
ARRAY_STRING_ | &quot;array&lt;string&gt;&quot;

<a name="OriginDataTypeEnum"></a>
## Enum: OriginDataTypeEnum
Name | Value
---- | -----
STRING | &quot;string&quot;
INT | &quot;int&quot;
BIGINT | &quot;bigint&quot;
DOUBLE | &quot;double&quot;
TIMESTAMP | &quot;timestamp&quot;
DECIMAL | &quot;decimal&quot;
LIST | &quot;list&quot;
DATE | &quot;date&quot;
DATETIME | &quot;datetime&quot;
ARRAY_STRING | &quot;array_string&quot;
ARRAY_STRING_ | &quot;array&lt;string&gt;&quot;

<a name="OriginTypeEnum"></a>
## Enum: OriginTypeEnum
Name | Value
---- | -----
STRING | &quot;String&quot;
STRINGENUM | &quot;StringEnum&quot;
DECIMAL | &quot;Decimal&quot;
DECIMALENUM | &quot;DecimalEnum&quot;
DOUBLEDECIMAL | &quot;DoubleDecimal&quot;
INTDECIMAL | &quot;IntDecimal&quot;
DIMTLBTYPE | &quot;dimTlbType&quot;
ARRAY | &quot;Array&quot;
COMPOUND | &quot;Compound&quot;
COMPOUNDENUM | &quot;CompoundEnum&quot;
SEGTYPE | &quot;SegType&quot;
DATETIME | &quot;DateTime&quot;
DATE | &quot;Date&quot;
TIMESTAMP | &quot;Timestamp&quot;
