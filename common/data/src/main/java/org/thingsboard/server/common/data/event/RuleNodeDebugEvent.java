/**
 * Copyright © 2016-2022 The Thingsboard Authors
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
package org.thingsboard.server.common.data.event;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;

import java.util.UUID;

@ToString
@EqualsAndHashCode(callSuper = true)
public class RuleNodeDebugEvent extends Event {

    private static final long serialVersionUID = -6575797430064573984L;

    @Builder
    private RuleNodeDebugEvent(TenantId tenantId, EntityId entityId, String serviceId,
                               String eventType, EntityId eventEntity, UUID msgId,
                               String msgType, String dataType, String relationType,
                               String data, String metadata, String error) {
        super(tenantId, entityId, serviceId);
        this.eventType = eventType;
        this.eventEntity = eventEntity;
        this.msgId = msgId;
        this.msgType = msgType;
        this.dataType = dataType;
        this.relationType = relationType;
        this.data = data;
        this.metadata = metadata;
        this.error = error;
    }

    @Getter
    private final String eventType;
    @Getter
    private final EntityId eventEntity;
    @Getter
    private final UUID msgId;
    @Getter
    private final String msgType;
    @Getter
    private final String dataType;
    @Getter
    private final String relationType;
    @Getter @Setter
    private String data;
    @Getter @Setter
    private String metadata;
    @Getter @Setter
    private String error;

    //TODO: rename the enum constant
    @Override
    public EventType getType() {
        return EventType.DEBUG_RULE_NODE;
    }
}