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
 * Model definition for GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationM
 * etricsConfidenceMetrics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Metrics are computed with an assumption that the Model never returns predictions with score
   * lower than this value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * The harmonic mean of recall and precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1Score;

  /**
   * Precision for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precision;

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recall;

  /**
   * Metrics are computed with an assumption that the Model never returns predictions with score
   * lower than this value.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * Metrics are computed with an assumption that the Model never returns predictions with score
   * lower than this value.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * The harmonic mean of recall and precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1Score() {
    return f1Score;
  }

  /**
   * The harmonic mean of recall and precision.
   * @param f1Score f1Score or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics setF1Score(java.lang.Float f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * Precision for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecision() {
    return precision;
  }

  /**
   * Precision for the given confidence threshold.
   * @param precision precision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics setPrecision(java.lang.Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecall() {
    return recall;
  }

  /**
   * Recall (True Positive Rate) for the given confidence threshold.
   * @param recall recall or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics setRecall(java.lang.Float recall) {
    this.recall = recall;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics clone() {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTextExtractionEvaluationMetricsConfidenceMetrics) super.clone();
  }

}