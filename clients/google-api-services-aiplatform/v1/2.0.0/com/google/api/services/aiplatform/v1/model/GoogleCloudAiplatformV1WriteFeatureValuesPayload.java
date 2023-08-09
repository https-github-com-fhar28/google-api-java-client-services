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
 * Contains Feature values to be written for a specific entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1WriteFeatureValuesPayload extends com.google.api.client.json.GenericJson {

  /**
   * Required. The ID of the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Required. Feature values to be written, mapping from Feature ID to value. Up to 100,000
   * `feature_values` entries may be written across all payloads. The feature generation time,
   * aligned by days, must be no older than five years (1825 days) and no later than one year (366
   * days) in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudAiplatformV1FeatureValue> featureValues;

  static {
    // hack to force ProGuard to consider GoogleCloudAiplatformV1FeatureValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudAiplatformV1FeatureValue.class);
  }

  /**
   * Required. The ID of the entity.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * Required. The ID of the entity.
   * @param entityId entityId or {@code null} for none
   */
  public GoogleCloudAiplatformV1WriteFeatureValuesPayload setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Required. Feature values to be written, mapping from Feature ID to value. Up to 100,000
   * `feature_values` entries may be written across all payloads. The feature generation time,
   * aligned by days, must be no older than five years (1825 days) and no later than one year (366
   * days) in the future.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudAiplatformV1FeatureValue> getFeatureValues() {
    return featureValues;
  }

  /**
   * Required. Feature values to be written, mapping from Feature ID to value. Up to 100,000
   * `feature_values` entries may be written across all payloads. The feature generation time,
   * aligned by days, must be no older than five years (1825 days) and no later than one year (366
   * days) in the future.
   * @param featureValues featureValues or {@code null} for none
   */
  public GoogleCloudAiplatformV1WriteFeatureValuesPayload setFeatureValues(java.util.Map<String, GoogleCloudAiplatformV1FeatureValue> featureValues) {
    this.featureValues = featureValues;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1WriteFeatureValuesPayload set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1WriteFeatureValuesPayload) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1WriteFeatureValuesPayload clone() {
    return (GoogleCloudAiplatformV1WriteFeatureValuesPayload) super.clone();
  }

}