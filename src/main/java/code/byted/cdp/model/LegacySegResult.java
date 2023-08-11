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
 * LegacySegResult
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:38:37.562+08:00[Asia/Shanghai]")
public class LegacySegResult {
  @SerializedName("count")
  private Long count = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("targetPath")
  private String targetPath = null;

  @SerializedName("exportAt")
  private String exportAt = null;

  /**
   * Gets or Sets segStatus
   */
  @JsonAdapter(SegStatusEnum.Adapter.class)
  public enum SegStatusEnum {
    EXPORTING("Exporting"),
    INVALID("Invalid"),
    NORMAL("Normal");

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

  public LegacySegResult count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public LegacySegResult path(String path) {
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

  public LegacySegResult targetPath(String targetPath) {
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

  public LegacySegResult exportAt(String exportAt) {
    this.exportAt = exportAt;
    return this;
  }

   /**
   * Get exportAt
   * @return exportAt
  **/
  @Schema(description = "")
  public String getExportAt() {
    return exportAt;
  }

  public void setExportAt(String exportAt) {
    this.exportAt = exportAt;
  }

  public LegacySegResult segStatus(SegStatusEnum segStatus) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegacySegResult legacySegResult = (LegacySegResult) o;
    return Objects.equals(this.count, legacySegResult.count) &&
        Objects.equals(this.path, legacySegResult.path) &&
        Objects.equals(this.targetPath, legacySegResult.targetPath) &&
        Objects.equals(this.exportAt, legacySegResult.exportAt) &&
        Objects.equals(this.segStatus, legacySegResult.segStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, path, targetPath, exportAt, segStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegacySegResult {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    exportAt: ").append(toIndentedString(exportAt)).append("\n");
    sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
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
