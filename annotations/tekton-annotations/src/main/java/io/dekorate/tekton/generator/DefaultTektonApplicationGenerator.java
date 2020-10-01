/**
 * Copyright 2018 The original authors.
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
package io.dekorate.tekton.generator;

import io.dekorate.config.DefaultConfiguration;
import io.dekorate.kubernetes.configurator.ApplyDeployToApplicationConfiguration;
import io.dekorate.project.ApplyProjectInfo;
import io.dekorate.tekton.config.TektonConfig;
import io.dekorate.tekton.config.TektonConfigBuilder;

public class DefaultTektonApplicationGenerator implements TektonApplicationGenerator {

  public DefaultTektonApplicationGenerator() {
    on(new DefaultConfiguration<TektonConfig>(new TektonConfigBuilder()
        .accept(new ApplyProjectInfo(getProject()))
        .accept(new ApplyDeployToApplicationConfiguration())));
  }
}