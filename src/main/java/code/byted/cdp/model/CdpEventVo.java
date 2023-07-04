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
 * CdpEventVo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class CdpEventVo {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("eventId")
  private Integer eventId = null;

  @SerializedName("enName")
  private String enName = null;

  @SerializedName("cnName")
  private String cnName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("eventType")
  private Integer eventType = null;

  @SerializedName("originId")
  private Integer originId = null;

  @SerializedName("isDisplay")
  private Boolean isDisplay = null;

  @SerializedName("editBan")
  private Boolean editBan = null;

  @SerializedName("dataSourceId")
  private Integer dataSourceId = null;

  @SerializedName("dataSourceName")
  private String dataSourceName = null;

  @SerializedName("sourceTag")
  private String sourceTag = null;

  @SerializedName("sourceType")
  private Integer sourceType = null;

  public CdpEventVo id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * 事件id
   * @return id
  **/
  @Schema(description = "事件id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CdpEventVo eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * 事件id, 别名
   * @return eventId
  **/
  @Schema(description = "事件id, 别名")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public CdpEventVo enName(String enName) {
    this.enName = enName;
    return this;
  }

   /**
   * 事件名
   * @return enName
  **/
  @Schema(description = "事件名")
  public String getEnName() {
    return enName;
  }

  public void setEnName(String enName) {
    this.enName = enName;
  }

  public CdpEventVo cnName(String cnName) {
    this.cnName = cnName;
    return this;
  }

   /**
   * 事件展示名
   * @return cnName
  **/
  @Schema(description = "事件展示名")
  public String getCnName() {
    return cnName;
  }

  public void setCnName(String cnName) {
    this.cnName = cnName;
  }

  public CdpEventVo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 事件描述
   * @return description
  **/
  @Schema(description = "事件描述")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CdpEventVo eventType(Integer eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * 事件类型
   * @return eventType
  **/
  @Schema(description = "事件类型")
  public Integer getEventType() {
    return eventType;
  }

  public void setEventType(Integer eventType) {
    this.eventType = eventType;
  }

  public CdpEventVo originId(Integer originId) {
    this.originId = originId;
    return this;
  }

   /**
   * 第三方数据源原始id，默认0
   * @return originId
  **/
  @Schema(description = "第三方数据源原始id，默认0")
  public Integer getOriginId() {
    return originId;
  }

  public void setOriginId(Integer originId) {
    this.originId = originId;
  }

  public CdpEventVo isDisplay(Boolean isDisplay) {
    this.isDisplay = isDisplay;
    return this;
  }

   /**
   * 是否显示
   * @return isDisplay
  **/
  @Schema(description = "是否显示")
  public Boolean isIsDisplay() {
    return isDisplay;
  }

  public void setIsDisplay(Boolean isDisplay) {
    this.isDisplay = isDisplay;
  }

  public CdpEventVo editBan(Boolean editBan) {
    this.editBan = editBan;
    return this;
  }

   /**
   * 是否可编辑
   * @return editBan
  **/
  @Schema(description = "是否可编辑")
  public Boolean isEditBan() {
    return editBan;
  }

  public void setEditBan(Boolean editBan) {
    this.editBan = editBan;
  }

  public CdpEventVo dataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 数据源id
   * @return dataSourceId
  **/
  @Schema(description = "数据源id")
  public Integer getDataSourceId() {
    return dataSourceId;
  }

  public void setDataSourceId(Integer dataSourceId) {
    this.dataSourceId = dataSourceId;
  }

  public CdpEventVo dataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
    return this;
  }

   /**
   * 数据源名
   * @return dataSourceName
  **/
  @Schema(description = "数据源名")
  public String getDataSourceName() {
    return dataSourceName;
  }

  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }

  public CdpEventVo sourceTag(String sourceTag) {
    this.sourceTag = sourceTag;
    return this;
  }

   /**
   * 数据源注册来源
   * @return sourceTag
  **/
  @Schema(description = "数据源注册来源")
  public String getSourceTag() {
    return sourceTag;
  }

  public void setSourceTag(String sourceTag) {
    this.sourceTag = sourceTag;
  }

  public CdpEventVo sourceType(Integer sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * 数据源类型
   * @return sourceType
  **/
  @Schema(description = "数据源类型")
  public Integer getSourceType() {
    return sourceType;
  }

  public void setSourceType(Integer sourceType) {
    this.sourceType = sourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CdpEventVo cdpEventVo = (CdpEventVo) o;
    return Objects.equals(this.id, cdpEventVo.id) &&
        Objects.equals(this.eventId, cdpEventVo.eventId) &&
        Objects.equals(this.enName, cdpEventVo.enName) &&
        Objects.equals(this.cnName, cdpEventVo.cnName) &&
        Objects.equals(this.description, cdpEventVo.description) &&
        Objects.equals(this.eventType, cdpEventVo.eventType) &&
        Objects.equals(this.originId, cdpEventVo.originId) &&
        Objects.equals(this.isDisplay, cdpEventVo.isDisplay) &&
        Objects.equals(this.editBan, cdpEventVo.editBan) &&
        Objects.equals(this.dataSourceId, cdpEventVo.dataSourceId) &&
        Objects.equals(this.dataSourceName, cdpEventVo.dataSourceName) &&
        Objects.equals(this.sourceTag, cdpEventVo.sourceTag) &&
        Objects.equals(this.sourceType, cdpEventVo.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, eventId, enName, cnName, description, eventType, originId, isDisplay, editBan, dataSourceId, dataSourceName, sourceTag, sourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CdpEventVo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    enName: ").append(toIndentedString(enName)).append("\n");
    sb.append("    cnName: ").append(toIndentedString(cnName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
    sb.append("    isDisplay: ").append(toIndentedString(isDisplay)).append("\n");
    sb.append("    editBan: ").append(toIndentedString(editBan)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("    sourceTag: ").append(toIndentedString(sourceTag)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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
