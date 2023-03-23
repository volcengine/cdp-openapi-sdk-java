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
import code.byted.cdp.model.IdTypeDetail;
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
 * IdTypeMeta
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class IdTypeMeta {
  @SerializedName("subjectId")
  private Integer subjectId = null;

  @SerializedName("subjectName")
  private String subjectName = null;

  @SerializedName("subjectType")
  private String subjectType = null;

  @SerializedName("idTypes")
  private List<IdTypeDetail> idTypes = null;

  public IdTypeMeta subjectId(Integer subjectId) {
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

  public IdTypeMeta subjectName(String subjectName) {
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

  public IdTypeMeta subjectType(String subjectType) {
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

  public IdTypeMeta idTypes(List<IdTypeDetail> idTypes) {
    this.idTypes = idTypes;
    return this;
  }

  public IdTypeMeta addIdTypesItem(IdTypeDetail idTypesItem) {
    if (this.idTypes == null) {
      this.idTypes = new ArrayList<IdTypeDetail>();
    }
    this.idTypes.add(idTypesItem);
    return this;
  }

   /**
   * Get idTypes
   * @return idTypes
  **/
  @Schema(description = "")
  public List<IdTypeDetail> getIdTypes() {
    return idTypes;
  }

  public void setIdTypes(List<IdTypeDetail> idTypes) {
    this.idTypes = idTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTypeMeta idTypeMeta = (IdTypeMeta) o;
    return Objects.equals(this.subjectId, idTypeMeta.subjectId) &&
        Objects.equals(this.subjectName, idTypeMeta.subjectName) &&
        Objects.equals(this.subjectType, idTypeMeta.subjectType) &&
        Objects.equals(this.idTypes, idTypeMeta.idTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectId, subjectName, subjectType, idTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTypeMeta {\n");
    
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    idTypes: ").append(toIndentedString(idTypes)).append("\n");
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
