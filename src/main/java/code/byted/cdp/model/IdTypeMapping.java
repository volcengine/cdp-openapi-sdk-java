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
import code.byted.cdp.model.IdTypeMappingStrategy;
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
 * IdTypeMapping
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-03-23T12:09:51.626+08:00[Asia/Shanghai]")
public class IdTypeMapping {
  @SerializedName("strategy")
  private List<IdTypeMappingStrategy> strategy = null;

  @SerializedName("targetEntityId")
  private Integer targetEntityId = null;

  public IdTypeMapping strategy(List<IdTypeMappingStrategy> strategy) {
    this.strategy = strategy;
    return this;
  }

  public IdTypeMapping addStrategyItem(IdTypeMappingStrategy strategyItem) {
    if (this.strategy == null) {
      this.strategy = new ArrayList<IdTypeMappingStrategy>();
    }
    this.strategy.add(strategyItem);
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @Schema(description = "")
  public List<IdTypeMappingStrategy> getStrategy() {
    return strategy;
  }

  public void setStrategy(List<IdTypeMappingStrategy> strategy) {
    this.strategy = strategy;
  }

  public IdTypeMapping targetEntityId(Integer targetEntityId) {
    this.targetEntityId = targetEntityId;
    return this;
  }

   /**
   * Get targetEntityId
   * @return targetEntityId
  **/
  @Schema(required = true, description = "")
  public Integer getTargetEntityId() {
    return targetEntityId;
  }

  public void setTargetEntityId(Integer targetEntityId) {
    this.targetEntityId = targetEntityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdTypeMapping idTypeMapping = (IdTypeMapping) o;
    return Objects.equals(this.strategy, idTypeMapping.strategy) &&
        Objects.equals(this.targetEntityId, idTypeMapping.targetEntityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(strategy, targetEntityId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdTypeMapping {\n");
    
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    targetEntityId: ").append(toIndentedString(targetEntityId)).append("\n");
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