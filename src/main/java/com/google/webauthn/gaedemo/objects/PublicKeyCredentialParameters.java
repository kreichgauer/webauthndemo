// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.webauthn.gaedemo.objects;

import com.google.gson.JsonObject;

public class PublicKeyCredentialParameters {
  private PublicKeyCredentialType type;
  private int algorithm;

  /**
   * @param type
   * @param algorithm
   */
  public PublicKeyCredentialParameters(PublicKeyCredentialType type, int algorithm) {
    this.type = type;
    this.algorithm = algorithm;
  }

  /**
   * @return JsonObject representation of PublicKeyCredentialParameters
   */
  public JsonObject getJsonObject() {
    JsonObject result = new JsonObject();
    result.addProperty("type", type.toString());
    result.addProperty("alg", algorithm);

    return result;
  }
}
