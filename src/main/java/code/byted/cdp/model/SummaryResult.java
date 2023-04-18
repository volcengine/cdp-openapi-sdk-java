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
import code.byted.cdp.model.InsightSummarySegObj;
import code.byted.cdp.model.InsightSummaryTagObj;
import code.byted.cdp.model.SegInfo;
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
 * SummaryResult
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-04-18T11:26:59.028+08:00[Asia/Shanghai]")
public class SummaryResult {
  @SerializedName("summary")
  private List<InsightSummarySegObj> summary = null;

  @SerializedName("tagOutline")
  private List<InsightSummaryTagObj> tagOutline = null;

  @SerializedName("segCountResults")
  private List<SegInfo> segCountResults = null;

  public SummaryResult summary(List<InsightSummarySegObj> summary) {
    this.summary = summary;
    return this;
  }

  public SummaryResult addSummaryItem(InsightSummarySegObj summaryItem) {
    if (this.summary == null) {
      this.summary = new ArrayList<InsightSummarySegObj>();
    }
    this.summary.add(summaryItem);
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @Schema(description = "")
  public List<InsightSummarySegObj> getSummary() {
    return summary;
  }

  public void setSummary(List<InsightSummarySegObj> summary) {
    this.summary = summary;
  }

  public SummaryResult tagOutline(List<InsightSummaryTagObj> tagOutline) {
    this.tagOutline = tagOutline;
    return this;
  }

  public SummaryResult addTagOutlineItem(InsightSummaryTagObj tagOutlineItem) {
    if (this.tagOutline == null) {
      this.tagOutline = new ArrayList<InsightSummaryTagObj>();
    }
    this.tagOutline.add(tagOutlineItem);
    return this;
  }

   /**
   * Get tagOutline
   * @return tagOutline
  **/
  @Schema(description = "")
  public List<InsightSummaryTagObj> getTagOutline() {
    return tagOutline;
  }

  public void setTagOutline(List<InsightSummaryTagObj> tagOutline) {
    this.tagOutline = tagOutline;
  }

  public SummaryResult segCountResults(List<SegInfo> segCountResults) {
    this.segCountResults = segCountResults;
    return this;
  }

  public SummaryResult addSegCountResultsItem(SegInfo segCountResultsItem) {
    if (this.segCountResults == null) {
      this.segCountResults = new ArrayList<SegInfo>();
    }
    this.segCountResults.add(segCountResultsItem);
    return this;
  }

   /**
   * Get segCountResults
   * @return segCountResults
  **/
  @Schema(description = "")
  public List<SegInfo> getSegCountResults() {
    return segCountResults;
  }

  public void setSegCountResults(List<SegInfo> segCountResults) {
    this.segCountResults = segCountResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryResult summaryResult = (SummaryResult) o;
    return Objects.equals(this.summary, summaryResult.summary) &&
        Objects.equals(this.tagOutline, summaryResult.tagOutline) &&
        Objects.equals(this.segCountResults, summaryResult.segCountResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, tagOutline, segCountResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryResult {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    tagOutline: ").append(toIndentedString(tagOutline)).append("\n");
    sb.append("    segCountResults: ").append(toIndentedString(segCountResults)).append("\n");
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
