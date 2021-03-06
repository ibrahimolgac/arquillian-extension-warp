/**
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.warp.client.filter.http;

import org.jboss.arquillian.warp.client.filter.RequestFilter;
import org.jboss.arquillian.warp.client.filter.matcher.HttpHeaderMatcherBuilder;
import org.jboss.arquillian.warp.client.filter.matcher.HttpParameterMatcherBuilder;
import org.jboss.arquillian.warp.client.filter.matcher.MethodMatcherBuilder;
import org.jboss.arquillian.warp.client.filter.matcher.UriMatcherBuilder;
import org.jboss.arquillian.warp.client.observer.ObserverBuilder;

/**
 * Builder responsible for creating {@link RequestFilter} class.
 */
public interface HttpFilterBuilder extends ObserverBuilder<HttpFilterBuilder, RequestFilter<HttpRequest>> {

    /**
     * Creates new uri matcher builder.
     *
     * @return uri matcher builder
     */
    UriMatcherBuilder<HttpFilterBuilder> uri();

    /**
     * Creates new method matcher builder.
     *
     * @return the method matcher builder
     */
    MethodMatcherBuilder<HttpFilterBuilder> method();

    /**
     * Creates new http header matcher builder.
     *
     * @return the method matcher builder
     */
    HttpHeaderMatcherBuilder<HttpFilterBuilder> header();

    HttpParameterMatcherBuilder<HttpFilterBuilder> parameter();

    /**
     * Matches the request which has given index (number; order) in sequence of matched requests.
     *
     * <ul>
     * <li>first request - <tt>index(1)</tt></li>
     * <li>second request - <tt>index(2)</tt></li>
     * </ul>
     *
     * @param indexOfRequest the index of request to observe
     * @return the HTTP filter builder
     */
    HttpFilterBuilder index(int indexOfRequest);
}
