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
import code.byted.cdp.model.IdType;
import code.byted.cdp.model.OptionLookalikeOption;
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
 * SegmentationResult
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class SegmentationResult {
  @SerializedName("abaseEnabled")
  private Boolean abaseEnabled = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("exportAt")
  private String exportAt = null;

  /**
   * Gets or Sets hashMethod
   */
  @JsonAdapter(HashMethodEnum.Adapter.class)
  public enum HashMethodEnum {
    MD5("MD5"),
    SHA256("SHA256"),
    AES256("AES256");

    private String value;

    HashMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HashMethodEnum fromValue(String input) {
      for (HashMethodEnum b : HashMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HashMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HashMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public HashMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return HashMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("hashMethod")
  private HashMethodEnum hashMethod = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("idType")
  private IdType idType = null;

  @SerializedName("isLookalikeReady")
  private Boolean isLookalikeReady = null;

  @SerializedName("lookalikeOption")
  private OptionLookalikeOption lookalikeOption = null;

  @SerializedName("originCount")
  private Long originCount = null;

  @SerializedName("parentId")
  private Integer parentId = null;

  @SerializedName("path")
  private String path = null;

  /**
   * Gets or Sets segStatus
   */
  @JsonAdapter(SegStatusEnum.Adapter.class)
  public enum SegStatusEnum {
    EXPORTING("Exporting"),
    INVALID("Invalid"),
    NORMAL("Normal"),
    CHEXPORTING("CHExporting"),
    PUBLICCOUNTINVALID("PublicCountInvalid"),
    PATCHFAILED("PatchFailed");

    private String value;

    SegStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SegStatusEnum fromValue(String input) {
      for (SegStatusEnum b : SegStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SegStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SegStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SegStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("segStatus")
  private SegStatusEnum segStatus = null;

  @SerializedName("splitResult")
  private List<String> splitResult = null;

  @SerializedName("targetIdType")
  private IdType targetIdType = null;

  @SerializedName("targetPath")
  private String targetPath = null;

  public SegmentationResult abaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
    return this;
  }

   /**
   * Get abaseEnabled
   * @return abaseEnabled
  **/
  @Schema(description = "")
  public Boolean isAbaseEnabled() {
    return abaseEnabled;
  }

  public void setAbaseEnabled(Boolean abaseEnabled) {
    this.abaseEnabled = abaseEnabled;
  }

  public SegmentationResult count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(required = true, description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SegmentationResult exportAt(String exportAt) {
    this.exportAt = exportAt;
    return this;
  }

   /**
   * Get exportAt
   * @return exportAt
  **/
  @Schema(required = true, description = "")
  public String getExportAt() {
    return exportAt;
  }

  public void setExportAt(String exportAt) {
    this.exportAt = exportAt;
  }

  public SegmentationResult hashMethod(HashMethodEnum hashMethod) {
    this.hashMethod = hashMethod;
    return this;
  }

   /**
   * Get hashMethod
   * @return hashMethod
  **/
  @Schema(description = "")
  public HashMethodEnum getHashMethod() {
    return hashMethod;
  }

  public void setHashMethod(HashMethodEnum hashMethod) {
    this.hashMethod = hashMethod;
  }

  public SegmentationResult id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SegmentationResult idType(IdType idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(description = "")
  public IdType getIdType() {
    return idType;
  }

  public void setIdType(IdType idType) {
    this.idType = idType;
  }

  public SegmentationResult isLookalikeReady(Boolean isLookalikeReady) {
    this.isLookalikeReady = isLookalikeReady;
    return this;
  }

   /**
   * Get isLookalikeReady
   * @return isLookalikeReady
  **/
  @Schema(description = "")
  public Boolean isIsLookalikeReady() {
    return isLookalikeReady;
  }

  public void setIsLookalikeReady(Boolean isLookalikeReady) {
    this.isLookalikeReady = isLookalikeReady;
  }

  public SegmentationResult lookalikeOption(OptionLookalikeOption lookalikeOption) {
    this.lookalikeOption = lookalikeOption;
    return this;
  }

   /**
   * Get lookalikeOption
   * @return lookalikeOption
  **/
  @Schema(required = true, description = "")
  public OptionLookalikeOption getLookalikeOption() {
    return lookalikeOption;
  }

  public void setLookalikeOption(OptionLookalikeOption lookalikeOption) {
    this.lookalikeOption = lookalikeOption;
  }

  public SegmentationResult originCount(Long originCount) {
    this.originCount = originCount;
    return this;
  }

   /**
   * Get originCount
   * @return originCount
  **/
  @Schema(description = "")
  public Long getOriginCount() {
    return originCount;
  }

  public void setOriginCount(Long originCount) {
    this.originCount = originCount;
  }

  public SegmentationResult parentId(Integer parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(description = "")
  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public SegmentationResult path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SegmentationResult segStatus(SegStatusEnum segStatus) {
    this.segStatus = segStatus;
    return this;
  }

   /**
   * Get segStatus
   * @return segStatus
  **/
  @Schema(description = "")
  public SegStatusEnum getSegStatus() {
    return segStatus;
  }

  public void setSegStatus(SegStatusEnum segStatus) {
    this.segStatus = segStatus;
  }

  public SegmentationResult splitResult(List<String> splitResult) {
    this.splitResult = splitResult;
    return this;
  }

  public SegmentationResult addSplitResultItem(String splitResultItem) {
    if (this.splitResult == null) {
      this.splitResult = new ArrayList<String>();
    }
    this.splitResult.add(splitResultItem);
    return this;
  }

   /**
   * Get splitResult
   * @return splitResult
  **/
  @Schema(description = "")
  public List<String> getSplitResult() {
    return splitResult;
  }

  public void setSplitResult(List<String> splitResult) {
    this.splitResult = splitResult;
  }

  public SegmentationResult targetIdType(IdType targetIdType) {
    this.targetIdType = targetIdType;
    return this;
  }

   /**
   * Get targetIdType
   * @return targetIdType
  **/
  @Schema(description = "")
  public IdType getTargetIdType() {
    return targetIdType;
  }

  public void setTargetIdType(IdType targetIdType) {
    this.targetIdType = targetIdType;
  }

  public SegmentationResult targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Get targetPath
   * @return targetPath
  **/
  @Schema(description = "")
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentationResult segmentationResult = (SegmentationResult) o;
    return Objects.equals(this.abaseEnabled, segmentationResult.abaseEnabled) &&
        Objects.equals(this.count, segmentationResult.count) &&
        Objects.equals(this.exportAt, segmentationResult.exportAt) &&
        Objects.equals(this.hashMethod, segmentationResult.hashMethod) &&
        Objects.equals(this.id, segmentationResult.id) &&
        Objects.equals(this.idType, segmentationResult.idType) &&
        Objects.equals(this.isLookalikeReady, segmentationResult.isLookalikeReady) &&
        Objects.equals(this.lookalikeOption, segmentationResult.lookalikeOption) &&
        Objects.equals(this.originCount, segmentationResult.originCount) &&
        Objects.equals(this.parentId, segmentationResult.parentId) &&
        Objects.equals(this.path, segmentationResult.path) &&
        Objects.equals(this.segStatus, segmentationResult.segStatus) &&
        Objects.equals(this.splitResult, segmentationResult.splitResult) &&
        Objects.equals(this.targetIdType, segmentationResult.targetIdType) &&
        Objects.equals(this.targetPath, segmentationResult.targetPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abaseEnabled, count, exportAt, hashMethod, id, idType, isLookalikeReady, lookalikeOption, originCount, parentId, path, segStatus, splitResult, targetIdType, targetPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentationResult {\n");
    
    sb.append("    abaseEnabled: ").append(toIndentedString(abaseEnabled)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    exportAt: ").append(toIndentedString(exportAt)).append("\n");
    sb.append("    hashMethod: ").append(toIndentedString(hashMethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    isLookalikeReady: ").append(toIndentedString(isLookalikeReady)).append("\n");
    sb.append("    lookalikeOption: ").append(toIndentedString(lookalikeOption)).append("\n");
    sb.append("    originCount: ").append(toIndentedString(originCount)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
    sb.append("    splitResult: ").append(toIndentedString(splitResult)).append("\n");
    sb.append("    targetIdType: ").append(toIndentedString(targetIdType)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
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
