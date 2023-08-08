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

package com.google.api.services.notebooks.v1.model;

/**
 * PreMigrationCheck checks how feasible a migration from UmN is.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PreMigrationCheck extends com.google.api.client.json.GenericJson {

  /**
   * Message provides a summary or workaround.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * Result returns the result of the check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String result;

  /**
   * Message provides a summary or workaround.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Message provides a summary or workaround.
   * @param message message or {@code null} for none
   */
  public PreMigrationCheck setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * Result returns the result of the check.
   * @return value or {@code null} for none
   */
  public java.lang.String getResult() {
    return result;
  }

  /**
   * Result returns the result of the check.
   * @param result result or {@code null} for none
   */
  public PreMigrationCheck setResult(java.lang.String result) {
    this.result = result;
    return this;
  }

  @Override
  public PreMigrationCheck set(String fieldName, Object value) {
    return (PreMigrationCheck) super.set(fieldName, value);
  }

  @Override
  public PreMigrationCheck clone() {
    return (PreMigrationCheck) super.clone();
  }

}