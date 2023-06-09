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
import code.byted.cdp.model.GroupInfo;
import code.byted.cdp.model.IdType;
import code.byted.cdp.model.SegDependency;
import code.byted.cdp.model.SegPermission;
import code.byted.cdp.model.SegTaskStatus;
import code.byted.cdp.model.SegmentationResp;
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
 * SegmentationResp
 */

@javax.annotation.Generated(value = "code.byted.cdp.client.JavaClientCodegen", date = "2023-07-04T16:56:05.487+08:00[Asia/Shanghai]")
public class SegmentationResp {
  @SerializedName("allowDownload")
  private Boolean allowDownload = null;

  /**
   * Gets or Sets cantPublicType
   */
  @JsonAdapter(CantPublicTypeEnum.Adapter.class)
  public enum CantPublicTypeEnum {
    IDTYPENOTSATISFIED("IdTypeNotSatisfied"),
    COUNTNOTSATISFIED("CountNotSatisfied"),
    AUTHNOTSATISFIED("AuthNotSatisfied"),
    SATISFIED("Satisfied");

    private String value;

    CantPublicTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CantPublicTypeEnum fromValue(String input) {
      for (CantPublicTypeEnum b : CantPublicTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CantPublicTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CantPublicTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CantPublicTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CantPublicTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("cantPublicType")
  private CantPublicTypeEnum cantPublicType = null;

  @SerializedName("count")
  private Long count = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("exportAt")
  private String exportAt = null;

  @SerializedName("exportStrategy")
  private String exportStrategy = null;

  @SerializedName("groupInf")
  private List<GroupInfo> groupInf = null;

  @SerializedName("hasPublicBefore")
  private Boolean hasPublicBefore = null;

  /**
   * Gets or Sets hashMethod
   */
  @JsonAdapter(HashMethodEnum.Adapter.class)
  public enum HashMethodEnum {
    MD5("MD5"),
    SHA256("SHA256"),
    AES256("AES256");

    private String value;

    HashMethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static HashMethodEnum fromValue(String input) {
      for (HashMethodEnum b : HashMethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<HashMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HashMethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public HashMethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return HashMethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("hashMethod")
  private HashMethodEnum hashMethod = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("idType")
  private IdType idType = null;

  @SerializedName("idTypeName")
  private String idTypeName = null;

  @SerializedName("isNewestVersion")
  private Boolean isNewestVersion = null;

  @SerializedName("module")
  private String module = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("onlineSegStatus")
  private Boolean onlineSegStatus = null;

  @SerializedName("onlineSegSyncStatus")
  private String onlineSegSyncStatus = null;

  @SerializedName("pDate")
  private String pDate = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("reportId")
  private Long reportId = null;

  @SerializedName("segDep")
  private SegDependency segDep = null;

  @SerializedName("segPermission")
  private List<SegPermission> segPermission = null;

  /**
   * Gets or Sets segStatus
   */
  @JsonAdapter(SegStatusEnum.Adapter.class)
  public enum SegStatusEnum {
    EXPORTING("Exporting"),
    INVALID("Invalid"),
    NORMAL("Normal"),
    CHEXPORTING("CHExporting"),
    PUBLICCOUNTINVALID("PublicCountInvalid"),
    PATCHFAILED("PatchFailed");

    private String value;

    SegStatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SegStatusEnum fromValue(String input) {
      for (SegStatusEnum b : SegStatusEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SegStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegStatusEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SegStatusEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SegStatusEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("segStatus")
  private SegStatusEnum segStatus = null;

  @SerializedName("segTaskStatus")
  private List<SegTaskStatus> segTaskStatus = null;

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

  @SerializedName("sourceResultReady")
  private Boolean sourceResultReady = null;

  @SerializedName("subSegmentations")
  private List<SegmentationResp> subSegmentations = null;

  @SerializedName("subjectId")
  private Integer subjectId = null;

  /**
   * Gets or Sets uploadType
   */
  @JsonAdapter(UploadTypeEnum.Adapter.class)
  public enum UploadTypeEnum {
    NORMAL("normal"),
    FILE("file"),
    HDFS("hdfs"),
    SQL("sql"),
    LOOKALIKE("lookalike"),
    SPLITLOOKALIKE("splitLookalike"),
    INSIGHTREPORT("insightReport"),
    FILE_FROM_FA("file_from_fa"),
    PUBLICUPLOAD("publicUpload"),
    FEATURERECOMMENDATION("FeatureRecommendation");

    private String value;

    UploadTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static UploadTypeEnum fromValue(String input) {
      for (UploadTypeEnum b : UploadTypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<UploadTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UploadTypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public UploadTypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return UploadTypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("uploadType")
  private UploadTypeEnum uploadType = null;

  @SerializedName("version")
  private Integer version = null;

  public SegmentationResp allowDownload(Boolean allowDownload) {
    this.allowDownload = allowDownload;
    return this;
  }

   /**
   * Get allowDownload
   * @return allowDownload
  **/
  @Schema(required = true, description = "")
  public Boolean isAllowDownload() {
    return allowDownload;
  }

  public void setAllowDownload(Boolean allowDownload) {
    this.allowDownload = allowDownload;
  }

  public SegmentationResp cantPublicType(CantPublicTypeEnum cantPublicType) {
    this.cantPublicType = cantPublicType;
    return this;
  }

   /**
   * Get cantPublicType
   * @return cantPublicType
  **/
  @Schema(required = true, description = "")
  public CantPublicTypeEnum getCantPublicType() {
    return cantPublicType;
  }

  public void setCantPublicType(CantPublicTypeEnum cantPublicType) {
    this.cantPublicType = cantPublicType;
  }

  public SegmentationResp count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @Schema(required = true, description = "")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }

  public SegmentationResp createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(required = true, description = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SegmentationResp createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(required = true, description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public SegmentationResp exportAt(String exportAt) {
    this.exportAt = exportAt;
    return this;
  }

   /**
   * Get exportAt
   * @return exportAt
  **/
  @Schema(required = true, description = "")
  public String getExportAt() {
    return exportAt;
  }

  public void setExportAt(String exportAt) {
    this.exportAt = exportAt;
  }

  public SegmentationResp exportStrategy(String exportStrategy) {
    this.exportStrategy = exportStrategy;
    return this;
  }

   /**
   * Get exportStrategy
   * @return exportStrategy
  **/
  @Schema(required = true, description = "")
  public String getExportStrategy() {
    return exportStrategy;
  }

  public void setExportStrategy(String exportStrategy) {
    this.exportStrategy = exportStrategy;
  }

  public SegmentationResp groupInf(List<GroupInfo> groupInf) {
    this.groupInf = groupInf;
    return this;
  }

  public SegmentationResp addGroupInfItem(GroupInfo groupInfItem) {
    if (this.groupInf == null) {
      this.groupInf = new ArrayList<GroupInfo>();
    }
    this.groupInf.add(groupInfItem);
    return this;
  }

   /**
   * Get groupInf
   * @return groupInf
  **/
  @Schema(description = "")
  public List<GroupInfo> getGroupInf() {
    return groupInf;
  }

  public void setGroupInf(List<GroupInfo> groupInf) {
    this.groupInf = groupInf;
  }

  public SegmentationResp hasPublicBefore(Boolean hasPublicBefore) {
    this.hasPublicBefore = hasPublicBefore;
    return this;
  }

   /**
   * Get hasPublicBefore
   * @return hasPublicBefore
  **/
  @Schema(required = true, description = "")
  public Boolean isHasPublicBefore() {
    return hasPublicBefore;
  }

  public void setHasPublicBefore(Boolean hasPublicBefore) {
    this.hasPublicBefore = hasPublicBefore;
  }

  public SegmentationResp hashMethod(HashMethodEnum hashMethod) {
    this.hashMethod = hashMethod;
    return this;
  }

   /**
   * Get hashMethod
   * @return hashMethod
  **/
  @Schema(description = "")
  public HashMethodEnum getHashMethod() {
    return hashMethod;
  }

  public void setHashMethod(HashMethodEnum hashMethod) {
    this.hashMethod = hashMethod;
  }

  public SegmentationResp id(Integer id) {
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

  public SegmentationResp idType(IdType idType) {
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @Schema(required = true, description = "")
  public IdType getIdType() {
    return idType;
  }

  public void setIdType(IdType idType) {
    this.idType = idType;
  }

  public SegmentationResp idTypeName(String idTypeName) {
    this.idTypeName = idTypeName;
    return this;
  }

   /**
   * Get idTypeName
   * @return idTypeName
  **/
  @Schema(required = true, description = "")
  public String getIdTypeName() {
    return idTypeName;
  }

  public void setIdTypeName(String idTypeName) {
    this.idTypeName = idTypeName;
  }

  public SegmentationResp isNewestVersion(Boolean isNewestVersion) {
    this.isNewestVersion = isNewestVersion;
    return this;
  }

   /**
   * Get isNewestVersion
   * @return isNewestVersion
  **/
  @Schema(required = true, description = "")
  public Boolean isIsNewestVersion() {
    return isNewestVersion;
  }

  public void setIsNewestVersion(Boolean isNewestVersion) {
    this.isNewestVersion = isNewestVersion;
  }

  public SegmentationResp module(String module) {
    this.module = module;
    return this;
  }

   /**
   * Get module
   * @return module
  **/
  @Schema(description = "")
  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public SegmentationResp name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SegmentationResp onlineSegStatus(Boolean onlineSegStatus) {
    this.onlineSegStatus = onlineSegStatus;
    return this;
  }

   /**
   * Get onlineSegStatus
   * @return onlineSegStatus
  **/
  @Schema(required = true, description = "")
  public Boolean isOnlineSegStatus() {
    return onlineSegStatus;
  }

  public void setOnlineSegStatus(Boolean onlineSegStatus) {
    this.onlineSegStatus = onlineSegStatus;
  }

  public SegmentationResp onlineSegSyncStatus(String onlineSegSyncStatus) {
    this.onlineSegSyncStatus = onlineSegSyncStatus;
    return this;
  }

   /**
   * Get onlineSegSyncStatus
   * @return onlineSegSyncStatus
  **/
  @Schema(required = true, description = "")
  public String getOnlineSegSyncStatus() {
    return onlineSegSyncStatus;
  }

  public void setOnlineSegSyncStatus(String onlineSegSyncStatus) {
    this.onlineSegSyncStatus = onlineSegSyncStatus;
  }

  public SegmentationResp pDate(String pDate) {
    this.pDate = pDate;
    return this;
  }

   /**
   * Get pDate
   * @return pDate
  **/
  @Schema(description = "")
  public String getPDate() {
    return pDate;
  }

  public void setPDate(String pDate) {
    this.pDate = pDate;
  }

  public SegmentationResp path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @Schema(description = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public SegmentationResp platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @Schema(description = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public SegmentationResp reportId(Long reportId) {
    this.reportId = reportId;
    return this;
  }

   /**
   * Get reportId
   * @return reportId
  **/
  @Schema(description = "")
  public Long getReportId() {
    return reportId;
  }

  public void setReportId(Long reportId) {
    this.reportId = reportId;
  }

  public SegmentationResp segDep(SegDependency segDep) {
    this.segDep = segDep;
    return this;
  }

   /**
   * Get segDep
   * @return segDep
  **/
  @Schema(description = "")
  public SegDependency getSegDep() {
    return segDep;
  }

  public void setSegDep(SegDependency segDep) {
    this.segDep = segDep;
  }

  public SegmentationResp segPermission(List<SegPermission> segPermission) {
    this.segPermission = segPermission;
    return this;
  }

  public SegmentationResp addSegPermissionItem(SegPermission segPermissionItem) {
    if (this.segPermission == null) {
      this.segPermission = new ArrayList<SegPermission>();
    }
    this.segPermission.add(segPermissionItem);
    return this;
  }

   /**
   * Get segPermission
   * @return segPermission
  **/
  @Schema(description = "")
  public List<SegPermission> getSegPermission() {
    return segPermission;
  }

  public void setSegPermission(List<SegPermission> segPermission) {
    this.segPermission = segPermission;
  }

  public SegmentationResp segStatus(SegStatusEnum segStatus) {
    this.segStatus = segStatus;
    return this;
  }

   /**
   * Get segStatus
   * @return segStatus
  **/
  @Schema(required = true, description = "")
  public SegStatusEnum getSegStatus() {
    return segStatus;
  }

  public void setSegStatus(SegStatusEnum segStatus) {
    this.segStatus = segStatus;
  }

  public SegmentationResp segTaskStatus(List<SegTaskStatus> segTaskStatus) {
    this.segTaskStatus = segTaskStatus;
    return this;
  }

  public SegmentationResp addSegTaskStatusItem(SegTaskStatus segTaskStatusItem) {
    if (this.segTaskStatus == null) {
      this.segTaskStatus = new ArrayList<SegTaskStatus>();
    }
    this.segTaskStatus.add(segTaskStatusItem);
    return this;
  }

   /**
   * Get segTaskStatus
   * @return segTaskStatus
  **/
  @Schema(description = "")
  public List<SegTaskStatus> getSegTaskStatus() {
    return segTaskStatus;
  }

  public void setSegTaskStatus(List<SegTaskStatus> segTaskStatus) {
    this.segTaskStatus = segTaskStatus;
  }

  public SegmentationResp segType(SegTypeEnum segType) {
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

  public SegmentationResp sourceResultReady(Boolean sourceResultReady) {
    this.sourceResultReady = sourceResultReady;
    return this;
  }

   /**
   * Get sourceResultReady
   * @return sourceResultReady
  **/
  @Schema(required = true, description = "")
  public Boolean isSourceResultReady() {
    return sourceResultReady;
  }

  public void setSourceResultReady(Boolean sourceResultReady) {
    this.sourceResultReady = sourceResultReady;
  }

  public SegmentationResp subSegmentations(List<SegmentationResp> subSegmentations) {
    this.subSegmentations = subSegmentations;
    return this;
  }

  public SegmentationResp addSubSegmentationsItem(SegmentationResp subSegmentationsItem) {
    if (this.subSegmentations == null) {
      this.subSegmentations = new ArrayList<SegmentationResp>();
    }
    this.subSegmentations.add(subSegmentationsItem);
    return this;
  }

   /**
   * Get subSegmentations
   * @return subSegmentations
  **/
  @Schema(description = "")
  public List<SegmentationResp> getSubSegmentations() {
    return subSegmentations;
  }

  public void setSubSegmentations(List<SegmentationResp> subSegmentations) {
    this.subSegmentations = subSegmentations;
  }

  public SegmentationResp subjectId(Integer subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @Schema(required = true, description = "")
  public Integer getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Integer subjectId) {
    this.subjectId = subjectId;
  }

  public SegmentationResp uploadType(UploadTypeEnum uploadType) {
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @Schema(description = "")
  public UploadTypeEnum getUploadType() {
    return uploadType;
  }

  public void setUploadType(UploadTypeEnum uploadType) {
    this.uploadType = uploadType;
  }

  public SegmentationResp version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentationResp segmentationResp = (SegmentationResp) o;
    return Objects.equals(this.allowDownload, segmentationResp.allowDownload) &&
        Objects.equals(this.cantPublicType, segmentationResp.cantPublicType) &&
        Objects.equals(this.count, segmentationResp.count) &&
        Objects.equals(this.createdAt, segmentationResp.createdAt) &&
        Objects.equals(this.createdBy, segmentationResp.createdBy) &&
        Objects.equals(this.exportAt, segmentationResp.exportAt) &&
        Objects.equals(this.exportStrategy, segmentationResp.exportStrategy) &&
        Objects.equals(this.groupInf, segmentationResp.groupInf) &&
        Objects.equals(this.hasPublicBefore, segmentationResp.hasPublicBefore) &&
        Objects.equals(this.hashMethod, segmentationResp.hashMethod) &&
        Objects.equals(this.id, segmentationResp.id) &&
        Objects.equals(this.idType, segmentationResp.idType) &&
        Objects.equals(this.idTypeName, segmentationResp.idTypeName) &&
        Objects.equals(this.isNewestVersion, segmentationResp.isNewestVersion) &&
        Objects.equals(this.module, segmentationResp.module) &&
        Objects.equals(this.name, segmentationResp.name) &&
        Objects.equals(this.onlineSegStatus, segmentationResp.onlineSegStatus) &&
        Objects.equals(this.onlineSegSyncStatus, segmentationResp.onlineSegSyncStatus) &&
        Objects.equals(this.pDate, segmentationResp.pDate) &&
        Objects.equals(this.path, segmentationResp.path) &&
        Objects.equals(this.platform, segmentationResp.platform) &&
        Objects.equals(this.reportId, segmentationResp.reportId) &&
        Objects.equals(this.segDep, segmentationResp.segDep) &&
        Objects.equals(this.segPermission, segmentationResp.segPermission) &&
        Objects.equals(this.segStatus, segmentationResp.segStatus) &&
        Objects.equals(this.segTaskStatus, segmentationResp.segTaskStatus) &&
        Objects.equals(this.segType, segmentationResp.segType) &&
        Objects.equals(this.sourceResultReady, segmentationResp.sourceResultReady) &&
        Objects.equals(this.subSegmentations, segmentationResp.subSegmentations) &&
        Objects.equals(this.subjectId, segmentationResp.subjectId) &&
        Objects.equals(this.uploadType, segmentationResp.uploadType) &&
        Objects.equals(this.version, segmentationResp.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDownload, cantPublicType, count, createdAt, createdBy, exportAt, exportStrategy, groupInf, hasPublicBefore, hashMethod, id, idType, idTypeName, isNewestVersion, module, name, onlineSegStatus, onlineSegSyncStatus, pDate, path, platform, reportId, segDep, segPermission, segStatus, segTaskStatus, segType, sourceResultReady, subSegmentations, subjectId, uploadType, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentationResp {\n");
    
    sb.append("    allowDownload: ").append(toIndentedString(allowDownload)).append("\n");
    sb.append("    cantPublicType: ").append(toIndentedString(cantPublicType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    exportAt: ").append(toIndentedString(exportAt)).append("\n");
    sb.append("    exportStrategy: ").append(toIndentedString(exportStrategy)).append("\n");
    sb.append("    groupInf: ").append(toIndentedString(groupInf)).append("\n");
    sb.append("    hasPublicBefore: ").append(toIndentedString(hasPublicBefore)).append("\n");
    sb.append("    hashMethod: ").append(toIndentedString(hashMethod)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    idTypeName: ").append(toIndentedString(idTypeName)).append("\n");
    sb.append("    isNewestVersion: ").append(toIndentedString(isNewestVersion)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onlineSegStatus: ").append(toIndentedString(onlineSegStatus)).append("\n");
    sb.append("    onlineSegSyncStatus: ").append(toIndentedString(onlineSegSyncStatus)).append("\n");
    sb.append("    pDate: ").append(toIndentedString(pDate)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    segDep: ").append(toIndentedString(segDep)).append("\n");
    sb.append("    segPermission: ").append(toIndentedString(segPermission)).append("\n");
    sb.append("    segStatus: ").append(toIndentedString(segStatus)).append("\n");
    sb.append("    segTaskStatus: ").append(toIndentedString(segTaskStatus)).append("\n");
    sb.append("    segType: ").append(toIndentedString(segType)).append("\n");
    sb.append("    sourceResultReady: ").append(toIndentedString(sourceResultReady)).append("\n");
    sb.append("    subSegmentations: ").append(toIndentedString(subSegmentations)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
