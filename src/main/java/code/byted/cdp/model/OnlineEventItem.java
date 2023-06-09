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
/**
 * OnlineEventItem
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class OnlineEventItem {
  @SerializedName("datasource_id")
  private Integer datasourceId = null;

  @SerializedName("event_ids")
  private List<Integer> eventIds = null;

  @SerializedName("start_time")
  private String startTime = null;

  @SerializedName("end_time")
  private String endTime = null;

  @SerializedName("need_properties")
  private Boolean needProperties = null;

  public OnlineEventItem datasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
    return this;
  }

   /**
   * Get datasourceId
   * @return datasourceId
  **/
  @Schema(description = "")
  public Integer getDatasourceId() {
    return datasourceId;
  }

  public void setDatasourceId(Integer datasourceId) {
    this.datasourceId = datasourceId;
  }

  public OnlineEventItem eventIds(List<Integer> eventIds) {
    this.eventIds = eventIds;
    return this;
  }

  public OnlineEventItem addEventIdsItem(Integer eventIdsItem) {
    if (this.eventIds == null) {
      this.eventIds = new ArrayList<Integer>();
    }
    this.eventIds.add(eventIdsItem);
    return this;
  }

   /**
   * Get eventIds
   * @return eventIds
  **/
  @Schema(description = "")
  public List<Integer> getEventIds() {
    return eventIds;
  }

  public void setEventIds(List<Integer> eventIds) {
    this.eventIds = eventIds;
  }

  public OnlineEventItem startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @Schema(description = "")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public OnlineEventItem endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @Schema(description = "")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public OnlineEventItem needProperties(Boolean needProperties) {
    this.needProperties = needProperties;
    return this;
  }

   /**
   * Get needProperties
   * @return needProperties
  **/
  @Schema(description = "")
  public Boolean isNeedProperties() {
    return needProperties;
  }

  public void setNeedProperties(Boolean needProperties) {
    this.needProperties = needProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineEventItem onlineEventItem = (OnlineEventItem) o;
    return Objects.equals(this.datasourceId, onlineEventItem.datasourceId) &&
        Objects.equals(this.eventIds, onlineEventItem.eventIds) &&
        Objects.equals(this.startTime, onlineEventItem.startTime) &&
        Objects.equals(this.endTime, onlineEventItem.endTime) &&
        Objects.equals(this.needProperties, onlineEventItem.needProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasourceId, eventIds, startTime, endTime, needProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineEventItem {\n");
    
    sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
    sb.append("    eventIds: ").append(toIndentedString(eventIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    needProperties: ").append(toIndentedString(needProperties)).append("\n");
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
