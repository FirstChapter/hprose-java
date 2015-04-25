/**********************************************************\
|                                                          |
|                          hprose                          |
|                                                          |
| Official WebSite: http://www.hprose.com/                 |
|                   http://www.hprose.org/                 |
|                                                          |
\**********************************************************/
/**********************************************************\
 *                                                        *
 * DateArraySerializer.java                               *
 *                                                        *
 * Date array serializer class for Java.                  *
 *                                                        *
 * LastModified: Apr 20, 2015                             *
 * Author: Ma Bingyao <andot@hprose.com>                  *
 *                                                        *
\**********************************************************/

package hprose.io.serialize;

import hprose.io.HproseWriter;
import java.io.IOException;
import java.sql.Date;

final class DateArraySerializer implements HproseSerializer<Date[]> {

    public final static HproseSerializer instance = new DateArraySerializer();

    public final void write(HproseWriter writer, Date[] obj) throws IOException {
        writer.writeArrayWithRef(obj);
    }
}