# LabelTreeNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | 结点ID |  [optional]
**preNodeId** | **Integer** | 当前结点上层结点ID |  [optional]
**subjectId** | **Integer** | 主体ID |  [optional]
**projectId** | **Long** | 项目ID |  [optional]
**name** | **String** | 结点名称 |  [optional]
**desc** | **String** | 结点描述 |  [optional]
**nodeType** | **String** | 结点类型 |  [optional]
**createTime** | **String** | 结点创建时间 |  [optional]
**updateTime** | **String** | 结点修改时间 |  [optional]
**index** | **Integer** | 结点排序位置 |  [optional]
**level** | **Integer** | 结点层级 |  [optional]
**labelCount** | **Integer** | 结点所含标签个数 |  [optional]
**display** | **Boolean** | 结点显示标识符 |  [optional]
**subNodes** | [**List&lt;LabelTreeNode&gt;**](LabelTreeNode.md) | 子结点实体列表 |  [optional]
**labelInfos** | [**List&lt;LabelInfo&gt;**](LabelInfo.md) | 结点所挂载标签实体列表 |  [optional]
