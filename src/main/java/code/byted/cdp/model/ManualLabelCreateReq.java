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
 * ManualLabelCreateReq
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-25T10:31:52.572+08:00[Asia/Shanghai]")
public class ManualLabelCreateReq {
  @SerializedName("name")
  private String name = null;

  @SerializedName("labelEntityType")
  private String labelEntityType = null;

  @SerializedName("conf")
  private Object conf = null;

  @SerializedName("appId")
  private Integer appId = null;

  @SerializedName("descr")
  private String descr = null;

  @SerializedName("dataTypeName")
  private String dataTypeName = null;

  @SerializedName("labelRangeRules")
  private Object labelRangeRules = null;

  public ManualLabelCreateReq name(String name) {
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

  public ManualLabelCreateReq labelEntityType(String labelEntityType) {
    this.labelEntityType = labelEntityType;
    return this;
  }

   /**
   * 当前标签枚举值原始值
   * @return labelEntityType
  **/
  @Schema(description = "当前标签枚举值原始值")
  public String getLabelEntityType() {
    return labelEntityType;
  }

  public void setLabelEntityType(String labelEntityType) {
    this.labelEntityType = labelEntityType;
  }

  public ManualLabelCreateReq conf(Object conf) {
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

  public ManualLabelCreateReq appId(Integer appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 项目id
   * @return appId
  **/
  @Schema(description = "项目id")
  public Integer getAppId() {
    return appId;
  }

  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  public ManualLabelCreateReq descr(String descr) {
    this.descr = descr;
    return this;
  }

   /**
   * 描述
   * @return descr
  **/
  @Schema(description = "描述")
  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

  public ManualLabelCreateReq dataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
    return this;
  }

   /**
   * 标签数据类型
   * @return dataTypeName
  **/
  @Schema(description = "标签数据类型")
  public String getDataTypeName() {
    return dataTypeName;
  }

  public void setDataTypeName(String dataTypeName) {
    this.dataTypeName = dataTypeName;
  }

  public ManualLabelCreateReq labelRangeRules(Object labelRangeRules) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManualLabelCreateReq manualLabelCreateReq = (ManualLabelCreateReq) o;
    return Objects.equals(this.name, manualLabelCreateReq.name) &&
        Objects.equals(this.labelEntityType, manualLabelCreateReq.labelEntityType) &&
        Objects.equals(this.conf, manualLabelCreateReq.conf) &&
        Objects.equals(this.appId, manualLabelCreateReq.appId) &&
        Objects.equals(this.descr, manualLabelCreateReq.descr) &&
        Objects.equals(this.dataTypeName, manualLabelCreateReq.dataTypeName) &&
        Objects.equals(this.labelRangeRules, manualLabelCreateReq.labelRangeRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labelEntityType, conf, appId, descr, dataTypeName, labelRangeRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualLabelCreateReq {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labelEntityType: ").append(toIndentedString(labelEntityType)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    descr: ").append(toIndentedString(descr)).append("\n");
    sb.append("    dataTypeName: ").append(toIndentedString(dataTypeName)).append("\n");
    sb.append("    labelRangeRules: ").append(toIndentedString(labelRangeRules)).append("\n");
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
