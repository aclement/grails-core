/*
 * Copyright 2004-2005 the original author or authors.
 *
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
 */
package org.codehaus.groovy.grails.commons.metaclass;

/**
 * Dynamic method invocation callback interface. Implementation classes
 * can add a persistence functionality to Grails like save and delete.
 *
 * @author Steven Devijver
 * @author Graeme Rocher
 */
public interface DynamicMethodInvocation {

    /**
     * Checks if a method name matches the criteria of the implementation class.
     *
     * @param methodName the static method name
     * @return result of criteria match test
     */
    boolean isMethodMatch(String methodName);

    /**
     * Invokes the actual method. The target object and arguments are supplied.
     *
     * @param target the target on which the method is invoked.
     * @param methodName
     *@param arguments the arguments passed in the method call @return the return value of the dynamic method invocation.
     */
    Object invoke(Object target, String methodName, Object[] arguments);
}
