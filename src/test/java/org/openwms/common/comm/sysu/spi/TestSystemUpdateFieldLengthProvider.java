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
package org.openwms.common.comm.sysu.spi;

import org.openwms.common.comm.spi.FieldLengthProvider;
import org.springframework.stereotype.Component;

/**
 * A TestSystemUpdateFieldLengthProvider.
 *
 * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
 */
@Component
class TestSystemUpdateFieldLengthProvider implements FieldLengthProvider {

    @Override
    public int lengthLocationGroupName() {
        return 20;
    }

    @Override
    public int barcodeLength() {
        return 20;
    }

    @Override
    public int locationIdLength() {
        return 20;
    }

    @Override
    public int noLocationIdFields() {
        return 5;
    }
}
