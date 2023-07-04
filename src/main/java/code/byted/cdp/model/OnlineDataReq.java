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
import code.byted.cdp.model.OnlineDetailItem;
import code.byted.cdp.model.OnlineEventItem;
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
 * OnlineDataReq
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T11:23:30.393+08:00[Asia/Shanghai]")
public class OnlineDataReq {
  @SerializedName("id")
  private String id = null;

  @SerializedName("id_type")
  private String idType = null;

  @SerializedName("event")
  private List<OnlineEventItem> event = null;

  @SerializedName("detail")
  private List<OnlineDetailItem> detail = null;

  public OnlineDataReq id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OnlineDataReq idType(String idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(description = "")
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public OnlineDataReq event(List<OnlineEventItem> event) {
    this.event = event;
    return this;
  }

  public OnlineDataReq addEventItem(OnlineEventItem eventItem) {
    if (this.event == null) {
      this.event = new ArrayList<OnlineEventItem>();
    }
    this.event.add(eventItem);
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(description = "")
  public List<OnlineEventItem> getEvent() {
    return event;
  }

  public void setEvent(List<OnlineEventItem> event) {
    this.event = event;
  }

  public OnlineDataReq detail(List<OnlineDetailItem> detail) {
    this.detail = detail;
    return this;
  }

  public OnlineDataReq addDetailItem(OnlineDetailItem detailItem) {
    if (this.detail == null) {
      this.detail = new ArrayList<OnlineDetailItem>();
    }
    this.detail.add(detailItem);
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @Schema(description = "")
  public List<OnlineDetailItem> getDetail() {
    return detail;
  }

  public void setDetail(List<OnlineDetailItem> detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineDataReq onlineDataReq = (OnlineDataReq) o;
    return Objects.equals(this.id, onlineDataReq.id) &&
        Objects.equals(this.idType, onlineDataReq.idType) &&
        Objects.equals(this.event, onlineDataReq.event) &&
        Objects.equals(this.detail, onlineDataReq.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType, event, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineDataReq {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
