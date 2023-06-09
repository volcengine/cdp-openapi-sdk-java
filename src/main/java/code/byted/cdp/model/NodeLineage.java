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
import code.byted.cdp.model.NodeLineage;
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
 * NodeLineage
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class NodeLineage {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("nativeId")
  private Long nativeId = null;

  @SerializedName("bizType")
  private String bizType = null;

  @SerializedName("inDegrees")
  private List<NodeLineage> inDegrees = null;

  @SerializedName("outDegrees")
  private List<NodeLineage> outDegrees = null;

  public NodeLineage id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NodeLineage nativeId(Long nativeId) {
    this.nativeId = nativeId;
    return this;
  }

   /**
   * Get nativeId
   * @return nativeId
  **/
  @Schema(description = "")
  public Long getNativeId() {
    return nativeId;
  }

  public void setNativeId(Long nativeId) {
    this.nativeId = nativeId;
  }

  public NodeLineage bizType(String bizType) {
    this.bizType = bizType;
    return this;
  }

   /**
   * Get bizType
   * @return bizType
  **/
  @Schema(description = "")
  public String getBizType() {
    return bizType;
  }

  public void setBizType(String bizType) {
    this.bizType = bizType;
  }

  public NodeLineage inDegrees(List<NodeLineage> inDegrees) {
    this.inDegrees = inDegrees;
    return this;
  }

  public NodeLineage addInDegreesItem(NodeLineage inDegreesItem) {
    if (this.inDegrees == null) {
      this.inDegrees = new ArrayList<NodeLineage>();
    }
    this.inDegrees.add(inDegreesItem);
    return this;
  }

   /**
   * Get inDegrees
   * @return inDegrees
  **/
  @Schema(description = "")
  public List<NodeLineage> getInDegrees() {
    return inDegrees;
  }

  public void setInDegrees(List<NodeLineage> inDegrees) {
    this.inDegrees = inDegrees;
  }

  public NodeLineage outDegrees(List<NodeLineage> outDegrees) {
    this.outDegrees = outDegrees;
    return this;
  }

  public NodeLineage addOutDegreesItem(NodeLineage outDegreesItem) {
    if (this.outDegrees == null) {
      this.outDegrees = new ArrayList<NodeLineage>();
    }
    this.outDegrees.add(outDegreesItem);
    return this;
  }

   /**
   * Get outDegrees
   * @return outDegrees
  **/
  @Schema(description = "")
  public List<NodeLineage> getOutDegrees() {
    return outDegrees;
  }

  public void setOutDegrees(List<NodeLineage> outDegrees) {
    this.outDegrees = outDegrees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeLineage nodeLineage = (NodeLineage) o;
    return Objects.equals(this.id, nodeLineage.id) &&
        Objects.equals(this.nativeId, nodeLineage.nativeId) &&
        Objects.equals(this.bizType, nodeLineage.bizType) &&
        Objects.equals(this.inDegrees, nodeLineage.inDegrees) &&
        Objects.equals(this.outDegrees, nodeLineage.outDegrees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nativeId, bizType, inDegrees, outDegrees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeLineage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nativeId: ").append(toIndentedString(nativeId)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    inDegrees: ").append(toIndentedString(inDegrees)).append("\n");
    sb.append("    outDegrees: ").append(toIndentedString(outDegrees)).append("\n");
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
