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
 * The information about the parent of a model.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1PublisherModelParent extends com.google.api.client.json.GenericJson {

  /**
   * Required. The display name of the parent. E.g., LaMDA, T5, Vision API, Natural Language API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The Google Cloud resource name or the URI reference.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1PublisherModelResourceReference reference;

  /**
   * Required. The display name of the parent. E.g., LaMDA, T5, Vision API, Natural Language API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the parent. E.g., LaMDA, T5, Vision API, Natural Language API.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PublisherModelParent setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The Google Cloud resource name or the URI reference.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PublisherModelResourceReference getReference() {
    return reference;
  }

  /**
   * Optional. The Google Cloud resource name or the URI reference.
   * @param reference reference or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1PublisherModelParent setReference(GoogleCloudAiplatformV1beta1PublisherModelResourceReference reference) {
    this.reference = reference;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1PublisherModelParent set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1PublisherModelParent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1PublisherModelParent clone() {
    return (GoogleCloudAiplatformV1beta1PublisherModelParent) super.clone();
  }

}