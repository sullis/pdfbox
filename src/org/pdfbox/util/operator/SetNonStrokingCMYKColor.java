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
package org.pdfbox.util.operator;

import java.util.List;

import org.pdfbox.cos.COSNumber;
import org.pdfbox.pdmodel.graphics.color.PDColorSpace;
import org.pdfbox.pdmodel.graphics.color.PDColorSpaceInstance;
import org.pdfbox.pdmodel.graphics.color.PDDeviceCMYK;
import org.pdfbox.util.PDFOperator;

import java.io.IOException;

/**
 * <p>Set the non stroking color space.</p>
 * 
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.4 $
 */
public class SetNonStrokingCMYKColor extends OperatorProcessor 
{
    /**
     * k Set color space for non stroking operations.
     * @param operator The operator that is being executed.
     * @param arguments List
     * @throws IOException If an error occurs while processing the font.
     */
    public void process(PDFOperator operator, List arguments) throws IOException
    {
        PDColorSpace cs = PDDeviceCMYK.INSTANCE;
        PDColorSpaceInstance colorInstance = context.getGraphicsState().getNonStrokingColorSpace();
        colorInstance.setColorSpace( cs );
        float[] values = new float[4];
        for( int i=0; i<arguments.size(); i++ )
        {
            values[i] = ((COSNumber)arguments.get( i )).floatValue();
        }
        colorInstance.setColorSpaceValue( values );
    }
}
