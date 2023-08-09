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
 * Annotation details specific to image segmentation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Mask based segmentation annotation. Only one mask annotation can exist for one image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation maskAnnotation;

  /**
   * Polygon annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation polygonAnnotation;

  /**
   * Polyline annotation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation polylineAnnotation;

  /**
   * Mask based segmentation annotation. Only one mask annotation can exist for one image.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation getMaskAnnotation() {
    return maskAnnotation;
  }

  /**
   * Mask based segmentation annotation. Only one mask annotation can exist for one image.
   * @param maskAnnotation maskAnnotation or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation setMaskAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationMaskAnnotation maskAnnotation) {
    this.maskAnnotation = maskAnnotation;
    return this;
  }

  /**
   * Polygon annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation getPolygonAnnotation() {
    return polygonAnnotation;
  }

  /**
   * Polygon annotation.
   * @param polygonAnnotation polygonAnnotation or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation setPolygonAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolygonAnnotation polygonAnnotation) {
    this.polygonAnnotation = polygonAnnotation;
    return this;
  }

  /**
   * Polyline annotation.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation getPolylineAnnotation() {
    return polylineAnnotation;
  }

  /**
   * Polyline annotation.
   * @param polylineAnnotation polylineAnnotation or {@code null} for none
   */
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation setPolylineAnnotation(GoogleCloudAiplatformV1SchemaImageSegmentationAnnotationPolylineAnnotation polylineAnnotation) {
    this.polylineAnnotation = polylineAnnotation;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation clone() {
    return (GoogleCloudAiplatformV1SchemaImageSegmentationAnnotation) super.clone();
  }

}