/*
 *  Copyright (C) 2010-2014 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.tags;

import com.jpexs.decompiler.flash.SWF;
import com.jpexs.decompiler.flash.SWFInputStream;

/**
 *
 *
 * @author JPEXS
 */
public class TagStub extends Tag {

    private final SWFInputStream dataStream;

    /**
     * Constructor
     *
     * @param swf
     * @param id
     * @param length
     * @param name
     * @param pos
     * @param sis
     */
    public TagStub(SWF swf, int id, String name, long pos, int length, SWFInputStream sis) {
        super(swf, id, name, pos, length);
        dataStream = sis;
    }

    public SWFInputStream getDataStream() {
        return dataStream;
    }
}
