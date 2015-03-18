/*
 * #%L
 * Gson Field Name Strategy Example
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.javacreed.examples.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ItemServiceImpl implements ItemService {

  private final Gson gson = new GsonBuilder().setFieldNamingStrategy(new ItemFieldNameStrategy()).create();

  @Override
  public Item parseItem(final String json) {
    return gson.fromJson(json, Item.class);
  }

}
