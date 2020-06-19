/*
 * Copyright 2020 Andrey Grigorov
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.peneksglazami.ext;

import com.github.peneksglazami.ext.resources.GreetingResourceExt;
import org.glassfish.jersey.internal.spi.AutoDiscoverable;

import javax.annotation.Priority;
import javax.ws.rs.ConstrainedTo;
import javax.ws.rs.RuntimeType;
import javax.ws.rs.core.FeatureContext;

@ConstrainedTo(RuntimeType.SERVER)
@Priority(AutoDiscoverable.DEFAULT_PRIORITY)
public class ResourcesAutoDiscoverable implements AutoDiscoverable {

    public void configure(FeatureContext context) {
        context.register(GreetingResourceExt.class);
    }
}
