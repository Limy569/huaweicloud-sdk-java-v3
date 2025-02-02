/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2021-2021. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.huaweicloud.sdk.core;

/**
 * @author HuaweiCloud_SDK
 */
public final class Constants {
    public static final String LINE_SEPARATOR = "\n";

    public static final String SDK_SIGNING_ALGORITHM = "SDK-HMAC-SHA256";

    public static final String X_SDK_DATE = "X-Sdk-Date";

    public static final String HTTP_SCHEME = "http";

    public static final String HTTPS_SCHEME = "https";

    public static final String HOST = "Host";

    public static final String CONTENT_TYPE = "Content-Type";

    public static final String CONTENT_LENGTH = "Content-Length";

    public static final String USER_AGENT = "User-Agent";

    public static final String AUTHORIZATION = "Authorization";

    public static final String X_PROJECT_ID = "X-Project-Id";

    public static final String X_DOMAIN_ID = "X-Domain-Id";

    public static final String X_SECURITY_TOKEN = "X-Security-Token";

    public static final String X_SDK_CONTENT_SHA256 = "X-Sdk-Content-Sha256";

    public static final String UNSIGNED_PAYLOAD = "UNSIGNED-PAYLOAD";

    public static final String CUSTOMIZATION = "Customization";

    /**
     * Supported media type
     */
    public static class MEDIATYPE {
        public static final String APPLICATION_JSON = "application/json";

        public static final String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";

        public static final String APPLICATION_OCTET_STREAM = "application/octet-stream";

        public static final String MULTIPART_FORM_DATA = "multipart/form-data";

        public static final String TEXT = "text";
    }

    public static final String BODY = "body";

    public static final String ERROR_CODE = "error_code";

    public static final String ERROR_MSG = "error_msg";

    public static final String REQUEST_ID = "request_id";

    public static final String X_REQUEST_ID = "X-Request-Id";

    public static final String CODE = "code";

    public static final String MESSAGE = "message";

    public static final String PROJECT_ID = "project_id";

    public static final String DOMAIN_ID = "domain_id";

    public static final String SDK_EXCHANGE = "SDK_EXCHANGE";

    public static final String DEFAULT_IAM_ENDPOINT = "https://iam.myhuaweicloud.com";

    /**
     * The utility class should hide the public constructor
     */
    private Constants() {

    }
}
