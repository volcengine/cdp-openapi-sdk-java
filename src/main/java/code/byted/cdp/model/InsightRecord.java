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
 * InsightRecord
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-04-18T11:26:59.028+08:00[Asia/Shanghai]")
public class InsightRecord {
  @SerializedName("insightTagName")
  private String insightTagName = null;

  @SerializedName("insightSegmentation")
  private String insightSegmentation = null;

  @SerializedName("insightTagValue")
  private String insightTagValue = null;

  @SerializedName("insightTagCoverage")
  private Float insightTagCoverage = null;

  @SerializedName("insightFull")
  private Long insightFull = null;

  @SerializedName("insightFullTgi")
  private Long insightFullTgi = null;

  @SerializedName("insightEffectiveCoverage")
  private Float insightEffectiveCoverage = null;

  @SerializedName("insightTagTgi")
  private Long insightTagTgi = null;

  @SerializedName("insightFullTgiLowBound")
  private Long insightFullTgiLowBound = null;

  @SerializedName("insightFullTgiUppBound")
  private Long insightFullTgiUppBound = null;

  @SerializedName("insightTagTgiLowBound")
  private Long insightTagTgiLowBound = null;

  @SerializedName("insightTagTgiUppBound")
  private Long insightTagTgiUppBound = null;

  @SerializedName("insightHorizontalTagName")
  private String insightHorizontalTagName = null;

  @SerializedName("insightHorizontalTagValue")
  private String insightHorizontalTagValue = null;

  @SerializedName("insightVerticalTagName")
  private String insightVerticalTagName = null;

  @SerializedName("insightVerticalTagValue")
  private String insightVerticalTagValue = null;

  @SerializedName("insightTagProportion")
  private Long insightTagProportion = null;

  public InsightRecord insightTagName(String insightTagName) {
    this.insightTagName = insightTagName;
    return this;
  }

   /**
   * Get insightTagName
   * @return insightTagName
  **/
  @Schema(description = "")
  public String getInsightTagName() {
    return insightTagName;
  }

  public void setInsightTagName(String insightTagName) {
    this.insightTagName = insightTagName;
  }

  public InsightRecord insightSegmentation(String insightSegmentation) {
    this.insightSegmentation = insightSegmentation;
    return this;
  }

   /**
   * Get insightSegmentation
   * @return insightSegmentation
  **/
  @Schema(description = "")
  public String getInsightSegmentation() {
    return insightSegmentation;
  }

  public void setInsightSegmentation(String insightSegmentation) {
    this.insightSegmentation = insightSegmentation;
  }

  public InsightRecord insightTagValue(String insightTagValue) {
    this.insightTagValue = insightTagValue;
    return this;
  }

   /**
   * Get insightTagValue
   * @return insightTagValue
  **/
  @Schema(description = "")
  public String getInsightTagValue() {
    return insightTagValue;
  }

  public void setInsightTagValue(String insightTagValue) {
    this.insightTagValue = insightTagValue;
  }

  public InsightRecord insightTagCoverage(Float insightTagCoverage) {
    this.insightTagCoverage = insightTagCoverage;
    return this;
  }

   /**
   * Get insightTagCoverage
   * @return insightTagCoverage
  **/
  @Schema(description = "")
  public Float getInsightTagCoverage() {
    return insightTagCoverage;
  }

  public void setInsightTagCoverage(Float insightTagCoverage) {
    this.insightTagCoverage = insightTagCoverage;
  }

  public InsightRecord insightFull(Long insightFull) {
    this.insightFull = insightFull;
    return this;
  }

   /**
   * Get insightFull
   * @return insightFull
  **/
  @Schema(description = "")
  public Long getInsightFull() {
    return insightFull;
  }

  public void setInsightFull(Long insightFull) {
    this.insightFull = insightFull;
  }

  public InsightRecord insightFullTgi(Long insightFullTgi) {
    this.insightFullTgi = insightFullTgi;
    return this;
  }

   /**
   * Get insightFullTgi
   * @return insightFullTgi
  **/
  @Schema(description = "")
  public Long getInsightFullTgi() {
    return insightFullTgi;
  }

  public void setInsightFullTgi(Long insightFullTgi) {
    this.insightFullTgi = insightFullTgi;
  }

  public InsightRecord insightEffectiveCoverage(Float insightEffectiveCoverage) {
    this.insightEffectiveCoverage = insightEffectiveCoverage;
    return this;
  }

   /**
   * Get insightEffectiveCoverage
   * @return insightEffectiveCoverage
  **/
  @Schema(description = "")
  public Float getInsightEffectiveCoverage() {
    return insightEffectiveCoverage;
  }

  public void setInsightEffectiveCoverage(Float insightEffectiveCoverage) {
    this.insightEffectiveCoverage = insightEffectiveCoverage;
  }

  public InsightRecord insightTagTgi(Long insightTagTgi) {
    this.insightTagTgi = insightTagTgi;
    return this;
  }

   /**
   * Get insightTagTgi
   * @return insightTagTgi
  **/
  @Schema(description = "")
  public Long getInsightTagTgi() {
    return insightTagTgi;
  }

  public void setInsightTagTgi(Long insightTagTgi) {
    this.insightTagTgi = insightTagTgi;
  }

  public InsightRecord insightFullTgiLowBound(Long insightFullTgiLowBound) {
    this.insightFullTgiLowBound = insightFullTgiLowBound;
    return this;
  }

   /**
   * Get insightFullTgiLowBound
   * @return insightFullTgiLowBound
  **/
  @Schema(description = "")
  public Long getInsightFullTgiLowBound() {
    return insightFullTgiLowBound;
  }

  public void setInsightFullTgiLowBound(Long insightFullTgiLowBound) {
    this.insightFullTgiLowBound = insightFullTgiLowBound;
  }

  public InsightRecord insightFullTgiUppBound(Long insightFullTgiUppBound) {
    this.insightFullTgiUppBound = insightFullTgiUppBound;
    return this;
  }

   /**
   * Get insightFullTgiUppBound
   * @return insightFullTgiUppBound
  **/
  @Schema(description = "")
  public Long getInsightFullTgiUppBound() {
    return insightFullTgiUppBound;
  }

  public void setInsightFullTgiUppBound(Long insightFullTgiUppBound) {
    this.insightFullTgiUppBound = insightFullTgiUppBound;
  }

  public InsightRecord insightTagTgiLowBound(Long insightTagTgiLowBound) {
    this.insightTagTgiLowBound = insightTagTgiLowBound;
    return this;
  }

   /**
   * Get insightTagTgiLowBound
   * @return insightTagTgiLowBound
  **/
  @Schema(description = "")
  public Long getInsightTagTgiLowBound() {
    return insightTagTgiLowBound;
  }

  public void setInsightTagTgiLowBound(Long insightTagTgiLowBound) {
    this.insightTagTgiLowBound = insightTagTgiLowBound;
  }

  public InsightRecord insightTagTgiUppBound(Long insightTagTgiUppBound) {
    this.insightTagTgiUppBound = insightTagTgiUppBound;
    return this;
  }

   /**
   * Get insightTagTgiUppBound
   * @return insightTagTgiUppBound
  **/
  @Schema(description = "")
  public Long getInsightTagTgiUppBound() {
    return insightTagTgiUppBound;
  }

  public void setInsightTagTgiUppBound(Long insightTagTgiUppBound) {
    this.insightTagTgiUppBound = insightTagTgiUppBound;
  }

  public InsightRecord insightHorizontalTagName(String insightHorizontalTagName) {
    this.insightHorizontalTagName = insightHorizontalTagName;
    return this;
  }

   /**
   * Get insightHorizontalTagName
   * @return insightHorizontalTagName
  **/
  @Schema(description = "")
  public String getInsightHorizontalTagName() {
    return insightHorizontalTagName;
  }

  public void setInsightHorizontalTagName(String insightHorizontalTagName) {
    this.insightHorizontalTagName = insightHorizontalTagName;
  }

  public InsightRecord insightHorizontalTagValue(String insightHorizontalTagValue) {
    this.insightHorizontalTagValue = insightHorizontalTagValue;
    return this;
  }

   /**
   * Get insightHorizontalTagValue
   * @return insightHorizontalTagValue
  **/
  @Schema(description = "")
  public String getInsightHorizontalTagValue() {
    return insightHorizontalTagValue;
  }

  public void setInsightHorizontalTagValue(String insightHorizontalTagValue) {
    this.insightHorizontalTagValue = insightHorizontalTagValue;
  }

  public InsightRecord insightVerticalTagName(String insightVerticalTagName) {
    this.insightVerticalTagName = insightVerticalTagName;
    return this;
  }

   /**
   * Get insightVerticalTagName
   * @return insightVerticalTagName
  **/
  @Schema(description = "")
  public String getInsightVerticalTagName() {
    return insightVerticalTagName;
  }

  public void setInsightVerticalTagName(String insightVerticalTagName) {
    this.insightVerticalTagName = insightVerticalTagName;
  }

  public InsightRecord insightVerticalTagValue(String insightVerticalTagValue) {
    this.insightVerticalTagValue = insightVerticalTagValue;
    return this;
  }

   /**
   * Get insightVerticalTagValue
   * @return insightVerticalTagValue
  **/
  @Schema(description = "")
  public String getInsightVerticalTagValue() {
    return insightVerticalTagValue;
  }

  public void setInsightVerticalTagValue(String insightVerticalTagValue) {
    this.insightVerticalTagValue = insightVerticalTagValue;
  }

  public InsightRecord insightTagProportion(Long insightTagProportion) {
    this.insightTagProportion = insightTagProportion;
    return this;
  }

   /**
   * Get insightTagProportion
   * @return insightTagProportion
  **/
  @Schema(description = "")
  public Long getInsightTagProportion() {
    return insightTagProportion;
  }

  public void setInsightTagProportion(Long insightTagProportion) {
    this.insightTagProportion = insightTagProportion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InsightRecord insightRecord = (InsightRecord) o;
    return Objects.equals(this.insightTagName, insightRecord.insightTagName) &&
        Objects.equals(this.insightSegmentation, insightRecord.insightSegmentation) &&
        Objects.equals(this.insightTagValue, insightRecord.insightTagValue) &&
        Objects.equals(this.insightTagCoverage, insightRecord.insightTagCoverage) &&
        Objects.equals(this.insightFull, insightRecord.insightFull) &&
        Objects.equals(this.insightFullTgi, insightRecord.insightFullTgi) &&
        Objects.equals(this.insightEffectiveCoverage, insightRecord.insightEffectiveCoverage) &&
        Objects.equals(this.insightTagTgi, insightRecord.insightTagTgi) &&
        Objects.equals(this.insightFullTgiLowBound, insightRecord.insightFullTgiLowBound) &&
        Objects.equals(this.insightFullTgiUppBound, insightRecord.insightFullTgiUppBound) &&
        Objects.equals(this.insightTagTgiLowBound, insightRecord.insightTagTgiLowBound) &&
        Objects.equals(this.insightTagTgiUppBound, insightRecord.insightTagTgiUppBound) &&
        Objects.equals(this.insightHorizontalTagName, insightRecord.insightHorizontalTagName) &&
        Objects.equals(this.insightHorizontalTagValue, insightRecord.insightHorizontalTagValue) &&
        Objects.equals(this.insightVerticalTagName, insightRecord.insightVerticalTagName) &&
        Objects.equals(this.insightVerticalTagValue, insightRecord.insightVerticalTagValue) &&
        Objects.equals(this.insightTagProportion, insightRecord.insightTagProportion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insightTagName, insightSegmentation, insightTagValue, insightTagCoverage, insightFull, insightFullTgi, insightEffectiveCoverage, insightTagTgi, insightFullTgiLowBound, insightFullTgiUppBound, insightTagTgiLowBound, insightTagTgiUppBound, insightHorizontalTagName, insightHorizontalTagValue, insightVerticalTagName, insightVerticalTagValue, insightTagProportion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InsightRecord {\n");
    
    sb.append("    insightTagName: ").append(toIndentedString(insightTagName)).append("\n");
    sb.append("    insightSegmentation: ").append(toIndentedString(insightSegmentation)).append("\n");
    sb.append("    insightTagValue: ").append(toIndentedString(insightTagValue)).append("\n");
    sb.append("    insightTagCoverage: ").append(toIndentedString(insightTagCoverage)).append("\n");
    sb.append("    insightFull: ").append(toIndentedString(insightFull)).append("\n");
    sb.append("    insightFullTgi: ").append(toIndentedString(insightFullTgi)).append("\n");
    sb.append("    insightEffectiveCoverage: ").append(toIndentedString(insightEffectiveCoverage)).append("\n");
    sb.append("    insightTagTgi: ").append(toIndentedString(insightTagTgi)).append("\n");
    sb.append("    insightFullTgiLowBound: ").append(toIndentedString(insightFullTgiLowBound)).append("\n");
    sb.append("    insightFullTgiUppBound: ").append(toIndentedString(insightFullTgiUppBound)).append("\n");
    sb.append("    insightTagTgiLowBound: ").append(toIndentedString(insightTagTgiLowBound)).append("\n");
    sb.append("    insightTagTgiUppBound: ").append(toIndentedString(insightTagTgiUppBound)).append("\n");
    sb.append("    insightHorizontalTagName: ").append(toIndentedString(insightHorizontalTagName)).append("\n");
    sb.append("    insightHorizontalTagValue: ").append(toIndentedString(insightHorizontalTagValue)).append("\n");
    sb.append("    insightVerticalTagName: ").append(toIndentedString(insightVerticalTagName)).append("\n");
    sb.append("    insightVerticalTagValue: ").append(toIndentedString(insightVerticalTagValue)).append("\n");
    sb.append("    insightTagProportion: ").append(toIndentedString(insightTagProportion)).append("\n");
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
