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
 * Selector for Features of an EntityType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1FeatureSelector extends com.google.api.client.json.GenericJson {

  /**
   * Required. Matches Features based on ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1beta1IdMatcher idMatcher;

  /**
   * Required. Matches Features based on ID.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1IdMatcher getIdMatcher() {
    return idMatcher;
  }

  /**
   * Required. Matches Features based on ID.
   * @param idMatcher idMatcher or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1FeatureSelector setIdMatcher(GoogleCloudAiplatformV1beta1IdMatcher idMatcher) {
    this.idMatcher = idMatcher;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1FeatureSelector set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1FeatureSelector) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1FeatureSelector clone() {
    return (GoogleCloudAiplatformV1beta1FeatureSelector) super.clone();
  }

}