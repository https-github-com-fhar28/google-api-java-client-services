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

package com.google.api.services.aiplatform.v1beta1.model;

/**
 * A TensorboardExperiment is a group of TensorboardRuns, that are typically the results of a
 * training job run, in a Tensorboard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1TensorboardExperiment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when this TensorboardExperiment was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of this TensorboardExperiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * User provided name of this TensorboardExperiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The labels with user-defined metadata to organize your TensorboardExperiment. Label keys and
   * values cannot be longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. No
   * more than 64 user labels can be associated with one Dataset (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with `aiplatform.googleapis.com/` and are immutable. The following system labels
   * exist for each Dataset: * `aiplatform.googleapis.com/dataset_metadata_schema`: output only. Its
   * value is the metadata_schema's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. Name of the TensorboardExperiment. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. Source of the TensorboardExperiment. Example: a custom training job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when this TensorboardExperiment was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this TensorboardExperiment was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of this TensorboardExperiment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of this TensorboardExperiment.
   * @param description description or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * User provided name of this TensorboardExperiment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User provided name of this TensorboardExperiment.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Used to perform consistent read-modify-write updates. If not set, a blind "overwrite" update
   * happens.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The labels with user-defined metadata to organize your TensorboardExperiment. Label keys and
   * values cannot be longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. No
   * more than 64 user labels can be associated with one Dataset (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with `aiplatform.googleapis.com/` and are immutable. The following system labels
   * exist for each Dataset: * `aiplatform.googleapis.com/dataset_metadata_schema`: output only. Its
   * value is the metadata_schema's title.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels with user-defined metadata to organize your TensorboardExperiment. Label keys and
   * values cannot be longer than 64 characters (Unicode codepoints), can only contain lowercase
   * letters, numeric characters, underscores and dashes. International characters are allowed. No
   * more than 64 user labels can be associated with one Dataset (System labels are excluded). See
   * https://goo.gl/xmQnxf for more information and examples of labels. System reserved label keys
   * are prefixed with `aiplatform.googleapis.com/` and are immutable. The following system labels
   * exist for each Dataset: * `aiplatform.googleapis.com/dataset_metadata_schema`: output only. Its
   * value is the metadata_schema's title.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. Name of the TensorboardExperiment. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Name of the TensorboardExperiment. Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. Source of the TensorboardExperiment. Example: a custom training job.
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * Immutable. Source of the TensorboardExperiment. Example: a custom training job.
   * @param source source or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this TensorboardExperiment was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1TensorboardExperiment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1TensorboardExperiment set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1TensorboardExperiment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1TensorboardExperiment clone() {
    return (GoogleCloudAiplatformV1beta1TensorboardExperiment) super.clone();
  }

}