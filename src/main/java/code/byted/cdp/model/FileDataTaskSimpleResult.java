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
import code.byted.cdp.model.SegSimpleInfo;
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
 * FileDataTaskSimpleResult
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class FileDataTaskSimpleResult {
  @SerializedName("taskId")
  private Integer taskId = null;

  @SerializedName("taskName")
  private String taskName = null;

  @SerializedName("segInfos")
  private List<SegSimpleInfo> segInfos = null;

  public FileDataTaskSimpleResult taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @Schema(description = "")
  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public FileDataTaskSimpleResult taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @Schema(description = "")
  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public FileDataTaskSimpleResult segInfos(List<SegSimpleInfo> segInfos) {
    this.segInfos = segInfos;
    return this;
  }

  public FileDataTaskSimpleResult addSegInfosItem(SegSimpleInfo segInfosItem) {
    if (this.segInfos == null) {
      this.segInfos = new ArrayList<SegSimpleInfo>();
    }
    this.segInfos.add(segInfosItem);
    return this;
  }

   /**
   * Get segInfos
   * @return segInfos
  **/
  @Schema(description = "")
  public List<SegSimpleInfo> getSegInfos() {
    return segInfos;
  }

  public void setSegInfos(List<SegSimpleInfo> segInfos) {
    this.segInfos = segInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDataTaskSimpleResult fileDataTaskSimpleResult = (FileDataTaskSimpleResult) o;
    return Objects.equals(this.taskId, fileDataTaskSimpleResult.taskId) &&
        Objects.equals(this.taskName, fileDataTaskSimpleResult.taskName) &&
        Objects.equals(this.segInfos, fileDataTaskSimpleResult.segInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskName, segInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDataTaskSimpleResult {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    segInfos: ").append(toIndentedString(segInfos)).append("\n");
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