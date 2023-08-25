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
 * PrivateSegInfo
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-25T10:31:52.572+08:00[Asia/Shanghai]")
public class PrivateSegInfo {
  @SerializedName("isSplitSeg")
  private Boolean isSplitSeg = null;

  @SerializedName("parentSegId")
  private Integer parentSegId = null;

  @SerializedName("parentSegName")
  private String parentSegName = null;

  @SerializedName("segId")
  private Integer segId = null;

  @SerializedName("segName")
  private String segName = null;

  /**
   * Gets or Sets segType
   */
  @JsonAdapter(SegTypeEnum.Adapter.class)
  public enum SegTypeEnum {
    UPLOADED("Uploaded"),
    CONDITIONAL("Conditional"),
    SEGBASED("SegBased"),
    INSIGHTEXPORT("InsightExport"),
    LOOKALIKE("Lookalike"),
    PUBLICCONDITIONAL("PublicConditional"),
    PUBLICUPLOADED("PublicUploaded"),
    ABI("ABI"),
    SUBJECTTRANS("SubjectTrans"),
    CHILDSEG("ChildSeg"),
    FEATURERECOMMENDATION("FeatureRecommendation"),
    FINDER("Finder"),
    TESTER("Tester"),
    GMP("GMP");

    private String value;

    SegTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SegTypeEnum fromValue(String input) {
      for (SegTypeEnum b : SegTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SegTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SegTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SegTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("segType")
  private SegTypeEnum segType = null;

  public PrivateSegInfo isSplitSeg(Boolean isSplitSeg) {
    this.isSplitSeg = isSplitSeg;
    return this;
  }

   /**
   * Get isSplitSeg
   * @return isSplitSeg
  **/
  @Schema(required = true, description = "")
  public Boolean isIsSplitSeg() {
    return isSplitSeg;
  }

  public void setIsSplitSeg(Boolean isSplitSeg) {
    this.isSplitSeg = isSplitSeg;
  }

  public PrivateSegInfo parentSegId(Integer parentSegId) {
    this.parentSegId = parentSegId;
    return this;
  }

   /**
   * Get parentSegId
   * @return parentSegId
  **/
  @Schema(description = "")
  public Integer getParentSegId() {
    return parentSegId;
  }

  public void setParentSegId(Integer parentSegId) {
    this.parentSegId = parentSegId;
  }

  public PrivateSegInfo parentSegName(String parentSegName) {
    this.parentSegName = parentSegName;
    return this;
  }

   /**
   * Get parentSegName
   * @return parentSegName
  **/
  @Schema(description = "")
  public String getParentSegName() {
    return parentSegName;
  }

  public void setParentSegName(String parentSegName) {
    this.parentSegName = parentSegName;
  }

  public PrivateSegInfo segId(Integer segId) {
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

  public PrivateSegInfo segName(String segName) {
    this.segName = segName;
    return this;
  }

   /**
   * Get segName
   * @return segName
  **/
  @Schema(required = true, description = "")
  public String getSegName() {
    return segName;
  }

  public void setSegName(String segName) {
    this.segName = segName;
  }

  public PrivateSegInfo segType(SegTypeEnum segType) {
    this.segType = segType;
    return this;
  }

   /**
   * Get segType
   * @return segType
  **/
  @Schema(required = true, description = "")
  public SegTypeEnum getSegType() {
    return segType;
  }

  public void setSegType(SegTypeEnum segType) {
    this.segType = segType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateSegInfo privateSegInfo = (PrivateSegInfo) o;
    return Objects.equals(this.isSplitSeg, privateSegInfo.isSplitSeg) &&
        Objects.equals(this.parentSegId, privateSegInfo.parentSegId) &&
        Objects.equals(this.parentSegName, privateSegInfo.parentSegName) &&
        Objects.equals(this.segId, privateSegInfo.segId) &&
        Objects.equals(this.segName, privateSegInfo.segName) &&
        Objects.equals(this.segType, privateSegInfo.segType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSplitSeg, parentSegId, parentSegName, segId, segName, segType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateSegInfo {\n");
    
    sb.append("    isSplitSeg: ").append(toIndentedString(isSplitSeg)).append("\n");
    sb.append("    parentSegId: ").append(toIndentedString(parentSegId)).append("\n");
    sb.append("    parentSegName: ").append(toIndentedString(parentSegName)).append("\n");
    sb.append("    segId: ").append(toIndentedString(segId)).append("\n");
    sb.append("    segName: ").append(toIndentedString(segName)).append("\n");
    sb.append("    segType: ").append(toIndentedString(segType)).append("\n");
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
