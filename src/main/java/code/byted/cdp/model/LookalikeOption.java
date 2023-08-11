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
import code.byted.cdp.model.ProfileFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LookalikeOption
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-08-11T11:20:29.425+08:00[Asia/Shanghai]")
public class LookalikeOption {
  @SerializedName("negativeSeg")
  private Integer negativeSeg = null;

  @SerializedName("random")
  private Integer random = null;

  @SerializedName("seedIncluded")
  private Boolean seedIncluded = null;

  @SerializedName("seedSegId")
  private Integer seedSegId = null;

  @SerializedName("similarity")
  private Float similarity = null;

  @SerializedName("targetSegConf")
  private ProfileFilter targetSegConf = null;

  @SerializedName("top")
  private Integer top = null;

  public LookalikeOption negativeSeg(Integer negativeSeg) {
    this.negativeSeg = negativeSeg;
    return this;
  }

   /**
   * Get negativeSeg
   * @return negativeSeg
  **/
  @Schema(description = "")
  public Integer getNegativeSeg() {
    return negativeSeg;
  }

  public void setNegativeSeg(Integer negativeSeg) {
    this.negativeSeg = negativeSeg;
  }

  public LookalikeOption random(Integer random) {
    this.random = random;
    return this;
  }

   /**
   * Get random
   * @return random
  **/
  @Schema(description = "")
  public Integer getRandom() {
    return random;
  }

  public void setRandom(Integer random) {
    this.random = random;
  }

  public LookalikeOption seedIncluded(Boolean seedIncluded) {
    this.seedIncluded = seedIncluded;
    return this;
  }

   /**
   * Get seedIncluded
   * @return seedIncluded
  **/
  @Schema(description = "")
  public Boolean isSeedIncluded() {
    return seedIncluded;
  }

  public void setSeedIncluded(Boolean seedIncluded) {
    this.seedIncluded = seedIncluded;
  }

  public LookalikeOption seedSegId(Integer seedSegId) {
    this.seedSegId = seedSegId;
    return this;
  }

   /**
   * Get seedSegId
   * @return seedSegId
  **/
  @Schema(description = "")
  public Integer getSeedSegId() {
    return seedSegId;
  }

  public void setSeedSegId(Integer seedSegId) {
    this.seedSegId = seedSegId;
  }

  public LookalikeOption similarity(Float similarity) {
    this.similarity = similarity;
    return this;
  }

   /**
   * Get similarity
   * @return similarity
  **/
  @Schema(description = "")
  public Float getSimilarity() {
    return similarity;
  }

  public void setSimilarity(Float similarity) {
    this.similarity = similarity;
  }

  public LookalikeOption targetSegConf(ProfileFilter targetSegConf) {
    this.targetSegConf = targetSegConf;
    return this;
  }

   /**
   * Get targetSegConf
   * @return targetSegConf
  **/
  @Schema(description = "")
  public ProfileFilter getTargetSegConf() {
    return targetSegConf;
  }

  public void setTargetSegConf(ProfileFilter targetSegConf) {
    this.targetSegConf = targetSegConf;
  }

  public LookalikeOption top(Integer top) {
    this.top = top;
    return this;
  }

   /**
   * Get top
   * @return top
  **/
  @Schema(description = "")
  public Integer getTop() {
    return top;
  }

  public void setTop(Integer top) {
    this.top = top;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookalikeOption lookalikeOption = (LookalikeOption) o;
    return Objects.equals(this.negativeSeg, lookalikeOption.negativeSeg) &&
        Objects.equals(this.random, lookalikeOption.random) &&
        Objects.equals(this.seedIncluded, lookalikeOption.seedIncluded) &&
        Objects.equals(this.seedSegId, lookalikeOption.seedSegId) &&
        Objects.equals(this.similarity, lookalikeOption.similarity) &&
        Objects.equals(this.targetSegConf, lookalikeOption.targetSegConf) &&
        Objects.equals(this.top, lookalikeOption.top);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negativeSeg, random, seedIncluded, seedSegId, similarity, targetSegConf, top);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookalikeOption {\n");
    
    sb.append("    negativeSeg: ").append(toIndentedString(negativeSeg)).append("\n");
    sb.append("    random: ").append(toIndentedString(random)).append("\n");
    sb.append("    seedIncluded: ").append(toIndentedString(seedIncluded)).append("\n");
    sb.append("    seedSegId: ").append(toIndentedString(seedSegId)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    targetSegConf: ").append(toIndentedString(targetSegConf)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
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
