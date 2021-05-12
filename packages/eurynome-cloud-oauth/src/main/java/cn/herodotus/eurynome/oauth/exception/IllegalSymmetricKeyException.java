/*
 * Copyright (c) 2019-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-oauth
 * File Name: IllegalSymmetricKeyException.java
 * Author: gengwei.zheng
 * Date: 2021/1/17 上午10:53
 * LastModified: 2020/6/19 下午3:45
 */

package cn.herodotus.eurynome.oauth.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * <p> Description : 非法加密Key Exception </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/1/28 17:32
 */
public class IllegalSymmetricKeyException extends AuthenticationException {

    public IllegalSymmetricKeyException(String message) {
        super(message);
    }
}
