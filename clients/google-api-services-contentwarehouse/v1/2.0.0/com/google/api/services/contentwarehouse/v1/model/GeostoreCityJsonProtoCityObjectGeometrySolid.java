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

package com.google.api.services.contentwarehouse.v1.model;

/**
 * A 3D shape, composed of a watertight exterior shell with optional interior watertight shells.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Document AI Warehouse API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreCityJsonProtoCityObjectGeometrySolid extends com.google.api.client.json.GenericJson {

  /**
   * The first shell is exterior; any additional are interior.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreCityJsonProtoCityObjectGeometryMultiSurface> shells;

  static {
    // hack to force ProGuard to consider GeostoreCityJsonProtoCityObjectGeometryMultiSurface used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GeostoreCityJsonProtoCityObjectGeometryMultiSurface.class);
  }

  /**
   * The first shell is exterior; any additional are interior.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreCityJsonProtoCityObjectGeometryMultiSurface> getShells() {
    return shells;
  }

  /**
   * The first shell is exterior; any additional are interior.
   * @param shells shells or {@code null} for none
   */
  public GeostoreCityJsonProtoCityObjectGeometrySolid setShells(java.util.List<GeostoreCityJsonProtoCityObjectGeometryMultiSurface> shells) {
    this.shells = shells;
    return this;
  }

  @Override
  public GeostoreCityJsonProtoCityObjectGeometrySolid set(String fieldName, Object value) {
    return (GeostoreCityJsonProtoCityObjectGeometrySolid) super.set(fieldName, value);
  }

  @Override
  public GeostoreCityJsonProtoCityObjectGeometrySolid clone() {
    return (GeostoreCityJsonProtoCityObjectGeometrySolid) super.clone();
  }

}