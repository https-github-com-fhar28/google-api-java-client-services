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
 * A container for a single DataItem and Annotations on it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1DataItemView extends com.google.api.client.json.GenericJson {

  /**
   * The Annotations on the DataItem. If too many Annotations should be returned for the DataItem,
   * this field will be truncated per annotations_limit in request. If it was, then the
   * has_truncated_annotations will be set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudAiplatformV1beta1Annotation> annotations;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1beta1Annotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1beta1Annotation.class);
  }

  /**
   * The DataItem.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1DataItem dataItem;

  /**
   * True if and only if the Annotations field has been truncated. It happens if more Annotations
   * for this DataItem met the request's annotation_filter than are allowed to be returned by
   * annotations_limit. Note that if Annotations field is not being returned due to field mask, then
   * this field will not be set to true no matter how many Annotations are there.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasTruncatedAnnotations;

  /**
   * The Annotations on the DataItem. If too many Annotations should be returned for the DataItem,
   * this field will be truncated per annotations_limit in request. If it was, then the
   * has_truncated_annotations will be set to true.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudAiplatformV1beta1Annotation> getAnnotations() {
    return annotations;
  }

  /**
   * The Annotations on the DataItem. If too many Annotations should be returned for the DataItem,
   * this field will be truncated per annotations_limit in request. If it was, then the
   * has_truncated_annotations will be set to true.
   * @param annotations annotations or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DataItemView setAnnotations(java.util.List<GoogleCloudAiplatformV1beta1Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * The DataItem.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DataItem getDataItem() {
    return dataItem;
  }

  /**
   * The DataItem.
   * @param dataItem dataItem or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DataItemView setDataItem(GoogleCloudAiplatformV1beta1DataItem dataItem) {
    this.dataItem = dataItem;
    return this;
  }

  /**
   * True if and only if the Annotations field has been truncated. It happens if more Annotations
   * for this DataItem met the request's annotation_filter than are allowed to be returned by
   * annotations_limit. Note that if Annotations field is not being returned due to field mask, then
   * this field will not be set to true no matter how many Annotations are there.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasTruncatedAnnotations() {
    return hasTruncatedAnnotations;
  }

  /**
   * True if and only if the Annotations field has been truncated. It happens if more Annotations
   * for this DataItem met the request's annotation_filter than are allowed to be returned by
   * annotations_limit. Note that if Annotations field is not being returned due to field mask, then
   * this field will not be set to true no matter how many Annotations are there.
   * @param hasTruncatedAnnotations hasTruncatedAnnotations or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1DataItemView setHasTruncatedAnnotations(java.lang.Boolean hasTruncatedAnnotations) {
    this.hasTruncatedAnnotations = hasTruncatedAnnotations;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1DataItemView set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1DataItemView) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1DataItemView clone() {
    return (GoogleCloudAiplatformV1beta1DataItemView) super.clone();
  }

}