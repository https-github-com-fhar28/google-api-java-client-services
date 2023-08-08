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

package com.google.api.services.apigee.v1.model;

/**
 * AppGroupAppKey contains all the information associated with the credentials.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1AppGroupAppKey extends com.google.api.client.json.GenericJson {

  /**
   * Output only. List of API products and its status for which the credential can be used.
   * **Note**: Use UpdateAppGroupAppKeyApiProductRequest API to make the association after the
   * consumer key and secret are created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1APIProductAssociation> apiProducts;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1APIProductAssociation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1APIProductAssociation.class);
  }

  /**
   * List of attributes associated with the credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Attribute> attributes;

  /**
   * Immutable. Consumer key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerKey;

  /**
   * Secret key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerSecret;

  /**
   * Output only. Time the AppGroup app expires in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresAt;

  /**
   * Immutable. Expiration time, in seconds, for the consumer key. If not set or left to the default
   * value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresInSeconds;

  /**
   * Output only. Time the AppGroup app was created in milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long issuedAt;

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. List of API products and its status for which the credential can be used.
   * **Note**: Use UpdateAppGroupAppKeyApiProductRequest API to make the association after the
   * consumer key and secret are created.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1APIProductAssociation> getApiProducts() {
    return apiProducts;
  }

  /**
   * Output only. List of API products and its status for which the credential can be used.
   * **Note**: Use UpdateAppGroupAppKeyApiProductRequest API to make the association after the
   * consumer key and secret are created.
   * @param apiProducts apiProducts or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setApiProducts(java.util.List<GoogleCloudApigeeV1APIProductAssociation> apiProducts) {
    this.apiProducts = apiProducts;
    return this;
  }

  /**
   * List of attributes associated with the credential.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * List of attributes associated with the credential.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Immutable. Consumer key.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerKey() {
    return consumerKey;
  }

  /**
   * Immutable. Consumer key.
   * @param consumerKey consumerKey or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setConsumerKey(java.lang.String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

  /**
   * Secret key.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerSecret() {
    return consumerSecret;
  }

  /**
   * Secret key.
   * @param consumerSecret consumerSecret or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setConsumerSecret(java.lang.String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

  /**
   * Output only. Time the AppGroup app expires in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresAt() {
    return expiresAt;
  }

  /**
   * Output only. Time the AppGroup app expires in milliseconds since epoch.
   * @param expiresAt expiresAt or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setExpiresAt(java.lang.Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  /**
   * Immutable. Expiration time, in seconds, for the consumer key. If not set or left to the default
   * value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresInSeconds() {
    return expiresInSeconds;
  }

  /**
   * Immutable. Expiration time, in seconds, for the consumer key. If not set or left to the default
   * value of `-1`, the API key never expires. The expiration time can't be updated after it is set.
   * @param expiresInSeconds expiresInSeconds or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setExpiresInSeconds(java.lang.Long expiresInSeconds) {
    this.expiresInSeconds = expiresInSeconds;
    return this;
  }

  /**
   * Output only. Time the AppGroup app was created in milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIssuedAt() {
    return issuedAt;
  }

  /**
   * Output only. Time the AppGroup app was created in milliseconds since epoch.
   * @param issuedAt issuedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setIssuedAt(java.lang.Long issuedAt) {
    this.issuedAt = issuedAt;
    return this;
  }

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * Scopes to apply to the app. The specified scope names must already be defined for the API
   * product that you associate with the app.
   * @param scopes scopes or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the credential. Valid values include `approved` or `revoked`.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1AppGroupAppKey setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1AppGroupAppKey set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1AppGroupAppKey) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1AppGroupAppKey clone() {
    return (GoogleCloudApigeeV1AppGroupAppKey) super.clone();
  }

}