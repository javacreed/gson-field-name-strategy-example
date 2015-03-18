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

import org.junit.Assert;
import org.junit.Test;

public class ItemServiceTest {

  private final ItemService itemService = new ItemServiceImpl();

  @Test
  public void test() {
    final String json = "{'item-name':'Sample Text','item-quantity':7}";
    final Item item = itemService.parseItem(json);
    Assert.assertNotNull(item);
    Assert.assertEquals("Sample Text", item.getName());
    Assert.assertEquals(7, item.getQuantity());
  }
}
