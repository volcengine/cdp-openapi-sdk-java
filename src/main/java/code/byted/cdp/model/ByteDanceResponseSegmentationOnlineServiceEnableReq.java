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
 * ByteDanceResponseSegmentationOnlineServiceEnableReq
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-04-18T11:26:59.028+08:00[Asia/Shanghai]")
public class ByteDanceResponseSegmentationOnlineServiceEnableReq {
  @SerializedName("onlineServiceEnabled")
  private Boolean onlineServiceEnabled = null;

  public ByteDanceResponseSegmentationOnlineServiceEnableReq onlineServiceEnabled(Boolean onlineServiceEnabled) {
    this.onlineServiceEnabled = onlineServiceEnabled;
    return this;
  }

   /**
   * Get onlineServiceEnabled
   * @return onlineServiceEnabled
  **/
  @Schema(required = true, description = "")
  public Boolean isOnlineServiceEnabled() {
    return onlineServiceEnabled;
  }

  public void setOnlineServiceEnabled(Boolean onlineServiceEnabled) {
    this.onlineServiceEnabled = onlineServiceEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ByteDanceResponseSegmentationOnlineServiceEnableReq byteDanceResponseSegmentationOnlineServiceEnableReq = (ByteDanceResponseSegmentationOnlineServiceEnableReq) o;
    return Objects.equals(this.onlineServiceEnabled, byteDanceResponseSegmentationOnlineServiceEnableReq.onlineServiceEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineServiceEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ByteDanceResponseSegmentationOnlineServiceEnableReq {\n");
    
    sb.append("    onlineServiceEnabled: ").append(toIndentedString(onlineServiceEnabled)).append("\n");
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
