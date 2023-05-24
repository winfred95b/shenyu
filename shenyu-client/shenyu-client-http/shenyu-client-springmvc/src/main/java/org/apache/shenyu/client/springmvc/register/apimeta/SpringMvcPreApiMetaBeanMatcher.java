/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.client.springmvc.register.apimeta;

import org.apache.shenyu.client.core.register.ApiBean;
import org.apache.shenyu.client.core.register.matcher.Matcher;
import org.apache.shenyu.client.springmvc.annotation.ShenyuSpringMvcClient;

public class SpringMvcPreApiMetaBeanMatcher implements Matcher<ApiBean> {

    @Override
    public boolean match(final ApiBean element) {
        ShenyuSpringMvcClient annotation = element.getAnnotation(ShenyuSpringMvcClient.class);
        return annotation != null && annotation.path().endsWith("/**");
    }
}
