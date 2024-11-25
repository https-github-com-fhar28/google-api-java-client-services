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

package com.google.api.services.testing.model;

/**
 * Describes a single error or issue with a matrix.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MatrixErrorDetail extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A human-readable message about how the error in the TestMatrix. Expands on the
   * `reason` field with additional details and possible options to fix the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Output only. The reason for the error. This is a constant value in UPPER_SNAKE_CASE that
   * identifies the cause of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * Output only. A human-readable message about how the error in the TestMatrix. Expands on the
   * `reason` field with additional details and possible options to fix the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Output only. A human-readable message about how the error in the TestMatrix. Expands on the
   * `reason` field with additional details and possible options to fix the issue.
   * @param message message or {@code null} for none
   */
  public MatrixErrorDetail setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Output only. The reason for the error. This is a constant value in UPPER_SNAKE_CASE that
   * identifies the cause of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * Output only. The reason for the error. This is a constant value in UPPER_SNAKE_CASE that
   * identifies the cause of the error.
   * @param reason reason or {@code null} for none
   */
  public MatrixErrorDetail setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public MatrixErrorDetail set(String fieldName, Object value) {
    return (MatrixErrorDetail) super.set(fieldName, value);
  }

  @Override
  public MatrixErrorDetail clone() {
    return (MatrixErrorDetail) super.clone();
  }

}
