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
import java.util.ArrayList;
import java.util.List;
/**
 * SegOpenApiFileUploadResponse
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class SegOpenApiFileUploadResponse {
  @SerializedName("uploadTaskId")
  private Integer uploadTaskId = null;

  @SerializedName("lines")
  private Long lines = null;

  @SerializedName("distinctLines")
  private Long distinctLines = null;

  @SerializedName("previewResult")
  private List<String> previewResult = null;

  public SegOpenApiFileUploadResponse uploadTaskId(Integer uploadTaskId) {
    this.uploadTaskId = uploadTaskId;
    return this;
  }

   /**
   * Get uploadTaskId
   * @return uploadTaskId
  **/
  @Schema(description = "")
  public Integer getUploadTaskId() {
    return uploadTaskId;
  }

  public void setUploadTaskId(Integer uploadTaskId) {
    this.uploadTaskId = uploadTaskId;
  }

  public SegOpenApiFileUploadResponse lines(Long lines) {
    this.lines = lines;
    return this;
  }

   /**
   * Get lines
   * @return lines
  **/
  @Schema(description = "")
  public Long getLines() {
    return lines;
  }

  public void setLines(Long lines) {
    this.lines = lines;
  }

  public SegOpenApiFileUploadResponse distinctLines(Long distinctLines) {
    this.distinctLines = distinctLines;
    return this;
  }

   /**
   * Get distinctLines
   * @return distinctLines
  **/
  @Schema(description = "")
  public Long getDistinctLines() {
    return distinctLines;
  }

  public void setDistinctLines(Long distinctLines) {
    this.distinctLines = distinctLines;
  }

  public SegOpenApiFileUploadResponse previewResult(List<String> previewResult) {
    this.previewResult = previewResult;
    return this;
  }

  public SegOpenApiFileUploadResponse addPreviewResultItem(String previewResultItem) {
    if (this.previewResult == null) {
      this.previewResult = new ArrayList<String>();
    }
    this.previewResult.add(previewResultItem);
    return this;
  }

   /**
   * Get previewResult
   * @return previewResult
  **/
  @Schema(description = "")
  public List<String> getPreviewResult() {
    return previewResult;
  }

  public void setPreviewResult(List<String> previewResult) {
    this.previewResult = previewResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegOpenApiFileUploadResponse segOpenApiFileUploadResponse = (SegOpenApiFileUploadResponse) o;
    return Objects.equals(this.uploadTaskId, segOpenApiFileUploadResponse.uploadTaskId) &&
        Objects.equals(this.lines, segOpenApiFileUploadResponse.lines) &&
        Objects.equals(this.distinctLines, segOpenApiFileUploadResponse.distinctLines) &&
        Objects.equals(this.previewResult, segOpenApiFileUploadResponse.previewResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadTaskId, lines, distinctLines, previewResult);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegOpenApiFileUploadResponse {\n");
    
    sb.append("    uploadTaskId: ").append(toIndentedString(uploadTaskId)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    distinctLines: ").append(toIndentedString(distinctLines)).append("\n");
    sb.append("    previewResult: ").append(toIndentedString(previewResult)).append("\n");
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