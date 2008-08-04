/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pdfbox.pdmodel.common.function;

import org.pdfbox.cos.COSDictionary;

/**
 * This class represents a type 2 function in a PDF document.
 *
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.2 $
 */
public class PDFunctionType2 extends PDDictionaryFunction
{

    /**
     * Constructor to create a new blank type 2 function.
     */
    protected PDFunctionType2()
    {
        super( 2 );
    }

    /**
     * Constructor.
     *
     * @param functionDictionary The prepopulated function dictionary.
     */
    public PDFunctionType2( COSDictionary functionDictionary )
    {
        super( functionDictionary );
    }
    
}