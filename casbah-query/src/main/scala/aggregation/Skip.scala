/**
 * Copyright (c) 2010 - 2013 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For questions and comments about this product, please see the project page at:
 *
 *     http://github.com/mongodb/casbah
 *
 */

package com.mongodb.casbah.query.dsl
package aggregation

import com.mongodb.casbah.query.Imports._

/**
 * Trait to implement $skip
 * 
 * @author brendan
 */
trait SkipOperator extends PipelineOperator {
  private val operator = "$skip"

  // TODO - Accept Numeric? As long as we can downconvert for mongo type?
  def $skip(target: Int) = op(operator, target)
}

