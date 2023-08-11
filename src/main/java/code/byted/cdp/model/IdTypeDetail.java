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
import code.byted.cdp.model.AvailableMappingIdsDetail;
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
 * IdTypeDetail
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class IdTypeDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dataType")
  private String dataType = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("needEncrypt")
  private Boolean needEncrypt = null;

  @SerializedName("subjectId")
  private Integer subjectId = null;

  @SerializedName("subjectName")
  private String subjectName = null;

  @SerializedName("orgId")
  private Integer orgId = null;

  @SerializedName("subjectType")
  private String subjectType = null;

  @SerializedName("availableMappingIds")
  private List<AvailableMappingIdsDetail> availableMappingIds = null;

  public IdTypeDetail id(Integer id) {
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

  public IdTypeDetail code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @Schema(description = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public IdTypeDetail name(String name) {
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

  public IdTypeDetail dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @Schema(description = "")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public IdTypeDetail entityType(String entityType) {
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

  public IdTypeDetail needEncrypt(Boolean needEncrypt) {
    this.needEncrypt = needEncrypt;
    return this;
  }

   /**
   * Get needEncrypt
   * @return needEncrypt
  **/
  @Schema(description = "")
  public Boolean isNeedEncrypt() {
    return needEncrypt;
  }

  public void setNeedEncrypt(Boolean needEncrypt) {
    this.needEncrypt = needEncrypt;
  }

  public IdTypeDetail subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @Schema(description = "")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public IdTypeDetail subjectName(String subjectName) {
    this.subjectName = subjectName;
    return this;
  }

   /**
   * Get subjectName
   * @return subjectName
  **/
  @Schema(description = "")
  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public IdTypeDetail orgId(Integer orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @Schema(description = "")
  public Integer getOrgId() {
    return orgId;
  }

  public void setOrgId(Integer orgId) {
    this.orgId = orgId;
  }

  public IdTypeDetail subjectType(String subjectType) {
    this.subjectType = subjectType;
    return this;
  }

   /**
   * Get subjectType
   * @return subjectType
  **/
  @Schema(description = "")
  public String getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(String subjectType) {
    this.subjectType = subjectType;
  }

  public IdTypeDetail availableMappingIds(List<AvailableMappingIdsDetail> availableMappingIds) {
    this.availableMappingIds = availableMappingIds;
    return this;
  }

  public IdTypeDetail addAvailableMappingIdsItem(AvailableMappingIdsDetail availableMappingIdsItem) {
    if (this.availableMappingIds == null) {
      this.availableMappingIds = new ArrayList<AvailableMappingIdsDetail>();
    }
    this.availableMappingIds.add(availableMappingIdsItem);
    return this;
  }

   /**
   * Get availableMappingIds
   * @return availableMappingIds
  **/
  @Schema(description = "")
  public List<AvailableMappingIdsDetail> getAvailableMappingIds() {
    return availableMappingIds;
  }

  public void setAvailableMappingIds(List<AvailableMappingIdsDetail> availableMappingIds) {
    this.availableMappingIds = availableMappingIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTypeDetail idTypeDetail = (IdTypeDetail) o;
    return Objects.equals(this.id, idTypeDetail.id) &&
        Objects.equals(this.code, idTypeDetail.code) &&
        Objects.equals(this.name, idTypeDetail.name) &&
        Objects.equals(this.dataType, idTypeDetail.dataType) &&
        Objects.equals(this.entityType, idTypeDetail.entityType) &&
        Objects.equals(this.needEncrypt, idTypeDetail.needEncrypt) &&
        Objects.equals(this.subjectId, idTypeDetail.subjectId) &&
        Objects.equals(this.subjectName, idTypeDetail.subjectName) &&
        Objects.equals(this.orgId, idTypeDetail.orgId) &&
        Objects.equals(this.subjectType, idTypeDetail.subjectType) &&
        Objects.equals(this.availableMappingIds, idTypeDetail.availableMappingIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, dataType, entityType, needEncrypt, subjectId, subjectName, orgId, subjectType, availableMappingIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTypeDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    needEncrypt: ").append(toIndentedString(needEncrypt)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    availableMappingIds: ").append(toIndentedString(availableMappingIds)).append("\n");
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
