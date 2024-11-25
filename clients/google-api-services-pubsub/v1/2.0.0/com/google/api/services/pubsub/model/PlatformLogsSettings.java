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

package com.google.api.services.pubsub.model;

/**
 * Settings for Platform Logs produced by Pub/Sub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlatformLogsSettings extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The minimum severity level of Platform Logs that will be written.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Optional. The minimum severity level of Platform Logs that will be written.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * Optional. The minimum severity level of Platform Logs that will be written.
   * @param severity severity or {@code null} for none
   */
  public PlatformLogsSettings setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  @Override
  public PlatformLogsSettings set(String fieldName, Object value) {
    return (PlatformLogsSettings) super.set(fieldName, value);
  }

  @Override
  public PlatformLogsSettings clone() {
    return (PlatformLogsSettings) super.clone();
  }

}
