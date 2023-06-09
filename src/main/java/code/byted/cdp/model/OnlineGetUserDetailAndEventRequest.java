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
import code.byted.cdp.model.OnlineDataReq;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * OnlineGetUserDetailAndEventRequest
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class OnlineGetUserDetailAndEventRequest {
  @SerializedName("tenant_code")
  private String tenantCode = null;

  @SerializedName("ignore_illegal")
  private Boolean ignoreIllegal = null;

  @SerializedName("data_req")
  private OnlineDataReq dataReq = null;

  public OnlineGetUserDetailAndEventRequest tenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
    return this;
  }

   /**
   * Get tenantCode
   * @return tenantCode
  **/
  @Schema(description = "")
  public String getTenantCode() {
    return tenantCode;
  }

  public void setTenantCode(String tenantCode) {
    this.tenantCode = tenantCode;
  }

  public OnlineGetUserDetailAndEventRequest ignoreIllegal(Boolean ignoreIllegal) {
    this.ignoreIllegal = ignoreIllegal;
    return this;
  }

   /**
   * Get ignoreIllegal
   * @return ignoreIllegal
  **/
  @Schema(description = "")
  public Boolean isIgnoreIllegal() {
    return ignoreIllegal;
  }

  public void setIgnoreIllegal(Boolean ignoreIllegal) {
    this.ignoreIllegal = ignoreIllegal;
  }

  public OnlineGetUserDetailAndEventRequest dataReq(OnlineDataReq dataReq) {
    this.dataReq = dataReq;
    return this;
  }

   /**
   * Get dataReq
   * @return dataReq
  **/
  @Schema(description = "")
  public OnlineDataReq getDataReq() {
    return dataReq;
  }

  public void setDataReq(OnlineDataReq dataReq) {
    this.dataReq = dataReq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineGetUserDetailAndEventRequest onlineGetUserDetailAndEventRequest = (OnlineGetUserDetailAndEventRequest) o;
    return Objects.equals(this.tenantCode, onlineGetUserDetailAndEventRequest.tenantCode) &&
        Objects.equals(this.ignoreIllegal, onlineGetUserDetailAndEventRequest.ignoreIllegal) &&
        Objects.equals(this.dataReq, onlineGetUserDetailAndEventRequest.dataReq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantCode, ignoreIllegal, dataReq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineGetUserDetailAndEventRequest {\n");
    
    sb.append("    tenantCode: ").append(toIndentedString(tenantCode)).append("\n");
    sb.append("    ignoreIllegal: ").append(toIndentedString(ignoreIllegal)).append("\n");
    sb.append("    dataReq: ").append(toIndentedString(dataReq)).append("\n");
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
