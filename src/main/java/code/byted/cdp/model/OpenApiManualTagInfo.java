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
 * OpenApiManualTagInfo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class OpenApiManualTagInfo {
  @SerializedName("createdAt")
  private Long createdAt = null;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    SIMPLETAG("SimpleTag"),
    COMPLEXTAG("ComplexTag"),
    APPTAG("AppTag"),
    TIDSENDTAG("TidSendTag"),
    TIDSHOWTAG("TidShowTag"),
    TIDCLICKTAG("TidClickTag"),
    MAUTAG("MauTag");

    private String value;

    DataTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DataTypeEnum fromValue(String input) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DataTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("dataType")
  private DataTypeEnum dataType = null;

  @SerializedName("idType")
  private Integer idType = null;

  @SerializedName("tagBounds")
  private Object tagBounds = null;

  @SerializedName("tagDate")
  private String tagDate = null;

  @SerializedName("tagId")
  private Integer tagId = null;

  @SerializedName("tagName")
  private String tagName = null;

  @SerializedName("tagValues")
  private Object tagValues = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  public OpenApiManualTagInfo createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public OpenApiManualTagInfo dataType(DataTypeEnum dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @Schema(description = "")
  public DataTypeEnum getDataType() {
    return dataType;
  }

  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }

  public OpenApiManualTagInfo idType(Integer idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(required = true, description = "")
  public Integer getIdType() {
    return idType;
  }

  public void setIdType(Integer idType) {
    this.idType = idType;
  }

  public OpenApiManualTagInfo tagBounds(Object tagBounds) {
    this.tagBounds = tagBounds;
    return this;
  }

   /**
   * Get tagBounds
   * @return tagBounds
  **/
  @Schema(description = "")
  public Object getTagBounds() {
    return tagBounds;
  }

  public void setTagBounds(Object tagBounds) {
    this.tagBounds = tagBounds;
  }

  public OpenApiManualTagInfo tagDate(String tagDate) {
    this.tagDate = tagDate;
    return this;
  }

   /**
   * Get tagDate
   * @return tagDate
  **/
  @Schema(description = "")
  public String getTagDate() {
    return tagDate;
  }

  public void setTagDate(String tagDate) {
    this.tagDate = tagDate;
  }

  public OpenApiManualTagInfo tagId(Integer tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @Schema(required = true, description = "")
  public Integer getTagId() {
    return tagId;
  }

  public void setTagId(Integer tagId) {
    this.tagId = tagId;
  }

  public OpenApiManualTagInfo tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @Schema(required = true, description = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public OpenApiManualTagInfo tagValues(Object tagValues) {
    this.tagValues = tagValues;
    return this;
  }

   /**
   * Get tagValues
   * @return tagValues
  **/
  @Schema(description = "")
  public Object getTagValues() {
    return tagValues;
  }

  public void setTagValues(Object tagValues) {
    this.tagValues = tagValues;
  }

  public OpenApiManualTagInfo updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(required = true, description = "")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenApiManualTagInfo openApiManualTagInfo = (OpenApiManualTagInfo) o;
    return Objects.equals(this.createdAt, openApiManualTagInfo.createdAt) &&
        Objects.equals(this.dataType, openApiManualTagInfo.dataType) &&
        Objects.equals(this.idType, openApiManualTagInfo.idType) &&
        Objects.equals(this.tagBounds, openApiManualTagInfo.tagBounds) &&
        Objects.equals(this.tagDate, openApiManualTagInfo.tagDate) &&
        Objects.equals(this.tagId, openApiManualTagInfo.tagId) &&
        Objects.equals(this.tagName, openApiManualTagInfo.tagName) &&
        Objects.equals(this.tagValues, openApiManualTagInfo.tagValues) &&
        Objects.equals(this.updatedAt, openApiManualTagInfo.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, dataType, idType, tagBounds, tagDate, tagId, tagName, tagValues, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenApiManualTagInfo {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    tagBounds: ").append(toIndentedString(tagBounds)).append("\n");
    sb.append("    tagDate: ").append(toIndentedString(tagDate)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagValues: ").append(toIndentedString(tagValues)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
