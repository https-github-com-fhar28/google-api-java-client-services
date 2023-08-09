/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.aiplatform.v1.model;

/**
 * Tensorboard is a physical database that stores users' training metrics. A default Tensorboard is
 * provided in each region of a Google Cloud project. If needed users can also create extra
 * Tensorboards in their projects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Tensorboard extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Consumer project Cloud Storage path prefix used to store blob data, which can
   * either be a bucket or directory. Does not end with a '/'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String blobStoragePathPrefix;

  /**
   * Output only. Timestamp when this Tensorboard was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of this Tensorboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. User provided name of this Tensorboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-
   * resources of this Tensorboard will be secured by this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1EncryptionSpec encryptionSpec;

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Used to indicate if the TensorBoard instance is the default one. Each project & region can have
   * at most one default TensorBoard instance. Creation of a default TensorBoard instance and
   * updating an existing TensorBoard instance to be default will mark all other TensorBoard
   * instances (if any) as non default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDefault;

  /**
   * The labels with user-defined metadata to organize your Tensorboards. Label keys and values can
   * be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. No more than
   * 64 user labels can be associated with one Tensorboard (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Name of the Tensorboard. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The number of Runs stored in this Tensorboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer runCount;

  /**
   * Output only. Timestamp when this Tensorboard was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Consumer project Cloud Storage path prefix used to store blob data, which can
   * either be a bucket or directory. Does not end with a '/'.
   * @return value or {@code null} for none
   */
  public java.lang.String getBlobStoragePathPrefix() {
    return blobStoragePathPrefix;
  }

  /**
   * Output only. Consumer project Cloud Storage path prefix used to store blob data, which can
   * either be a bucket or directory. Does not end with a '/'.
   * @param blobStoragePathPrefix blobStoragePathPrefix or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setBlobStoragePathPrefix(java.lang.String blobStoragePathPrefix) {
    this.blobStoragePathPrefix = blobStoragePathPrefix;
    return this;
  }

  /**
   * Output only. Timestamp when this Tensorboard was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this Tensorboard was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of this Tensorboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of this Tensorboard.
   * @param description description or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. User provided name of this Tensorboard.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. User provided name of this Tensorboard.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-
   * resources of this Tensorboard will be secured by this key.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1EncryptionSpec getEncryptionSpec() {
    return encryptionSpec;
  }

  /**
   * Customer-managed encryption key spec for a Tensorboard. If set, this Tensorboard and all sub-
   * resources of this Tensorboard will be secured by this key.
   * @param encryptionSpec encryptionSpec or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setEncryptionSpec(GoogleCloudAiplatformV1EncryptionSpec encryptionSpec) {
    this.encryptionSpec = encryptionSpec;
    return this;
  }

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used to perform a consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Used to indicate if the TensorBoard instance is the default one. Each project & region can have
   * at most one default TensorBoard instance. Creation of a default TensorBoard instance and
   * updating an existing TensorBoard instance to be default will mark all other TensorBoard
   * instances (if any) as non default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDefault() {
    return isDefault;
  }

  /**
   * Used to indicate if the TensorBoard instance is the default one. Each project & region can have
   * at most one default TensorBoard instance. Creation of a default TensorBoard instance and
   * updating an existing TensorBoard instance to be default will mark all other TensorBoard
   * instances (if any) as non default.
   * @param isDefault isDefault or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setIsDefault(java.lang.Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * The labels with user-defined metadata to organize your Tensorboards. Label keys and values can
   * be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. No more than
   * 64 user labels can be associated with one Tensorboard (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels with user-defined metadata to organize your Tensorboards. Label keys and values can
   * be no longer than 64 characters (Unicode codepoints), can only contain lowercase letters,
   * numeric characters, underscores and dashes. International characters are allowed. No more than
   * 64 user labels can be associated with one Tensorboard (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with "aiplatform.googleapis.com/" and are immutable.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Name of the Tensorboard. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the Tensorboard. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The number of Runs stored in this Tensorboard.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRunCount() {
    return runCount;
  }

  /**
   * Output only. The number of Runs stored in this Tensorboard.
   * @param runCount runCount or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setRunCount(java.lang.Integer runCount) {
    this.runCount = runCount;
    return this;
  }

  /**
   * Output only. Timestamp when this Tensorboard was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this Tensorboard was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1Tensorboard setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Tensorboard set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Tensorboard) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Tensorboard clone() {
    return (GoogleCloudAiplatformV1Tensorboard) super.clone();
  }

}