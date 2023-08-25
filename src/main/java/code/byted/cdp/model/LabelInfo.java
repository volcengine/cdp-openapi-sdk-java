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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LabelInfo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-25T10:31:52.572+08:00[Asia/Shanghai]")
public class LabelInfo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("subjectId")
  private Integer subjectId = null;

  @SerializedName("projectId")
  private Long projectId = null;

  @SerializedName("orgId")
  private Long orgId = null;

  @SerializedName("entityId")
  private Integer entityId = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("labelType")
  private String labelType = null;

  @SerializedName("dataType")
  private String dataType = null;

  @SerializedName("creator")
  private String creator = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("createTime")
  private String createTime = null;

  @SerializedName("updateTime")
  private String updateTime = null;

  @SerializedName("computeType")
  private String computeType = null;

  @SerializedName("isMautag")
  private Integer isMautag = null;

  @SerializedName("taskId")
  private Long taskId = null;

  @SerializedName("dimMetId")
  private Integer dimMetId = null;

  @SerializedName("updater")
  private String updater = null;

  @SerializedName("dataSecurityLevel")
  private String dataSecurityLevel = null;

  @SerializedName("createApiTask")
  private Boolean createApiTask = null;

  @SerializedName("env")
  private String env = null;

  @SerializedName("syncStatus")
  private Integer syncStatus = null;

  @SerializedName("syncTime")
  private String syncTime = null;

  @SerializedName("syncId")
  private Integer syncId = null;

  @SerializedName("nodeId")
  private Integer nodeId = null;

  @SerializedName("index")
  private Integer index = null;

  @SerializedName("readable")
  private Boolean readable = null;

  @SerializedName("isCollected")
  private Boolean isCollected = null;

  @SerializedName("isTemplateLabel")
  private Boolean isTemplateLabel = null;

  @SerializedName("isOnlineService")
  private Boolean isOnlineService = null;

  @SerializedName("refreshFreqDetails")
  private String refreshFreqDetails = null;

  @SerializedName("coverage")
  private String coverage = null;

  public LabelInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 标签id
   * @return id
  **/
  @Schema(description = "标签id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LabelInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 标签名
   * @return name
  **/
  @Schema(description = "标签名")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LabelInfo subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * 主体id
   * @return subjectId
  **/
  @Schema(description = "主体id")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public LabelInfo projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  @Schema(description = "项目id")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public LabelInfo orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * 集团id
   * @return orgId
  **/
  @Schema(description = "集团id")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public LabelInfo entityId(Integer entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * 实体类型id
   * @return entityId
  **/
  @Schema(description = "实体类型id")
  public Integer getEntityId() {
    return entityId;
  }

  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }

  public LabelInfo entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * 实体类型
   * @return entityType
  **/
  @Schema(description = "实体类型")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public LabelInfo labelType(String labelType) {
    this.labelType = labelType;
    return this;
  }

   /**
   * 标签类型
   * @return labelType
  **/
  @Schema(description = "标签类型")
  public String getLabelType() {
    return labelType;
  }

  public void setLabelType(String labelType) {
    this.labelType = labelType;
  }

  public LabelInfo dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * 标签值类型(映射后)
   * @return dataType
  **/
  @Schema(description = "标签值类型(映射后)")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public LabelInfo creator(String creator) {
    this.creator = creator;
    return this;
  }

   /**
   * 标签创建人
   * @return creator
  **/
  @Schema(description = "标签创建人")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public LabelInfo status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * 标签状态,0-正常,1-已删除
   * @return status
  **/
  @Schema(description = "标签状态,0-正常,1-已删除")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LabelInfo desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * 标签描述
   * @return desc
  **/
  @Schema(description = "标签描述")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public LabelInfo createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 标签创建时间
   * @return createTime
  **/
  @Schema(description = "标签创建时间")
  public String getCreateTime() {
    return createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public LabelInfo updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * 标签更新时间
   * @return updateTime
  **/
  @Schema(description = "标签更新时间")
  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public LabelInfo computeType(String computeType) {
    this.computeType = computeType;
    return this;
  }

   /**
   * 标签更新方式
   * @return computeType
  **/
  @Schema(description = "标签更新方式")
  public String getComputeType() {
    return computeType;
  }

  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }

  public LabelInfo isMautag(Integer isMautag) {
    this.isMautag = isMautag;
    return this;
  }

   /**
   * 是否为mautag,0-否,1-是
   * @return isMautag
  **/
  @Schema(description = "是否为mautag,0-否,1-是")
  public Integer getIsMautag() {
    return isMautag;
  }

  public void setIsMautag(Integer isMautag) {
    this.isMautag = isMautag;
  }

  public LabelInfo taskId(Long taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * 标签任务id
   * @return taskId
  **/
  @Schema(description = "标签任务id")
  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public LabelInfo dimMetId(Integer dimMetId) {
    this.dimMetId = dimMetId;
    return this;
  }

   /**
   * 标签在标签数据集中对应的维度指标id
   * @return dimMetId
  **/
  @Schema(description = "标签在标签数据集中对应的维度指标id")
  public Integer getDimMetId() {
    return dimMetId;
  }

  public void setDimMetId(Integer dimMetId) {
    this.dimMetId = dimMetId;
  }

  public LabelInfo updater(String updater) {
    this.updater = updater;
    return this;
  }

   /**
   * 标签最近修改人
   * @return updater
  **/
  @Schema(description = "标签最近修改人")
  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  public LabelInfo dataSecurityLevel(String dataSecurityLevel) {
    this.dataSecurityLevel = dataSecurityLevel;
    return this;
  }

   /**
   * 标签权限等级,默认L3
   * @return dataSecurityLevel
  **/
  @Schema(description = "标签权限等级,默认L3")
  public String getDataSecurityLevel() {
    return dataSecurityLevel;
  }

  public void setDataSecurityLevel(String dataSecurityLevel) {
    this.dataSecurityLevel = dataSecurityLevel;
  }

  public LabelInfo createApiTask(Boolean createApiTask) {
    this.createApiTask = createApiTask;
    return this;
  }

   /**
   * 在线api任务,0未创建,1已创建
   * @return createApiTask
  **/
  @Schema(description = "在线api任务,0未创建,1已创建")
  public Boolean isCreateApiTask() {
    return createApiTask;
  }

  public void setCreateApiTask(Boolean createApiTask) {
    this.createApiTask = createApiTask;
  }

  public LabelInfo env(String env) {
    this.env = env;
    return this;
  }

   /**
   * 标签环境:dev/prod
   * @return env
  **/
  @Schema(description = "标签环境:dev/prod")
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public LabelInfo syncStatus(Integer syncStatus) {
    this.syncStatus = syncStatus;
    return this;
  }

   /**
   * 同步状态:0-未同步,1-已同步,2-修改未同步
   * @return syncStatus
  **/
  @Schema(description = "同步状态:0-未同步,1-已同步,2-修改未同步")
  public Integer getSyncStatus() {
    return syncStatus;
  }

  public void setSyncStatus(Integer syncStatus) {
    this.syncStatus = syncStatus;
  }

  public LabelInfo syncTime(String syncTime) {
    this.syncTime = syncTime;
    return this;
  }

   /**
   * 同步时间
   * @return syncTime
  **/
  @Schema(description = "同步时间")
  public String getSyncTime() {
    return syncTime;
  }

  public void setSyncTime(String syncTime) {
    this.syncTime = syncTime;
  }

  public LabelInfo syncId(Integer syncId) {
    this.syncId = syncId;
    return this;
  }

   /**
   * 该标签对应prod环境的标签id,非多环境/prod应为null
   * @return syncId
  **/
  @Schema(description = "该标签对应prod环境的标签id,非多环境/prod应为null")
  public Integer getSyncId() {
    return syncId;
  }

  public void setSyncId(Integer syncId) {
    this.syncId = syncId;
  }

  public LabelInfo nodeId(Integer nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * 标签所在的目录id
   * @return nodeId
  **/
  @Schema(description = "标签所在的目录id")
  public Integer getNodeId() {
    return nodeId;
  }

  public void setNodeId(Integer nodeId) {
    this.nodeId = nodeId;
  }

  public LabelInfo index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * 标签索引位置
   * @return index
  **/
  @Schema(description = "标签索引位置")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public LabelInfo readable(Boolean readable) {
    this.readable = readable;
    return this;
  }

   /**
   * 标签是否可读
   * @return readable
  **/
  @Schema(description = "标签是否可读")
  public Boolean isReadable() {
    return readable;
  }

  public void setReadable(Boolean readable) {
    this.readable = readable;
  }

  public LabelInfo isCollected(Boolean isCollected) {
    this.isCollected = isCollected;
    return this;
  }

   /**
   * 标签是否被收藏
   * @return isCollected
  **/
  @Schema(description = "标签是否被收藏")
  public Boolean isIsCollected() {
    return isCollected;
  }

  public void setIsCollected(Boolean isCollected) {
    this.isCollected = isCollected;
  }

  public LabelInfo isTemplateLabel(Boolean isTemplateLabel) {
    this.isTemplateLabel = isTemplateLabel;
    return this;
  }

   /**
   * 标签是否是模版标签
   * @return isTemplateLabel
  **/
  @Schema(description = "标签是否是模版标签")
  public Boolean isIsTemplateLabel() {
    return isTemplateLabel;
  }

  public void setIsTemplateLabel(Boolean isTemplateLabel) {
    this.isTemplateLabel = isTemplateLabel;
  }

  public LabelInfo isOnlineService(Boolean isOnlineService) {
    this.isOnlineService = isOnlineService;
    return this;
  }

   /**
   * 标签是否成功导入在线服务
   * @return isOnlineService
  **/
  @Schema(description = "标签是否成功导入在线服务")
  public Boolean isIsOnlineService() {
    return isOnlineService;
  }

  public void setIsOnlineService(Boolean isOnlineService) {
    this.isOnlineService = isOnlineService;
  }

  public LabelInfo refreshFreqDetails(String refreshFreqDetails) {
    this.refreshFreqDetails = refreshFreqDetails;
    return this;
  }

   /**
   * 标签更新频率
   * @return refreshFreqDetails
  **/
  @Schema(description = "标签更新频率")
  public String getRefreshFreqDetails() {
    return refreshFreqDetails;
  }

  public void setRefreshFreqDetails(String refreshFreqDetails) {
    this.refreshFreqDetails = refreshFreqDetails;
  }

  public LabelInfo coverage(String coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * 标签覆盖率
   * @return coverage
  **/
  @Schema(description = "标签覆盖率")
  public String getCoverage() {
    return coverage;
  }

  public void setCoverage(String coverage) {
    this.coverage = coverage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelInfo labelInfo = (LabelInfo) o;
    return Objects.equals(this.id, labelInfo.id) &&
        Objects.equals(this.name, labelInfo.name) &&
        Objects.equals(this.subjectId, labelInfo.subjectId) &&
        Objects.equals(this.projectId, labelInfo.projectId) &&
        Objects.equals(this.orgId, labelInfo.orgId) &&
        Objects.equals(this.entityId, labelInfo.entityId) &&
        Objects.equals(this.entityType, labelInfo.entityType) &&
        Objects.equals(this.labelType, labelInfo.labelType) &&
        Objects.equals(this.dataType, labelInfo.dataType) &&
        Objects.equals(this.creator, labelInfo.creator) &&
        Objects.equals(this.status, labelInfo.status) &&
        Objects.equals(this.desc, labelInfo.desc) &&
        Objects.equals(this.createTime, labelInfo.createTime) &&
        Objects.equals(this.updateTime, labelInfo.updateTime) &&
        Objects.equals(this.computeType, labelInfo.computeType) &&
        Objects.equals(this.isMautag, labelInfo.isMautag) &&
        Objects.equals(this.taskId, labelInfo.taskId) &&
        Objects.equals(this.dimMetId, labelInfo.dimMetId) &&
        Objects.equals(this.updater, labelInfo.updater) &&
        Objects.equals(this.dataSecurityLevel, labelInfo.dataSecurityLevel) &&
        Objects.equals(this.createApiTask, labelInfo.createApiTask) &&
        Objects.equals(this.env, labelInfo.env) &&
        Objects.equals(this.syncStatus, labelInfo.syncStatus) &&
        Objects.equals(this.syncTime, labelInfo.syncTime) &&
        Objects.equals(this.syncId, labelInfo.syncId) &&
        Objects.equals(this.nodeId, labelInfo.nodeId) &&
        Objects.equals(this.index, labelInfo.index) &&
        Objects.equals(this.readable, labelInfo.readable) &&
        Objects.equals(this.isCollected, labelInfo.isCollected) &&
        Objects.equals(this.isTemplateLabel, labelInfo.isTemplateLabel) &&
        Objects.equals(this.isOnlineService, labelInfo.isOnlineService) &&
        Objects.equals(this.refreshFreqDetails, labelInfo.refreshFreqDetails) &&
        Objects.equals(this.coverage, labelInfo.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subjectId, projectId, orgId, entityId, entityType, labelType, dataType, creator, status, desc, createTime, updateTime, computeType, isMautag, taskId, dimMetId, updater, dataSecurityLevel, createApiTask, env, syncStatus, syncTime, syncId, nodeId, index, readable, isCollected, isTemplateLabel, isOnlineService, refreshFreqDetails, coverage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    isMautag: ").append(toIndentedString(isMautag)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dimMetId: ").append(toIndentedString(dimMetId)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    dataSecurityLevel: ").append(toIndentedString(dataSecurityLevel)).append("\n");
    sb.append("    createApiTask: ").append(toIndentedString(createApiTask)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
    sb.append("    syncTime: ").append(toIndentedString(syncTime)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    readable: ").append(toIndentedString(readable)).append("\n");
    sb.append("    isCollected: ").append(toIndentedString(isCollected)).append("\n");
    sb.append("    isTemplateLabel: ").append(toIndentedString(isTemplateLabel)).append("\n");
    sb.append("    isOnlineService: ").append(toIndentedString(isOnlineService)).append("\n");
    sb.append("    refreshFreqDetails: ").append(toIndentedString(refreshFreqDetails)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
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
