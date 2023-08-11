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
 * LabelMetaSimpleInfo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:38:37.562+08:00[Asia/Shanghai]")
public class LabelMetaSimpleInfo {
  @SerializedName("desc")
  private String desc = null;

  @SerializedName("domainName")
  private String domainName = null;

  @SerializedName("syncEndTime")
  private String syncEndTime = null;

  public LabelMetaSimpleInfo desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @Schema(description = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public LabelMetaSimpleInfo domainName(String domainName) {
    this.domainName = domainName;
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(description = "")
  public String getDomainName() {
    return domainName;
  }

  public void setDomainName(String domainName) {
    this.domainName = domainName;
  }

  public LabelMetaSimpleInfo syncEndTime(String syncEndTime) {
    this.syncEndTime = syncEndTime;
    return this;
  }

   /**
   * Get syncEndTime
   * @return syncEndTime
  **/
  @Schema(description = "")
  public String getSyncEndTime() {
    return syncEndTime;
  }

  public void setSyncEndTime(String syncEndTime) {
    this.syncEndTime = syncEndTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelMetaSimpleInfo labelMetaSimpleInfo = (LabelMetaSimpleInfo) o;
    return Objects.equals(this.desc, labelMetaSimpleInfo.desc) &&
        Objects.equals(this.domainName, labelMetaSimpleInfo.domainName) &&
        Objects.equals(this.syncEndTime, labelMetaSimpleInfo.syncEndTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desc, domainName, syncEndTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelMetaSimpleInfo {\n");
    
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    syncEndTime: ").append(toIndentedString(syncEndTime)).append("\n");
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
