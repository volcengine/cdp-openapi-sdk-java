/*
 * Copyright 2022 ByteDance and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * CDP开放接口
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2023-02-10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package code.byted.cdp.model;

import java.util.Objects;
import java.util.Arrays;
import code.byted.cdp.model.LabelInfo;
import code.byted.cdp.model.LabelTreeNode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * 标签树结点全部信息,部分字段在特定查询case下非null,返回值时为root层级结点List
 */
@Schema(description = "标签树结点全部信息,部分字段在特定查询case下非null,返回值时为root层级结点List")
@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class LabelTreeNode {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("preNodeId")
  private Integer preNodeId = null;

  @SerializedName("subjectId")
  private Integer subjectId = null;

  @SerializedName("projectId")
  private Long projectId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("nodeType")
  private String nodeType = null;

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("updateTime")
  private String updateTime = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("level")
  private Integer level = null;

  @SerializedName("labelCount")
  private Integer labelCount = null;

  @SerializedName("display")
  private Boolean display = null;

  @SerializedName("subNodes")
  private List<LabelTreeNode> subNodes = null;

  @SerializedName("labelInfos")
  private List<LabelInfo> labelInfos = null;

  public LabelTreeNode id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 结点ID
   * @return id
  **/
  @Schema(description = "结点ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LabelTreeNode preNodeId(Integer preNodeId) {
    this.preNodeId = preNodeId;
    return this;
  }

   /**
   * 当前结点上层结点ID
   * @return preNodeId
  **/
  @Schema(description = "当前结点上层结点ID")
  public Integer getPreNodeId() {
    return preNodeId;
  }

  public void setPreNodeId(Integer preNodeId) {
    this.preNodeId = preNodeId;
  }

  public LabelTreeNode subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * 主体ID
   * @return subjectId
  **/
  @Schema(description = "主体ID")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public LabelTreeNode projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @Schema(description = "项目ID")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public LabelTreeNode name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 结点名称
   * @return name
  **/
  @Schema(description = "结点名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LabelTreeNode desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 结点描述
   * @return desc
  **/
  @Schema(description = "结点描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public LabelTreeNode nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * 结点类型
   * @return nodeType
  **/
  @Schema(description = "结点类型")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public LabelTreeNode createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 结点创建时间
   * @return createTime
  **/
  @Schema(description = "结点创建时间")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public LabelTreeNode updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 结点修改时间
   * @return updateTime
  **/
  @Schema(description = "结点修改时间")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public LabelTreeNode index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * 结点排序位置
   * @return index
  **/
  @Schema(description = "结点排序位置")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public LabelTreeNode level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * 结点层级
   * @return level
  **/
  @Schema(description = "结点层级")
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public LabelTreeNode labelCount(Integer labelCount) {
    this.labelCount = labelCount;
    return this;
  }

   /**
   * 结点所含标签个数
   * @return labelCount
  **/
  @Schema(description = "结点所含标签个数")
  public Integer getLabelCount() {
    return labelCount;
  }

  public void setLabelCount(Integer labelCount) {
    this.labelCount = labelCount;
  }

  public LabelTreeNode display(Boolean display) {
    this.display = display;
    return this;
  }

   /**
   * 结点显示标识符
   * @return display
  **/
  @Schema(description = "结点显示标识符")
  public Boolean isDisplay() {
    return display;
  }

  public void setDisplay(Boolean display) {
    this.display = display;
  }

  public LabelTreeNode subNodes(List<LabelTreeNode> subNodes) {
    this.subNodes = subNodes;
    return this;
  }

  public LabelTreeNode addSubNodesItem(LabelTreeNode subNodesItem) {
    if (this.subNodes == null) {
      this.subNodes = new ArrayList<LabelTreeNode>();
    }
    this.subNodes.add(subNodesItem);
    return this;
  }

   /**
   * 子结点实体列表
   * @return subNodes
  **/
  @Schema(description = "子结点实体列表")
  public List<LabelTreeNode> getSubNodes() {
    return subNodes;
  }

  public void setSubNodes(List<LabelTreeNode> subNodes) {
    this.subNodes = subNodes;
  }

  public LabelTreeNode labelInfos(List<LabelInfo> labelInfos) {
    this.labelInfos = labelInfos;
    return this;
  }

  public LabelTreeNode addLabelInfosItem(LabelInfo labelInfosItem) {
    if (this.labelInfos == null) {
      this.labelInfos = new ArrayList<LabelInfo>();
    }
    this.labelInfos.add(labelInfosItem);
    return this;
  }

   /**
   * 结点所挂载标签实体列表
   * @return labelInfos
  **/
  @Schema(description = "结点所挂载标签实体列表")
  public List<LabelInfo> getLabelInfos() {
    return labelInfos;
  }

  public void setLabelInfos(List<LabelInfo> labelInfos) {
    this.labelInfos = labelInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelTreeNode labelTreeNode = (LabelTreeNode) o;
    return Objects.equals(this.id, labelTreeNode.id) &&
        Objects.equals(this.preNodeId, labelTreeNode.preNodeId) &&
        Objects.equals(this.subjectId, labelTreeNode.subjectId) &&
        Objects.equals(this.projectId, labelTreeNode.projectId) &&
        Objects.equals(this.name, labelTreeNode.name) &&
        Objects.equals(this.desc, labelTreeNode.desc) &&
        Objects.equals(this.nodeType, labelTreeNode.nodeType) &&
        Objects.equals(this.createTime, labelTreeNode.createTime) &&
        Objects.equals(this.updateTime, labelTreeNode.updateTime) &&
        Objects.equals(this.index, labelTreeNode.index) &&
        Objects.equals(this.level, labelTreeNode.level) &&
        Objects.equals(this.labelCount, labelTreeNode.labelCount) &&
        Objects.equals(this.display, labelTreeNode.display) &&
        Objects.equals(this.subNodes, labelTreeNode.subNodes) &&
        Objects.equals(this.labelInfos, labelTreeNode.labelInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, preNodeId, subjectId, projectId, name, desc, nodeType, createTime, updateTime, index, level, labelCount, display, subNodes, labelInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelTreeNode {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    preNodeId: ").append(toIndentedString(preNodeId)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    labelCount: ").append(toIndentedString(labelCount)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    subNodes: ").append(toIndentedString(subNodes)).append("\n");
    sb.append("    labelInfos: ").append(toIndentedString(labelInfos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
