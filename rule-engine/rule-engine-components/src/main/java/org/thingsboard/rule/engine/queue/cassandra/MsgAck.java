/**
 * Copyright © 2016-2017 The Thingsboard Authors
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
package org.thingsboard.rule.engine.queue.cassandra;

import com.datastax.driver.core.utils.UUIDs;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.thingsboard.rule.engine.api.TbMsg;
import org.thingsboard.server.common.data.UUIDConverter;

import java.util.UUID;

@Data
@EqualsAndHashCode
public class MsgAck {

    private final UUID msgId;
    private final UUID nodeId;
    private final long clusteredHash;
    private final long partition;

}
