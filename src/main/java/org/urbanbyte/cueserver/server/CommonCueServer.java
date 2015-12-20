package org.urbanbyte.cueserver.server;

import org.urbanbyte.cueserver.CueServerClient;
import org.urbanbyte.cueserver.http.HttpCueServerClient;

/**
 * author: Chris Reising
 */
public class CommonCueServer
{
    private static final CueServerClient cueServer =
            new HttpCueServerClient("http://demo1.cueserver.com", 100);

    private CommonCueServer()
    {
        // private for singleton
    }

    public static CueServerClient getCueServerInstance()
    {
        return cueServer;
    }
}
