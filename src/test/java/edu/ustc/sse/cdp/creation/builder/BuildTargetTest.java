package edu.ustc.sse.cdp.creation.builder;

import org.junit.Assert;
import org.junit.Test;

public class BuildTargetTest {

    @Test
    public void testBuild() throws Exception {

        BuildTarget buildTarget = BuildTarget.builder().setHeader("header").setBody("body").setFooter("footer").build();

        Assert.assertEquals("header", buildTarget.getHeader());
        Assert.assertEquals("body", buildTarget.getBody());
        Assert.assertEquals("footer", buildTarget.getFooter());
    }
}
