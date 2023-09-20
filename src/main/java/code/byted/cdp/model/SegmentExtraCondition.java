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
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 分群类型
 */
@JsonAdapter(SegmentExtraCondition.Adapter.class)
public enum SegmentExtraCondition {
  CONDITIONAL("Conditional"),
  UPLOADED("Uploaded"),
  ABI("ABI"),
  LOOKALIKE("Lookalike"),
  CHILDSEG("ChildSeg"),
  PRIVATETRANSTOPUBLIC("PrivateTransToPublic"),
  SUBJECTTRANS("SubjectTrans"),
  FEATURERECOMMENDATION("FeatureRecommendation"),
  INSIGHTEXPORT("InsightExport"),
  INSIGHTEXPORTV2("InsightExportV2"),
  PUBLICCONDITIONAL("PublicConditional"),
  FINDER("Finder"),
  PUBLICMODELRESULT("PublicModelResult"),
  PUBLICUPLOADED("PublicUploaded"),
  MODEL("Model"),
  PUBLICLOOKALIKE("PublicLookalike"),
  PRIVATELOOKALIKE("PrivateLookalike"),
  SQLEXPORT("SqlExport"),
  REALTIMECONDITIONAL("RealtimeConditional"),
  PRIVATECLUSTER("PrivateCluster"),
  PRIVATECLUSTERCHILD("PrivateClusterChild"),
  PUBLICCLUSTER("PublicCluster"),
  PUBLICCLUSTERCHILD("PublicClusterChild"),
  MANUALREALTIME("ManualRealtime");

  private Object value;

  SegmentExtraCondition(Object value) {
    this.value = value;
  }

  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SegmentExtraCondition fromValue(Object input) {
    for (SegmentExtraCondition b : SegmentExtraCondition.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SegmentExtraCondition> {
    @Override
    public void write(final JsonWriter jsonWriter, final SegmentExtraCondition enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public SegmentExtraCondition read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return SegmentExtraCondition.fromValue((Object)(value));
    }
  }
}