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
 * Config for blur baseline. When enabled, a linear path from the maximally blurred image to the
 * input image is created. Using a blurred baseline instead of zero (black image) is motivated by
 * the BlurIG approach explained here: https://arxiv.org/abs/2004.03383
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1beta1BlurBaselineConfig extends com.google.api.client.json.GenericJson {

  /**
   * The standard deviation of the blur kernel for the blurred baseline. The same blurring parameter
   * is used for both the height and the width dimension. If not set, the method defaults to the
   * zero (i.e. black for images) baseline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxBlurSigma;

  /**
   * The standard deviation of the blur kernel for the blurred baseline. The same blurring parameter
   * is used for both the height and the width dimension. If not set, the method defaults to the
   * zero (i.e. black for images) baseline.
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxBlurSigma() {
    return maxBlurSigma;
  }

  /**
   * The standard deviation of the blur kernel for the blurred baseline. The same blurring parameter
   * is used for both the height and the width dimension. If not set, the method defaults to the
   * zero (i.e. black for images) baseline.
   * @param maxBlurSigma maxBlurSigma or {@code null} for none
   */
  public GoogleCloudAiplatformV1beta1BlurBaselineConfig setMaxBlurSigma(java.lang.Float maxBlurSigma) {
    this.maxBlurSigma = maxBlurSigma;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1beta1BlurBaselineConfig set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1beta1BlurBaselineConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1beta1BlurBaselineConfig clone() {
    return (GoogleCloudAiplatformV1beta1BlurBaselineConfig) super.clone();
  }

}