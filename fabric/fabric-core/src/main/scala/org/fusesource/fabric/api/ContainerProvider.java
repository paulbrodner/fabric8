/**
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fusesource.fabric.api;

import java.util.Set;

/**
 * A Factory that creates {@link Container}.
 */
public interface ContainerProvider<O extends CreateContainerOptions, M extends CreateContainerMetadata> {

    static final String DEBUG_CONTAINER =" -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005";
    static final String ENSEMBLE_SERVER_CONTAINER =" -D"+ZooKeeperClusterService.ENSEMBLE_AUTOSTART +"=true";
    static final String PROTOCOL = "fabric.container.protocol";

    /**
     * Creates a container using a set of arguments
     */
    Set<M> create(O options) throws Exception;
}
