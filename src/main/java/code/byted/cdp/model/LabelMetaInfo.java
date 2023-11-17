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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * LabelMetaInfo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-11-17T15:32:30.245+08:00[Asia/Shanghai]")
public class LabelMetaInfo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("orgId")
  private Long orgId = null;

  @SerializedName("projectId")
  private Long projectId = null;

  @SerializedName("descr")
  private String descr = null;

  @SerializedName("dataSecurityLevel")
  private String dataSecurityLevel = null;

  @SerializedName("labelType")
  private String labelType = null;

  @SerializedName("dataTypeName")
  private String dataTypeName = null;

  @SerializedName("domainId")
  private Integer domainId = null;

  @SerializedName("position")
  private Double position = null;

  @SerializedName("entityId")
  private Integer entityId = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("computeType")
  private String computeType = null;

  @SerializedName("isMautag")
  private Integer isMautag = null;

  @SerializedName("syncParams")
  private Object syncParams = null;

  @SerializedName("conf")
  private Object conf = null;

  @SerializedName("taskId")
  private Integer taskId = null;

  @SerializedName("dimMetId")
  private Integer dimMetId = null;

  @SerializedName("labelRangeRules")
  private Object labelRangeRules = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("createApiTask")
  private Boolean createApiTask = null;

  @SerializedName("realtimeTaskId")
  private Integer realtimeTaskId = null;

  @SerializedName("realtimeStatus")
  private Integer realtimeStatus = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("createTime")
  private OffsetDateTime createTime = null;

  @SerializedName("updater")
  private String updater = null;

  @SerializedName("updateTime")
  private OffsetDateTime updateTime = null;

  @SerializedName("abiDimMetId")
  private Integer abiDimMetId = null;

  @SerializedName("lastSuccessTaskInstanceId")
  private Integer lastSuccessTaskInstanceId = null;

  @SerializedName("latestRunDate")
  private OffsetDateTime latestRunDate = null;

  @SerializedName("userNum")
  private Integer userNum = null;

  @SerializedName("values")
  private List<String> values = null;

  public LabelMetaInfo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LabelMetaInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LabelMetaInfo orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @Schema(description = "")
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public LabelMetaInfo projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public LabelMetaInfo descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * Get descr
   * @return descr
  **/
  @Schema(description = "")
  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public LabelMetaInfo dataSecurityLevel(String dataSecurityLevel) {
    this.dataSecurityLevel = dataSecurityLevel;
    return this;
  }

   /**
   * Get dataSecurityLevel
   * @return dataSecurityLevel
  **/
  @Schema(description = "")
  public String getDataSecurityLevel() {
    return dataSecurityLevel;
  }

  public void setDataSecurityLevel(String dataSecurityLevel) {
    this.dataSecurityLevel = dataSecurityLevel;
  }

  public LabelMetaInfo labelType(String labelType) {
    this.labelType = labelType;
    return this;
  }

   /**
   * Get labelType
   * @return labelType
  **/
  @Schema(description = "")
  public String getLabelType() {
    return labelType;
  }

  public void setLabelType(String labelType) {
    this.labelType = labelType;
  }

  public LabelMetaInfo dataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
    return this;
  }

   /**
   * Get dataTypeName
   * @return dataTypeName
  **/
  @Schema(description = "")
  public String getDataTypeName() {
    return dataTypeName;
  }

  public void setDataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
  }

  public LabelMetaInfo domainId(Integer domainId) {
    this.domainId = domainId;
    return this;
  }

   /**
   * Get domainId
   * @return domainId
  **/
  @Schema(description = "")
  public Integer getDomainId() {
    return domainId;
  }

  public void setDomainId(Integer domainId) {
    this.domainId = domainId;
  }

  public LabelMetaInfo position(Double position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @Schema(description = "")
  public Double getPosition() {
    return position;
  }

  public void setPosition(Double position) {
    this.position = position;
  }

  public LabelMetaInfo entityId(Integer entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @Schema(description = "")
  public Integer getEntityId() {
    return entityId;
  }

  public void setEntityId(Integer entityId) {
    this.entityId = entityId;
  }

  public LabelMetaInfo entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @Schema(description = "")
  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public LabelMetaInfo computeType(String computeType) {
    this.computeType = computeType;
    return this;
  }

   /**
   * Get computeType
   * @return computeType
  **/
  @Schema(description = "")
  public String getComputeType() {
    return computeType;
  }

  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }

  public LabelMetaInfo isMautag(Integer isMautag) {
    this.isMautag = isMautag;
    return this;
  }

   /**
   * Get isMautag
   * @return isMautag
  **/
  @Schema(description = "")
  public Integer getIsMautag() {
    return isMautag;
  }

  public void setIsMautag(Integer isMautag) {
    this.isMautag = isMautag;
  }

  public LabelMetaInfo syncParams(Object syncParams) {
    this.syncParams = syncParams;
    return this;
  }

   /**
   * Get syncParams
   * @return syncParams
  **/
  @Schema(description = "")
  public Object getSyncParams() {
    return syncParams;
  }

  public void setSyncParams(Object syncParams) {
    this.syncParams = syncParams;
  }

  public LabelMetaInfo conf(Object conf) {
    this.conf = conf;
    return this;
  }

   /**
   * Get conf
   * @return conf
  **/
  @Schema(description = "")
  public Object getConf() {
    return conf;
  }

  public void setConf(Object conf) {
    this.conf = conf;
  }

  public LabelMetaInfo taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public LabelMetaInfo dimMetId(Integer dimMetId) {
    this.dimMetId = dimMetId;
    return this;
  }

   /**
   * Get dimMetId
   * @return dimMetId
  **/
  @Schema(description = "")
  public Integer getDimMetId() {
    return dimMetId;
  }

  public void setDimMetId(Integer dimMetId) {
    this.dimMetId = dimMetId;
  }

  public LabelMetaInfo labelRangeRules(Object labelRangeRules) {
    this.labelRangeRules = labelRangeRules;
    return this;
  }

   /**
   * Get labelRangeRules
   * @return labelRangeRules
  **/
  @Schema(description = "")
  public Object getLabelRangeRules() {
    return labelRangeRules;
  }

  public void setLabelRangeRules(Object labelRangeRules) {
    this.labelRangeRules = labelRangeRules;
  }

  public LabelMetaInfo status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LabelMetaInfo createApiTask(Boolean createApiTask) {
    this.createApiTask = createApiTask;
    return this;
  }

   /**
   * Get createApiTask
   * @return createApiTask
  **/
  @Schema(description = "")
  public Boolean isCreateApiTask() {
    return createApiTask;
  }

  public void setCreateApiTask(Boolean createApiTask) {
    this.createApiTask = createApiTask;
  }

  public LabelMetaInfo realtimeTaskId(Integer realtimeTaskId) {
    this.realtimeTaskId = realtimeTaskId;
    return this;
  }

   /**
   * Get realtimeTaskId
   * @return realtimeTaskId
  **/
  @Schema(description = "")
  public Integer getRealtimeTaskId() {
    return realtimeTaskId;
  }

  public void setRealtimeTaskId(Integer realtimeTaskId) {
    this.realtimeTaskId = realtimeTaskId;
  }

  public LabelMetaInfo realtimeStatus(Integer realtimeStatus) {
    this.realtimeStatus = realtimeStatus;
    return this;
  }

   /**
   * Get realtimeStatus
   * @return realtimeStatus
  **/
  @Schema(description = "")
  public Integer getRealtimeStatus() {
    return realtimeStatus;
  }

  public void setRealtimeStatus(Integer realtimeStatus) {
    this.realtimeStatus = realtimeStatus;
  }

  public LabelMetaInfo owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @Schema(description = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public LabelMetaInfo createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @Schema(description = "")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public LabelMetaInfo updater(String updater) {
    this.updater = updater;
    return this;
  }

   /**
   * Get updater
   * @return updater
  **/
  @Schema(description = "")
  public String getUpdater() {
    return updater;
  }

  public void setUpdater(String updater) {
    this.updater = updater;
  }

  public LabelMetaInfo updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }

  public LabelMetaInfo abiDimMetId(Integer abiDimMetId) {
    this.abiDimMetId = abiDimMetId;
    return this;
  }

   /**
   * Get abiDimMetId
   * @return abiDimMetId
  **/
  @Schema(description = "")
  public Integer getAbiDimMetId() {
    return abiDimMetId;
  }

  public void setAbiDimMetId(Integer abiDimMetId) {
    this.abiDimMetId = abiDimMetId;
  }

  public LabelMetaInfo lastSuccessTaskInstanceId(Integer lastSuccessTaskInstanceId) {
    this.lastSuccessTaskInstanceId = lastSuccessTaskInstanceId;
    return this;
  }

   /**
   * Get lastSuccessTaskInstanceId
   * @return lastSuccessTaskInstanceId
  **/
  @Schema(description = "")
  public Integer getLastSuccessTaskInstanceId() {
    return lastSuccessTaskInstanceId;
  }

  public void setLastSuccessTaskInstanceId(Integer lastSuccessTaskInstanceId) {
    this.lastSuccessTaskInstanceId = lastSuccessTaskInstanceId;
  }

  public LabelMetaInfo latestRunDate(OffsetDateTime latestRunDate) {
    this.latestRunDate = latestRunDate;
    return this;
  }

   /**
   * Get latestRunDate
   * @return latestRunDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLatestRunDate() {
    return latestRunDate;
  }

  public void setLatestRunDate(OffsetDateTime latestRunDate) {
    this.latestRunDate = latestRunDate;
  }

  public LabelMetaInfo userNum(Integer userNum) {
    this.userNum = userNum;
    return this;
  }

   /**
   * Get userNum
   * @return userNum
  **/
  @Schema(description = "")
  public Integer getUserNum() {
    return userNum;
  }

  public void setUserNum(Integer userNum) {
    this.userNum = userNum;
  }

  public LabelMetaInfo values(List<String> values) {
    this.values = values;
    return this;
  }

  public LabelMetaInfo addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @Schema(description = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelMetaInfo labelMetaInfo = (LabelMetaInfo) o;
    return Objects.equals(this.id, labelMetaInfo.id) &&
        Objects.equals(this.name, labelMetaInfo.name) &&
        Objects.equals(this.orgId, labelMetaInfo.orgId) &&
        Objects.equals(this.projectId, labelMetaInfo.projectId) &&
        Objects.equals(this.descr, labelMetaInfo.descr) &&
        Objects.equals(this.dataSecurityLevel, labelMetaInfo.dataSecurityLevel) &&
        Objects.equals(this.labelType, labelMetaInfo.labelType) &&
        Objects.equals(this.dataTypeName, labelMetaInfo.dataTypeName) &&
        Objects.equals(this.domainId, labelMetaInfo.domainId) &&
        Objects.equals(this.position, labelMetaInfo.position) &&
        Objects.equals(this.entityId, labelMetaInfo.entityId) &&
        Objects.equals(this.entityType, labelMetaInfo.entityType) &&
        Objects.equals(this.computeType, labelMetaInfo.computeType) &&
        Objects.equals(this.isMautag, labelMetaInfo.isMautag) &&
        Objects.equals(this.syncParams, labelMetaInfo.syncParams) &&
        Objects.equals(this.conf, labelMetaInfo.conf) &&
        Objects.equals(this.taskId, labelMetaInfo.taskId) &&
        Objects.equals(this.dimMetId, labelMetaInfo.dimMetId) &&
        Objects.equals(this.labelRangeRules, labelMetaInfo.labelRangeRules) &&
        Objects.equals(this.status, labelMetaInfo.status) &&
        Objects.equals(this.createApiTask, labelMetaInfo.createApiTask) &&
        Objects.equals(this.realtimeTaskId, labelMetaInfo.realtimeTaskId) &&
        Objects.equals(this.realtimeStatus, labelMetaInfo.realtimeStatus) &&
        Objects.equals(this.owner, labelMetaInfo.owner) &&
        Objects.equals(this.createTime, labelMetaInfo.createTime) &&
        Objects.equals(this.updater, labelMetaInfo.updater) &&
        Objects.equals(this.updateTime, labelMetaInfo.updateTime) &&
        Objects.equals(this.abiDimMetId, labelMetaInfo.abiDimMetId) &&
        Objects.equals(this.lastSuccessTaskInstanceId, labelMetaInfo.lastSuccessTaskInstanceId) &&
        Objects.equals(this.latestRunDate, labelMetaInfo.latestRunDate) &&
        Objects.equals(this.userNum, labelMetaInfo.userNum) &&
        Objects.equals(this.values, labelMetaInfo.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, orgId, projectId, descr, dataSecurityLevel, labelType, dataTypeName, domainId, position, entityId, entityType, computeType, isMautag, syncParams, conf, taskId, dimMetId, labelRangeRules, status, createApiTask, realtimeTaskId, realtimeStatus, owner, createTime, updater, updateTime, abiDimMetId, lastSuccessTaskInstanceId, latestRunDate, userNum, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelMetaInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    dataSecurityLevel: ").append(toIndentedString(dataSecurityLevel)).append("\n");
    sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
    sb.append("    dataTypeName: ").append(toIndentedString(dataTypeName)).append("\n");
    sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    isMautag: ").append(toIndentedString(isMautag)).append("\n");
    sb.append("    syncParams: ").append(toIndentedString(syncParams)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    dimMetId: ").append(toIndentedString(dimMetId)).append("\n");
    sb.append("    labelRangeRules: ").append(toIndentedString(labelRangeRules)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createApiTask: ").append(toIndentedString(createApiTask)).append("\n");
    sb.append("    realtimeTaskId: ").append(toIndentedString(realtimeTaskId)).append("\n");
    sb.append("    realtimeStatus: ").append(toIndentedString(realtimeStatus)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    abiDimMetId: ").append(toIndentedString(abiDimMetId)).append("\n");
    sb.append("    lastSuccessTaskInstanceId: ").append(toIndentedString(lastSuccessTaskInstanceId)).append("\n");
    sb.append("    latestRunDate: ").append(toIndentedString(latestRunDate)).append("\n");
    sb.append("    userNum: ").append(toIndentedString(userNum)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
