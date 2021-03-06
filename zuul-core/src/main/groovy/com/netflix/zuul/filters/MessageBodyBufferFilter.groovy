/*
 * Copyright 2015 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.zuul.filters

import com.netflix.zuul.message.ZuulMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import rx.Observable

/**
 * User: michaels@netflix.com
 * Date: 5/28/15
 * Time: 10:54 AM
 */
public abstract class MessageBodyBufferFilter extends BaseSyncFilter<ZuulMessage, ZuulMessage> {

    @Override
    ZuulMessage apply(ZuulMessage msg) {
        return msg;
    }

    @Override
    boolean shouldFilter(ZuulMessage msg) {
        return true
    }

    @Override
    boolean needsBodyBuffered(ZuulMessage input) {
        return true;
    }

    @Override
    int filterOrder() {
        return -10
    }

}