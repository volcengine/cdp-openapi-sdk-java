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
 * IdTypes
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-25T10:31:52.572+08:00[Asia/Shanghai]")
public class IdTypes {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("subjectId")
  private Integer subjectId = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("dataType")
  private String dataType = null;

  @SerializedName("entityType")
  private String entityType = null;

  @SerializedName("needEncrypt")
  private String needEncrypt = null;

  @SerializedName("finderIdType")
  private String finderIdType = null;

  public IdTypes id(Integer id) {
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

  public IdTypes subjectId(Integer subjectId) {
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

  public IdTypes code(String code) {
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

  public IdTypes name(String name) {
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

  public IdTypes dataType(String dataType) {
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

  public IdTypes entityType(String entityType) {
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

  public IdTypes needEncrypt(String needEncrypt) {
    this.needEncrypt = needEncrypt;
    return this;
  }

   /**
   * Get needEncrypt
   * @return needEncrypt
  **/
  @Schema(description = "")
  public String getNeedEncrypt() {
    return needEncrypt;
  }

  public void setNeedEncrypt(String needEncrypt) {
    this.needEncrypt = needEncrypt;
  }

  public IdTypes finderIdType(String finderIdType) {
    this.finderIdType = finderIdType;
    return this;
  }

   /**
   * Get finderIdType
   * @return finderIdType
  **/
  @Schema(description = "")
  public String getFinderIdType() {
    return finderIdType;
  }

  public void setFinderIdType(String finderIdType) {
    this.finderIdType = finderIdType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTypes idTypes = (IdTypes) o;
    return Objects.equals(this.id, idTypes.id) &&
        Objects.equals(this.subjectId, idTypes.subjectId) &&
        Objects.equals(this.code, idTypes.code) &&
        Objects.equals(this.name, idTypes.name) &&
        Objects.equals(this.dataType, idTypes.dataType) &&
        Objects.equals(this.entityType, idTypes.entityType) &&
        Objects.equals(this.needEncrypt, idTypes.needEncrypt) &&
        Objects.equals(this.finderIdType, idTypes.finderIdType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subjectId, code, name, dataType, entityType, needEncrypt, finderIdType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTypes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    needEncrypt: ").append(toIndentedString(needEncrypt)).append("\n");
    sb.append("    finderIdType: ").append(toIndentedString(finderIdType)).append("\n");
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
