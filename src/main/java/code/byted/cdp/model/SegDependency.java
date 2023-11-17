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
 * SegDependency
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-11-17T15:23:34.702+08:00[Asia/Shanghai]")
public class SegDependency {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("relatedSegId")
  private Integer relatedSegId = null;

  @SerializedName("relatedSegName")
  private String relatedSegName = null;

  /**
   * Gets or Sets relatedSegStatus
   */
  @JsonAdapter(RelatedSegStatusEnum.Adapter.class)
  public enum RelatedSegStatusEnum {
    UNKNOWN("Unknown"),
    EXPORTING("Exporting"),
    INVALID("Invalid"),
    NORMAL("Normal"),
    CHEXPORTING("CHExporting"),
    PUBLICCOUNTINVALID("PublicCountInvalid"),
    PATCHFAILED("PatchFailed");

    private String value;

    RelatedSegStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RelatedSegStatusEnum fromValue(String input) {
      for (RelatedSegStatusEnum b : RelatedSegStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return UNKNOWN;
    }
    public static class Adapter extends TypeAdapter<RelatedSegStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelatedSegStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RelatedSegStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RelatedSegStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("relatedSegStatus")
  private RelatedSegStatusEnum relatedSegStatus = null;

  @SerializedName("segId")
  private Integer segId = null;

  public SegDependency id(Integer id) {
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

  public SegDependency relatedSegId(Integer relatedSegId) {
    this.relatedSegId = relatedSegId;
    return this;
  }

   /**
   * Get relatedSegId
   * @return relatedSegId
  **/
  @Schema(required = true, description = "")
  public Integer getRelatedSegId() {
    return relatedSegId;
  }

  public void setRelatedSegId(Integer relatedSegId) {
    this.relatedSegId = relatedSegId;
  }

  public SegDependency relatedSegName(String relatedSegName) {
    this.relatedSegName = relatedSegName;
    return this;
  }

   /**
   * Get relatedSegName
   * @return relatedSegName
  **/
  @Schema(required = true, description = "")
  public String getRelatedSegName() {
    return relatedSegName;
  }

  public void setRelatedSegName(String relatedSegName) {
    this.relatedSegName = relatedSegName;
  }

  public SegDependency relatedSegStatus(RelatedSegStatusEnum relatedSegStatus) {
    this.relatedSegStatus = relatedSegStatus;
    return this;
  }

   /**
   * Get relatedSegStatus
   * @return relatedSegStatus
  **/
  @Schema(required = true, description = "")
  public RelatedSegStatusEnum getRelatedSegStatus() {
    return relatedSegStatus;
  }

  public void setRelatedSegStatus(RelatedSegStatusEnum relatedSegStatus) {
    this.relatedSegStatus = relatedSegStatus;
  }

  public SegDependency segId(Integer segId) {
    this.segId = segId;
    return this;
  }

   /**
   * Get segId
   * @return segId
  **/
  @Schema(required = true, description = "")
  public Integer getSegId() {
    return segId;
  }

  public void setSegId(Integer segId) {
    this.segId = segId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegDependency segDependency = (SegDependency) o;
    return Objects.equals(this.id, segDependency.id) &&
        Objects.equals(this.relatedSegId, segDependency.relatedSegId) &&
        Objects.equals(this.relatedSegName, segDependency.relatedSegName) &&
        Objects.equals(this.relatedSegStatus, segDependency.relatedSegStatus) &&
        Objects.equals(this.segId, segDependency.segId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedSegId, relatedSegName, relatedSegStatus, segId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegDependency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedSegId: ").append(toIndentedString(relatedSegId)).append("\n");
    sb.append("    relatedSegName: ").append(toIndentedString(relatedSegName)).append("\n");
    sb.append("    relatedSegStatus: ").append(toIndentedString(relatedSegStatus)).append("\n");
    sb.append("    segId: ").append(toIndentedString(segId)).append("\n");
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
