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
public final class GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Bounding box intersection-over-union precision. Measures how well the bounding boxes overlap
   * between each other (e.g. complete overlap or just barely above iou_threshold).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float boundingBoxIou;

  /**
   * The confidence threshold value used to compute the metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidenceThreshold;

  /**
   * Mismatch rate, which measures the tracking consistency, i.e. correctness of instance ID
   * continuity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float mismatchRate;

  /**
   * Tracking precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trackingPrecision;

  /**
   * Tracking recall.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float trackingRecall;

  /**
   * Bounding box intersection-over-union precision. Measures how well the bounding boxes overlap
   * between each other (e.g. complete overlap or just barely above iou_threshold).
   * @return value or {@code null} for none
   */
  public java.lang.Float getBoundingBoxIou() {
    return boundingBoxIou;
  }

  /**
   * Bounding box intersection-over-union precision. Measures how well the bounding boxes overlap
   * between each other (e.g. complete overlap or just barely above iou_threshold).
   * @param boundingBoxIou boundingBoxIou or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics setBoundingBoxIou(java.lang.Float boundingBoxIou) {
    this.boundingBoxIou = boundingBoxIou;
    return this;
  }

  /**
   * The confidence threshold value used to compute the metrics.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidenceThreshold() {
    return confidenceThreshold;
  }

  /**
   * The confidence threshold value used to compute the metrics.
   * @param confidenceThreshold confidenceThreshold or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics setConfidenceThreshold(java.lang.Float confidenceThreshold) {
    this.confidenceThreshold = confidenceThreshold;
    return this;
  }

  /**
   * Mismatch rate, which measures the tracking consistency, i.e. correctness of instance ID
   * continuity.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMismatchRate() {
    return mismatchRate;
  }

  /**
   * Mismatch rate, which measures the tracking consistency, i.e. correctness of instance ID
   * continuity.
   * @param mismatchRate mismatchRate or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics setMismatchRate(java.lang.Float mismatchRate) {
    this.mismatchRate = mismatchRate;
    return this;
  }

  /**
   * Tracking precision.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrackingPrecision() {
    return trackingPrecision;
  }

  /**
   * Tracking precision.
   * @param trackingPrecision trackingPrecision or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics setTrackingPrecision(java.lang.Float trackingPrecision) {
    this.trackingPrecision = trackingPrecision;
    return this;
  }

  /**
   * Tracking recall.
   * @return value or {@code null} for none
   */
  public java.lang.Float getTrackingRecall() {
    return trackingRecall;
  }

  /**
   * Tracking recall.
   * @param trackingRecall trackingRecall or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics setTrackingRecall(java.lang.Float trackingRecall) {
    this.trackingRecall = trackingRecall;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics clone() {
    return (GoogleCloudAiplatformV1SchemaModelevaluationMetricsTrackMetricsConfidenceMetrics) super.clone();
  }

}