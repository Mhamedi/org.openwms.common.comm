/*
 * Copyright 2018 Heiko Scherrer
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
 */
package org.openwms.common.comm.osip.synq.tcp;

import org.openwms.common.comm.config.Driver;
import org.openwms.common.comm.osip.OSIPComponent;
import org.openwms.common.comm.osip.OSIPSerializer;
import org.openwms.common.comm.osip.synq.TimesyncResponse;

import java.text.SimpleDateFormat;

/**
 * A TimesyncResponseSerializer.
 *
 * @author <a href="mailto:hscherrer@openwms.org">Heiko Scherrer</a>
 */
@OSIPComponent
class TimesyncResponseSerializer extends OSIPSerializer<TimesyncResponse> {

    public TimesyncResponseSerializer(Driver driver) {
        super(driver);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessageIdentifier() {
        return TimesyncResponse.IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String convert(TimesyncResponse message) {
        return getMessageIdentifier() +
                new SimpleDateFormat(getDriver().getOsip().getDatePattern()).format(message.getSenderTime());
    }
}
