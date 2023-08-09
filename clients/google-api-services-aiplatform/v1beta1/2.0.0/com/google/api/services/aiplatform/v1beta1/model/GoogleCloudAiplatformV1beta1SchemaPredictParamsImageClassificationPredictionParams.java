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
 * Prediction model parameters for Image Classification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams extends com.google.api.client.json.GenericJson {

  /**
   * The Model only returns predictions with at least this confidence score. Default value is 0.0
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * The Model only returns up to that many top, by confidence score, predictions per instance. If
   * this number is very high, the Model may return fewer predictions. Default value is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxPredictions;

  /**
   * The Model only returns predictions with at least this confidence score. Default value is 0.0
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * The Model only returns predictions with at least this confidence score. Default value is 0.0
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * The Model only returns up to that many top, by confidence score, predictions per instance. If
   * this number is very high, the Model may return fewer predictions. Default value is 10.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxPredictions() {
    return maxPredictions;
  }

  /**
   * The Model only returns up to that many top, by confidence score, predictions per instance. If
   * this number is very high, the Model may return fewer predictions. Default value is 10.
   * @param maxPredictions maxPredictions or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams setMaxPredictions(java.lang.Integer maxPredictions) {
    this.maxPredictions = maxPredictions;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams clone() {
    return (GoogleCloudAiplatformV1beta1SchemaPredictParamsImageClassificationPredictionParams) super.clone();
  }

}