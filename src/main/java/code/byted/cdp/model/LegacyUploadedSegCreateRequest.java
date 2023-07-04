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
import code.byted.cdp.model.LegacyUploadedSegmentDetail;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LegacyUploadedSegCreateRequest
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T11:23:30.393+08:00[Asia/Shanghai]")
public class LegacyUploadedSegCreateRequest {
  @SerializedName("name")
  private String name = null;

  @SerializedName("idType")
  private String idType = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("abaseEnabled")
  private Boolean abaseEnabled = null;

  @SerializedName("sourcePlatform")
  private String sourcePlatform = null;

  @SerializedName("detail")
  private LegacyUploadedSegmentDetail detail = null;

  public LegacyUploadedSegCreateRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 分群名称
   * @return name
  **/
  @Schema(required = true, description = "分群名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LegacyUploadedSegCreateRequest idType(String idType) {
    this.idType = idType;
    return this;
  }

   /**
   * 分群名称
   * @return idType
  **/
  @Schema(description = "分群名称")
  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public LegacyUploadedSegCreateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 分群描述
   * @return description
  **/
  @Schema(description = "分群描述")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LegacyUploadedSegCreateRequest abaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
    return this;
  }

   /**
   * 是否开启分群在线服务
   * @return abaseEnabled
  **/
  @Schema(description = "是否开启分群在线服务")
  public Boolean isAbaseEnabled() {
    return abaseEnabled;
  }

  public void setAbaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
  }

  public LegacyUploadedSegCreateRequest sourcePlatform(String sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
    return this;
  }

   /**
   * 来源平台
   * @return sourcePlatform
  **/
  @Schema(description = "来源平台")
  public String getSourcePlatform() {
    return sourcePlatform;
  }

  public void setSourcePlatform(String sourcePlatform) {
    this.sourcePlatform = sourcePlatform;
  }

  public LegacyUploadedSegCreateRequest detail(LegacyUploadedSegmentDetail detail) {
    this.detail = detail;
    return this;
  }

   /**
   * Get detail
   * @return detail
  **/
  @Schema(description = "")
  public LegacyUploadedSegmentDetail getDetail() {
    return detail;
  }

  public void setDetail(LegacyUploadedSegmentDetail detail) {
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
    LegacyUploadedSegCreateRequest legacyUploadedSegCreateRequest = (LegacyUploadedSegCreateRequest) o;
    return Objects.equals(this.name, legacyUploadedSegCreateRequest.name) &&
        Objects.equals(this.idType, legacyUploadedSegCreateRequest.idType) &&
        Objects.equals(this.description, legacyUploadedSegCreateRequest.description) &&
        Objects.equals(this.abaseEnabled, legacyUploadedSegCreateRequest.abaseEnabled) &&
        Objects.equals(this.sourcePlatform, legacyUploadedSegCreateRequest.sourcePlatform) &&
        Objects.equals(this.detail, legacyUploadedSegCreateRequest.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, idType, description, abaseEnabled, sourcePlatform, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacyUploadedSegCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    abaseEnabled: ").append(toIndentedString(abaseEnabled)).append("\n");
    sb.append("    sourcePlatform: ").append(toIndentedString(sourcePlatform)).append("\n");
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
