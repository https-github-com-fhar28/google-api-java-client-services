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
 * Metrics for a single confidence threshold.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The confidence threshold value used to compute the metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * Output only. The harmonic mean of recall and precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float f1Score;

  /**
   * Output only. Precision for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float precision;

  /**
   * Output only. Recall for the given confidence threshold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float recall;

  /**
   * Output only. The confidence threshold value used to compute the metrics.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * Output only. The confidence threshold value used to compute the metrics.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Output only. The harmonic mean of recall and precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getF1Score() {
    return f1Score;
  }

  /**
   * Output only. The harmonic mean of recall and precision.
   * @param f1Score f1Score or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics setF1Score(java.lang.Float f1Score) {
    this.f1Score = f1Score;
    return this;
  }

  /**
   * Output only. Precision for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrecision() {
    return precision;
  }

  /**
   * Output only. Precision for the given confidence threshold.
   * @param precision precision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics setPrecision(java.lang.Float precision) {
    this.precision = precision;
    return this;
  }

  /**
   * Output only. Recall for the given confidence threshold.
   * @return value or {@code null} for none
   */
  public java.lang.Float getRecall() {
    return recall;
  }

  /**
   * Output only. Recall for the given confidence threshold.
   * @param recall recall or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics setRecall(java.lang.Float recall) {
    this.recall = recall;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics clone() {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsVideoActionMetricsConfidenceMetrics) super.clone();
  }

}